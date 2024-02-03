package task001;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        /**
         * 7. Escreva um programa que requisite ao utilizador o preço de 3 produtos adquiridos. Apresente o valor
         * a pagar, considerando que deverá ter um desconto de 10% sobre o total dos produtos.
         */
        // Scanner input for data:
        Scanner input = new Scanner(System.in);

        // Declaration of variables:
        int num1, num2, num3, valorTotal;
        double valorDesconto;

        // Data input by the user:
        System.out.println("Insert the value to got a descont:");
        System.out.print("First product value: ");
        num1 = input.nextInt();
        System.out.print("Second product value: ");
        num2 = input.nextInt();
        System.out.print("Third product value: ");
        num3 = input.nextInt();
        valorTotal = (num1 + num2 + num3);
        valorDesconto = ((double) valorTotal * 10 / 100);
        // Final data:
        System.out.println("The total value was: $" + valorTotal + " with 10% descont now is = $" + (valorTotal - valorDesconto));
    }
}
