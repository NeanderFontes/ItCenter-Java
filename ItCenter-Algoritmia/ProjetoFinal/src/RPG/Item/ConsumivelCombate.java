package RPG.Item;

import RPG.Item.AbstractClass.Consumivel;

public class ConsumivelCombate extends Consumivel {
    private int ataqueInstataneo;

    /**
     * Método Construtor de ConsumivelCombate da Abstract SuperClass <b>Consumivel</b>
     * @param nomeItemHeroi - Nome do Item
     * @param ataqueInstataneo -
     */
    public ConsumivelCombate(String nomeItemHeroi, int ataqueInstataneo) {
        super(nomeItemHeroi);
        this.ataqueInstataneo = ataqueInstataneo;
    }
}
