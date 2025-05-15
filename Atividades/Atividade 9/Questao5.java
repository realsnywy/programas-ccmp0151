import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;

public class Questao5 extends JFrame {

    private JTree tree;
    private DefaultMutableTreeNode rootNode;
    private DefaultTreeModel treeModel;
    private JRadioButton alfabeticaRadioButton;
    private JRadioButton tamanhoRadioButton;
    private ButtonGroup ordenacaoButtonGroup;
    private JPanel radioPanel;

    static class NodeData {
        String name;
        int size;

        public NodeData(String name, int size) {
            this.name = name;
            this.size = size;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public Questao5() {
        setTitle("Questão 5 - JTree e Ordenação");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        rootNode = new DefaultMutableTreeNode(new NodeData("Raiz", 0));
        DefaultMutableTreeNode pasta1 = new DefaultMutableTreeNode(new NodeData("Documentos", 100));
        pasta1.add(new DefaultMutableTreeNode(new NodeData("Trabalho.docx", 20)));
        pasta1.add(new DefaultMutableTreeNode(new NodeData("Apresentacao.pptx", 50)));

        DefaultMutableTreeNode pasta2 = new DefaultMutableTreeNode(new NodeData("Imagens", 200));
        pasta2.add(new DefaultMutableTreeNode(new NodeData("Foto1.jpg", 70)));
        pasta2.add(new DefaultMutableTreeNode(new NodeData("Icone.png", 10)));
        pasta2.add(new DefaultMutableTreeNode(new NodeData("Wallpaper.bmp", 120)));

        DefaultMutableTreeNode arquivoSolto = new DefaultMutableTreeNode(new NodeData("Notas.txt", 5));

        rootNode.add(pasta1);
        rootNode.add(pasta2);
        rootNode.add(arquivoSolto);

        treeModel = new DefaultTreeModel(rootNode);
        tree = new JTree(treeModel);
        tree.setRootVisible(true);

        alfabeticaRadioButton = new JRadioButton("Alfabética", true);
        tamanhoRadioButton = new JRadioButton("Por Tamanho (simulado)");

        ordenacaoButtonGroup = new ButtonGroup();
        ordenacaoButtonGroup.add(alfabeticaRadioButton);
        ordenacaoButtonGroup.add(tamanhoRadioButton);

        radioPanel = new JPanel(new FlowLayout());
        radioPanel.add(new JLabel("Ordenar por:"));
        radioPanel.add(alfabeticaRadioButton);
        radioPanel.add(tamanhoRadioButton);

        ActionListener ordenacaoListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ordenarNos(rootNode);
                treeModel.reload(rootNode);
                expandAllNodes(tree, 0, tree.getRowCount());
            }
        };
        alfabeticaRadioButton.addActionListener(ordenacaoListener);
        tamanhoRadioButton.addActionListener(ordenacaoListener);

        ordenarNos(rootNode);
        treeModel.reload(rootNode);
        expandAllNodes(tree, 0, tree.getRowCount());

        add(new JScrollPane(tree), BorderLayout.CENTER);
        add(radioPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void ordenarNos(DefaultMutableTreeNode parentNode) {
        int childCount = parentNode.getChildCount();
        if (childCount <= 1) {
            return;
        }

        DefaultMutableTreeNode[] children = new DefaultMutableTreeNode[childCount];
        for (int i = 0; i < childCount; i++) {
            children[i] = (DefaultMutableTreeNode) parentNode.getChildAt(i);
        }

        Comparator<DefaultMutableTreeNode> comparator;
        if (alfabeticaRadioButton.isSelected()) {
            comparator = (node1, node2) -> {
                NodeData data1 = (NodeData) node1.getUserObject();
                NodeData data2 = (NodeData) node2.getUserObject();
                return data1.name.compareToIgnoreCase(data2.name);
            };
        } else {
            comparator = (node1, node2) -> {
                NodeData data1 = (NodeData) node1.getUserObject();
                NodeData data2 = (NodeData) node2.getUserObject();
                return Integer.compare(data1.size, data2.size);
            };
        }

        Arrays.sort(children, comparator);

        parentNode.removeAllChildren();
        for (DefaultMutableTreeNode child : children) {
            parentNode.add(child);
            ordenarNos(child);
        }
    }

    private void expandAllNodes(JTree tree, int startingIndex, int rowCount) {
        for (int i = startingIndex; i < rowCount; ++i) {
            tree.expandRow(i);
        }

        if (tree.getRowCount() != rowCount) {
            expandAllNodes(tree, rowCount, tree.getRowCount());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Questao5();
            }
        });
    }
}
