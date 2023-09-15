package ficha03;

public class Ex_04 {
    public static void main(String[] args) {
        //Entrada e iniciação de variáveis:
        int numInicial, numFinal;
        numInicial = -1;
        numFinal = 20;

        //Resolução while:
        while (numInicial < numFinal) {
            numInicial++;
            System.out.println(numInicial);
        }
        while (numFinal < numInicial) {
            numInicial--;
            System.out.println(numInicial);
        }
    }
}
