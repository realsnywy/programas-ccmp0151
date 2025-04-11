public class Questao3 {
    public static void main(String[] args) {
        Biblioteca minhaBiblioteca = new Biblioteca();

        Livro livro1 = new Livro("1984", "George Orwell", 1949);
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro3 = new Livro("Dom Casmurro", "Machado de Assis", 1899);

        System.out.println("\nAdicionando livros à biblioteca...");
        minhaBiblioteca.adicionarLivro(livro1);
        minhaBiblioteca.adicionarLivro(livro2);
        minhaBiblioteca.adicionarLivro(livro3);

        System.out.println("\nListando todos os livros:");
        minhaBiblioteca.listarLivros();

        try {
            System.out.println("\nTentando adicionar um livro nulo...");
            minhaBiblioteca.adicionarLivro(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}