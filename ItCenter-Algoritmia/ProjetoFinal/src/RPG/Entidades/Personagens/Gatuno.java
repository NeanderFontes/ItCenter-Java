package RPG.Entidades.Personagens;

import RPG.Entidades.Heroi;
import RPG.Entidades.NPC;
import RPG.Enum.ArmaPrincipal;
import RPG.Enum.ClassePersonagem;

public class Gatuno extends Heroi {
    private ClassePersonagem classePersonagem;

    /**
     * Método Construtor Gatuno da Abstract SuperClass <b>Heroi</b>
     *
     * @param nomeEntidade       - Nome do Gatuno
     * @param vidaEntidade       - Total de Vida do Gatuno
     * @param forcaEntidade      - Total de Força de Ataque do Gatuno
     * @param nivelHeroi         - Nivel do Gatuno
     * @param ouroHeroi          - Quantidade de ouro do Gatuno
     * @param armaPrincipalHeroi - Tipo de Arma do Gatuno
     * @param classePersonagem   - Tipo da Classe do Gatuno
     */
    public Gatuno(String nomeEntidade, int vidaEntidade, int forcaEntidade, int nivelHeroi, int ouroHeroi, ArmaPrincipal armaPrincipalHeroi, ClassePersonagem classePersonagem) {
        super(nomeEntidade, vidaEntidade, forcaEntidade, nivelHeroi, ouroHeroi, armaPrincipalHeroi);
        this.classePersonagem = ClassePersonagem.GATUNO;
    }

    /**
     * Método @Override Adaptado ao Gatuno para Atacar um NPC
     *
     * @param oponenteNPC - Recebe como Parâmetro o Npc para Batalha
     */
    @Override
    public void atacar(NPC oponenteNPC) {

    }

    /**
     * Método Getter e Setter do Gatuno
     */
    public ClassePersonagem getClassePersonagem() {
        return this.classePersonagem;
    }

    public void setClassePersonagem(ClassePersonagem classePersonagem) {
        this.classePersonagem = classePersonagem;
    }
}
