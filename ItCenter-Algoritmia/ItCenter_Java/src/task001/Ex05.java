package task001;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        /**
         * 5. Escreva um programa que determine a média aritmética de um conjunto de 3 valores introduzidos pelo
         * utilizador. Tendo em consideração os valores introduzidos, deverá também apresentar a média
         * ponderada considerando as seguintes ponderações: 20%, 30%, 50%
         */

        // Scanner input for data:
        Scanner input = new Scanner(System.in);

        // Declaration of variables:
        int num1 = 0, num2 = 0, num3 = 0, totalNum = 0;
        double mediaAritmetica;

        // Data input by the user:
        System.out.println("Program that determines the arithmetic mean of a set of three values: ");
        System.out.print("First: ");
        num1 = input.nextInt();
        totalNum++;
        System.out.print("Second: ");
        num2 = input.nextInt();
        totalNum++;
        System.out.print("Third: ");
        num3 = input.nextInt();
        totalNum++;
        mediaAritmetica = ((double)num1 + num2 + num3) / totalNum;

        // Final data:
        System.out.println("The total of arithmetic mean = " + mediaAritmetica);

    }
}
