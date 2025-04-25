interface Pagamento {
    void processarPagamento();
}

class CartaoCredito implements Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento processado com cartão de crédito.");
    }
}

class Dinheiro implements Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento processado com dinheiro.");
    }
}

public class Questao2 {
    public static void finalizarCompra(Pagamento pagamento) {
        pagamento.processarPagamento();
    }

    public static void main(String[] args) {
        Pagamento pagamentoCartao = new CartaoCredito();
        Pagamento pagamentoDinheiro = new Dinheiro();

        finalizarCompra(pagamentoCartao);
        finalizarCompra(pagamentoDinheiro);
    }
}