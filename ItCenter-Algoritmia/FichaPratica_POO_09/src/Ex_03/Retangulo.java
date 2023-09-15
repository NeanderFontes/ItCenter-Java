package Ex_03;

/**
 * Class Retângulo
 */
public class Retangulo {
    private int altura, largura;

    /**
     * Método Construtor
     * @param altura - Altura do Retângulo
     * @param largura - Base do Retângulo
     */
    public Retangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    /**
     * Método para retornar Área do Retângulo
     * @return - area do Retângulo
     */
    public double areaRetangulo() {
        return (this.altura * this.largura);
    }

    /**
     * Método para calcular Perimetro do retangulo
     * @return
     */
    public double perimetroRetangulo() {
        return ((this.altura * 2) + (this.largura * 2));
    }

    /**
     * Método especial setter para modificar altura do Retângulo
     * @param altura
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * Método especial setter para modificar largura do Retângulo
     * @param largura
     */
    public void setLargura(int largura) {
        this.largura = largura;
    }
}
