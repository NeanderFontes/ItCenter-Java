package task003;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {/**
     * 5. Faça um programa que leia dois números inteiros, representando os valores início e fim de um intervalo e
     * imprima os números inteiros neste intervalo.
     * Exemplo de execução:
     * - Introduza um número de início: 15
     * - Introduza um número de início: 990
     * - 15
     * - 16
     * - 17
     * ...
     * - 988
     * - 989
     * - 990
     */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        int inputFinalNum = 0;
        int inputInitialNum = 0;

        // Data input by the user
        System.out.print("Program to counting, Insert a initial number: ");
        inputInitialNum = input.nextInt();
        System.out.print("Insert a final number: ");
        inputFinalNum = input.nextInt();

        // Final data
        if (inputInitialNum == inputFinalNum) {
            System.out.println("Both the numbers are the same");
        } else {
            if (inputInitialNum < inputFinalNum) {
                while (inputInitialNum <= inputFinalNum) {
                    System.out.println(inputInitialNum);
                    if (inputInitialNum == inputFinalNum) {
                        break;
                    }
                    inputInitialNum++;
                }
            }
            if (inputInitialNum > inputFinalNum) {
                while (inputInitialNum >= inputFinalNum) {
                    System.out.println(inputInitialNum);
                    if (inputInitialNum == inputFinalNum) {
                        break;
                    }
                    inputInitialNum--;
                }
            }
        }

        // Close Scanner to improvise resource leak
        input.close();
    }
}
