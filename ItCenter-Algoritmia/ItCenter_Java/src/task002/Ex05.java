package task002;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        /**
         * 5. Escreva um programa que leia dois valores numéricos e apresente o menor e depois o maior.
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        int num1, num2, numMaior = 0, numMenor = 0;

        // Data input by the user
        System.out.println("Enter two values for the end show the smallest and largest");
        System.out.print("First value: ");
        num1 = input.nextInt();
        System.out.print("Second value: ");
        num2 = input.nextInt();

        if (num1 == 0 && num2 == 0) {
            System.out.println("Both are 0");
        } else {
            if (num1 > num2) {
                numMaior = num1;
                numMenor = num2;
            } else {
                numMaior = num2;
                numMenor = num1;
            }
        }
        // Final data
        System.out.println("The smallest value is: " + numMenor);
        System.out.println("The largest value is: " + numMaior);

        // Close the scanner to prevent resource leak
        input.close();
    }
}
