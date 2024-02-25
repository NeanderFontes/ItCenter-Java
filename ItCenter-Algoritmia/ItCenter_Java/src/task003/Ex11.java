package task003;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        /**
         * 11. Escreva um algoritmo que leia uma quantidade desconhecida de números inteiros positivos fornecidos pelo
         * utilizador e conte quantos deles estão nos seguintes intervalos: [0.25], [26,50], [51,75] e [76,100].
         * A entrada de dados deve terminar quando for lido um número negativo.
         * Exemplo de Execução:
         * - Introduza um número: 10
         * - Introduza um número: 15
         * - Introduza um número: 29
         * - Introduza um número: 55
         * - Introduza um número: 58
         * - Introduza um número: 5
         * - Introduza um número: 105
         * - [00,25]: 3
         * - [26,50]: 1
         * - [51,75]: 2
         * - [76,100]: 0
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        int increase00To25 = 0, increase26To50 = 0, increase51To75 = 0, increase76To100 = 0;
        int inputNumber = 0, inputCount = 0;

        // Data input by the user
        System.out.println("Program to calculate the quantity of numbers inserted between the value ranges [0.25], [26,50], [51,75] and [76,100]");
        System.out.println("If you want to finis, enter negative value any moment.");
        while (true) {
            System.out.print("Enter the " + (++inputCount) + "º value: ");
            inputNumber = input.nextInt();

            // Count increase ranges
            if (inputNumber <= 25) {
                increase00To25++;
            } else if (inputNumber <= 50) {
                increase26To50++;
            } else if (inputNumber <= 75) {
                increase51To75++;
            } else if (inputNumber <= 100) {
                increase76To100++;
            }

            // Finish program
            if (inputNumber < 0) {
                break;
            }
        }

        // Final data
        System.out.println("Total range [0.25]: " + increase00To25);
        System.out.println("Total range [26.50]: " + increase26To50);
        System.out.println("Total range [51.75]: " + increase51To75);
        System.out.println("Total range [75.100]: " + increase76To100);

        // Close Scanner to improve source leak
        input.close();
    }
}
