abstract class ContaBancaria {
    protected double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque de R$ " + valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }
}

class ContaCorrente extends ContaBancaria {
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }
}

class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    public void aplicarJurosMensais(double taxa) {
        saldo += saldo * taxa;
        System.out.println("Juros mensais aplicados. Saldo atual: R$ " + saldo);
    }
}

public class Questao1 {
    public static void main(String[] args) {
        System.out.println("=== Conta Corrente ===");
        ContaCorrente contaCorrente = new ContaCorrente(1000);
        contaCorrente.depositar(500);
        contaCorrente.sacar(200);
        contaCorrente.sacar(1500);

        System.out.println("\n=== Conta Poupança ===");
        ContaPoupanca contaPoupanca = new ContaPoupanca(5000);
        contaPoupanca.depositar(1000);
        contaPoupanca.aplicarJurosMensais(0.005);
    }
}