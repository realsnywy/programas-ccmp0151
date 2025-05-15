import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Questao2 extends JFrame {

    private JTextField textField;
    private JCheckBox maiusculasCheckBox;
    private JCheckBox minusculasCheckBox;
    private ButtonGroup caseButtonGroup;
    private JPanel checkBoxPanel;

    public Questao2() {
        setTitle("Questão 2 - Maiúsculas/Minúsculas");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new java.awt.BorderLayout());

        textField = new JTextField();
        maiusculasCheckBox = new JCheckBox("Maiúsculas");
        minusculasCheckBox = new JCheckBox("Minúsculas");

        caseButtonGroup = new ButtonGroup();
        caseButtonGroup.add(maiusculasCheckBox);
        caseButtonGroup.add(minusculasCheckBox);

        checkBoxPanel = new JPanel();
        checkBoxPanel.add(maiusculasCheckBox);
        checkBoxPanel.add(minusculasCheckBox);

        ActionListener caseListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarTexto();
            }
        };

        maiusculasCheckBox.addActionListener(caseListener);
        minusculasCheckBox.addActionListener(caseListener);

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                atualizarTexto();
            }
        });

        add(new JLabel("Digite o texto:"), java.awt.BorderLayout.NORTH);
        add(textField, java.awt.BorderLayout.CENTER);
        add(checkBoxPanel, java.awt.BorderLayout.SOUTH);

        setVisible(true);
    }

    private void atualizarTexto() {
        String texto = textField.getText();
        if (maiusculasCheckBox.isSelected()) {
            textField.setText(texto.toUpperCase());
        } else if (minusculasCheckBox.isSelected()) {
            textField.setText(texto.toLowerCase());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Questao2();
            }
        });
    }
}
