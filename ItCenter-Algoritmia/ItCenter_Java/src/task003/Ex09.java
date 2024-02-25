package task003;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        /**
         * 9. Faça um programa que leia um número inteiro e imprima os números pares entre 2 e o número lido inclusive.
         * Suponha que o número lido da entrada será maior que 2.
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        final int NUMBER_INITIAL = 2;
        int inputNum = 0;

        // Data input by the user
        System.out.println("Program to declare the even values between 2 and the value entered.");
        System.out.print("Please enter an integer value: ");
        inputNum = input.nextInt();

        // Final data
        if (inputNum == NUMBER_INITIAL) {
            System.out.println("Both the values are the same. " + inputNum + " is the onl even.");
        } else if (inputNum < NUMBER_INITIAL) {
            System.out.print("Initial number is: " + inputNum + " all between values even...");
            do {
                inputNum++;
                if (inputNum % 2 == 0) {
                    System.out.print(", " + inputNum);
                }
            } while (inputNum != NUMBER_INITIAL);
        } else {
            System.out.print("Initial number is: " + inputNum + " all between values even...");
            do {
                inputNum--;
                if (inputNum % 2 == 0) {
                    System.out.print(", " + inputNum);
                }
            } while (inputNum != NUMBER_INITIAL);
        }

        // Close Scanner to improve resource leak
        input.close();
    }
}
