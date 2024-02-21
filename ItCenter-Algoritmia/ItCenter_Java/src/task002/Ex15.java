package task002;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        /**
         * 15. Escreva um programa que leia 3 números, seguidamente deve perguntar ao utilizador se quer ordem crescente
         * ‘C’ ou decrescente ‘D’, e deve colocar os números no ecrã por ordem decrescente ou crescente de acordo com a
         * escolha.
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        int firstNum, secondNum, thirdNum;
        int minValue = 0, medValue = 0, highValue = 0;
        int userOption = 0;
        boolean crescentValue = false;

        // Data input by the user
        System.out.println("Enter three values for at the end of the result choose between ascending or descending");
        System.out.print("First Value: ");
        firstNum = input.nextInt();
        System.out.print("Second Value: ");
        secondNum = input.nextInt();
        System.out.print("Third Value: ");
        thirdNum = input.nextInt();

        if (firstNum == secondNum && firstNum == thirdNum && secondNum == thirdNum) {
            crescentValue = true;
        } else {
            minValue = firstNum;
            medValue = secondNum;
            highValue = thirdNum;
            if (minValue < secondNum && minValue < thirdNum) {
                minValue = firstNum;
            } else {
                if (minValue > secondNum) {
                    minValue = secondNum;
                }
                if (minValue > thirdNum) {
                    minValue = thirdNum;
                }
            }
            if (medValue < thirdNum && medValue > firstNum) {
                medValue = secondNum;
            } else {
                if (medValue > thirdNum) {
                    medValue = thirdNum;
                }
                if (medValue < firstNum) {
                    medValue = firstNum;
                }
            }
            if (highValue > secondNum && highValue > firstNum) {
                highValue = thirdNum;
            } else {
                if (highValue < secondNum) {
                    highValue = secondNum;
                }
                if (highValue < firstNum && highValue > secondNum) {
                    highValue = thirdNum;
                }
            }
            if (medValue > highValue) {
                int temp = medValue;
                medValue = highValue;
                highValue = temp;
            }
        }

        // Final data
        if (crescentValue) {
            System.out.println("All the numbers are the same " + firstNum);
        } else {
            System.out.println("------------ Check Bank ------------");
            System.out.println("[ 1 ] - Descending");
            System.out.println("[ 2 ] - Ascending");
            System.out.println("------------------------------------");
            System.out.print("Please chose an option above: ");
            userOption = input.nextInt();
            switch (userOption) {
                case 1 -> System.out.println("The Descending sequence is: " + highValue + ", " + medValue + " e " + minValue);
                case 2 -> System.out.println("The Ascending sequence is: " + minValue + ", " + medValue + " e " + highValue);
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
