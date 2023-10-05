package RPG.Entidades;

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
     * Método para Exibir detalhes de status do Jogadr
     */
    public void mostrarDetalhe() {
        System.out.println("================== Status do Jogador ==================");
        System.out.println("Jogador " + this.nomeEntidade);
        System.out.println("Hp " + this.vidaEntidade);
        System.out.println("Força " + this.forcaEntidade);
        System.out.println("=======================================================");
    }

    /**
     * Métodos Getter e Setter
     */
    public String getNomeEntidade() {
        return this.nomeEntidade;
    }

    public void setNomeEntidade(String nomeEntidade) {
        this.nomeEntidade = nomeEntidade;
    }

    public int getVidaEntidade() {
        return this.vidaEntidade;
    }

    public void setVidaEntidade(int vidaEntidade) {
        this.vidaEntidade = vidaEntidade;
    }

    public int getForcaEntidade() {
        return this.forcaEntidade;
    }

    public void setForcaEntidade(int forcaEntidade) {
        this.forcaEntidade = forcaEntidade;
    }
}
