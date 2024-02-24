package task003;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        /**
         * 6. Faça um programa que imprima os números inteiros de 1 a 100 inclusive, e no final imprima também o valor do
         * seu somatório.
         * Exemplo de Execução:
         * - 1
         * - 2
         * - 3
         * - 4
         * ...
         * - 98
         * - 99
         * - 100
         * - Somatório: 5050 (1+2+3+4+5+6+7+8+9+10+11+…+98+99+100)
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        int initialNum = 0, finalNum = 0, sumNumbers = 0;

        // Data input by the user
        System.out.print("Program to counting and calculate the total in the end." + "\nInsert a initial number: ");
        initialNum = input.nextInt();
        System.out.print("Insert a final number: ");
        finalNum = input.nextInt();

        // Final data
        if (initialNum == finalNum) {
            System.out.println("Both are the same!");
        } else if (initialNum < finalNum) {
            while (initialNum <= finalNum) {
                System.out.println(initialNum);
                sumNumbers += initialNum;
                initialNum++;
                if (initialNum == finalNum) {
                    System.out.println(initialNum);
                    sumNumbers += initialNum;
                    break;
                }
            }
        } else {
            while (initialNum > finalNum) {
                System.out.println(initialNum);
                sumNumbers += initialNum;
                initialNum--;
                if (initialNum == finalNum) {
                    System.out.println(initialNum);
                    sumNumbers += initialNum;
                    break;
                }
            }
        }

        System.out.println("The total sum is: " + sumNumbers);

        // Close Scanner to improve source leak
        input.close();
    }
}
