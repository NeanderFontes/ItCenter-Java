package RPG.Entidades.Personagens;

import RPG.Entidades.Heroi;
import RPG.Entidades.NPC;

public class Mercador extends Heroi {

    /**
     * Método Construtor Mercador da Abstract SuperClass <b>Heroi</b>
     *
     * @param nomeEntidade       - Nome do Mercador
     * @param vidaEntidade       - Total de Vida do Mercador
     * @param forcaEntidade      - Total de Força de Ataque do Mercador
     */
    public Mercador(String nomeEntidade, int vidaEntidade, int forcaEntidade) {
        super(nomeEntidade, vidaEntidade, forcaEntidade);
    }

    /**
     * Método @Override Adaptado ao Mercador para Atacar um NPC
     * O Mercador por sem ambicioso recebe 10% a mais do Ouro ao Matar o NPC...
     * ... tem prioridade de ataque
     * Se o Arqueiro ganhar a batalha: Nivel +1, +3% de HP e +3% de Força.
     *
     * @param oponenteNPC - Recebe como Parâmetro o Npc para Batalha
     */
    @Override
    public void atacar(NPC oponenteNPC) {

    }

    /**
     * Método Getter e Setter do Mercador
     */

}
