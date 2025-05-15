import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Questao2 {
    private static final String SOURCE_FILENAME = "dados.txt";
    private static final String COPY_FILENAME = "copia_dados.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        try (FileWriter writer = new FileWriter(SOURCE_FILENAME, true)) {
            if (new java.io.File(SOURCE_FILENAME).length() == 0) {
                writer.write("Este e um conteudo de exemplo para o arquivo dados.txt.\nSegunda linha de exemplo.");
                System.out.println(SOURCE_FILENAME + " criado com conteudo de exemplo.");
            }
        } catch (IOException e) {
            System.err.println("Aviso: Nao foi possivel criar/verificar o arquivo de exemplo " + SOURCE_FILENAME + ": "
                    + e.getMessage());
        }

        do {
            System.out.println("\nMenu Questao 2:");
            System.out.println("1) Ler dados.txt byte a byte e mostrar");
            System.out.println("2) Copiar dados.txt para copia_dados.txt");
            System.out.println("3) Encerrar o programa");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    lerArquivoByteAByte();
                    break;
                case 2:
                    copiarArquivo();
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

    private static void lerArquivoByteAByte() {
        try (FileInputStream fis = new FileInputStream(SOURCE_FILENAME)) {
            System.out.println("\nConteudo do arquivo " + SOURCE_FILENAME + " (byte a byte):");
            int byteLido;
            while ((byteLido = fis.read()) != -1) {
                System.out.print((char) byteLido);
            }
            System.out.println("\nLeitura byte a byte concluida.");
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo " + SOURCE_FILENAME + ": " + e.getMessage());
        }
    }

    private static void copiarArquivo() {
        try (FileInputStream fis = new FileInputStream(SOURCE_FILENAME);
                FileOutputStream fos = new FileOutputStream(COPY_FILENAME)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Arquivo " + SOURCE_FILENAME + " copiado para " + COPY_FILENAME + " com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao copiar o arquivo: " + e.getMessage());
        }
    }
}
