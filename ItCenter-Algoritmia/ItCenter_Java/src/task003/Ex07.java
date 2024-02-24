package task003;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        /**
         * 7. Faça um programa que leia um número inteiro e imprima os 5 anteriores e os 5 seguintes.
         * a. Por exemplo: Leu 15, deve imprimir: 10 11 12 13 14 16 17 18 19 20
         * Exemplo de execução:
         *  Introduza um número: 20
         * - 15
         * - 16
         * - 17
         * - 18
         * - 19
         *
         * - 21
         * - 22
         * - 23
         * - 24
         * - 25
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        int inputNumber = 0, startRange = 0, endRange = 0;

        // Data input by the user
        System.out.println("Program to increase or decrease 5 of a chosen value");
        System.out.print("Insert any value: ");
        inputNumber = input.nextInt();
        startRange = inputNumber - 5;
        endRange = inputNumber + 5;

        // Final data
        if (inputNumber > startRange) {
            while (inputNumber > startRange) {
                --inputNumber;
            }
        }
        System.out.print(inputNumber + " ");
        if (inputNumber < endRange) {
            while (inputNumber < endRange) {
                System.out.print(++inputNumber + " ");
            }
        }


        // Close Scanner to improve source leak
        input.close();
    }
}
