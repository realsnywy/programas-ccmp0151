public class Aluno {
    private String nome;
    private String cpf;
    private double[] notas;

    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.notas = new double[4];
    }

    public void setNotas(double[] notas) {
        if (notas.length == 4) {
            this.notas = notas;
        } else {
            System.out.println("É necessário fornecer exatamente quatro notas.");
        }
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("João Silva", "987.654.321-00");

        double[] notas = { 6.5, 7.8, 8.2, 9.5 };
        aluno.setNotas(notas);

        double media = aluno.calcularMedia();

        System.out.println("Média: " + media);

        notas[1] = 8.0;
        aluno.setNotas(notas);

        double novaMedia = aluno.calcularMedia();

        System.out.println("Nova Média: " + novaMedia);
    }
}