package ficha03;

public class Ex_03 {
    public static void main(String[] args) {
        //Numeros impares entre 531 - 750

        //Entrada de variáveis:
        int numImpar, numInicial;
        numImpar = 0;
        numInicial = 531;

        //Resolução com laço while:
        while (numInicial < 750) {
            numInicial++;
            if (numInicial % 2 != 0) {
                numImpar = numInicial;
                System.out.println(numImpar);
            }
        }
    }
}
