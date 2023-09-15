package Ex_06;

public class Calculadora {
    private double num1, num2;

    /**
     * Método Construtor para Entrada de valores para calcular
     * @param num1
     * @param num2
     */
    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //Funções para Retorno de valores da calculadora:

    /**
     * Método para retornar Soma
     *
     * @return
     */
    public double resultadoSomar() {
        return (this.num1 + this.num2);
    }
    /**
     * Método para retornar Subtração
     * @return
     */
    public double resultadoSubtracao() {
        return (this.num1 - this.num2);
    }
    /**
     * Método para retornar Divisão
     * @return
     */
    public double resultadoDivisao() {
        return( this.num1 / this.num2);
    }
    /**
     * Método para retornar Multiplicação
     * @return
     */
    public double resultadoMultiplicacao() {
        return (this.num1 * this.num2);
    }

}
