package RPG.Entidades.Personagens;

import RPG.Entidades.Heroi;
import RPG.Entidades.NPC;

public class Arqueiro extends Heroi {

    /**
     * Método Construtor Arqueiro da Abstract SuperClass <b>Heroi</b>
     *
     * @param nomeEntidade       - Nome do Arqueiro
     * @param vidaEntidade       - Total de Vida do Arqueiro
     * @param forcaEntidade      - Total de Força de Ataque do Arqueiro
     */
    public Arqueiro(String nomeEntidade, int vidaEntidade, int forcaEntidade) {
        super(nomeEntidade, vidaEntidade, forcaEntidade);
    }

    /**
     * Método para o Herói Usar Poção
     */
    public void usarPocao() {

    }

    /**
     * Método @Override Adaptado ao Arqueiro para Atacar um NPC
     *
     * @param oponenteNPC - Recebe como Parâmetro o Npc para Batalha
     */
    @Override
    public void atacar(NPC oponenteNPC) {

    }

}
