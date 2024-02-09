package task002;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        /**
         * 10. Escreva um programa que leia dois números reais e pergunte ao utilizador qual a operação aritmética que quer
         * realizar e apresente o resultado. O utilizador deve responder usando o símbolo da operação (exemplo: para fazer
         * a soma, o utilizador deve escrever ‘+’). Se for inválido apresente erro.
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        double firstNum, secondNum, finalResult = 0;
        char optionUser;

        // Data input by the user
        System.out.println("Mini calculator");
        System.out.print("Inser the first number: ");
        firstNum = input.nextDouble();
        System.out.print("Inser the second number: ");
        secondNum = input.nextDouble();
        System.out.println("------------ Mini Calculator ------------");
        System.out.println("[ + ] - Sum");
        System.out.println("[ - ] - Subtraction");
        System.out.println("[ * ] - Multiplication");
        System.out.println("[ / ] - Division");
        System.out.println("-----------------------------------------");
        System.out.print("Please chose a correct operator: ");
        optionUser = input.next().charAt(0);

        // Calculating results
        switch (optionUser) {
            case '+' -> finalResult = (firstNum + secondNum);
            case '-' -> finalResult = (firstNum - secondNum);
            case '*' -> finalResult = (firstNum * secondNum);
            case '/' -> {
                if (secondNum == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    finalResult = (firstNum / secondNum);
                }
            }
            default -> System.out.println("Invalid option.");
        }

        // Final data
        System.out.println("Final result = " + finalResult);

        // Close the scanner to prevent resource leak
        input.close();
    }
}
