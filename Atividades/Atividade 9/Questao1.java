import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Questao1 extends JFrame {

    private JTextField textField;
    private JButton inverterButton;

    public Questao1() {
        setTitle("Questão 1 - Inverter Texto");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new java.awt.FlowLayout());

        textField = new JTextField(20);
        inverterButton = new JButton("Inverter");

        inverterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoOriginal = textField.getText();
                String textoInvertido = new StringBuilder(textoOriginal).reverse().toString();
                JOptionPane.showMessageDialog(Questao1.this,
                        "Texto invertido: " + textoInvertido,
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        add(new JLabel("Digite um texto:"));
        add(textField);
        add(inverterButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Questao1();
            }
        });
    }
}
