import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        if (livro != null) {
            livros.add(livro);
            System.out.println("Livro adicionado com sucesso: " + livro.getTitulo());
        } else {
            throw new IllegalArgumentException("O livro não pode ser nulo.");
        }
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro na biblioteca.");
        } else {
            System.out.println("Livros na biblioteca:");
            for (Livro livro : livros) {
                livro.exibirDetalhes();
                System.out.println("-----");
            }
        }
    }
}