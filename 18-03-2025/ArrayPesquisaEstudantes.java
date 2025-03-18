import javax.swing.*;

public class ArrayPesquisaEstudantes {
    public static void main(String args[])
    {
        String nomes[] = { "Ana", "Bia", "Cris", "Duda", "Eva", "Fê", "Gabi", "Helo", "Iza", "Jô" };
        String pesquisa = JOptionPane.showInputDialog(null, "Digite o nome do estudante a ser pesquisado:");
        int i;
        for (i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(pesquisa)) {
                break;
            }
        }
        if (i == nomes.length) {
            JOptionPane.showMessageDialog(null, "Estudante não encontrado", "Pesquisa de estudantes", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Estudante encontrado na posição " + i, "Pesquisa de estudantes", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}
