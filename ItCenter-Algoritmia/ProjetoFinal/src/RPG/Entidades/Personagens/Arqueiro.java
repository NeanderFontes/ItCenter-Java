package RPG.Entidades.Personagens;

import RPG.Entidades.Heroi;
import RPG.Entidades.NPC;
import RPG.Enum.ArmaPrincipal;
import RPG.Enum.ClassePersonagem;

public class Arqueiro extends Heroi {
    private ClassePersonagem classePersonagem;

    /**
     * Método Construtor Arqueiro da Abstract SuperClass <b>Heroi</b>
     *
     * @param nomeEntidade       - Nome do Arqueiro
     * @param vidaEntidade       - Total de Vida do Arqueiro
     * @param forcaEntidade      - Total de Força de Ataque do Arqueiro
     * @param nivelHeroi         - Nivel do Arqueiro
     * @param ouroHeroi          - Quantidade de ouro do Arqueiro
     * @param armaPrincipalHeroi - Tipo de Arma do Arqueiro
     * @param classePersonagem   - Tipo da Classe do Arqueiro
     */
    public Arqueiro(String nomeEntidade, int vidaEntidade, int forcaEntidade, int nivelHeroi, int ouroHeroi, ArmaPrincipal armaPrincipalHeroi, ClassePersonagem classePersonagem) {
        super(nomeEntidade, vidaEntidade, forcaEntidade, nivelHeroi, ouroHeroi, armaPrincipalHeroi);
        this.classePersonagem = ClassePersonagem.ARQUEIRO;
    }

    /**
     * Método @Override Adaptado ao Arqueiro para Atacar um NPC
     *
     * @param oponenteNPC - Recebe como Parâmetro o Npc para Batalha
     */
    @Override
    public void atacar(NPC oponenteNPC) {

    }

    /**
     * Método Getter e Setter do Arqueiro
     */
    public ClassePersonagem getClassePersonagem() {
        return this.classePersonagem;
    }

    public void setClassePersonagem(ClassePersonagem classePersonagem) {
        this.classePersonagem = classePersonagem;
    }
}
