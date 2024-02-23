package task003;

import javax.security.sasl.SaslServer;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        /**
         * 1. Faça um programa que imprima os números no intervalo de 1 a 250 inclusive. (Não necessita de Scanner ou
         * input do utilizador). Exemplo de execução:
         *  1
         * - 2
         * - 3
         * - 4
         * ...
         * - 248
         * - 249
         * - 250
         */

        // Declaration of variables
        int inputCount = 0;
        int maxNumber = 250;

        // Final data
        while (inputCount <= 250) {
            System.out.println("Counting: " + ++inputCount);
            if (inputCount == maxNumber) {
                break;
            }
        }
    }
}
