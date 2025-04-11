public class Questao8 {
    public static void main(String[] args) {
        try {
            ContaCorrente conta = new ContaCorrente("12345-6", 500.0, 200.0);

            System.out.println("Detalhes iniciais da conta:");
            conta.exibirDetalhes();

            System.out.println("\nRealizando depósito de R$200...");
            conta.depositar(200);

            System.out.println("\nTentando sacar R$600...");
            boolean saqueRealizado = conta.sacar(600);
            if (saqueRealizado) {
                System.out.println("Saque realizado com sucesso.");
            } else {
                System.out.println("Saque não realizado.");
            }

            System.out.println("\nTentando sacar R$200...");
            saqueRealizado = conta.sacar(200);
            if (saqueRealizado) {
                System.out.println("Saque realizado com sucesso.");
            } else {
                System.out.println("Saque não realizado.");
            }

            System.out.println("\nDetalhes finais da conta:");
            conta.exibirDetalhes();

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}