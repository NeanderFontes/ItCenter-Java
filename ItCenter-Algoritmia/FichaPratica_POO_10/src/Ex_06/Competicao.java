package Ex_06;

/**
 * Crie uma classe chamada "Atleta" que armazena informações sobre um atleta, incluindo nome, modalidade
 * desportiva, altura, peso e país de origem. Cada atleta pode participar numa ou mais competições.
 * a. De seguida, crie a classe Competicao, que armazena informações sobre uma competição, incluindo
 * o nome da competição, país, e a lista de atletas participantes.
 * b. Crie métodos para adicionar atletas.
 * c. No Main crie, pelo menos, 6 atletas.
 * d. No Main crie, pelo menos, 2 competições (onde são adicionados os participantes).
 * e. Crie um método para imprimir as informações de uma competição, inclusive a lista de atletas.
 */
public class Competicao {
    private Atleta[] atletaPraCompetir;
    private int atletaAdicionado;
    private String tipoCompeticao, paisCompeticao;

    /**
     * Construtor do Objeto Competição para
     *
     * @param tipoCompeticao - Tipo da Modalidade Esportiva
     * @param paisCompeticao - País-Sede da Competição
     */
    public Competicao(String tipoCompeticao, String paisCompeticao) {
        this.atletaPraCompetir = new Atleta[50];
        this.atletaAdicionado = 0;
        this.tipoCompeticao = tipoCompeticao;
        this.paisCompeticao = paisCompeticao;
    }

    /**
     * Método para Adicionar atleta novo para a competição
     *
     * @param addAtleta
     */
    public void addAtletaPraCompeticao(Atleta addAtleta) {
        this.atletaPraCompetir[this.atletaAdicionado++] = addAtleta;
    }

    /**
     * Método para listar os atletas que está cadastrado para competir:
     */
    public void listarAtletas() {
        System.out.println("Total de Atletas no Campeonato = " + this.atletaAdicionado);
        for (int numIndice = 0; numIndice < this.atletaAdicionado; numIndice++) {
            System.out.print((numIndice + 1) + "º :");
            this.atletaPraCompetir[numIndice].exibirDetalhesAtleta();
            System.out.println();
        }
    }

    /**
     * Método para imprimir no console informações da competição.
     */
    public void infoCompeticao() {
        System.out.println("++++++++++++ COMPETIÇÃO +++++++++++++");
        System.out.println("País-Sede: " + this.paisCompeticao);
        System.out.println("Tipo da Modalidade: " + this.tipoCompeticao);
    }
}
