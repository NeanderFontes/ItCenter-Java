package RPG.Entidades.Personagens;

import RPG.Entidades.Heroi;
import RPG.Entidades.NPC;

public class Mago extends Heroi {

    /**
     * Método Construtor Mago da Abstract SuperClass <b>Heroi</b>
     *
     * @param nomeEntidade       - Nome do Mago
     * @param vidaEntidade       - Total de Vida do Mago
     * @param forcaEntidade      - Total de Força de Ataque do Mago
     */
    public Mago(String nomeEntidade, int vidaEntidade, int forcaEntidade) {
        super(nomeEntidade, vidaEntidade, forcaEntidade);
    }

    /**
     * Método para o Herói Usar Poção
     */
    public void usarPocao() {

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

}
