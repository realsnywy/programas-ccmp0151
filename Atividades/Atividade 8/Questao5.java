import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Questao5 {
    private static final String BACKUP_FILENAME = "backup.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\nMenu Questao 5:");
            System.out.println("1) Fazer backup de um arquivo");
            System.out.println("2) Encerrar o programa");
            System.out.print("Escolha uma opcao: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Entrada invalida. Por favor, digite um numero.");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    fazerBackup(scanner);
                    break;
                case 2:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 2);

        scanner.close();
    }

    private static void fazerBackup(Scanner scanner) {
        System.out.print(
                "Digite o caminho completo do arquivo a ser copiado (ex: /caminho/para/arquivo.txt ou C:\\caminho\\arquivo.txt): ");
        String caminhoArquivoOriginal = scanner.nextLine();

        File arquivoOriginal = new File(caminhoArquivoOriginal);
        if (!arquivoOriginal.exists() || !arquivoOriginal.isFile()) {
            System.err.println("Arquivo original nao encontrado ou nao e um arquivo valido: " + caminhoArquivoOriginal);
            return;
        }

        try (FileInputStream fis = new FileInputStream(arquivoOriginal);
                FileOutputStream fos = new FileOutputStream(BACKUP_FILENAME)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Backup realizado com sucesso! Copia salva em: " + BACKUP_FILENAME);
        } catch (IOException e) {
            System.err.println("Erro durante o processo de backup: " + e.getMessage());
        }
    }
}
