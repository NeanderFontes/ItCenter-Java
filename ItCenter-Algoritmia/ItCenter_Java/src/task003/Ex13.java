package task003;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        /**
         * 13. Escreva um programa que leia uma sequência de números inteiros do utilizador e determine se a sequência
         * está em ordem crescente.
         * Exemplos de Execução:
         * - Quantos números deseja inserir: 7
         * - Introduza um número: 1
         * - Introduza um número: 2
         * - Introduza um número: 3
         * - Introduza um número: 10
         * - Introduza um número: 20
         * - Introduza um número: 100
         * - Introduza um número: 105
         * - Crescente
         *
         * - Quantos números deseja inserir: 5
         * - Introduza um número: 102
         * - Introduza um número: 68
         * - Introduza um número: 68
         * - Introduza um número: 10
         * - Introduza um número: 20
         * - Não crescente
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        int inputNumber = 0, totalCountNumbers = 0, inputCount = 0;
        boolean increaseValue = false;
        boolean decreaseValue = false;

        // Data input by the user
        System.out.println("Program to discover ascending or descending order of entered values");
        System.out.print("How many numbers you wish to entered? ");
        totalCountNumbers = input.nextInt();
        if (totalCountNumbers == 0) {
            System.out.println("Don't have counting because you entered 0. Try Again!");
        } else if (totalCountNumbers == 1) {
            System.out.print("Insert the " + ++inputCount + "º number: ");
            inputNumber = input.nextInt();
            System.out.println(inputNumber + "Is the only value don't have to discover if is ascending or descending. Try Again!");
        } else {
            System.out.print("Insert the " + ++inputCount + "º number: ");
            inputNumber = input.nextInt();
            // Variable auxiliary to prevent the correct count
            int auxiliaryNum = inputNumber;

            // Validation the counting according the totalNumbers entered
            while (inputCount <= totalCountNumbers && inputCount < totalCountNumbers) {
                if (increaseValue == true || decreaseValue == true) {
                    increaseValue = false;
                    decreaseValue = false;
                    break;
                }
                System.out.print("Insert the " + ++inputCount + "º number: ");
                inputNumber = input.nextInt();
                if (auxiliaryNum < inputNumber) {
                    increaseValue = true;
                    while (inputNumber > auxiliaryNum && inputCount < totalCountNumbers) {
                        System.out.print("Insert the " + ++inputCount + "º number: ");
                        inputNumber = input.nextInt();
                        if (inputNumber <= auxiliaryNum) {
                            System.out.println("Sorry, to continue doing the increase you have to put a larger number");
                            break;
                        } else {
                            auxiliaryNum = inputNumber;
                        }
                    }
                } else if (inputNumber == totalCountNumbers) {
                    System.out.println("Sorry don't have count because you put the same value before!");
                    break;
                } else {
                    if (auxiliaryNum > inputNumber) {
                        decreaseValue = true;
                        while (inputNumber < auxiliaryNum && inputCount < totalCountNumbers) {
                            System.out.print("Insert the " + ++inputCount + "º number: ");
                            inputNumber = input.nextInt();
                            if (inputNumber >= auxiliaryNum) {
                                System.out.println("Sorry, to continue doing the decrease you have to put a less number");
                                break;
                            } else {
                                auxiliaryNum = inputNumber;
                            }
                        }
                    }
                }
            }
        }

        // Final data
        if (increaseValue) {
            System.out.println("The count is increase.");
        } else if (decreaseValue){
            System.out.println("The count is decrease.");
        }

        // Scanner close to prevent resource leak
        input.close();
    }
}
