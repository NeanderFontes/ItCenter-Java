package FiguraGeometrica;

/**
 * Crie duas subclasses concretas de FiguraGeometrica: "Retangulo", "Circulo" e “Triangulo”. Essas
 * classes devem ter um construtor que chama o construtor da superclasse (FiguraGeometrica),
 * assim como atributos específicos para cada um deles (comprimento, base, altura, raio, etc).
 * f. Para Triangulo: "calcularArea()" que calcula a área do triangulo ((base*altura)/2) e retorna o valor
 * como um double. Também deve ter o método calcularPerimetro().
 */
public class Triangulo extends FiguraGeometrica {
    private double baseCatetoAdjTriangulo, alturaTriangulo, catetoOposto, hipotenusaTriangulo;

    /**
     * Método Construtor do Triangulo da SuperClass <b>FiguraGeometrica</b>
     *
     * @param corFigGeometrica - Cor do Triângulo
     * @param baseCatetoAdjTriangulo - Base / Cateto Adjascente do Triângulo
     * @param alturaTriangulo - Altura do Triângulo
     * @param catetoOposto - Cateto Oposto do triângulo
     * @param hipotenusaTriangulo - Hipotenusa do Triângulo
     */
    public Triangulo(String corFigGeometrica, double baseCatetoAdjTriangulo, double alturaTriangulo, double catetoOposto, double hipotenusaTriangulo) {
        super(corFigGeometrica);
        this.baseCatetoAdjTriangulo = baseCatetoAdjTriangulo;
        this.alturaTriangulo = alturaTriangulo;
        this.catetoOposto = catetoOposto;
        this.hipotenusaTriangulo = hipotenusaTriangulo;
    }

    /**
     * Override do método abstrato calcularArea() da SuperClass <b>FiguraGeometrica</b>
     *
     * @return - Área do Triàngulo
     */
    @Override
    public double calcularArea() {
        System.out.print("Área do Triângulo = ");
        return (this.baseCatetoAdjTriangulo * this.alturaTriangulo) / 2;
    }

    /**
     * Override do método abstrato calcularPerimetro() da SuperClass <b>FiguraGeometrica</b>
     *
     * @return - Perimetro do Triàngulo
     */
    @Override
    public double calcularPerimetro() {
        return this.baseCatetoAdjTriangulo + this.hipotenusaTriangulo + this.catetoOposto;
    }
}
