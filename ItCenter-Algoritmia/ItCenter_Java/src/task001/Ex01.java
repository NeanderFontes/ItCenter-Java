package task001;

import java.util.Scanner;

public class Ex01 {
    /**
     * Update data and studing
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 1. Escreva um programa que faça a soma de dois números introduzidos pelo utilizador. Apresente o
         * resultado da operação.
         * Exemplo de execução:
         * - Introduza um numero: 20
         * - Introduza um numero: 3
         * - Soma: 23
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables:
        int num1 = 0, num2 = 0, soma;

        // Data input by the user:
        System.out.println("Please insert a value for the sum of the values: ");
        System.out.print("First Value: ");
        num1 = input.nextInt();
        System.out.print("Second Value: ");
        num2 = input.nextInt();
        soma = (num1 + num2);

        // Final data:
        System.out.println("Result: " + num1 + " + " + num2 + " = " + soma);
    }
}
