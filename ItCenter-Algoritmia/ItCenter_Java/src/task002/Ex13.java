package task002;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        /**
         * 13. Faça um programa que leia um horário no sistema de 24 horas e imprima esse horário no sistema de 12 horas.
         * Exemplo: Valores Lidos: 22 32 Resultado: 10 32 PM
         * Valores Lidos: 10 44 Resultado: 10 44 AM
         * Exemplos de execução:
         *   Introduza horas: 11
         * - Introduza minutos: 40
         * - 11:40 AM
         *   Introduza horas: 22
         * - Introduza minutos: 15
         * - 10:15 PM
         */

        // Scanner input data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        int hourTime, minuteTime;
        String finalData = "";

        // Data input by the user
        System.out.print("Insert the hours: ");
        hourTime = input.nextInt();
        System.out.print("Insert the minutes: ");
        minuteTime = input.nextInt();

        if (hourTime >= 25) {
            finalData = ("Sorry do not exist " + hourTime + " hours");
        } else {
            if (hourTime >= 13 && hourTime <= 24 && minuteTime <= 59) {
                hourTime -= 12;
                finalData = (hourTime + ":" + minuteTime + "PM");
            }
            if (hourTime >= 13 && hourTime <= 24 || minuteTime > 59) {
                minuteTime -= 60;
                hourTime += 1;
                if (hourTime > 24) {
                    hourTime = 1;
                    finalData = (hourTime + ":" + minuteTime + "AM");
                }
                if (hourTime >= 13 && hourTime <= 24) {
                    hourTime -= 12;
                    finalData = (hourTime + ":" + minuteTime + "PM");
                }
            }
        }

        // Final data
        System.out.println(finalData);
    }
}
