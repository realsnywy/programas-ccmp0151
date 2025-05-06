import java.util.Scanner;
import java.util.InputMismatchException;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int index = 0;

        try {
            while (true) {
                System.out.print("Digite um valor (0 para encerrar): ");
                int valor = scanner.nextInt();

                if (valor == 0) {
                    break;
                }

                vetor[index++] = valor;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Número máximo de valores excedido.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira números.");
        } finally {
            scanner.close();
        }
    }
}