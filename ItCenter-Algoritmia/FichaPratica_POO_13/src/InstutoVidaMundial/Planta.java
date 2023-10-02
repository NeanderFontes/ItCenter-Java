package InstutoVidaMundial;

import InstutoVidaMundial.Enum.FamiliaPlanta;

/**
 * Classe para Herdar valores da SuperClass <b>SerVivo</b>
 * <p>
 * Planta, que terá os seguintes atributos:
 * o Família (Árvores, Flores, Ervas, ComeInsetos)
 * o Int Grau de Defesa (0 - 5) sendo 0 a inexistência de um mecanismo de defesa e 5 como
 * defesa muito boa.
 */
public class Planta extends SerVivo {
    private FamiliaPlanta tipoFamiliaPlanta;
    private int grauDefesaPlanta;

    /**
     * Método Construtor da Class Planta extends <b>SerVivo</b>
     *
     * @param nomeSerVivo       - Nome da Planta
     * @param especieSerVivo    - Espécie da Planta
     * @param paisOrigemSerVivo - País de Origem da Planta
     * @param idadeSerVivo      - Idade da Planta
     * @param tipoFamiliaPlanta - Tipo da Planta Enum.(Árvores, Flores, Ervas, ComeInsetos)
     * @param grauDefesaPlanta  -  (0 - 5) sendo 0 a inexistência de um mecanismo de defesa e 5 como
     *                          defesa muito boa.
     */

    public Planta(String nomeSerVivo, String especieSerVivo, String paisOrigemSerVivo, int idadeSerVivo, FamiliaPlanta tipoFamiliaPlanta, int grauDefesaPlanta) {
        super(nomeSerVivo, especieSerVivo, paisOrigemSerVivo, idadeSerVivo);
        this.tipoFamiliaPlanta = tipoFamiliaPlanta;
        this.grauDefesaPlanta = grauDefesaPlanta;
    }

    public FamiliaPlanta getTipoFamiliaPlanta() {
        return this.tipoFamiliaPlanta;
    }

    public void setTipoFamiliaPlanta(FamiliaPlanta tipoFamiliaPlanta) {
        this.tipoFamiliaPlanta = tipoFamiliaPlanta;
    }

    public int getGrauDefesaPlanta() {
        return this.grauDefesaPlanta;
    }

    public void setGrauDefesaPlanta(int grauDefesaPlanta) {
        this.grauDefesaPlanta = grauDefesaPlanta;
    }
}
