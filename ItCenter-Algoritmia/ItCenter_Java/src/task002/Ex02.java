package task002;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        /**
         * 2. Determine e escreva o montante de impostos a pagar sobre um salário anual lido, tendo em conta o seguinte:
         * a. Salário até 15.000€ inclusive paga taxa de 20%
         * b. Salário superior a 15.000€ paga taxa de 30%
         * Exemplos de execução:
         * - Introduza um salario: 10000
         * - Paga taxa de 20%: 2000€
         *
         * - Introduza um salario: 20000
         * - Paga taxa de 30%: 6000€
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        double salarioAnual, valorImposto;

        // Data input by the user
        System.out.print("Please insert your amount payment: $");
        salarioAnual = input.nextInt();

        // Final Data
        if (salarioAnual <= 0) {
            System.out.println("Sorry please insert the correct amount");
        } else {
            if (salarioAnual <= 15000) {
                valorImposto = (salarioAnual * 20 / 100);
                System.out.println("The tax is 20% you have to pay $" + valorImposto);
                salarioAnual -= valorImposto;
                System.out.println("Final amount total = $" + salarioAnual);
            } else {
                valorImposto = (salarioAnual * 30 / 100);
                System.out.println("The tax is 30% you have to pay $" + valorImposto);
                salarioAnual -= valorImposto;
                System.out.println("Final amount total = $" + salarioAnual);
            }
        }
    }
}
