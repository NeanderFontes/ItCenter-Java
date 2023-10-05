package RPG.Entidades;

import RPG.Item.AbstractClass.ItemHeroi;

import java.util.ArrayList;

public abstract class NPC extends Entidade {
    private int ouroNPC;
    private ArrayList<ItemHeroi> inventarioNPC;

    /**
     * Método Construtor da SuperClass abstrata <b>Entidade</b>
     *
     * @param nomeEntidade  - Nome do NPC
     * @param vidaEntidade  - Total de Vida do NPC
     * @param forcaEntidade - Total de Força do NPC
     * @param ouroNPC       - Arma Principal do NPC
     */
    public NPC(String nomeEntidade, int vidaEntidade, int forcaEntidade, int ouroNPC) {
        super(nomeEntidade, vidaEntidade, forcaEntidade);
        this.ouroNPC = ouroNPC;
        this.inventarioNPC = new ArrayList<>();
    }

    /**
     * Métodos Getter e Setter da SubClass <b>NPC</b>
     */
    public int getOuroNPC() {
        return this.ouroNPC;
    }

    public void setOuroNPC(int ouroNPC) {
        this.ouroNPC = ouroNPC;
    }

    public ArrayList<ItemHeroi> getInventarioNPC() {
        return this.inventarioNPC;
    }

    public void setInventarioNPC(ArrayList<ItemHeroi> inventarioNPC) {
        this.inventarioNPC = inventarioNPC;
    }
}
