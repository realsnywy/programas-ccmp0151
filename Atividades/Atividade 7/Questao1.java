import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite um número: ");
            int posicao = scanner.nextInt();

            System.out.println("Caractere na posição " + posicao + ": " + nome.charAt(posicao));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Posição Inválida");
        } finally {
            scanner.close();
        }
    }
}