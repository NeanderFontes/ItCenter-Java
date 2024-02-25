package task003;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        /**
         * 12. Faça um algoritmo que leia dois números inteiros, representando os valores início e fim de um intervalo e
         * imprima os múltiplos de 5 entre eles.
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        int initialValue = 0, finalValue = 0, inputCount = 0;

        // Data input by the user
        System.out.println("Program for counting between intervals of values entered from start and end by the user");
        System.out.print("Please, enter initial value: ");
        initialValue = input.nextInt();
        System.out.print("Please, enter final value: ");
        finalValue = input.nextInt();
        if (initialValue == finalValue) {
            System.out.println("Both are the same value!");
        } else {
            // Condition to initialValue less than finalValue
            if (initialValue < finalValue) {
                System.out.print("Count... ");
                while (initialValue <= finalValue) {
                    System.out.print(", " + initialValue);
                    initialValue++;
                }
            } else {
                // Condition to initialValue more than finalValue
                System.out.print("Count... ");
                while (initialValue >= finalValue) {
                    System.out.print(", " + initialValue);
                    initialValue--;
                }
            }
        }

        // Final data

        // Close Scanner to prevent resource leak
        input.close();
    }
}
