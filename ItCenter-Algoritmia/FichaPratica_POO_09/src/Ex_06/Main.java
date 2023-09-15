package Ex_06;

public class Main {
    /**
     * Função principal
     * @param args
     */
    public static void main(String[] args) {
        //Instancia do objeto Calculadora:
        Calculadora calcular = new Calculadora(5, 2);

        //Saída de dados para somar/subtrair/dividir/multiplicar:
        System.out.println("Soma dos valores 5 + 2 = " + calcular.resultadoSomar());
        System.out.println("Subtração dos valores 5 + 2 = " + calcular.resultadoSubtracao());
        System.out.println("Divisão dos valores 5 + 2 = " + calcular.resultadoDivisao());
        System.out.println("Multiplicação dos valores 5 + 2 = " + calcular.resultadoMultiplicacao());
    }
}
