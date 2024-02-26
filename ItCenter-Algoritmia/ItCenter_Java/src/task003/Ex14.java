package task003;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        /**
         * 14. Escreva um programa que calcule e imprima o fatorial de um número inteiro não-negativo n.
         * Utilize o ciclo while.
         * Exemplo de Fatorial de 5: 5x4x3x2x1=120
         * Exemplo de Fatorial de 8: 8x7x6x5x4x3x2x1=40320
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        int inputNumber = 0, finalFactorialValue = 1;

        // Data input by the user
        System.out.print("Please insert positive number to calculate the factorial: ");
        inputNumber = input.nextInt();
        if (inputNumber == 0) {
            System.out.println("Factorial of 0 is 0");
        } else if (inputNumber < 0) {
            System.out.println("Only positive numbers, try again.");
        } else {
            System.out.print("Factorial of (" + inputNumber + "!) = " + inputNumber);
            while (inputNumber > 1) {
                finalFactorialValue *= inputNumber;
                inputNumber--;
                System.out.print("x" + inputNumber);
            }
        }

        // Final data
        System.out.println(" = " + finalFactorialValue);
        
        // Close Scanner to prevent source leak
        input.close();
    }
}
