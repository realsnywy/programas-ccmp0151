import java.util.ArrayList;
import java.util.List;

public class Questao11 {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido("Notebook", 1200.0));
        pedidos.add(new Pedido("Smartphone", 800.0));
        pedidos.add(new Pedido("Fone de Ouvido", 150.0));
        pedidos.add(new Pedido("Mouse", 50.0));

        double totalComDescontos = 0.0;
        System.out.println("Detalhes dos pedidos com descontos:\n");

        for (Pedido pedido : pedidos) {
            double desconto = pedido.calcularDesconto();
            double totalComDesconto = pedido.calcularTotalComDesconto();

            System.out.println("Pedido: " + pedido.getDescricao());
            System.out.println("Valor Original: R$" + pedido.getValor());
            System.out.println("Desconto Aplicado: R$" + desconto);
            System.out.println("Valor com Desconto: R$" + totalComDesconto);
            System.out.println("-----");

            totalComDescontos += totalComDesconto;
        }

        System.out.println("\nTotal final com descontos: R$" + totalComDescontos);
    }
}