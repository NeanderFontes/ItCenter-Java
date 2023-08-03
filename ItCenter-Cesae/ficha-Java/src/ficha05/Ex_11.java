package ficha05;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        //Import Scanner input para entrada de dados
        Scanner input = new Scanner(System.in);

        //Declaração e inicialização de variáveis e matriz:
        int numMatriz[][] = new int[3][3];
        int numLinha, numColuna, numMaiorLinha, numMaiorColuna, numMenorLinha, numMenorColuna, numMenorTot, numMaiorTot;
        numMaiorLinha = 0;
        numMaiorColuna = 0;
        numMenorLinha = 0;
        numMenorColuna = 0;

        //Entrada de dados na matriz:
        for (numLinha = 0; numLinha < numMatriz.length; numLinha++) {
            for (numColuna = 0; numColuna < numMatriz.length; numColuna++) {
                System.out.print("Insira o " + (numLinha + 1) + "º valor da linha[" + numLinha + "] numero coluna[" + numColuna + "]: ");
                numMatriz[numLinha][numColuna] = input.nextInt();
            }
            System.out.println("");
        }
        //Introdução dos valores a zero da matriz:
        numMenorLinha = numMatriz[0][0];
        numMenorColuna = numMatriz[0][0];
        numMaiorLinha = numMatriz[0][0];
        numMaiorColuna = numMatriz[0][0];
        numMenorTot = numMatriz[0][0];
        numMaiorTot = numMatriz[0][0];

        //Declaração da matriz:
        for (numLinha = 0; numLinha < numMatriz.length; numLinha++) {
            for (numColuna = 0; numColuna < numMatriz.length; numColuna++) {
                //Entrada de condição para numeros maiores e menores:
                if (numLinha == 0 && numColuna == 0) {
                    numMenorLinha = numMatriz[numLinha][numColuna];
                    numMenorColuna = numMatriz[numLinha][numColuna];
                    numMaiorLinha = numMatriz[numLinha][numColuna];
                    numMaiorColuna = numMatriz[numLinha][numColuna];
                    numMaiorTot = numMatriz[numLinha][numColuna];
                    numMenorTot = numMatriz[numLinha][numColuna];
                } else {
                    if (numMatriz[numLinha][numColuna] > numMaiorLinha) {
                        numMaiorLinha = numMatriz[numLinha][numColuna];
                    }
                    if (numMatriz[numLinha][numColuna] < numMenorLinha) {
                        numMenorLinha = numMatriz[numLinha][numColuna];
                    }
                    if (numMatriz[numLinha][numColuna] > numMaiorColuna) {
                        numMaiorColuna = numMatriz[numLinha][numColuna];
                    }
                    if (numMatriz[numLinha][numColuna] < numMenorColuna) {
                        numMenorColuna = numMatriz[numLinha][numColuna];
                    }
                    if (numMatriz[numLinha][numColuna] > numMaiorTot) {
                        numMaiorTot = numMatriz[numLinha][numColuna];
                    }
                    if (numMatriz[numLinha][numColuna] < numMenorTot) {
                        numMenorTot = numMatriz[numLinha][numColuna];
                    }
                }
            }
        }
        //Saida de dados e resultados finais:
        System.out.println("================== RESULTADOS ==================");
        System.out.println("O Maior valor do Número de linha = " + numMaiorLinha);
        System.out.println("O Menor valor do Número de linha = " + numMenorLinha);
        System.out.println("O Maior valor do Número de Coluna = " + numMaiorColuna);
        System.out.println("O Menor valor do Número de linha = " + numMenorColuna);
        System.out.println("O Maior valor da Matriz[3][3] = " + numMaiorTot);
        System.out.println("O Menor valor da Matriz[3][3] = " + numMenorTot);

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
