package FiguraGeometrica;

/**
 * Crie uma classe abstrata chamada "FiguraGeometrica" com o seguinte atributo: Cor (String). A classe deve
 * ter um construtor que recebe a cor como parâmetro.
 * a. Crie o método mostrarCor( ) que imprime na consola: “A forma geométrica é (cor)”
 * b. Crie os métodos abstratos: double calcularArea( ), double calcularPerimetro().
 * c. Crie duas subclasses concretas de FiguraGeometrica: "Retangulo", "Circulo" e “Triangulo”. Essas
 * classes devem ter um construtor que chama o construtor da superclasse (FiguraGeometrica),
 * assim como atributos específicos para cada um deles (comprimento, base, altura, raio, etc).
 * d. Para Retangulo: "calcularArea()" que calcula a área do retângulo (base x altura) e retorna o valor
 * como um double. Também deve ter o método calcularPerimetro().
 * e. Para Circulo: "calcularArea()" que calcula a área do círculo (π x raio²) e retorna o valor como um
 * double. Também deve ter o método calcularPerimetro().
 * f. Para Triangulo: "calcularArea()" que calcula a área do triangulo ((base*altura)/2) e retorna o valor
 * como um double. Também deve ter o método calcularPerimetro().
 * g. Crie uma classe chamada "FigurasGeometricasDemo" com um método main que cria um objeto de
 * cada uma das classes (FiguraGeometrica, Retangulo, Circulo e Triangulo) e chama o método
 * “mostrarCor()” e "calcularArea()" de cada um deles.
 */
public abstract class FiguraGeometrica {
    private String corFigGeometrica;

    /**
     * Método Construtor para Figura Geométrica:
     *
     * @param corFigGeometrica - Cor da Figura Geométrica
     */
    public FiguraGeometrica(String corFigGeometrica) {
        this.corFigGeometrica = corFigGeometrica;
    }

    public String mostrarCor() {
        return "A cor do " + getClass().getSimpleName() + " é " + getCorFigGeometrica();
    }

    /**
     * Método Abstrato para Calcular área de uma Figura Geométrica
     *
     * @return - null
     */
    public abstract double calcularArea();

    /**
     * Método Abstrato para Calcular Perímetro de uma Figura Geométrica
     *
     * @return - null
     */
    public abstract double calcularPerimetro();


    /**
     * Métodos Getter
     *
     * @return - Cor da Figura Geométrica
     */
    private String getCorFigGeometrica() {
        return this.corFigGeometrica;
    }
}
