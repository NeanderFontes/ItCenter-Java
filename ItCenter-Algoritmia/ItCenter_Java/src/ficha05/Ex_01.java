package ficha05;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        //Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis e arrays:
        int numVetor[] = new int[10]; //array com 10 indices (0-9) e 10 valores.
        int numIndice;
        numIndice = 0;

        //Entrada de dados pelo utilizador:
        System.out.println("Insira 10 valores para o array");
        for (numIndice = 0; numIndice < numVetor.length; numIndice++) {
            System.out.print((numIndice + 1) + "º Valor:");
            numVetor[numIndice] = input.nextInt();
        }

        //Quebra de linha
        System.out.print("\n");

        for (numIndice = 0; numIndice < numVetor.length; numIndice++) {
            System.out.println("O número de indice [" + numIndice + "] = " + numVetor[numIndice]);
            System.out.println((numIndice + 1 + "º Valor Insirido: ") + numVetor[numIndice]);

            //Quebra de linha
            System.out.print("\n");
        }
    }
}
