package ficha06;

import java.util.Scanner;

public class Ex_02 {
    private static void funcaoRetorno(int numRetorno) {
        for (int numIndice = 0; numIndice < numRetorno; numIndice++) {
            System.out.print("*");
        }
    }

    //Função principal:
    public static void main(String[] args) {
        //Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis:
        int numEntrada;

        //Entrada de dados:
        do {
            System.out.print("Introduza um valor inteiro positivo: ");
            numEntrada = input.nextInt();
            if (numEntrada % 2 == 0) {
                funcaoRetorno(numEntrada);
            } else {
                System.out.println("Numero inválido");
            }
            System.out.println();
        } while (numEntrada >= 0);
    }

}
