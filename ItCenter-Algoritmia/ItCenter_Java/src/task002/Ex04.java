package task002;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /**
         * 4. Na fórmula 1, os pontos no final de cada corrida são atribuidos da seguinte forma:
         * a. 1º Lugar: 10 pontos
         * b. 2º Lugar: 8 pontos
         * c. 3º Lugar: 6 pontos
         * d. 4º Lugar: 5 pontos
         * e. 5º Lugar: 4 pontos
         * f. 6º Lugar: 3 pontos
         * g. 7º Lugar: 2 pontos
         * h. 8º Lugar: 1 ponto
         * Escreva um programa que leia o lugar em que o piloto terminou e escreva quantos pontos ganhou.
         * Exemplos de execução:
         *  Introduza o seu lugar na corrida: 2
         * - Ganhou 8 pontos
         *  Introduza o seu lugar na corrida: 10
         * - Não ganhou pontos
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        int positionF1, totalScore;

        // Data input by the user
        System.out.print("Please state your position: ");
        positionF1 = input.nextInt();

        if (positionF1 <= 0 || positionF1 > 8) {
            System.out.println("Sorry, you didn't earn any points");
        } else {
            if (positionF1 == 1) {
              totalScore = 10;
            } else if (positionF1 == 2) {
                totalScore = 8;
            } else if (positionF1 == 3) {
                totalScore = 6;
            } else if (positionF1 == 4) {
                totalScore = 5;
            } else if (positionF1 == 5) {
                totalScore = 4;
            } else if (positionF1 == 6) {
                totalScore = 3;
            } else if (positionF1 == 7) {
                totalScore = 2;
            } else {
                totalScore = 1;
            }
            System.out.println("Your score is " + totalScore);
        }
    }
}
