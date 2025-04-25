abstract class Veiculo {
    public abstract double calcularAluguel(int dias);
}

class Carro extends Veiculo {
    private static final double PRECO_POR_DIA = 100.0;

    @Override
    public double calcularAluguel(int dias) {
        return dias * PRECO_POR_DIA;
    }
}

class Moto extends Veiculo {
    private static final double PRECO_POR_DIA = 50.0;

    @Override
    public double calcularAluguel(int dias) {
        return dias * PRECO_POR_DIA;
    }
}

public class Questao3 {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        int dias = 5;
        System.out.printf("Aluguel do carro por %d dias: R$ %.2f%n", dias, carro.calcularAluguel(dias));
        System.out.printf("Aluguel da moto por %d dias: R$ %.2f%n", dias, moto.calcularAluguel(dias));
    }
}