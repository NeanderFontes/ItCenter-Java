package RPG.Entidades.Personagens;

import RPG.Entidades.Heroi;
import RPG.Entidades.NPC;
import RPG.Enum.ArmaPrincipal;
import RPG.Enum.ClassePersonagem;
import RPG.Item.AbstractClass.ItemHeroi;

public class Espadachim extends Heroi {
    private ClassePersonagem classePersonagem;

    /**
     * Método Construtor Espadachim da Abstract SuperClass <b>Heroi</b>
     *
     * @param nomeEntidade       - Nome do Espadachim
     * @param vidaEntidade       - Total de Vida do Espadachim
     * @param forcaEntidade      - Total de Força de Ataque do Espadachim
     * @param nivelHeroi         - Nivel do Espadachim
     * @param ouroHeroi          - Quantidade de ouro do Espadachim
     * @param armaPrincipalHeroi - Tipo de Arma do Espadachim
     * @param classePersonagem   - Tipo da Classe do Espadachim
     */
    public Espadachim(String nomeEntidade, int vidaEntidade, int forcaEntidade, int nivelHeroi, int ouroHeroi, ArmaPrincipal armaPrincipalHeroi, ClassePersonagem classePersonagem) {
        super(nomeEntidade, vidaEntidade, forcaEntidade, nivelHeroi, ouroHeroi, armaPrincipalHeroi);
        this.classePersonagem = ClassePersonagem.ESPADACHIM;
    }

    public int usarPocao(ItemHeroi usarItemPocao) {
        return 0;
    }

    /**
     * Método @Override Adaptado ao Espadachim para Atacar um NPC
     *
     * @param oponenteNPC - Recebe como Parâmetro o Npc para Batalha
     */
    @Override
    public void atacar(NPC oponenteNPC) {

    }

    /**
     * Método Getter e Setter do Espadachim
     */
    public ClassePersonagem getClassePersonagem() {
        return this.classePersonagem;
    }

    public void setClassePersonagem(ClassePersonagem classePersonagem) {
        this.classePersonagem = classePersonagem;
    }
}
