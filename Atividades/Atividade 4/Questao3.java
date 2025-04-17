import java.util.Stack;

class Caixa {
    private int id;
    private String conteudo;
    private double peso;
    private double altura;

    public Caixa(int id, String conteudo, double peso, double altura) {
        this.id = id;
        this.conteudo = conteudo;
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void exibirEtiqueta() {
        System.out.println("Caixa ID: " + id + ", Conteúdo: " + conteudo + ", Peso: " + peso + ", Altura: " + altura);
    }
}

class CaixaFragil extends Caixa {
    private double pesoMaximoAcima;

    public CaixaFragil(int id, String conteudo, double peso, double altura, double pesoMaximoAcima) {
        super(id, conteudo, peso, altura);
        this.pesoMaximoAcima = pesoMaximoAcima;
    }

    @Override
    public void exibirEtiqueta() {
        super.exibirEtiqueta();
        System.out.println("Peso Máximo Acima: " + pesoMaximoAcima);
    }
}

class PilhaDeCaixas {
    private double alturaMaxima;
    private double pesoTotal;
    private double alturaAtual;
    private Stack<Caixa> pilha;

    public PilhaDeCaixas(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
        this.pesoTotal = 0;
        this.alturaAtual = 0;
        this.pilha = new Stack<>();
    }

    public boolean empilhar(Caixa caixa) {
        if (alturaAtual + caixa.getAltura() <= alturaMaxima) {
            pilha.push(caixa);
            alturaAtual += caixa.getAltura();
            pesoTotal += caixa.getPeso();
            return true;
        } else {
            System.out.println("Altura máxima excedida. Não é possível empilhar a caixa.");
            return false;
        }
    }

    public Caixa desempilhar() {
        if (!pilha.isEmpty()) {
            Caixa caixa = pilha.pop();
            alturaAtual -= caixa.getAltura();
            pesoTotal -= caixa.getPeso();
            return caixa;
        } else {
            System.out.println("A pilha está vazia.");
            return null;
        }
    }

    public double getAlturaAtual() {
        return alturaAtual;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public void exibirPilha() {
        System.out.println("Pilha de Caixas:");
        for (int i = pilha.size() - 1; i >= 0; i--) {
            pilha.get(i).exibirEtiqueta();
        }
        System.out.println("Altura Atual: " + alturaAtual + ", Peso Total: " + pesoTotal);
    }
}

public class Questao3 {
    public static void main(String[] args) {
        PilhaDeCaixas pilha = new PilhaDeCaixas(10);

        Caixa caixa1 = new Caixa(1, "Livros", 5, 2);
        CaixaFragil caixa2 = new CaixaFragil(2, "Vasos", 3, 1.5, 10);

        System.out.println("=== Empilhando Caixas ===");
        pilha.empilhar(caixa1);
        pilha.empilhar(caixa2);
        pilha.exibirPilha();

        System.out.println("\n=== Desempilhando a última Caixa ===");
        pilha.desempilhar();
        pilha.exibirPilha();
    }
}