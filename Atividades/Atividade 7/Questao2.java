import java.util.ArrayList;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> idades = new ArrayList<>();

        try {
            System.out.println("Digite 10 idades:");
            for (int i = 0; i < 10; i++) {
                idades.add(scanner.nextInt());
            }

            System.out.print("Digite a posição a ser removida: ");
            int posicao = scanner.nextInt();

            idades.remove(posicao - 1);
            System.out.println("Idade removida com sucesso!");
            System.out.println("Lista atual: " + idades);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Posição Inválida");
        } finally {
            scanner.close();
        }
    }
}