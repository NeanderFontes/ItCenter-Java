package ficha05;

import java.util.Scanner;

public class Ex_08_vs2 {
    public static void main(String[] args) {
        //Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração e inicialização de variáveis e matriz:
        int numMatriz[][] = new int[3][3];
        int numIndice, numLinha, numColuna;

        //Entrada de dados da matriz:
        for (numLinha = 0; numLinha < numMatriz.length; numLinha++) {
            for (numColuna = 0; numColuna < numMatriz.length; numColuna++) {
                System.out.print("Insira o " + (numLinha + 1) + "º valor da linha[" + numLinha + "]" + " coluna[" + numColuna +"]: ");
                numMatriz[numLinha][numColuna] = input.nextInt();
            }
            System.out.println("");
        }

        //Declaração da matriz:
        System.out.println("\nA Matriz exposta:");
        for (numLinha = 0; numLinha < numMatriz.length; numLinha++) {
            for (numColuna = 0; numColuna < numMatriz.length; numColuna++) {
                System.out.print(numMatriz[numLinha][numColuna] + " ");
            }
            //Quebra de linha para expor matriz:
            System.out.println();
        }
    }
}
