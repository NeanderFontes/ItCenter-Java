package RPG.Entidades.Personagens;

import RPG.Entidades.Heroi;
import RPG.Entidades.NPC;

public class Gatuno extends Heroi {

    /**
     * Método Construtor Gatuno da Abstract SuperClass <b>Heroi</b>
     *
     * @param nomeEntidade       - Nome do Gatuno
     * @param vidaEntidade       - Total de Vida do Gatuno
     * @param forcaEntidade      - Total de Força de Ataque do Gatuno
     */
    public Gatuno(String nomeEntidade, int vidaEntidade, int forcaEntidade) {
        super(nomeEntidade, vidaEntidade, forcaEntidade);
    }

    /**
     * Método para o Herói Usar Poção
     */
    public void usarPocao() {

    }

    /**
     * Método @Override Adaptado ao Gatuno para Atacar um NPC
     *
     * @param oponenteNPC - Recebe como Parâmetro o Npc para Batalha
     */
    @Override
    public void atacar(NPC oponenteNPC) {

    }
}
