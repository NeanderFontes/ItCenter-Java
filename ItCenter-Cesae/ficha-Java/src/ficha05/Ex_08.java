package ficha05;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        //Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração e inicialização de variáveis e matriz:
        int numMatriz[][] = new int[3][3];
        int numIndice, numLinha, numColuna;

        //Declaração da matriz ********** impossível realizar ***********:
        for (numLinha = 0; numLinha < numMatriz.length; numLinha++) {
            System.out.println("Insira o " + (numLinha + 1) + "º valor da linha[" + numLinha + "]");
            numMatriz[numLinha][0] = input.nextInt();
            for (numColuna = 0; numColuna < numMatriz.length; numColuna++) {
                System.out.println("Insira o " + (numColuna + 1) + "º valor da coluna[" + numColuna + "]");
                numMatriz[0][numColuna] = input.nextInt();
            }
        }
    }
}
