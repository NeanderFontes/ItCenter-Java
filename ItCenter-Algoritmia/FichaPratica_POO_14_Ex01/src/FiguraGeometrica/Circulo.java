package FiguraGeometrica;

/**
 * Crie duas subclasses concretas de FiguraGeometrica: "Retangulo", "Circulo" e “Triangulo”. Essas
 * classes devem ter um construtor que chama o construtor da superclasse (FiguraGeometrica),
 * assim como atributos específicos para cada um deles (comprimento, base, altura, raio, etc).
 * e. Para Circulo: "calcularArea()" que calcula a área do círculo (π x raio²) e retorna o valor como um
 * double. Também deve ter o método calcularPerimetro().
 */
public class Circulo extends FiguraGeometrica {
    private final double numPi = Math.PI;
    private double raioCirculo;

    /**
     * MMétodo Construtor do Circulo da SuperClass <b>FiguraGeometrica</b>
     *
     * @param corFigGeometrica - Cor da Círculo
     * @param raioCirculo      - Raio do Círculo
     */
    public Circulo(String corFigGeometrica, double raioCirculo) {
        super(corFigGeometrica);
        this.raioCirculo = raioCirculo;
    }

    /**
     * Override do método abstrato calcularArea() da SuperClass <b>FiguraGeometrica</b>
     *
     * @return - Área do Círculo
     */
    @Override
    public double calcularArea() {
        System.out.print("Área do Círculo = ");
        return (this.numPi * (this.raioCirculo * this.raioCirculo));
    }

    /**
     * Override do método abstrato calcularPerimetro() da SuperClass <b>FiguraGeometrica</b>
     *
     * @return - Perimetro do Círculo
     */
    @Override
    public double calcularPerimetro() {
        return 2 * (this.numPi * this.raioCirculo);
    }
}
