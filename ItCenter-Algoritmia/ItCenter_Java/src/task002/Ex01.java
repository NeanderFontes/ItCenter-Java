package task002;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        /**
         * 1. Leia dois números inteiros e escreva na consola o maior deles.
         * Exemplo de execução:
         * - Introduza um numero: 40
         * - Introduza um numero: 5
         * - Maior: 40
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        String resultadoValor = "";
        int num1, num2;

        // Data input by the user
        System.out.println("Enter two values to find the largest between them");
        System.out.print("First value: ");
        num1 = input.nextInt();
        System.out.print("Second value: ");
        num2 = input.nextInt();

        if (num1 == 0 && num2 == 0) {
            resultadoValor = "Both value are 0";
        } else {
            if (num1 == num2) {
                resultadoValor = "Both numbers are equal!";
            } else if (num1 < num2) {
                resultadoValor = (num1 + " Is the lowest value.");
            } else if (num1 > num2) {
                resultadoValor = (num1 + " Is the highest value");
            } else {
                resultadoValor = "Invalid Values please start again";
            }
        }

        // Final data
        System.out.println(resultadoValor);
    }
}
