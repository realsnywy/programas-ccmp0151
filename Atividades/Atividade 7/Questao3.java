import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            int resultado = num1 / num2;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira números.");
        } finally {
            scanner.close();
        }
    }
}