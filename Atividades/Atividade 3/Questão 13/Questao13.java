public class Questao13 {
    public static void main(String[] args) {
        try {
            Carro carro1 = new Carro("Toyota", "Corolla", 2021);
            Carro carro2 = new Carro("Volkswagen", "Fusca", 1980);
            Carro carro3 = new Carro("Tesla", "Model 3", 2023);

            System.out.println("\nInformações do Carro 1:");
            carro1.exibirInformacoes();
            System.out.println("É recente? " + (carro1.ehRecente() ? "Sim" : "Não"));

            System.out.println("\nInformações do Carro 2:");
            carro2.exibirInformacoes();
            System.out.println("É recente? " + (carro2.ehRecente() ? "Sim" : "Não"));

            System.out.println("\nInformações do Carro 3:");
            carro3.exibirInformacoes();
            System.out.println("É recente? " + (carro3.ehRecente() ? "Sim" : "Não"));

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            System.out.println("\nTentando criar um carro com ano inválido...");
            Carro carroInvalido = new Carro("Ford", "T", 1800);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}