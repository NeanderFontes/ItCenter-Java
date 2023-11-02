package RPG.Item;

import RPG.Entidades.Heroi;
import RPG.Item.AbstractClass.ItemHeroi;

public class ArmaPrincipal extends ItemHeroi {
    private int ataqueNormal, ataqueEspecial;

    /**
     * Método Construtor da Abstract SuperClass <b>ItemHeroi</b>
     *
     * @param nomeItemHeroi  - Nome do Arma para o Herói.
     * @param precoItemHeroi - Preço da Arma para o Herói.
     * @param ataqueNormal   - Ataque Normal da Arma do Herói
     * @param ataqueEspecial - Ataque Especial da Arma do Herói
     */
    public ArmaPrincipal(String nomeItemHeroi, int precoItemHeroi, int ataqueNormal, int ataqueEspecial) {
        super(nomeItemHeroi, precoItemHeroi);
        this.ataqueNormal = ataqueNormal;
        this.ataqueEspecial = ataqueEspecial;
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
}
