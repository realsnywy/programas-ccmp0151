/* Desenvolva uma classe chamada EncontraMaiorMenor que solicite ao usuário 10 números inteiros. O programa deve armazenar esses números em um array, encontrar o maior e o menor valor inserido, e exibir esses valores junto com suas posições no array. */
/* Discente: Gabriel Furtado Carneiro Leão (200469079) */

import java.util.Scanner;

public class EncontraMaiorMenor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[10];
            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;
            int posicaoMaior = 0;
            int posicaoMenor = 0;

            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();

                if (numeros[i] > maior) {
                    maior = numeros[i];
                    posicaoMaior = i;
                }

                if (numeros[i] < menor) {
                    menor = numeros[i];
                    posicaoMenor = i;
                }
            }

            System.out.println("Maior número: " + maior + " (posição " + posicaoMaior + ")");
            System.out.println("Menor número: " + menor + " (posição " + posicaoMenor + ")");
        }
    }
}
