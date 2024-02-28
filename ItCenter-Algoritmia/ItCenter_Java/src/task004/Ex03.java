package task004;
import java.util.Random;
import java.util.Scanner;


public class Ex03 {
    public static void main(String[] args) {
        /**
         * 3. Crie um jogo, que peça ao jogador 1 um valor entre 0 e 100.
         * De seguida, deverá permitir ao jogador 2 tentar acertar no valor inserido pelo jogador 1.
         * A cada iteração, enquanto o valor não for descoberto, deverá informar
         * se o valor introduzido pelo jogador 2 é inferior ou superior ao valor inserido pelo jogador 1. No final (quando o
         * valor é descoberto) deverá apresentar o número de tentativas que o jogador 2 necessitou para acertar.
         */

        // Scanner input e random for data
        Scanner input = new Scanner(System.in);
        Random randomGame = new Random();

        // Declaration of variables
        boolean hitRandomNumber = false;
        int userChooseOption, hitWrongNumber = 0, totalOfWrongNumber = 0;
        int randomNumber = randomGame.nextInt(0, 101); // Random number between 0 ~ 100

        // Data input by the user
        System.out.println("Let's play a game, guess the number between 0 - 100");
        while (!hitRandomNumber) {
            System.out.print("Please pick one: ");
            userChooseOption = input.nextInt();
            if (userChooseOption < 0) {
                System.out.println("Sorry only biger than 0, between 0 - 100, try again.");
            } else if (userChooseOption >= 101) {
                System.out.println("Sorry only less than 101, between 0 - 100, try again.");
            } else {
                if (userChooseOption == randomNumber) {
                    hitWrongNumber++;
                    hitRandomNumber = true;
                } else {
                    hitWrongNumber++;
                    System.out.println("Sorry not this time! You have tried " + hitWrongNumber + " attempts into now");
                }
            }
        }

        // Final data
        if (hitRandomNumber) {
            System.out.println("OWW! Great!! You got it right!!");
            System.out.println("You tried in total to " + hitWrongNumber + " attempts. Congratulations!!");
        } else {
            System.out.println("OW! Sorry, you can do better! Thank you for playing");
            System.out.println("You tried in total to " + hitWrongNumber + " attempts!");
        }

        // Close Scanner to prevent resource leak
        input.close();
    }
}
