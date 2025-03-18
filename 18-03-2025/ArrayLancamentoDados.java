import javax.swing.*;

public class ArrayLancamentoDados {
    public static void main(String args[]) {
        int frequencia[] = new int[7];
        for (int i = 0; i < 6000; i++) {
            ++frequencia[1 + (int) (Math.random() * 6)];
        }
        String saidaStr = "Face\tFrequência\n";
        for (int i = 1; i < frequencia.length; i++) {
            saidaStr += i + "\t" + frequencia[i] + "\n";
        }
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saidaStr);
        JOptionPane.showMessageDialog(null, saidaArea, "Lançamento de dados", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}