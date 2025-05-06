import java.util.ArrayList;
import java.util.List;

class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}

public class Questao1 {
    public static void main(String[] args) {
        List<Circulo> circulos = new ArrayList<>();
        circulos.add(new Circulo(1.0));
        circulos.add(new Circulo(2.5));
        circulos.add(new Circulo(3.0));
        circulos.add(new Circulo(4.2));
        circulos.add(new Circulo(5.5));

        for (Circulo circulo : circulos) {
            System.out.printf("Área do círculo com raio %.2f: %.2f%n", 
                              circulo.calcularArea() / Math.PI, 
                              circulo.calcularArea());
        }
    }
}