package ficha05;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        //Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração e inicialização de variáveis e matriz:
        int numMatriz [][] = new int[5][5];
        int numLinha, numColuna, somaLinha, somaColuna, somaTotal;
        somaLinha = 0;
        somaColuna = 0;
        somaTotal = 0;

        //Entrada de dados da matriz:
        for (numLinha = 0; numLinha < numMatriz.length; numLinha++) {
            for (numColuna = 0; numColuna < numMatriz.length; numColuna++) {
                System.out.print("Insira o " + (numLinha + 1) + "º valor da linha[" + numLinha + "] colina[" + numColuna + "]: ");
                numMatriz[numLinha][numColuna] = input.nextInt();
                somaLinha += numMatriz[numLinha][0];
                somaColuna += numMatriz[0][numColuna];
                somaTotal = somaLinha + somaColuna;
            }
        }
        //Resultados finais:
        System.out.println("\n==================== RESULTADOS ====================");
        System.out.println("A soma de todas as linhas da Matriz = " + somaLinha);
        System.out.println("A soma de todas as coluna da Matriz = " + somaColuna);
        System.out.println("A soma de Total das linhas e colunas da Matriz = " + somaTotal);
        System.out.println("====================================================");

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
