package InstutoVidaMundial;

import InstutoVidaMundial.Enum.AlimentacaoDietaAnimal;

/**
 * Classe para Herdar valores da SuperClass <b>SerVivo</b>
 * <p>
 * Animal, que terá os seguintes atributos:
 * o Boolean fome
 * o Double Peso (peso em Kg.)
 * o Double inteligência (0 - 100)
 * o Alimentacao dieta (Carnívoro, Herbívoro, Omnívoro)
 * o String barulho
 */
public class Animal extends SerVivo {
    private boolean fomeAnimal;
    private double pesoAnimal;
    private double inteligenciaAnimal;
    private AlimentacaoDietaAnimal dietaAnimal;
    private String barulhoAnimal;

    /**
     * Método Construtor da Class Animal extends <b>SerVivo</b>
     *
     * @param nomeSerVivo        - Nome do Animal
     * @param especieSerVivo     - Espécie do Animal
     * @param paisOrigemSerVivo  - País de Origem do Animal
     * @param idadeSerVivo       - Idade do Animal
     * @param fomeAnimal         - Fome do Animal tipo boolean(true, false)
     * @param pesoAnimal         - Peso do Animal
     * @param inteligenciaAnimal - Inteligência do Animal
     * @param dietaAnimal        - Dieta do Alimentacao Enum.(Carnívoro, Herbívoro, Omnívoro)
     * @param barulhoAnimal      - Barulho que o Animal emite
     */
    public Animal(String nomeSerVivo, String especieSerVivo, String paisOrigemSerVivo, int idadeSerVivo, boolean fomeAnimal, double pesoAnimal, double inteligenciaAnimal, AlimentacaoDietaAnimal dietaAnimal, String barulhoAnimal) {
        super(nomeSerVivo, especieSerVivo, paisOrigemSerVivo, idadeSerVivo);
        this.fomeAnimal = fomeAnimal;
        this.pesoAnimal = pesoAnimal;
        this.inteligenciaAnimal = inteligenciaAnimal;
        this.dietaAnimal = dietaAnimal;
        this.barulhoAnimal = barulhoAnimal;
    }

    public boolean isFomeAnimal() {
        return fomeAnimal;
    }

    public void setFomeAnimal(boolean fomeAnimal) {
        this.fomeAnimal = fomeAnimal;
    }

    public double getPesoAnimal() {
        return pesoAnimal;
    }

    public void setPesoAnimal(double pesoAnimal) {
        this.pesoAnimal = pesoAnimal;
    }

    public double getInteligenciaAnimal() {
        return inteligenciaAnimal;
    }

    public void setInteligenciaAnimal(double inteligenciaAnimal) {
        this.inteligenciaAnimal = inteligenciaAnimal;
    }

    public AlimentacaoDietaAnimal getDietaAnimal() {
        return dietaAnimal;
    }

    public void setDietaAnimal(AlimentacaoDietaAnimal dietaAnimal) {
        this.dietaAnimal = dietaAnimal;
    }

    public String getBarulhoAnimal() {
        return barulhoAnimal;
    }

    public void setBarulhoAnimal(String barulhoAnimal) {
        this.barulhoAnimal = barulhoAnimal;
    }
}
