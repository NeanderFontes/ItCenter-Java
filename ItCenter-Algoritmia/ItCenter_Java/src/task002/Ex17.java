package task002;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        /**
         * 17. Um banco autoriza a conceção de um crédito especial aos seus clientes, num montante variável com base no seu
         * saldo médio do último ano. Faça um programa que leia o saldo médio de um cliente e calcule o valor do crédito
         * especial de acordo com a seguinte tabela. Mostre uma mensagem com o saldo médio e o valor de crédito.
         *
         * Saldo Médio Percentagem
         * De 0 a 2000 (inclusive) Nenhum crédito
         * De 2000 a 4000 (inclusive) 20% do valor do saldo médio
         * De 4000 a 6000 (inclusive) 30% do valor do saldo médio
         * Acima de 6000 40% do valor do saldo médio
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        double avarageBalance, creditValue = 0;
        int taxValue = 0;
        boolean enoughAvarage = false;

        // Data input by the user
        System.out.print("Please insert your average balance: €");
        avarageBalance = input.nextDouble();

        // Calculate to got response
        if (avarageBalance < 0) {
            System.out.println("Sorry you avarage balance are incorrect! Try Again.");
        } else {
            if (avarageBalance <= 2000) {
                enoughAvarage = true;
                taxValue = 0;
            } else if (avarageBalance > 2000 && avarageBalance <= 4000) {
                taxValue = 20;
            } else if (avarageBalance > 4000 && avarageBalance <= 6000) {
                taxValue = 30;
            } else {
                taxValue = 40;
            }
            creditValue = avarageBalance * taxValue / 100;
        }

        // Final data
        if (enoughAvarage) {
            System.out.println("Sorry you don't have enough avarage balance for credit.");
        } else {
            System.out.println("Your have " + taxValue + "% of you avarage balance, The total credit is: €" + creditValue);
        }

        // Close the scanner to prevent resouce leak
        input.close();
    }
}
