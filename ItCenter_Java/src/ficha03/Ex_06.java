package ficha03;

public class Ex_06 {
    public static void main(String[] args) {
        //Entrada e declaração das variáveis:
        int numInicial, numFinal, somaTotal;
        numInicial = 1;
        numFinal = 100;
        somaTotal = 0;

        //Resolução com laço while:
        while (numInicial <= numFinal) {
            System.out.println(numInicial);
            somaTotal += numInicial;
            numInicial++;
        }
        System.out.println("A soma da contagem é = " + somaTotal);
    }
}
