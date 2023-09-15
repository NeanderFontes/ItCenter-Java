package ficha05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        //Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração e inicialização de variáveis, array e matriz:
        int numVetor1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numVetor2[] = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int numMatriz[][] = new int[10][2];
        int numIndice, numLinha, numColuna;

        //Atribuição dos array na matriz:
        for (numIndice = 0; numIndice < numMatriz.length; numIndice++) {
            numMatriz[numIndice][0] = numVetor1[numIndice];
            numMatriz[numIndice][1] = numVetor2[numIndice];
        }

        //Declaração da Matriz:
        System.out.println("\nA Matriz exposta:");
        for (numLinha = 0; numLinha < numMatriz.length; numLinha++) {
            for (numColuna = 0; numColuna < numMatriz.length; numColuna++) {
                System.out.print(numMatriz[numLinha][numColuna] + "\t");
            }
            //Quebra de linha para expor matriz:
            System.out.println();
        }
    }
}