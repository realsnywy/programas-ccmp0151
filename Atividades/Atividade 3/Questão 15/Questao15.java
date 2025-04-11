public class Questao15 {
    public static void main(String[] args) {
        try {
            Item[] inventario = {
                    new Item("Notebook", "A001", 10, 3500.0),
                    new Item("Smartphone", "A002", 15, 2000.0),
                    new Item("Fone de Ouvido", "A003", 50, 150.0),
                    new Item("Mouse", "A004", 30, 50.0)
            };

            double valorTotalInventario = calcularValorTotalInventario(inventario);
            System.out.println("Valor total do inventário: R$" + valorTotalInventario);

            System.out.println("\nAtualizando o estoque do item 'Notebook'...");
            inventario[0].atualizarEstoque(5);

            valorTotalInventario = calcularValorTotalInventario(inventario);
            System.out.println("\nValor total do inventário atualizado: R$" + valorTotalInventario);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static double calcularValorTotalInventario(Item[] inventario) {
        double total = 0.0;
        for (Item item : inventario) {
            total += item.calcularValorTotal();
        }
        return total;
    }
}