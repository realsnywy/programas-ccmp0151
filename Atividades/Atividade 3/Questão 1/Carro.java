public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0.0;
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadeAtual += incremento;
            System.out.println("O carro acelerou. Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Incremento inválido para acelerar.");
        }
    }

    public void frear(double decremento) {
        if (decremento > 0 && velocidadeAtual >= decremento) {
            velocidadeAtual -= decremento;
            System.out.println("O carro reduziu a velocidade. Velocidade atual: " + velocidadeAtual + " km/h");
        } else if (velocidadeAtual < decremento) {
            velocidadeAtual = 0;
            System.out.println("O carro parou completamente.");
        } else {
            System.out.println("Decremento inválido para frear.");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }
}