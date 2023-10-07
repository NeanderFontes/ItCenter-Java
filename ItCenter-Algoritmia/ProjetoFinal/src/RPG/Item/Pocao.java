package RPG.Item;

import RPG.Item.AbstractClass.Consumivel;

public class Pocao extends Consumivel {
    private int recuperarVida;
    private int aumentarForca;

    /**
     * Método Construtor Poção da Abstract SuperClass <b>Consumivel</b>
     *
     * @param nomeItemHeroi  - Nome da Poção de <b>Consumivel</b>
     * @param precoItemHeroi - Preço da Poção de <b>Consumivel</b>
     * @param recuperarVida  - Quantidade de Hp Recuperado da Poção do <b>Consumivel</b>
     * @param aumentarForca  - Quantidade de Força Aumentada da Poção do <b>Consumivel</b>
     */
    public Pocao(String nomeItemHeroi, int precoItemHeroi, int recuperarVida, int aumentarForca) {
        super(nomeItemHeroi, precoItemHeroi);
        this.recuperarVida = recuperarVida;
        this.aumentarForca = aumentarForca;
    }



    /**
     * Método para Mostrar detalhe de cada Item
     */
    public int getRecuperarVida() {
        return recuperarVida;
    }

    public void setRecuperarVida(int recuperarVida) {
        this.recuperarVida = recuperarVida;
    }

    public int getAumentarForca() {
        return aumentarForca;
    }

    public void setAumentarForca(int aumentarForca) {
        this.aumentarForca = aumentarForca;
    }
}
