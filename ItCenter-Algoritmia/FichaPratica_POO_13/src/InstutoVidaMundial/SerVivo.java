package InstutoVidaMundial;

/**
 * SuperClass <b>SerVivo</b>
 * <p>
 * O Instituto de Vida Mundial® é responsável por observar, estudar e armazenar informações relativas a todos
 * os seres vivos. Com isto, foi contactado pelo IVM® de forma a criar uma pequena aplicação que refletisse o
 * comportamento e permitisse simular a vida de determinado ser vivo num ambiente.
 * Para isso, deve criar a classe SerVivo que tem como atributos:
 * • String Nome (nome do animal)
 * • String Espécie (espécie)
 * • String País (país de origem)
 * • Int Idade (idade)
 */
public class SerVivo {
    private String nomeSerVivo, especieSerVivo, paisOrigemSerVivo;
    private int idadeSerVivo;

    /**
     * Método Construtor da SuperClass <b>SerVivo</b>
     *
     * @param nomeSerVivo       - Nome do SerVivo
     * @param especieSerVivo    - Espécie do SerVivo
     * @param paisOrigemSerVivo - País de Origem do SerVivo
     * @param idadeSerVivo      - Idade do SerVivo
     */
    public SerVivo(String nomeSerVivo, String especieSerVivo, String paisOrigemSerVivo, int idadeSerVivo) {
        this.nomeSerVivo = nomeSerVivo;
        this.especieSerVivo = especieSerVivo;
        this.paisOrigemSerVivo = paisOrigemSerVivo;
        this.idadeSerVivo = idadeSerVivo;
    }

    public String getNomeSerVivo() {
        return nomeSerVivo;
    }

    public void setNomeSerVivo(String nomeSerVivo) {
        this.nomeSerVivo = nomeSerVivo;
    }

    public String getEspecieSerVivo() {
        return especieSerVivo;
    }

    public void setEspecieSerVivo(String especieSerVivo) {
        this.especieSerVivo = especieSerVivo;
    }

    public String getPaisOrigemSerVivo() {
        return paisOrigemSerVivo;
    }

    public void setPaisOrigemSerVivo(String paisOrigemSerVivo) {
        this.paisOrigemSerVivo = paisOrigemSerVivo;
    }

    public int getIdadeSerVivo() {
        return idadeSerVivo;
    }

    public void setIdadeSerVivo(int idadeSerVivo) {
        this.idadeSerVivo = idadeSerVivo;
    }
}
