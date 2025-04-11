public class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(String titular, double saldoInicial) {
        setTitular(titular);
        this.saldo = saldoInicial >= 0 ? saldoInicial : 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.trim().isEmpty()) {
            this.titular = titular;
        } else {
            throw new IllegalArgumentException("O nome do titular não pode ser nulo ou vazio.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso. Saldo atual: R$" + saldo);
        } else {
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo atual: R$" + saldo);
            } else {
                System.out.println("Saldo insuficiente. Saque não realizado.");
            }
        } else {
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
    }
}