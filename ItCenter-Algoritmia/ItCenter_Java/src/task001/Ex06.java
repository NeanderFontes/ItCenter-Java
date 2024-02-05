package task001;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        /**
         * 6. Escreva um programa que leia dois valores inteiros e os armazene na variáveis valor1 e valor2. Permute
         * o valor das variáveis e apresente o resultado. De seguida, verifique se consegue efetuar esta troca sem
         * criar variáveis adicionais
         * Bubble Sort
         */
        // Scanner input for data:
        Scanner input = new Scanner(System.in);

        // Declaratio of variables:
        int num1, num2, bubbleSort;

        // Data input by the user:
        System.out.println("Modified values");
        System.out.print("Insert first value: ");
        num1 = input.nextInt();
        int num3 = num1;
        System.out.print("Insert second value: ");
        num2 = input.nextInt();
        bubbleSort = num1;
        num1 = num2;
        num2 = bubbleSort;

        // Final data:
        System.out.println("The first value involved was: " + num3 + " and now is = " + num1);
        System.out.println("The second value involved was: " + num1 + " and now is = " + bubbleSort);
    }
}
