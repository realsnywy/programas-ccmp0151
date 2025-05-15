import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Questao1 {
    private static final String FILENAME = "saida.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu Questao 1:");
            System.out.println("1) Digitar texto e salvar em saida.txt");
            System.out.println("2) Ler conteudo de saida.txt e exibir");
            System.out.println("3) Encerrar o programa");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    escreverArquivo(scanner);
                    break;
                case 2:
                    lerArquivo();
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

    private static void escreverArquivo(Scanner scanner) {
        System.out.print("Digite o texto a ser salvo: ");
        String texto = scanner.nextLine();
        try (FileWriter writer = new FileWriter(FILENAME)) {
            writer.write(texto);
            System.out.println("Texto salvo com sucesso em " + FILENAME);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    private static void lerArquivo() {
        try (FileReader reader = new FileReader(FILENAME)) {
            System.out.println("\nConteudo do arquivo " + FILENAME + ":");
            int caractere;
            while ((caractere = reader.read()) != -1) {
                System.out.print((char) caractere);
            }
            System.out.println("\nLeitura concluida.");
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
