package ficha03;

import java.util.Scanner;

public class Ex_9 {
    public static void main(String[] args) {
        //Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Entrada e declaração das variáveis:
        int numEntrada, numPar, numContador;
        numContador = 2;

        //Entrada de dados:
        System.out.print("Insira um número para sua contagem em par até o mesmo: ");
        numEntrada = input.nextInt();

        //Estrutura de laço while:
        while (numContador <= numEntrada) {
            numEntrada--;
            if (numEntrada % 2 == 0) {
                numPar = numEntrada;
                System.out.println(numPar);
            }
        }
    }
}
