public class Post {
    private String texto;
    private String link;
    private int numeroCurtidas;
    private int numeroCompartilhamentos;

    public Post(String texto, String link) {
        this.texto = texto;
        this.link = link;
        this.numeroCurtidas = 0;
        this.numeroCompartilhamentos = 0;
    }

    public void curtir() {
        this.numeroCurtidas++;
    }

    public void compartilhar() {
        this.numeroCompartilhamentos++;
    }

    public int getNumeroCurtidas() {
        return this.numeroCurtidas;
    }

    public int getNumeroCompartilhamentos() {
        return this.numeroCompartilhamentos;
    }

    public static void main(String[] args) {
        Post meuPost = new Post("Este é o meu último post no Facebook!", "https://www.youtube.com/watch?v=dQw4w9WgXcQ");

        meuPost.curtir();
        meuPost.curtir();
        meuPost.curtir();

        System.out.println("Número de curtidas: " + meuPost.getNumeroCurtidas());

        meuPost.compartilhar();
        meuPost.compartilhar();

        System.out.println("Número de compartilhamentos: " + meuPost.getNumeroCompartilhamentos());
    }
}