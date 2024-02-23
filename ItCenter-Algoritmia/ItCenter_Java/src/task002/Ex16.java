package task002;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        /**
         * 16. Escreva um programa que lê um valor em euros  e calcula qual o menor número possível de notas
         * de 200, 100, 50, 20, 10, 5 em que o valor pode ser decomposto. Escrever o valor lido e a relação de notas
         * necessárias.
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        int bankNote500 = 0, bankNote200 = 0, bankNote100 = 0, bankNote50 = 0, bankNote20 = 0, bankNote10 = 0, bankNote5 = 0;
        double euroCoinCents2 = 0, euroCoinCents1 = 0, euroCoinCents050 = 0, euroCoinCents020 = 0, euroCoinCents010 = 0;
        double euroCoinCents005 = 0, euroCoinCents002 = 0, euroCoinCents001 = 0, inputValue;

        // Data input by the user
        System.out.print("Banknote system.\nPlease enter a value in € to get total banknotes: ");
        inputValue = input.nextDouble();

        if (inputValue <= 0) {
            System.out.println("Sorry do not exist banknote to this value.");
        } else {
            bankNote500 = (int) (inputValue / 500);
            inputValue -= bankNote500 * 500;

            bankNote200 = (int) (inputValue / 200);
            inputValue -= bankNote200 * 200;

            bankNote100 = (int) (inputValue / 100);
            inputValue -= bankNote100 * 100;

            bankNote50 = (int) (inputValue / 50);
            inputValue -= bankNote50 * 50;

            bankNote20 = (int) (inputValue / 20);
            inputValue -= bankNote20 * 20;

            bankNote10 = (int) (inputValue / 10);
            inputValue -= bankNote10 * 10;

            bankNote5 = (int) (inputValue / 5);
            inputValue -= bankNote5 * 5;

            // Coins
            euroCoinCents2 = (int)  (inputValue / 2);
            inputValue -= euroCoinCents2 * 2;

            euroCoinCents1 = (int)  (inputValue / 1);
            inputValue -= euroCoinCents1 * 1;

            euroCoinCents050 = (int) (inputValue / 0.50);
            inputValue -= euroCoinCents050 * 0.50;

            euroCoinCents020 = (int) (inputValue / 0.20);
            inputValue -= euroCoinCents020 * 0.20;

            euroCoinCents010 = (int) (inputValue / 0.10);
            inputValue -= euroCoinCents010 * 0.10;

            euroCoinCents005 = (int) (inputValue / 0.05);
            inputValue -= euroCoinCents005 * 0.05;

            euroCoinCents002 = (int) (inputValue / 0.02);
            inputValue -= euroCoinCents002 * 0.02;

            euroCoinCents001 = (int) (Math.round(inputValue / 0.01));
            inputValue -= euroCoinCents001 * 0.01;
        }

        // Final data
        if (bankNote500 > 0) System.out.println("Total banknotes €500: " + bankNote500);
        if (bankNote200 > 0) System.out.println("Total banknotes €200: " + bankNote200);
        if (bankNote100 > 0) System.out.println("Total banknotes €100: " + bankNote100);
        if (bankNote50 > 0) System.out.println("Total banknotes €50: " + bankNote50);
        if (bankNote20 > 0) System.out.println("Total banknotes €20: " + bankNote20);
        if (bankNote10 > 0) System.out.println("Total banknotes €10: " + bankNote10);
        if (bankNote5 > 0) System.out.println("Total banknotes €5: " + bankNote5);
        if (euroCoinCents2 > 0) System.out.println("Total coins €2: " + (int) euroCoinCents2);
        if (euroCoinCents1 > 0) System.out.println("Total coins €1: " + (int) euroCoinCents1);
        if (euroCoinCents050 > 0) System.out.println("Total coins €0.50: " + (int) euroCoinCents050);
        if (euroCoinCents020 > 0) System.out.println("Total coins €0.20: " + (int) euroCoinCents020);
        if (euroCoinCents010 > 0) System.out.println("Total coins €0.10: " + (int) euroCoinCents010);
        if (euroCoinCents005 > 0) System.out.println("Total coins €0.05: " + (int) euroCoinCents005);
        if (euroCoinCents002 > 0) System.out.println("Total coins €0.02: " + (int) euroCoinCents002);
        if (euroCoinCents001 > 0) System.out.println("Total coins €0.01: " + (int) euroCoinCents001);

        // Close scanner to prevent resouce leak
        input.close();
    }
}
