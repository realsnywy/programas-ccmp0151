public class Questao9 {
    public static void main(String[] args) {
        try {
            Produto produto1 = new Produto("Notebook", 3500.0, 10);
            Produto produto2 = new Produto("Smartphone", 2000.0, 5);

            System.out.println("Estoque inicial:");
            System.out.println(produto1.getNome() + " - Estoque: " + produto1.getQuantidadeEmEstoque());
            System.out.println(produto2.getNome() + " - Estoque: " + produto2.getQuantidadeEmEstoque());

            System.out.println("\nRegistrando vendas...");
            Loja.registrarVenda(produto1, 2);
            Loja.registrarVenda(produto2, 3);

            System.out.println("\nEstoque atualizado:");
            System.out.println(produto1.getNome() + " - Estoque: " + produto1.getQuantidadeEmEstoque());
            System.out.println(produto2.getNome() + " - Estoque: " + produto2.getQuantidadeEmEstoque());

            System.out.println("\nTotal de vendas registrado: R$" + Loja.consultarTotalVendas());

            System.out.println("\nTentando vender mais do que o estoque disponível...");
            Loja.registrarVenda(produto2, 5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}