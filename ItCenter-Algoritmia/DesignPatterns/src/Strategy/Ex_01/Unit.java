package Strategy.Ex_01;

public class Unit {
    private String nome;
    private int vida;
    private int forca;
    private AtackStrategy atackStrategy;

    public Unit(String nome, int vida, int forca, AtackStrategy atackStrategy) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.atackStrategy = atackStrategy;
    }

}
