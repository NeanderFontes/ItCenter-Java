package Jogo;

/**
 * Implemente um jogo sobre Personagens que enfrentam inimigos perigosos, o objetivo será o jogador
 * definir qual a sua personagem e, seguidamente, jogar contra os inimigos, para isso:
 * a) Crie uma classe abstrata “Entidade” que tem como atributos nome (String), vida (int), força (int).
 * Seguidamente, crie duas subclasses Personagem e NPC (non-playable character).
 * b) A classe Personagem terá o atributo nível (int), categoria (ENUM contendo, por exemplo,
 * cavaleiro, mago, arqueiro, etc…) e arma (String).
 * c) Deve ser implementado o método atacar que recebe um inimigo (NPC) como parâmetro. Este
 * método “atacar” compara as estatísticas da personagem vs NPC. Tenha em consideração o
 * seguinte:
 * I - O jogo será por turnos, pelo que no primeiro turno de ataque começa sempre o
 * personagem. Será deduzida a força da personagem à vida do inimigo. Ao fim do ataque
 * do jogador, o inimigo retribui, sendo deduzida à vida do jogador a força do inimigo.
 * II - O método deve executar até que uma das entidades fique com a vida igual ou menor que
 * zero. Se o jogador ficar vivo, imprime uma mensagem na consola com o seguinte aspeto:
 * “Parabéns (“categoria da personagem”) (“nome da personagem”), ganhou um combate
 * contra um (“inimigo”) com o uso de (“arma”).” e passa de nível e incrementa a vida e a
 * força em 10%, restaurando a vida ao valor total mais incremento. Se o jogador morrer, o
 * programa deve encerrar com a mensagem “Perdeu”.
 * d) Numa classe Jogo, defina um método main, instancie uma personagem e três inimigos, de seguida,
 * faça a personagem enfrentar todos os inimigos.
 */
public abstract class Entidade {
    private String nomeEntidade;
    private int vidaEntidade, forcaEntidade;

    /**
     * Método Construtor da Class abstrata <b>Entidade</b>
     *
     * @param nomeEntidade  - Nome para Entidade
     * @param vidaEntidade  - Total de Vida da Entidade (em hp)
     * @param forcaEntidade - Total de Força da Entidade
     */
    public Entidade(String nomeEntidade, int vidaEntidade, int forcaEntidade) {
        this.nomeEntidade = nomeEntidade;
        this.vidaEntidade = vidaEntidade;
        this.forcaEntidade = forcaEntidade;
    }

    /**
     * Métodos Getter e Setter
     */
    public String getNomeEntidade() {
        return nomeEntidade;
    }

    public int getVidaEntidade() {
        return vidaEntidade;
    }

    public void setVidaEntidade(int vidaEntidade) {
        this.vidaEntidade = vidaEntidade;
    }

    public int getForcaEntidade() {
        return forcaEntidade;
    }

    public void setForcaEntidade(int forcaEntidade) {
        this.forcaEntidade = forcaEntidade;
    }
}
