import java.util.Scanner;

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

class ContaCorrente {
    private String numero;
    private double saldo;

    public ContaCorrente(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque.");
        }
        saldo -= valor;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "numero='" + numero + '\'' + ", saldo=" + saldo + '}';
    }
}

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o número da conta: ");
            String numero = scanner.nextLine();

            System.out.print("Digite o saldo inicial: ");
            double saldoInicial = scanner.nextDouble();

            ContaCorrente conta = new ContaCorrente(numero, saldoInicial);

            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o valor do saque: ");
                double valor = scanner.nextDouble();
                try {
                    conta.sacar(valor);
                    System.out.println("Saque realizado com sucesso! " + conta);
                } catch (SaldoInsuficienteException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
        } finally {
            scanner.close();
        }
    }
}