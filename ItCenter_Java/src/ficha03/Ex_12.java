package ficha03;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        //Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Entrada e declaração de variáveis:
        int numFinal, numContador, numMuiltiplo5;
        numContador = 0;
        numMuiltiplo5 = 0;

        //Entrada de dados:
        System.out.print("Insira valor para inicio da contagem: ");
        numContador = input.nextInt();
        System.out.print("Insira o valor para o final da contagem: ");
        numFinal = input.nextInt();

        //Resolução com laço while:
        while (numContador <= numFinal) {
            if (numContador % 5 == 0) {
                numMuiltiplo5 = numContador;
                System.out.println(numContador);
            }
            numContador++;
        }
    }
}
