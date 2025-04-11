public class Questao7 {
    public static void main(String[] args) {
        try {
            Aluno[] alunos = {
                    new Aluno("João", 8.5),
                    new Aluno("Maria", 9.0),
                    new Aluno("Carlos", 7.0),
                    new Aluno("Ana", 10.0)
            };

            double media = Aluno.calcularMediaNotas(alunos);
            System.out.println("Média das notas: " + media);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            System.out.println("\nTentando calcular a média de um array vazio...");
            Aluno[] alunosVazios = {};
            Aluno.calcularMediaNotas(alunosVazios);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            System.out.println("\nTentando calcular a média de um array nulo...");
            Aluno[] alunosNulos = null;
            Aluno.calcularMediaNotas(alunosNulos);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}