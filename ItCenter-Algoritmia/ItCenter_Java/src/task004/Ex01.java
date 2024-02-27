package task004;

import java.util.Objects;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        /**
         * Menus
         * 1. Implemente um programa que peça ao utilizador dois valores e um carácter representando uma das quatro
         * operações aritméticas (+, -, *, /). Apresente o resultado de aplicar a operação correspondente aos valores. No
         * final, deverá perguntar ao utilizador se deseja repetir, permitindo-lhe efetuar novos cálculos. Exemplo: Deseja
         * continuar? (introduza s/n).
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        int firstNumber, secdNumber;
        double calculationResult = 1;
        String userOption = " ";

        // Data input by the user
        do {
            System.out.print("Please, enter a number: ");
            firstNumber = input.nextInt();
            System.out.print("Another number: ");
            secdNumber = input.nextInt();

            System.out.println("--------- CALCULATOR ---------");
            System.out.println("[ + ] - Sum");
            System.out.println("[ - ] - Subtraction");
            System.out.println("[ / ] - Division");
            System.out.println("[ * ] - Multiplication");
            System.out.println("[ ! ] - Factorial");
            System.out.println("------------------------------");
            System.out.print("Choose an option above: ");
            userOption = input.next();

            switch (userOption) {
                case "+":
                    calculationResult = (firstNumber + secdNumber);
                    System.out.println(firstNumber + " + " + secdNumber + " = " + (int) calculationResult);
                    break;
                case "-":
                    calculationResult = (firstNumber - secdNumber);
                    System.out.println(firstNumber + " - " + secdNumber + " = " + (int) calculationResult);
                    break;
                case "/":
                    if (secdNumber == 0) {
                        System.out.println("It's impossible to division with 0");
                    } else {
                        calculationResult = (double) firstNumber / secdNumber;
                        System.out.println(firstNumber + " * " + secdNumber + " = " + calculationResult);
                    }
                    break;
                case "*":
                    calculationResult = (firstNumber * secdNumber);
                    System.out.println(firstNumber + " * " + secdNumber + " = " + calculationResult);
                    break;
                case "!":
                    if (firstNumber == 0 && secdNumber == 0) {
                        System.out.println("Factorial of 0 is 0");
                    } else {
                        // Factorial for first number
                        if (firstNumber > 0) {
                            System.out.print("Factorial of (" + firstNumber + "!) = " + firstNumber);
                            while (firstNumber > 1) {
                                calculationResult *= firstNumber;
                                firstNumber--;
                                System.out.print("x" + firstNumber);
                            }
                            System.out.println(" = " + (int) calculationResult);
                        } else {
                            System.out.println("Only positive numbers, try again.");
                        }
                        // Factorial for second number
                        if (secdNumber > 0) {
                            System.out.print("Factorial of (" + secdNumber + "!) = " + secdNumber);
                            int calculationResult2 = 1;
                            while (secdNumber > 1) {
                                calculationResult2 *= secdNumber;
                                secdNumber--;
                                System.out.print("x" + secdNumber);
                            }
                            System.out.println(" = " + calculationResult2);
                        } else {
                            System.out.println("Only positive numbers, try again.");
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid Option");
            }

            // Final data
            System.out.print("Want to calculate again? [S/N]:");
            userOption = input.next();

            // Validation of user option to continue or exit
            while (!userOption.equalsIgnoreCase("S") && !userOption.equalsIgnoreCase("N")) {
                System.out.println("Invalid input. Please enter 'S' to continue or 'N' to exit.");
                userOption = input.next();
            }
        } while (userOption.equalsIgnoreCase("S"));


        // Close Scanner to prevent resource leak
        input.close();
    }
}
