public class Questao14 {
    public static void main(String[] args) {
        try {
            ContaBancaria conta = new ContaBancaria("João Silva", 1000.0);

            System.out.println("Detalhes iniciais da conta:");
            conta.exibirDetalhes();

            System.out.println("\nRealizando depósito de R$500...");
            conta.depositar(500);

            System.out.println("\nRealizando saque de R$300...");
            conta.sacar(300);

            System.out.println("\nTentando sacar R$2000...");
            conta.sacar(2000);

            System.out.println("\nTentando realizar depósito de R$-100...");
            conta.depositar(-100);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            System.out.println("\nTentando criar uma conta com titular inválido...");
            ContaBancaria contaInvalida = new ContaBancaria("", 500.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}