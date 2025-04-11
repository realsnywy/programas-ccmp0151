public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        setNome(nome);
        setNota(nota);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio.");
        }
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
        }
    }

    public static double calcularMediaNotas(Aluno[] alunos) {
        if (alunos == null || alunos.length == 0) {
            throw new IllegalArgumentException("O array de alunos não pode ser nulo ou vazio.");
        }

        double soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.getNota();
        }
        return soma / alunos.length;
    }
}