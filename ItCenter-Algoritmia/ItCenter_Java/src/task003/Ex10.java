package task003;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        /**
         * 10. Faça um programa que leia um número inteiro (variável limite), um incremento (variável salto) e imprima os
         * números inteiros de 0 até limite inclusive, com incremento de salto. Suponha que limite e salto são maiores que
         * zero. Exemplo:
         * Valores lidos: 10 (limite) e 3 (salto)
         * Saída do algoritmo: 0 3 6 9
         * Exemplo de Execução:
         * - Introduza um limite: 21
         * - Introduza um salto: 5
         * - 0
         * - 5
         * - 10
         * - 15
         * - 20
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Data input by the user
        int initialNum = 0, finalNum = 0, inputCount = 0;
        System.out.println("Program to create a count from 0 to the entered value and the value increase entered.");
        System.out.print("Please, enter only positive value to determine final count: ");
        finalNum = input.nextInt();
        
        // Final data
        if (finalNum == initialNum) {
            System.out.println("Both values are the same, don't have count.");
        } else {
            if (finalNum < initialNum) {
                System.out.println("Sorry only POSITIVE value are valid! Try again.");
            } else {
                System.out.print("Now enter a increase value the count into " + finalNum + ": ");
                inputCount = input.nextInt();
                if ( inputCount == 0) {
                    System.out.println("Sorry is impossible to increase value with 0");
                } else if (inputCount < 0) {
                    System.out.println("Sorry only POSITIVE increase value are valid! Try again.");
                } else {
                    System.out.println("Initial number is: " + initialNum + " increase value: " + inputCount + " and final value is: " + finalNum);
                    System.out.print("Counting... " + initialNum);
                    while (initialNum <= finalNum) {
                        initialNum += inputCount;
                        if (initialNum <= finalNum) {
                            System.out.print(", " + initialNum);
                        }
                    }
                }
            }
        }

        // Close Scanner to improve resource leak
        input.close();
    }
}
