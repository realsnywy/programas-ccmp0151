import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");

        try {
            int numero = leitor.nextInt();
            System.out.println(numero);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
