package Jogo;

/**
 * Implemente um jogo sobre Personagens que enfrentam inimigos perigosos, o objetivo será o jogador
 * definir qual a sua personagem e, seguidamente, jogar contra os inimigos, para isso:
 * a. Crie uma classe abstrata “Entidade” que tem como atributos nome (String), vida (int), força (int).
 * Seguidamente, crie duas subclasses Personagem e NPC (non-playable character).
 */
public class NPC extends Entidade {
    /**
     * Método Construtor do NPC (non-playable character)
     *
     * @param nomeEntidade  - Nome do NPC
     * @param vidaEntidade  - Vida do NPC (em hp)
     * @param forcaEntidade - Força do NPC
     */
    public NPC(String nomeEntidade, int vidaEntidade, int forcaEntidade) {
        super(nomeEntidade, vidaEntidade, forcaEntidade);
    }
}
