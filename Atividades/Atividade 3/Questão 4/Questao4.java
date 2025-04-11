public class Questao4 {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Ford", "Focus", 2021);

        System.out.println("Detalhes iniciais do carro:");
        meuCarro.exibirDetalhes();

        System.out.println("\nAcelerando o carro para 15 km/h...");
        meuCarro.acelerar(15);
        meuCarro.trocarMarcha(1);

        System.out.println("\nAcelerando o carro para 25 km/h...");
        meuCarro.acelerar(10);
        meuCarro.trocarMarcha(2);

        System.out.println("\nTentando trocar para 3ª marcha...");
        meuCarro.trocarMarcha(3);

        System.out.println("\nAcelerando o carro para 50 km/h...");
        meuCarro.acelerar(25);
        meuCarro.trocarMarcha(3);

        System.out.println("\nFreando o carro para 10 km/h...");
        meuCarro.frear(40);
        meuCarro.trocarMarcha(1);

        System.out.println("\nDetalhes finais do carro:");
        meuCarro.exibirDetalhes();
    }
}