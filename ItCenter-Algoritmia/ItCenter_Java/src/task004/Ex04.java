package task004;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /**
         * 4. Escreva um programa que indique se um número pedido ao utilizador é primo.
         * (Chamamos de número primo um número natural que só possui dois divisores: 1 e ele mesmo).
         * (Por exemplo: 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, etc…)
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        int countNumber, numberUserOption, increasePrimeNumber = 0;

        // Data input by the user
        System.out.println("Program to search if a number is prime number");
        System.out.print("Entered a number: ");
        numberUserOption = input.nextInt();
        if (numberUserOption == 0) {
            System.out.println("Sorry 0 don't have prime number.");
        } else if (numberUserOption < 0) {
            System.out.println("Sorry can't resolve with negative number.");
        } else {
            for (countNumber = 1; countNumber <= numberUserOption; countNumber++) {
                if (numberUserOption % countNumber != 0) {
                } else {
                    increasePrimeNumber++;
                }
            }
        }

        // Final data
        if (increasePrimeNumber == 2) {
            System.out.println("The number " + numberUserOption + " is prime");
        } else {
            System.out.println("The number " + numberUserOption + " is not prime");
        }

        // Close Scanner to prevent resource leak
        input.close();
    }
}
