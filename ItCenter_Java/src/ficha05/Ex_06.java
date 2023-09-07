package ficha05;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        //Impor Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração e inicialização de variáveis e array:
        int[] numVetor = new int[10];
        boolean isSorted = true;

        //Entrada de dados:
        System.out.println("Digite os elementos do array:");

        //Declaração do array
        for (int numIndice = 0; numIndice < numVetor.length; numIndice++) {
            numVetor[numIndice] = input.nextInt();
        }
        for (int numIndice = 0; numIndice < numVetor.length - 1 && isSorted; numIndice++) {
            //Condições para numeros em não ordem crescente
            if (numVetor[numIndice] > numVetor[numIndice + 1]) {
                isSorted = false;
            }
        }

        //Condições finais para numeros em ordem crescente ou não:
        if (isSorted) {
            System.out.println("Os elementos estão em ordem crescente.");
        } else {
            System.out.println("Os elementos não estão em ordem crescente.");
        }
    }
}
