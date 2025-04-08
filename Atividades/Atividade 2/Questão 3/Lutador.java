public class Lutador {
    private String nome;
    private int energia;
    private int forca;

    public Lutador(String nome, int energia, int forca) {
        this.nome = nome;
        this.energia = energia;
        this.forca = forca;
    }

    public void reduzirEnergia(int quantidade) {
        this.energia -= quantidade;
        if (this.energia < 0) {
            this.energia = 0;
        }
    }

    public void aplicarGolpe(Lutador outroLutador) {
        outroLutador.reduzirEnergia(this.forca);
    }

    public int getEnergia() {
        return this.energia;
    }

    public static void main(String[] args) {
        Lutador ryu = new Lutador("Ryu", 100, 10);

        Lutador bison = new Lutador("Bison", 100, 12);

        ryu.aplicarGolpe(bison);
        ryu.aplicarGolpe(bison);
        ryu.aplicarGolpe(bison);

        System.out.println("Energia de Bison após três golpes: " + bison.getEnergia());

        bison.aplicarGolpe(ryu);
        bison.aplicarGolpe(ryu);
        bison.aplicarGolpe(ryu);
        bison.aplicarGolpe(ryu);
        bison.aplicarGolpe(ryu);
        bison.aplicarGolpe(ryu);
        bison.aplicarGolpe(ryu);
        bison.aplicarGolpe(ryu);

        System.out.println("Energia de Ryu após oito golpes: " + ryu.getEnergia());
    }
}