/* Desenvolva uma classe chamada OrdenacaoSimples que permita ao usuário inserir 8 nomes de pessoas. O programa deve armazenar os nomes em um array, ordená-los em ordem alfabética e exibir a lista antes e depois da ordenação. */
/* Discente: Gabriel Furtado Carneiro Leão (200469079) */

import java.util.Scanner;

public class OrdenacaoSimples {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] nomes = new String[8];
            String temp;

            for (int i = 0; i < nomes.length; i++) {
                System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
                nomes[i] = scanner.nextLine();
            }

            System.out.println("Nomes inseridos:");
            for (int i = 0; i < nomes.length; i++) {
                System.out.println(nomes[i]);
            }

            for (int i = 0; i < nomes.length - 1; i++) {
                for (int j = i + 1; j < nomes.length; j++) {
                    if (nomes[i].compareTo(nomes[j]) > 0) {
                        temp = nomes[i];
                        nomes[i] = nomes[j];
                        nomes[j] = temp;
                    }
                }
            }

            System.out.println("Nomes ordenados:");
            for (int i = 0; i < nomes.length; i++) {
                System.out.println(nomes[i]);
            }
        }
    }
}
