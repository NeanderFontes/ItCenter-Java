package ficha02;

import java.util.Random;
import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        //Import scanner de random input para entrada de valores:
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        //Entrada de variáveis e declarações de valores:
        int numMaior, numMenor, numRandom, contador;
        numMaior = 0;
        numMenor = 0;

        //Entrada de laços e resoluções:
        System.out.print("Os números são: ");
        for (contador = 0; contador >= 0 && contador < 3; contador++) {
            numRandom = random.nextInt(51);
            System.out.print("[" + numRandom + "] ");

            if (contador == 0) {
                numMaior = numRandom;
                numMenor = numRandom;
            } else {
                if (numRandom < numMenor) {
                    numMenor = numRandom;
                }
                if (numRandom > numMaior) {
                    numMaior = numRandom;
                }
            }
        }
        System.out.println("\n" + "O menor valor entre eles é = [" + numMenor + "]");
    }
}
