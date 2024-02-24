package task003;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /**
         * 4. Faça um programa que leia um número inteiro e imprima os números inteiros de 0 até este número.
         * Exemplo de Execução:
         * - Introduza um número: 20
         * - 0
         * - 1
         * - 2
         * ...
         * - 18
         * - 19
         * - 20
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        int inputNum, inputCount = 0;
        System.out.print("Please insert a number to couting into 0: ");
        inputNum = input.nextInt();

        // Final data
        while (inputCount <= inputNum) {
            System.out.println(inputCount);
            inputCount++;
        }

        // Close scanner to improvise resource leak
        input.close();
    }
}
