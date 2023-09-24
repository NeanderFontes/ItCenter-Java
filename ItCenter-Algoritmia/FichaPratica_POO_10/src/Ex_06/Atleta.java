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
public class Atleta {
    private String nomeAtleta, modalidadeAtleta, paisOrigemAtleta;
    private double alturaAtleta;

    /**
     * Método Construtor do Objeto Atleta:
     *
     * @param nomeAtleta       - Nome do Atleta
     * @param modalidadeAtleta - Modalidade Esportiva do Atlea
     * @param paisOrigemAtleta - País de Origem do Atleta
     * @param alturaAtleta     - Altura do Atleta (em metros)
     */
    public Atleta(String nomeAtleta, String modalidadeAtleta, String paisOrigemAtleta, double alturaAtleta) {
        this.nomeAtleta = nomeAtleta;
        this.modalidadeAtleta = modalidadeAtleta;
        this.paisOrigemAtleta = paisOrigemAtleta;
        this.alturaAtleta = alturaAtleta;
    }

    /**
     * Método para Exibir:
     * Nome do Atleta
     * Especialidade de Esporte
     * País de Origem do Atleta
     */
    public void exibirDetalhesAtleta() {
        System.out.print("Atleta: " + this.nomeAtleta + " | Especialidade: " + this.modalidadeAtleta + " | País: " + this.paisOrigemAtleta);
    }
}
