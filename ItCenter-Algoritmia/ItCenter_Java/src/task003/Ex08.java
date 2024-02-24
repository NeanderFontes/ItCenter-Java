package task003;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        /**
         * 8. Faça um programa que vai pedindo números ao utilizador até que este introduza o número -1.
         * O computador deve dizer a média dos números introduzidos (excluindo o -1).
         *  Introduza um número: 10
         * - Introduza um número: 15
         * - Introduza um número: 20
         * - Introduza um número: 25
         * - Introduza um número: 30
         * - Introduza um número: -1
         * - Média: 20
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        double countInput = 0, inputValue = 0, totalAverage = 0, sumOfValues = 0;
        int finishValue = 0;
        boolean finishProgram = false;

        // Data input by the user
        System.out.println("Program to calculate average of inserted values.");
        while (!finishProgram) {
            System.out.print("Insert the " + (int)(++countInput) + "º Value: ");
            inputValue = input.nextDouble();
            System.out.print("Whant to finish? [-1] to leave or any number to continue: ");
            finishValue = input.nextInt();
            if (finishValue == -1) {
                finishProgram = true;
            } else {
                sumOfValues += inputValue;
            }
            totalAverage = (sumOfValues / (countInput - 1));
        }

        // Final data
        System.out.println("The total average is: " + totalAverage);

        // Close Scanner to improve resource leak
        input.close();
    }
}
