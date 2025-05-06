import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TesteHashSetCPF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> cpfs = new HashSet<>();

        System.out.println("Digite 10 CPFs:");
        for (int i = 0; i < 10; i++) {
            System.out.print("CPF " + (i + 1) + ": ");
            cpfs.add(scanner.nextLine());
        }

        System.out.println("\nCPFs armazenados no HashSet:");
        for (String cpf : cpfs) {
            System.out.println(cpf);
        }

        scanner.close();
    }
}