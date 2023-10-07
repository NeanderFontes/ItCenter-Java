package RPG.Entidades.Personagens;

import RPG.Entidades.Heroi;
import RPG.Entidades.NPC;
import RPG.Item.AbstractClass.ItemHeroi;

public class Espadachim extends Heroi {

    /**
     * Método Construtor Espadachim da Abstract SuperClass <b>Heroi</b>
     *
     * @param nomeEntidade       - Nome do Espadachim
     * @param vidaEntidade       - Total de Vida do Espadachim
     * @param forcaEntidade      - Total de Força de Ataque do Espadachim
     */
    public Espadachim(String nomeEntidade, int vidaEntidade, int forcaEntidade) {
        super(nomeEntidade, vidaEntidade, forcaEntidade);
    }

    /**
     * Método para o Herói Usar Poção
     */
    public void usarPocao() {

    }

    public int usarPocao(ItemHeroi usarItemPocao) {
        return 0;
    }

    /**
     * Método @Override Adaptado ao Espadachim para Atacar um NPC
     *
     * @param oponenteNPC - Recebe como Parâmetro o Npc para Batalha
     */
    @Override
    public void atacar(NPC oponenteNPC) {

    }

    /**
     * Método Getter e Setter do Espadachim
     */

}
