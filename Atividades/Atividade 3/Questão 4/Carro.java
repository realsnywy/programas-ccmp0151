public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;
    private int marchaAtual;

    public Carro(String marca, String modelo, int ano) {
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        this.velocidadeAtual = 0.0;
        this.marchaAtual = 0;
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

    public int getMarchaAtual() {
        return marchaAtual;
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

    public void trocarMarcha(int novaMarcha) {
        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida. As marchas válidas estão entre 0 (Neutro) e 6.");
            return;
        }

        switch (novaMarcha) {
            case 0:
                System.out.println("Marcha trocada para Neutro.");
                marchaAtual = novaMarcha;
                break;
            case 1:
                if (velocidadeAtual >= 0 && velocidadeAtual <= 20) {
                    marchaAtual = novaMarcha;
                    System.out.println("Marcha trocada para 1.");
                } else {
                    System.out.println("Velocidade incompatível para a 1ª marcha.");
                }
                break;
            case 2:
                if (velocidadeAtual > 20 && velocidadeAtual <= 40) {
                    marchaAtual = novaMarcha;
                    System.out.println("Marcha trocada para 2.");
                } else {
                    System.out.println("Velocidade incompatível para a 2ª marcha.");
                }
                break;
            case 3:
                if (velocidadeAtual > 40 && velocidadeAtual <= 60) {
                    marchaAtual = novaMarcha;
                    System.out.println("Marcha trocada para 3.");
                } else {
                    System.out.println("Velocidade incompatível para a 3ª marcha.");
                }
                break;
            case 4:
                if (velocidadeAtual > 60 && velocidadeAtual <= 80) {
                    marchaAtual = novaMarcha;
                    System.out.println("Marcha trocada para 4.");
                } else {
                    System.out.println("Velocidade incompatível para a 4ª marcha.");
                }
                break;
            case 5:
                if (velocidadeAtual > 80 && velocidadeAtual <= 120) {
                    marchaAtual = novaMarcha;
                    System.out.println("Marcha trocada para 5.");
                } else {
                    System.out.println("Velocidade incompatível para a 5ª marcha.");
                }
                break;
            case 6:
                if (velocidadeAtual > 120) {
                    marchaAtual = novaMarcha;
                    System.out.println("Marcha trocada para 6.");
                } else {
                    System.out.println("Velocidade incompatível para a 6ª marcha.");
                }
                break;
            default:
                System.out.println("Marcha inválida.");
                break;
        }
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
        System.out.println("Marcha Atual: " + (marchaAtual == 0 ? "Neutro" : marchaAtual));
    }
}