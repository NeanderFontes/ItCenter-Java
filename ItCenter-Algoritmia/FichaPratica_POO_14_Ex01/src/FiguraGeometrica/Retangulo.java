package FiguraGeometrica;

/**
 * Crie duas subclasses concretas de FiguraGeometrica: "Retangulo", "Circulo" e “Triangulo”. Essas
 * classes devem ter um construtor que chama o construtor da superclasse (FiguraGeometrica),
 * assim como atributos específicos para cada um deles (comprimento, base, altura, raio, etc).
 * d. Para Retangulo: "calcularArea()" que calcula a área do retângulo (base x altura) e retorna o valor
 * como um double. Também deve ter o método calcularPerimetro()
 */
public class Retangulo extends FiguraGeometrica {
    private double baseRetangulo, alturaRetangulo;

    /**
     * Método Construtor do Retângulo da SuperClass <b>FiguraGeometrica</b>
     *
     * @param corFigGeometrica - Cor do Retângulo
     * @param baseRetangulo    - Base do Retângulo
     * @param alturaRetangulo  - Altura do Retângulo
     */
    public Retangulo(String corFigGeometrica, double baseRetangulo, double alturaRetangulo) {
        super(corFigGeometrica);
        this.baseRetangulo = baseRetangulo;
        this.alturaRetangulo = alturaRetangulo;
    }

    /**
     * Override do método abstrato calcularArea() da SuperClass <b>FiguraGeometrica</b>
     *
     * @return - Área do Retângulo
     */
    @Override
    public double calcularArea() {
        System.out.print("Área do Retângulo = ");
        return this.baseRetangulo * this.alturaRetangulo;
    }

    /**
     * Override do método abstrato calcularPerimetro() da SuperClass <b>FiguraGeometrica</b>
     *
     * @return - Perimetro do Retângulo
     */
    @Override
    public double calcularPerimetro() {
        return 2 * (this.baseRetangulo + this.alturaRetangulo);
    }
}
