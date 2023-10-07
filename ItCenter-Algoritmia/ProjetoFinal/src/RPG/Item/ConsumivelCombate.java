package RPG.Item;

import RPG.Item.AbstractClass.Consumivel;

public class ConsumivelCombate extends Consumivel {
    private int ataqueInstataneo;

    /**
     * Método Construtor de ConsumivelCombate da Abstract SuperClass <b>Consumivel</b>
     *
     * @param nomeItemHeroi    - Nome do ConsumivelCombate
     * @param precoItemHeroi   - Preço do ConsumivelCombate
     * @param ataqueInstataneo - Valor de AtaqueInstataneo
     */
    public ConsumivelCombate(String nomeItemHeroi, int precoItemHeroi, int ataqueInstataneo) {
        super(nomeItemHeroi, precoItemHeroi);
        this.ataqueInstataneo = ataqueInstataneo;
    }



    /**
     * Método para Mostrar detalhe de cada Item
     */
    public int getAtaqueInstataneo() {
        return ataqueInstataneo;
    }

    public void setAtaqueInstataneo(int ataqueInstataneo) {
        this.ataqueInstataneo = ataqueInstataneo;
    }
}
