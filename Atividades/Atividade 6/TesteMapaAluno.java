// Será necessário executar 'javac Questao3.java TesteMapaAluno.java' antes de executar a 5ª questão. Consequentemente, é só executar 'java TesteMapaAluno' em seguida.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TesteMapaAluno {
    public static void main(String[] args) {
        Map<String, Aluno> mapaAlunos = new HashMap<>();

        mapaAlunos.put("A001", new Aluno("A001", "João", 20, "Engenharia"));
        mapaAlunos.put("A002", new Aluno("A002", "Maria", 22, "Medicina"));
        mapaAlunos.put("A003", new Aluno("A003", "Pedro", 19, "Direito"));
        mapaAlunos.put("A004", new Aluno("A004", "Ana", 21, "Arquitetura"));
        mapaAlunos.put("A005", new Aluno("A005", "Lucas", 23, "Ciência da Computação"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();

        Aluno aluno = mapaAlunos.get(matricula);
        if (aluno != null) {
            System.out.println("Dados do aluno:");
            System.out.println(aluno);
        } else {
            System.out.println("Aluno não encontrado!");
        }

        scanner.close();
    }
}