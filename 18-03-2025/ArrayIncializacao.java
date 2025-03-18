import javax.swing.*;

public class ArrayIncializacao {
    public static void main(String args[]) {
        int array[];
        array = new int[10];
        String saidaStr = "Subscrito\tValor\n";
        for (int i = 0; i < array.length; i++)
            saidaStr += i + "\t" + array[i] + "\n";
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saidaStr);
        JOptionPane.showMessageDialog(null, saidaArea, "Inicializando um array de inteiros", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
