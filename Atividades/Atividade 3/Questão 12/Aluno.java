public class Aluno {
    private String nome;
    private double notaFinal;

    public Aluno(String nome, double notaFinal) {
        setNome(nome);
        setNotaFinal(notaFinal);
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

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        if (notaFinal >= 0 && notaFinal <= 10) {
            this.notaFinal = notaFinal;
        } else {
            throw new IllegalArgumentException("A nota final deve estar entre 0 e 10.");
        }
    }

    public static double calcularMediaNotas(Aluno[] alunos) {
        if (alunos == null || alunos.length == 0) {
            throw new IllegalArgumentException("O array de alunos não pode ser nulo ou vazio.");
        }

        double soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.getNotaFinal();
        }
        return soma / alunos.length;
    }
}