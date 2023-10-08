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
     * Método @Override Adaptado ao Mago para Atacar um NPC
     * O Mago por não ter proteção devida recebe 10% de Dano a mais do ataque do NPC...
     * ... que por sua vez também tem 20% de dano a mais por ser Ataque Mágico
     * Se o Mago ganhar a batalha: Nivel +1, +5% de HP e +2% de Força.
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
