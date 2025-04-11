public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    public Carro(String marca, String modelo, int ano) {
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        this.velocidadeAtual = 0.0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        } else {
            throw new IllegalArgumentException("A marca não pode ser nula ou vazia.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
        } else {
            throw new IllegalArgumentException("O modelo não pode ser nulo ou vazio.");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano >= 1886) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("O ano deve ser maior ou igual a 1886.");
        }
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
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