package task001;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        /**
         * 2. Escreva um programa que requisite dois valores. O programa deverá utilizá-los como operandos para
         * as seguintes operações aritméticas: soma, subtração, multiplicação e divisão. Apresente o resultado
         * das operações e teste os resultados obtidos com vários casos
         * Exemplo de execução:
         * - Introduza um numero: 20
         * - Introduza um numero: 4
         * - Soma: 24
         * - Subtracao: 16
         * - Multiplicacao: 80
         * - Divisao: 5
         */
        // Scanner input for data:
        Scanner input = new Scanner(System.in);

        // Declaration of variables:
        int num1 = 0, num2 = 0, resultado;

        // Data input by the user:
        System.out.println("Please insert values of two numbers to get the total result.");
        System.out.print("First number = ");
        num1 = input.nextInt();
        System.out.print("Second number = ");
        num2 = input.nextInt();

        // Totaly result:
        resultado = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + resultado);
        resultado = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + resultado);
        resultado = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + resultado);
        double resultadoDivisao = ((double) num1 / num2);
        System.out.println(num1 + " / " + num2 + " = " + resultadoDivisao);

    }
}
