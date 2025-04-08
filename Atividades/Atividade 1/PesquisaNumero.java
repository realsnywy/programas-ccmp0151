/* Programe uma classe chamada PesquisaNumero que crie um array com 15 números inteiros aleatórios entre 1 e 100. Em seguida, o programa deve solicitar ao usuário um número para pesquisar no array. O programa deve informar se o número foi encontrado ou não, e em caso positivo, em quais posições ele aparece. */

import java.util.Scanner;

public class PesquisaNumero {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[15];
            int numeroPesquisado;
            boolean encontrado = false;

            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * 100) + 1;
            }

            System.out.print("Digite um número para pesquisar: ");
            numeroPesquisado = scanner.nextInt();

            System.out.println("Números gerados:");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i] + " ");
            }
            System.out.println();

            System.out.println("Número pesquisado: " + numeroPesquisado);

            System.out.print("Posições encontradas: ");
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == numeroPesquisado) {
                    System.out.print(i + " ");
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("Número não encontrado.");
            }
        }
    }
}
