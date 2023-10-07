package RPG.Entidades;

import RPG.Item.AbstractClass.Consumivel;
import RPG.Item.ArmaPrincipal;

import java.util.ArrayList;

public abstract class Heroi extends Entidade {
    private int nivelHeroi, ouroHeroi;
    private ArmaPrincipal armaPrincipalHeroi;
    private ArrayList<Consumivel> inventarioHeroi;

    /**
     * Método Construtor da SuperClass abstrata <b>Entidade</b>
     *
     * @param nomeEntidade  - Nome do Herói
     * @param vidaEntidade  - Total de Vida do Herói (em hp)
     * @param forcaEntidade - Total de Força do Herói
     */
    public Heroi(String nomeEntidade, int vidaEntidade, int forcaEntidade) {
        super(nomeEntidade, vidaEntidade, forcaEntidade);
        this.nivelHeroi = 1;
        this.ouroHeroi = 0;
        this.armaPrincipalHeroi = null;
        this.inventarioHeroi = new ArrayList<>();
    }

    /**
     * Método Abstrato Atacar da Class <b>Heroi</b> para Criar implementações de acordo com cada @override
     *
     * @param oponenteNPC - Recebe como Parâmetro o Npc para Batalha
     */
    public abstract void atacar(NPC oponenteNPC);

    /**
     * Método para Exibir Detalhes do Herói:
     */
    public void exibirDetalhes() {
        System.out.println("************************ Herói ************************");
        System.out.println("SubClasse do Herói: " + this.getTipoHeroi());
        System.out.println("Nickname: " + this.getNomeEntidade());
        System.out.println("Nivel: " + this.getNivelHeroi());
        System.out.println("Total HP: " + this.getVidaEntidade());
        System.out.println("Força: " + this.getForcaEntidade());
        System.out.println("Quantidade Ouro: " + this.getOuroHeroi());
        System.out.println("Arma Principal: " + this.armaPrincipalHeroi);
        System.out.println("*******************************************************");
    }


    /**
     * Método para Completar a comparação entre tipos de classes
     *
     * @return - Tipo do Personagem "Aprendiz, Arqueiro, Espadachim..."
     */
    public String getTipoHeroi() {
        String classeCompleta = this.getClass().getName();
        //RPG.Entidades.Personagens.Gatuno

        String[] classeCompletaPartida = classeCompleta.split("\\.");
        return classeCompletaPartida[3];
    }

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

    public ArrayList<Consumivel> getInventarioHeroi() {
        return this.inventarioHeroi;
    }

    public void setInventarioHeroi(ArrayList<Consumivel> inventarioHeroi) {
        this.inventarioHeroi = inventarioHeroi;
    }

    public void setArmaPrincipalHeroi(ArmaPrincipal armaPrincipalHeroi) {
        this.armaPrincipalHeroi = armaPrincipalHeroi;
    }
}
