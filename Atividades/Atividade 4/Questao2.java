// Será necessário executar 'javac Questao1.java Questao2.java' antes de executar a 2ª questão. Consequentemente, é só executar 'java Questao2' em seguida.

class ContaTesouroDireto extends ContaPoupanca {
    public ContaTesouroDireto(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void depositar(double valor) {
        if (valor >= 1000) {
            super.depositar(valor);
        } else {
            System.out.println("Depósitos devem ser acima de R$ 1000.");
        }
    }

    public void aplicarRendimentoMensal() {
        aplicarJurosMensais(0.01);
    }
}

public class Questao2 {
    public static void main(String[] args) {
        ContaPoupanca[] contas = new ContaPoupanca[10];
        contas[0] = new ContaTesouroDireto(2000);
        contas[1] = new ContaPoupanca(3000);

        System.out.println("=== Conta Tesouro Direto ===");
        ContaTesouroDireto contaTesouro = (ContaTesouroDireto) contas[0];
        contaTesouro.depositar(1500);
        contaTesouro.aplicarRendimentoMensal();

        System.out.println("\n=== Conta Poupança ===");
        ContaPoupanca contaPoupanca = contas[1];
        contaPoupanca.depositar(500);
        contaPoupanca.aplicarJurosMensais(0.005);

        System.out.println("\nSaldos Finais:");
        System.out.println("Saldo Conta Tesouro Direto: R$ " + contaTesouro.getSaldo());
        System.out.println("Saldo Conta Poupança: R$ " + contaPoupanca.getSaldo());
    }
}