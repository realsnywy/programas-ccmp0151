public class Questao5 {
    public static void main(String[] args) {
        try {
            Pessoa pessoa1 = new Pessoa("João", 25, 1.75);

            System.out.println("Detalhes da pessoa:");
            pessoa1.exibirDetalhes();

            System.out.println("\nAtualizando os atributos...");
            pessoa1.setNome("Maria");
            pessoa1.setIdade(30);
            pessoa1.setAltura(1.65);
            pessoa1.exibirDetalhes();

            System.out.println("\nTentando definir valores inválidos...");
            pessoa1.setIdade(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            System.out.println("\nTentando criar uma pessoa com valores inválidos...");
            Pessoa pessoaInvalida = new Pessoa("", -10, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar a pessoa: " + e.getMessage());
        }
    }
}