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
     * Método para o Herói Usar Poção
     */
    public void usarPocao() {

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

}
