import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Aluno {
    private String matricula;
    private String nome;
    private int idade;
    private String curso;

    public Aluno(String matricula, String nome, int idade, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return String.format("Matricula: %s, Nome: %s, Idade: %d, Curso: %s", 
                             matricula, nome, idade, curso);
    }
}

class CadastroAluno {
    private List<Aluno> alunos = new ArrayList<>();

    public void inserirAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void imprimirAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroAluno cadastro = new CadastroAluno();

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite os dados do aluno " + (i + 1) + ":");
            System.out.print("Matrícula: ");
            String matricula = scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            System.out.print("Curso: ");
            String curso = scanner.nextLine();

            cadastro.inserirAluno(new Aluno(matricula, nome, idade, curso));
        }

        System.out.println("\nLista de alunos cadastrados:");
        cadastro.imprimirAlunos();

        scanner.close();
    }
}