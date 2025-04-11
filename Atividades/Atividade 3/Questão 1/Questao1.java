public class Questao1 {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2020);

        System.out.println("Detalhes do carro:");
        meuCarro.exibirDetalhes();

        System.out.println("\nAcelerando o carro...");
        meuCarro.acelerar(50);

        System.out.println("\nFreando o carro...");
        meuCarro.frear(30);

        System.out.println("\nDetalhes atualizados do carro:");
        meuCarro.exibirDetalhes();
    }
}