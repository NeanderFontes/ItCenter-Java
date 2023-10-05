package RPG.Item;

import RPG.Item.AbstractClass.ItemHeroi;

public class ArmaPrincipal extends ItemHeroi {
    private int ataqueNormal, ataqueEspecial;
    private ArmaPrincipal armaPrincipal;

    /**
     * Método Construtor da Abstract SuperClass <b>ItemHeroi</b>
     *
     * @param nomeItemHeroi  - Nome do Item para o Herói usar
     * @param ataqueNormal   - Ataque Normal do Herói
     * @param ataqueEspecial - Ataque Especial do Herói
     * @param armaPrincipal  - Arma Principal do Herói
     */
    public ArmaPrincipal(String nomeItemHeroi, int ataqueNormal, int ataqueEspecial, ArmaPrincipal armaPrincipal) {
        super(nomeItemHeroi);
        this.ataqueNormal = ataqueNormal;
        this.ataqueEspecial = ataqueEspecial;
        this.armaPrincipal = armaPrincipal;
    }

    /**
     * Métodos Getter e Setter da SubClass <b>ArmaPrincipal</b>
     */
    public int getAtaqueNormal() {
        return ataqueNormal;
    }

    public void setAtaqueNormal(int ataqueNormal) {
        this.ataqueNormal = ataqueNormal;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public ArmaPrincipal getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(ArmaPrincipal armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }
}
