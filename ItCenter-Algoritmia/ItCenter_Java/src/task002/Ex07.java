package task002;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        /**
         * 7. Escreva um programa que leia um número, depois apresente se é par ou ímpar.
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        int inputNumber;

        // Data input by the user
        System.out.print("Insert a number to find out if it's even or odd: ");
        inputNumber = input.nextInt();

        // Final Data
        if (inputNumber % 2 == 0) {
            System.out.println("The number " + inputNumber + " is even .");
        } else {
            System.out.println("The number " + inputNumber + " is odd.");
        }
    }
}
