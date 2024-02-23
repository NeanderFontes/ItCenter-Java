package task002;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        /**
         * 8. Escreva um programa que leia três notas (0-20 valores) de um aluno, calcule a sua média final ponderada, e diga
         * se está aprovado ou não (mais de 9.5). Ponderações: Nota 1: 25%; Nota 2: 35%; Nota 3:40%
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        int ponderacaoNota1 = 25, ponderacaoNota2 = 35, ponderacaoNota3 = 40;
        double grade1, grade2, grade3, totalAverage;

        // Data input by the user
        System.out.println("Program to calculate student's final average");
        System.out.print("Enter student's first grade(0-20): ");
        grade1 = input.nextDouble();
        System.out.print("Enter student's second grade(0-20): ");
        grade2 = input.nextDouble();
        System.out.print("Enter student's third grade(0-20): ");
        grade3 = input.nextDouble();

        // Calculate to got response
        grade1 *= ponderacaoNota1 / 100.0;
        grade2 *= ponderacaoNota1 / 100.0;
        grade3 *= ponderacaoNota1 / 100.0;
        totalAverage = (grade1 + grade2 + grade3);

        // Final data
        if (totalAverage >= 9.5) {
            System.out.println("Approved with an average of " + totalAverage);
        } else {
            System.out.println("Failed with an average of " + totalAverage);
        }
    }
}
