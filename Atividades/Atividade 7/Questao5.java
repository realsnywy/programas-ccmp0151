import java.util.Scanner;

class DimensoesInvalidasException extends Exception {
    public DimensoesInvalidasException(String mensagem) {
        super(mensagem);
    }
}

class Triangulo {
    private int lado1, lado2, lado3;

    public Triangulo(int lado1, int lado2, int lado3) throws DimensoesInvalidasException {
        if (!validaTriangulo(lado1, lado2, lado3)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para um triângulo.");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    private boolean validaTriangulo(int a, int b, int c) {
        return a < b + c && b < a + c && c < a + b &&
                a > Math.abs(b - c) && b > Math.abs(a - c) && c > Math.abs(a - b);
    }

    public void setLados(int lado1, int lado2, int lado3) throws DimensoesInvalidasException {
        if (!validaTriangulo(lado1, lado2, lado3)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para um triângulo.");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + '}';
    }
}

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Triangulo triangulo = new Triangulo(3, 4, 5);
            System.out.println("Triângulo criado: " + triangulo);

            System.out.println("Alterando lado para 10...");
            triangulo.setLados(10, 4, 5);

            System.out.print("Digite os lados do novo triângulo: ");
            int lado1 = scanner.nextInt();
            int lado2 = scanner.nextInt();
            int lado3 = scanner.nextInt();

            Triangulo novoTriangulo = new Triangulo(lado1, lado2, lado3);
            System.out.println("Novo triângulo criado: " + novoTriangulo);
        } catch (DimensoesInvalidasException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}