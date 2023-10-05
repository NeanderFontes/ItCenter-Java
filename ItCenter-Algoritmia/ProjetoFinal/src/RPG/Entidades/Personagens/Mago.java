package RPG.Entidades.Personagens;

import RPG.Entidades.Heroi;
import RPG.Entidades.NPC;
import RPG.Enum.ArmaPrincipal;
import RPG.Enum.ClassePersonagem;

public class Mago extends Heroi {
    private ClassePersonagem classePersonagem;

    /**
     * Método Construtor Mago da Abstract SuperClass <b>Heroi</b>
     *
     * @param nomeEntidade       - Nome do Mago
     * @param vidaEntidade       - Total de Vida do Mago
     * @param forcaEntidade      - Total de Força de Ataque do Mago
     * @param nivelHeroi         - Nivel do Mago
     * @param ouroHeroi          - Quantidade de ouro do Mago
     * @param armaPrincipalHeroi - Tipo de Arma do Mago
     * @param classePersonagem   - Tipo da Classe do Mago
     */
    public Mago(String nomeEntidade, int vidaEntidade, int forcaEntidade, int nivelHeroi, int ouroHeroi, ArmaPrincipal armaPrincipalHeroi, ClassePersonagem classePersonagem) {
        super(nomeEntidade, vidaEntidade, forcaEntidade, nivelHeroi, ouroHeroi, armaPrincipalHeroi);
        this.classePersonagem = ClassePersonagem.MAGO;
    }

    /**
     * Método @Override Adaptado ao Mago para Atacar um NPC
     *
     * @param oponenteNPC - Recebe como Parâmetro o Npc para Batalha
     */
    @Override
    public void atacar(NPC oponenteNPC) {

    }

    /**
     * Método Getter e Setter do Mago
     */
    public ClassePersonagem getClassePersonagem() {
        return this.classePersonagem;
    }

    public void setClassePersonagem(ClassePersonagem classePersonagem) {
        this.classePersonagem = classePersonagem;
    }
}
