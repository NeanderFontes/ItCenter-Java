package ficha05;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        //Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração e inicialização de variáveis e array:
        int numVetor[] = new int[10];
        int numIndice, numMaior, numMaiorPar;
        boolean contemMaiorPar = false;
        numMaior = 0;
        numMaiorPar = 0;

        //Entrada de dados:
        System.out.println("Introduza valores ao array");

        //Declaração do array:
        for (numIndice = 0; numIndice < numVetor.length; numIndice++) {
            System.out.print("Insira o " + (numIndice + 1) + "º valor: ");
            numVetor[numIndice] = input.nextInt();
        }
        for (numIndice = 0; numIndice < numVetor.length; numIndice++) {
            if (numIndice == 0) {
                numMaior = numVetor[0];
            } else {
                if (numVetor[numIndice] > numMaior) {
                    numMaior = numVetor[numIndice];
                }
                if (numMaior % 2 == 0) {
                    numMaiorPar = numMaior;
                    contemMaiorPar = true;
                }
            }
        }
        if (contemMaiorPar == true) {
            System.out.println("O Maior número par = " + numMaiorPar);
        } else {
            System.out.println("Não há números pares no array.");
        }
    }
}
