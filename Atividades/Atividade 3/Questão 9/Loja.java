public class Loja {
    private static double totalVendas = 0.0;

    public static void registrarVenda(Produto produto, int quantidade) {
        if (produto != null && quantidade > 0) {
            double valorVenda = produto.getPreco() * quantidade;
            produto.reduzirEstoque(quantidade);
            totalVendas += valorVenda;
            System.out.println("Venda de " + quantidade + " unidade(s) do produto '" + produto.getNome() +
                    "' registrada no valor de R$" + valorVenda);
        } else {
            throw new IllegalArgumentException("Produto inválido ou quantidade inválida.");
        }
    }

    public static double consultarTotalVendas() {
        return totalVendas;
    }
}