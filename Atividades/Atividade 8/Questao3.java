import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Questao3 {
    private static String nomeArquivoDinamico = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu Questao 3:");
            System.out.println("1) Criar novo arquivo e escrever conteudo");
            System.out.println("2) Mostrar conteudo do arquivo criado");
            System.out.println("3) Apagar arquivo criado");
            System.out.println("4) Encerrar o programa");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    criarEPreencherArquivo(scanner);
                    break;
                case 2:
                    mostrarArquivoCriado();
                    break;
                case 3:
                    apagarArquivoCriado();
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    private static void criarEPreencherArquivo(Scanner scanner) {
        System.out.print("Digite o nome do arquivo a ser criado (ex: meu_arquivo.txt): ");
        nomeArquivoDinamico = scanner.nextLine();
        System.out.print("Digite o conteudo para o arquivo: ");
        String conteudo = scanner.nextLine();

        try (FileWriter writer = new FileWriter(nomeArquivoDinamico)) {
            writer.write(conteudo);
            System.out.println("Arquivo " + nomeArquivoDinamico + " criado e preenchido com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao criar ou escrever no arquivo: " + e.getMessage());
            nomeArquivoDinamico = null;
        }
    }

    private static void mostrarArquivoCriado() {
        if (nomeArquivoDinamico == null) {
            System.out.println("Nenhum arquivo foi criado ainda ou ocorreu um erro na criacao.");
            return;
        }
        try (FileReader reader = new FileReader(nomeArquivoDinamico)) {
            System.out.println("\nConteudo do arquivo " + nomeArquivoDinamico + ":");
            int caractere;
            while ((caractere = reader.read()) != -1) {
                System.out.print((char) caractere);
            }
            System.out.println("\nLeitura concluida.");
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo " + nomeArquivoDinamico + ": " + e.getMessage());
        }
    }

    private static void apagarArquivoCriado() {
        if (nomeArquivoDinamico == null) {
            System.out.println("Nenhum arquivo para apagar (nao foi criado ou ja foi apagado).");
            return;
        }
        File arquivo = new File(nomeArquivoDinamico);
        if (arquivo.exists()) {
            if (arquivo.delete()) {
                System.out.println("Arquivo " + nomeArquivoDinamico + " apagado com sucesso.");
                nomeArquivoDinamico = null;
            } else {
                System.err.println("Erro ao apagar o arquivo " + nomeArquivoDinamico);
            }
        } else {
            System.out.println("Arquivo " + nomeArquivoDinamico + " nao encontrado para apagar.");
            nomeArquivoDinamico = null;
        }
    }
}
