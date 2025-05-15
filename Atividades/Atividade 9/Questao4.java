import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Questao4 extends JFrame {

    private JPasswordField passwordField;
    private JButton escolherArquivoButton;
    private JButton salvarButton;
    private JLabel arquivoSelecionadoLabel;
    private File arquivoSelecionado;

    public Questao4() {
        setTitle("Questão 4 - Salvar Senha");
        setSize(450, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        passwordField = new JPasswordField(20);
        escolherArquivoButton = new JButton("Escolher Arquivo...");
        salvarButton = new JButton("Salvar Senha no Arquivo");
        arquivoSelecionadoLabel = new JLabel("Nenhum arquivo selecionado.");

        escolherArquivoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(Questao4.this);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    arquivoSelecionado = fileChooser.getSelectedFile();
                    arquivoSelecionadoLabel.setText("Arquivo: " + arquivoSelecionado.getName());
                }
            }
        });

        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] senhaChars = passwordField.getPassword();
                String senha = new String(senhaChars);

                if (senha.isEmpty()) {
                    JOptionPane.showMessageDialog(Questao4.this,
                            "Por favor, digite uma senha.",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (arquivoSelecionado == null) {
                    JOptionPane.showMessageDialog(Questao4.this,
                            "Por favor, selecione um arquivo primeiro.",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try (PrintWriter writer = new PrintWriter(new FileWriter(arquivoSelecionado, true))) {
                    writer.println(senha);
                    java.util.Arrays.fill(senhaChars, ' ');
                    passwordField.setText("");

                    JOptionPane.showMessageDialog(Questao4.this,
                            "Senha salva com sucesso no arquivo: " + arquivoSelecionado.getName(),
                            "Sucesso",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(Questao4.this,
                            "Erro ao salvar a senha no arquivo: " + ex.getMessage(),
                            "Erro de Arquivo",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JPanel panelSenha = new JPanel();
        panelSenha.add(new JLabel("Senha:"));
        panelSenha.add(passwordField);

        JPanel panelArquivo = new JPanel();
        panelArquivo.add(escolherArquivoButton);
        panelArquivo.add(arquivoSelecionadoLabel);

        add(panelSenha);
        add(panelArquivo);
        add(salvarButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Questao4();
            }
        });
    }
}
