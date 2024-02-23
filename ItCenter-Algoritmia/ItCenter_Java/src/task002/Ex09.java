package task002;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        /**
         * 9. Crie um programa que mostre o menor de três números inteiros lidos.
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        int inputNum, firstNumber, secondNum, thirdNum, largestNum = 0, smallestNum = 0;
        boolean larestValue = false;

        // Data input by the user
        System.out.println("Enter three values to know which one is the largest");
        System.out.print("First Value: ");
        firstNumber = input.nextInt();
        System.out.print("Second Value: ");
        secondNum = input.nextInt();
        System.out.print("Third Value: ");
        thirdNum = input.nextInt();

        if (firstNumber == secondNum && firstNumber == thirdNum && secondNum == thirdNum) {
            larestValue = true;
        } else {
            largestNum = firstNumber;
            if (secondNum > largestNum) {
                largestNum = secondNum;
            }
            if (thirdNum > largestNum) {
                largestNum = thirdNum;
            }
        }
        
        // Final data
        if (larestValue) {
            System.out.println("All the numbers are the same " + firstNumber);
        } else {
            System.out.println("The largest value is " + largestNum);
        }

        // Close the scanner to prevent resource leak
        input.close();
    }
}
