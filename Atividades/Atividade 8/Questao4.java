import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Questao4 {
    private static final String MULTILINHAS_FILENAME = "multilinhas.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu Questao 4:");
            System.out.println("1) Gravar varias linhas em multilinhas.txt");
            System.out.println("2) Ler multilinhas.txt linha a linha e mostrar");
            System.out.println("3) Encerrar o programa");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    gravarMultiplasLinhas(scanner);
                    break;
                case 2:
                    lerLinhaALinha();
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }

    private static void gravarMultiplasLinhas(Scanner scanner) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(MULTILINHAS_FILENAME))) {
            System.out.println("Digite as linhas de texto. Digite 'FIM' em uma nova linha para parar.");
            String linha;
            while (true) {
                linha = scanner.nextLine();
                if (linha.equalsIgnoreCase("FIM")) {
                    break;
                }
                writer.write(linha);
                writer.newLine();
            }
            System.out.println("Linhas gravadas com sucesso em " + MULTILINHAS_FILENAME);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    private static void lerLinhaALinha() {
        try (BufferedReader reader = new BufferedReader(new FileReader(MULTILINHAS_FILENAME))) {
            System.out.println("\nConteudo do arquivo " + MULTILINHAS_FILENAME + " (linha a linha):");
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
            System.out.println("Leitura linha a linha concluida.");
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
