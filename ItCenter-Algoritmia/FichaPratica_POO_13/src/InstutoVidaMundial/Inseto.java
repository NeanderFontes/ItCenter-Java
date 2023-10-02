package InstutoVidaMundial;

/**
 * Classe para Herdar valores da SuperClass <b>SerVivo</b>
 * <p>
 * Inseto, que terá os seguintes atributos:
 * o Boolean Venenoso
 */
public class Inseto extends SerVivo {
    private boolean venenoInseto;

    /**
     * Método Construtor da Class Inseto extends <b>SerVivo</b>
     *
     * @param nomeSerVivo       - Nome do Inseto
     * @param especieSerVivo    - Espécie do Inseto
     * @param paisOrigemSerVivo - País de Origem do Inseto
     * @param idadeSerVivo      - Idade do Inseto
     * @param venenoInseto      - Inseto Venenoso(true, false)
     */
    public Inseto(String nomeSerVivo, String especieSerVivo, String paisOrigemSerVivo, int idadeSerVivo, boolean venenoInseto) {
        super(nomeSerVivo, especieSerVivo, paisOrigemSerVivo, idadeSerVivo);
        this.venenoInseto = venenoInseto;
    }
}
