package RPG.Entidades.Personagens;

import RPG.Entidades.Heroi;
import RPG.Entidades.NPC;
import RPG.Enum.ArmaPrincipal;
import RPG.Enum.ClassePersonagem;

public class Mercador extends Heroi {
    private ClassePersonagem classePersonagem;

    /**
     * Método Construtor Mercador da Abstract SuperClass <b>Heroi</b>
     *
     * @param nomeEntidade       - Nome do Mercador
     * @param vidaEntidade       - Total de Vida do Mercador
     * @param forcaEntidade      - Total de Força de Ataque do Mercador
     * @param nivelHeroi         - Nivel do Mercador
     * @param ouroHeroi          - Quantidade de ouro do Mercador
     * @param armaPrincipalHeroi - Tipo de Arma do Mercador
     * @param classePersonagem   - Tipo da Classe do Mercador
     */
    public Mercador(String nomeEntidade, int vidaEntidade, int forcaEntidade, int nivelHeroi, int ouroHeroi, ArmaPrincipal armaPrincipalHeroi, ClassePersonagem classePersonagem) {
        super(nomeEntidade, vidaEntidade, forcaEntidade, nivelHeroi, ouroHeroi, armaPrincipalHeroi);
        this.classePersonagem = ClassePersonagem.MERCADOR;
    }

    /**
     * Método @Override Adaptado ao Mercador para Atacar um NPC
     *
     * @param oponenteNPC - Recebe como Parâmetro o Npc para Batalha
     */
    @Override
    public void atacar(NPC oponenteNPC) {

    }

    /**
     * Método Getter e Setter do Mercador
     */
    public ClassePersonagem getClassePersonagem() {
        return this.classePersonagem;
    }

    public void setClassePersonagem(ClassePersonagem classePersonagem) {
        this.classePersonagem = classePersonagem;
    }
}
