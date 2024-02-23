package task003;

public class Ex02 {
    public static void main(String[] args) {
        /**
         * 2. Faça um programa que imprima os números pares no intervalo de 1 a 400 inclusive. (Não necessita de Scanner
         * ou input do utilizador). Exemplo de execução:
         *  2
         * - 4
         * - 6
         * - 8
         * ...
         * - 396
         * - 398
         * - 400
         */

        // Declaration of variables
        int inputCount = 0;
        int finalNumber = 400;

        // Final data
        System.out.println("Count of even numbers between 0 and 400: ");
        while (inputCount <= 400) {
            ++inputCount;
            if (inputCount % 2 == 0) {
                System.out.println(inputCount);
            }
        }
    }
}
