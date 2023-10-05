package RPG.Item;

import RPG.Item.AbstractClass.Consumivel;

public class Pocao extends Consumivel {
    private int recuperarVida;
    private int aumentarForca;
    //todo private int aumento de força (int) {Acredito que não deve ter esse modelo de Poção}

    /**
     *
     * @param nomeItemHeroi
     * @param recuperarVida
     * @param aumentarForca
     */
    public Pocao(String nomeItemHeroi, int recuperarVida, int aumentarForca) {
        super(nomeItemHeroi);
        this.recuperarVida = recuperarVida;
        this.aumentarForca = aumentarForca;
    }

    /**
     * Método para Mostrar detalhe de cada Item
     */
    public void mostrarDetalhePocao() {

    }
}
