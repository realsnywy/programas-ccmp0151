/* Crie uma classe chamada ParImpar que gere um array com 20 números inteiros aleatórios entre 1 e 50. O programa deve separar os números em dois novos arrays: um contendo apenas os números pares e outro contendo apenas os números ímpares. Ao final, exiba os três arrays e a quantidade de números em cada um dos novos arrays. */

public class ParImpar {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int qtdPares = 0;
        int qtdImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 50) + 1;
            if (numeros[i] % 2 == 0) {
                pares[qtdPares] = numeros[i];
                qtdPares++;
            } else {
                impares[qtdImpares] = numeros[i];
                qtdImpares++;
            }
        }

        System.out.println("Números gerados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        System.out.println("Números pares:");
        for (int i = 0; i < qtdPares; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();

        System.out.println("Números ímpares:");
        for (int i = 0; i < qtdImpares; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();

        System.out.println("Quantidade de números pares: " + qtdPares);
        System.out.println("Quantidade de números ímpares: " + qtdImpares);
    }

}
