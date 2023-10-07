package RPG.Item.AbstractClass;

public abstract class Consumivel extends ItemHeroi {

    /**
     * Método Construtor Abstract Consumivel da SuperClass <b>ItemHeroi</b>
     *
     * @param nomeItemHeroi  - Nome do Consumivel
     * @param precoItemHeroi - Preço do Consumivel
     */
    public Consumivel(String nomeItemHeroi, int precoItemHeroi) {
        super(nomeItemHeroi, precoItemHeroi);
    }
}
