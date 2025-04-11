public class Questao2 {
    public static void main(String[] args) {
        try {
            Carro meuCarro = new Carro("Honda", "Civic", 2018);

            System.out.println("Detalhes do carro:");
            meuCarro.exibirDetalhes();

            System.out.println("\nAtualizando os atributos do carro...");
            meuCarro.setMarca("Toyota");
            meuCarro.setModelo("Corolla");
            meuCarro.setAno(2022);
            meuCarro.exibirDetalhes();

            System.out.println("\nTentando definir valores inválidos...");
            meuCarro.setAno(1800);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            Carro carroInvalido = new Carro("", "Civic", 2018);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar o carro: " + e.getMessage());
        }
    }
}