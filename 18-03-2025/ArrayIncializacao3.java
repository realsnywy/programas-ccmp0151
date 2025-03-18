import java.util.Scanner;
import javax.swing.*;

public class ArrayIncializacao3 {
    public static void main(String args[]) {
        float array[];
        array = new float[5];
        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < array.length; i++) {
                System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
                array[i] = input.nextFloat();
            }
        }
        String saidaStr = "Aluno\tNota\n";
        float soma = 0;
        for (int i = 0; i < array.length; i++) {
            saidaStr += (i + 1) + "\t" + array[i] + "\n";
            soma += array[i];
        }
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saidaStr + "\nMédia da turma: " + (soma / array.length));
        JOptionPane.showMessageDialog(null, saidaArea, "Notas dos alunos", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}