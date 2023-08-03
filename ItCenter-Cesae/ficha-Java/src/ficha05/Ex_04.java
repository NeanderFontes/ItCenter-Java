package ficha05;

import java.util.Random;
import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        //Import Random e Scanner input para sortear numeros
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        //Declaração e inicialização de variáveis e arrays:
        int numVetor[] = new int[10];
        int numIndice, numMaior, numMenor, numIndiceMenor;
        numIndice = 0;
        numIndiceMenor = 0;
        numMenor = 0;

        //Entrada de dados:
        System.out.println("Insira valores para determinar qual o maior e menor entre eles.");

        //Declaração do array:
        for (numIndice = 0; numIndice < numVetor.length; numIndice++) {
            System.out.print("Introduza o " + (numIndice + 1) + "º valor:");
            numVetor[numIndice] = input.nextInt();
            //Para numeros aleatórios de 0 - 10.
            //numVetor[numIndice] = random.nextInt(10);
        }


        //Continuação para saída de dados do array:
        for (numIndice = 0; numIndice < numVetor.length; numIndice++) {
            if (numIndice == 0) {
                //Incialização de valores menor com array
                numMenor = numVetor[0];
            } else {
                if (numVetor[numIndice] < numMenor) {
                    numMenor = numVetor[numIndice];
                    numIndiceMenor = numIndice;
                }
            }
        }
        //Saída de dados e respostas:
        System.out.println("========== DECLARAÇÕES FINAIS ========== ");
        System.out.println("O menor valor digitado é = " + numMenor + " no Indice[" + numIndiceMenor + "]");
    }
}
