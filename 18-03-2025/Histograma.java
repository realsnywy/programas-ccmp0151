import javax.swing.*;

public class Histograma {
    public static void main(String args[]) {
        int array[] = { 19, 3, 15, 7, 11, 9, 13, 5, 17, 1 };
        String saidaStr = "Elemento\tValor\tHistograma\n";
        for (int i = 0; i < array.length; i++) {
            saidaStr += (i + 1) + "\t" + array[i] + "\t";
            for (int j = 0; j < array[i]; j++) {
                saidaStr += "*";
            }
            saidaStr += "\n";
        }
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saidaStr);
        JOptionPane.showMessageDialog(null, saidaArea, "Histograma", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}