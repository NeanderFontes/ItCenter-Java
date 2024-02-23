package task002;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        /**
         * 3. Determine e escreva o montante de impostos a pagar sobre um salário anual lido, tendo em conta o seguinte:
         * a. Salário até 15.000€ inclusive paga taxa de 20%
         * b. Salário de 15.000€ a 20.000€ inclusive paga taxa de 30%
         * c. Salário de 20.000€ a 25.000€ inclusive paga taxa de 35%
         * d. Salário superior a 25.000€ paga taxa de 40%
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        double salarioAnual, valorImpostoFixo, descontoValorImposto;

        // Data input by the user
        System.out.print("Please insert your amount payment: $");
        salarioAnual = input.nextDouble();

        // Final data
        if (salarioAnual <= 0) {
            System.out.println("Sorry please insert the correct amount");
        } else {
            if (salarioAnual <= 15000) {
                valorImpostoFixo = 20;
            } else if (salarioAnual <= 20000) {
                valorImpostoFixo = 30;
            } else if (salarioAnual <= 25000) {
                valorImpostoFixo = 35;
            } else {
                valorImpostoFixo = 40;
            }
            descontoValorImposto = (salarioAnual * valorImpostoFixo / 100);
            System.out.println("The tax is " + (int)valorImpostoFixo + "%. You hhave to pay $" + descontoValorImposto);
        }

        // Close the scanner to prevent resource leak
        input.close();
    }
}
