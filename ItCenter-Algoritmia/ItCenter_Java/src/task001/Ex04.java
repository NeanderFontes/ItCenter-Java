package task001;

import java.util.Scanner;
import java.util.SortedSet;

public class Ex04 {
    public static void main(String[] args) {
        /**
         * Escreva um programa para calcular a área da circunferência. As dimensões devem ser requisitadas ao
         * utilizador.
         * A = (π r²).
         */

        // Scanner input for data:
        Scanner input = new Scanner(System.in);

        // Declaration of variables:
        double tamanhoRaio = 0;
        double areaCircuferencia;

        // Data input by the user
        System.out.println("To calculate area of circunference going to need the size of raio");
        System.out.print("Please enter for the size: ");
        tamanhoRaio = input.nextDouble();
        areaCircuferencia = (Math.PI * (tamanhoRaio * tamanhoRaio));

        // Final data:
        System.out.println("The total area is: " + areaCircuferencia);
    }
}
