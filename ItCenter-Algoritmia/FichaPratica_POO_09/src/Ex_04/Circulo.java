package Ex_04;

/**
 * Class Circulo
 */
public class Circulo {

    private double raio;
    private final double PI = Math.PI;

    /**
     * Método Construtor
     * @param raio
     */
    public Circulo(double raio) {
        this.raio = raio;
    }

    public double areaCirculo() {
        return (this.PI * this.raio * 2);
    }

    /**
     * M+etodo especial setter para modificar raio do Cículo
     * @param raio - Raio do Circulo
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }

}
