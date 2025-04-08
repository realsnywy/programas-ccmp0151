/* Crie uma classe chamada MediaNotas que permita ao usuário inserir 5 notas de alunos. O programa deve calcular e exibir a média das notas, bem como mostrar quantas notas estão acima da média calculada. Utilize um array para armazenar as notas dos alunos. */

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] notas = new double[5];
            double soma = 0;
            double media;
            int acimaMedia = 0;

            for (int i = 0; i < notas.length; i++) {
                System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
                notas[i] = scanner.nextDouble();
                soma += notas[i];
            }

            media = soma / notas.length;

            for (int i = 0; i < notas.length; i++) {
                if (notas[i] > media) {
                    acimaMedia++;
                }
            }

            System.out.println("Média das notas: " + media);
            System.out.println("Quantidade de notas acima da média: " + acimaMedia);
        }
    }
}
