import java.util.List;

public class Questao10 {
    public static double aplicarDescontos(List<Pedido> pedidos) {
        double totalComDescontos = 0.0;

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

        return totalComDescontos;
    }

    public static void main(String[] args) {
        List<Pedido> pedidos = List.of(
            new Pedido("Notebook", 1200.0),
            new Pedido("Smartphone", 800.0),
            new Pedido("Fone de Ouvido", 150.0),
            new Pedido("Mouse", 50.0)
        );

        System.out.println("Aplicando descontos nos pedidos...");
        double totalFinal = aplicarDescontos(pedidos);

        System.out.println("\nTotal final com descontos: R$" + totalFinal);
    }
}