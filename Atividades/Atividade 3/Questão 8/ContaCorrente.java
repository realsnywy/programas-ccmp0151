public class ContaCorrente {
    private String numeroConta;
    private double saldo;
    private double limite;

    public ContaCorrente(String numeroConta, double saldoInicial, double limite) {
        setNumeroConta(numeroConta);
        this.saldo = saldoInicial;
        setLimite(limite);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        if (numeroConta != null && !numeroConta.trim().isEmpty()) {
            this.numeroConta = numeroConta;
        } else {
            throw new IllegalArgumentException("O número da conta não pode ser nulo ou vazio.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if (limite >= 0) {
            this.limite = limite;
        } else {
            throw new IllegalArgumentException("O limite deve ser maior ou igual a zero.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0) {
            if (saldo + limite >= valor) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo atual: R$" + saldo);
                return true;
            } else {
                System.out.println("Saldo insuficiente. Saque não realizado.");
                return false;
            }
        } else {
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");
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

    public void exibirDetalhes() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Limite: R$" + limite);
    }
}