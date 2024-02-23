package task003;

public class Ex03 {
    public static void main(String[] args) {
        /**
         * 3. Faça um programa que imprima os números ímpares no intervalo de 531 a 750 inclusive. (Não necessita de
         * Scanner ou input do utilizador)
         */

        // Declaration of variables
        int inputCount = 531;
        int finalNum = 750;

        // Final data
        System.out.println("Odd numbers count between " + inputCount + " and " + finalNum + ": ");
        while (inputCount <= finalNum) {
            ++inputCount;
            if (inputCount % 2 != 0) {
                System.out.println(inputCount);
            }
        }
    }
}
