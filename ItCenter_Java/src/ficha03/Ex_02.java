package ficha03;

public class Ex_02 {
    public static void main(String[] args) {
        //Numeros pares escritos com while

        //Entrada de variáveis:
        int numPar, numInicial;
        numPar = 0;
        numInicial = 1;

        //Entrada de dados:
        while (numInicial <= 400) {
            numInicial++;
            if (numInicial % 2 == 0) {
                numPar = numInicial;
                System.out.println(numPar);
            }
        }
    }
}
