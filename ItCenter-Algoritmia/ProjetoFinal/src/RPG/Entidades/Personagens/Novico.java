package RPG.Entidades.Personagens;

import RPG.Entidades.Heroi;
import RPG.Entidades.NPC;

public class Novico extends Heroi {

    /**
     * Método Construtor Noviço da Abstract SuperClass <b>Heroi</b>
     *
     * @param nomeEntidade       - Nome do Noviço
     * @param vidaEntidade       - Total de Vida do Noviço
     * @param forcaEntidade      - Total de Força de Ataque do Noviço
     */
    public Novico(String nomeEntidade, int vidaEntidade, int forcaEntidade) {
        super(nomeEntidade, vidaEntidade, forcaEntidade);
    }

    /**
     * Método para o Herói Usar Poção
     */
    public void usarPocao() {

    }

    /**
     * Método @Override Adaptado ao Noviço para Atacar um NPC
     *
     * @param oponenteNPC - Recebe como Parâmetro o Npc para Batalha
     */
    @Override
    public void atacar(NPC oponenteNPC) {

    }

    /**
     * Método Getter e Setter do Noviço
     */

}
