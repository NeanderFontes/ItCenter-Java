package RPG.Entidades;

import RPG.Item.AbstractClass.Consumivel;
import RPG.Enum.ArmaPrincipal;

import java.util.ArrayList;

public abstract class Heroi extends Entidade {
    private int nivelHeroi, ouroHeroi;
    private ArmaPrincipal armaPrincipalHeroi;
    private ArrayList<Consumivel> inventarioHeroi;

    /**
     * Método Construtor da SuperClass abstrata <b>Entidade</b>
     *
     * @param nomeEntidade       - Nome do Herói
     * @param vidaEntidade       - Total de Vida do Herói (em hp)
     * @param forcaEntidade      - Total de Força do Herói
     * @param nivelHeroi         - Nivel do Herói
     * @param ouroHeroi          - Quantidade de Ouro do Herói
     * @param armaPrincipalHeroi - Arma Principal do Herói
     */
    public Heroi(String nomeEntidade, int vidaEntidade, int forcaEntidade, int nivelHeroi, int ouroHeroi, ArmaPrincipal armaPrincipalHeroi) {
        super(nomeEntidade, vidaEntidade, forcaEntidade);
        this.nivelHeroi = nivelHeroi;
        this.ouroHeroi = ouroHeroi;
        this.armaPrincipalHeroi = armaPrincipalHeroi;
        this.inventarioHeroi = new ArrayList<>();
    }

    /**
     * Método Abstrato Atacar da Class <b>Heroi</b> para Criar implementações de acordo com cada @override
     *
     * @param oponenteNPC - Recebe como Parâmetro o Npc para Batalha
     */
    public abstract void atacar(NPC oponenteNPC);

    /**
     * Métodos Getter e Setter da SubClass <b>Heroi</b>
     */
    public int getNivelHeroi() {
        return this.nivelHeroi;
    }

    public void setNivelHeroi(int nivelHeroi) {
        this.nivelHeroi = nivelHeroi;
    }

    public int getOuroHeroi() {
        return this.ouroHeroi;
    }

    public void setOuroHeroi(int ouroHeroi) {
        this.ouroHeroi = ouroHeroi;
    }

    public ArmaPrincipal getArmaPrincipalHeroi() {
        return this.armaPrincipalHeroi;
    }

    public void setArmaPrincipalHeroi(ArmaPrincipal armaPrincipalHeroi) {
        this.armaPrincipalHeroi = armaPrincipalHeroi;
    }

    public ArrayList<Consumivel> getInventarioHeroi() {
        return this.inventarioHeroi;
    }

    public void setInventarioHeroi(ArrayList<Consumivel> inventarioHeroi) {
        this.inventarioHeroi = inventarioHeroi;
    }
}
