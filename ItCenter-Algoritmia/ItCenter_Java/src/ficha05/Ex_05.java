package ficha05;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        //Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração e inicialização de variáveis e array:
        double numVetor[] = new double[10];
        double numMedia, numSoma;
        int numIndice;
        numIndice = 0;
        numSoma = 0.0;
        numMedia = 0.0;

        //Entrada de dados:
        System.out.println("Calculo para média dos elementos");

        //Declaração do array:
        for (numIndice = 0; numIndice < numVetor.length; numIndice++) {
            System.out.print("Introduza a " + (numIndice + 1) + "º valor:");
            numVetor[numIndice] = input.nextDouble();

            //Cáuculos dos indices inseridos ao array:
            numSoma += numVetor[numIndice];
            numMedia = numSoma / numVetor.length;
        }

        //Saida de dados e resultados finais:
        System.out.println();
        System.out.println("================== RESULTADOS ==================");
        System.out.println("A soma total = " + numSoma);
        System.out.println("A média = " + numMedia);
    }
}
