package ficha02;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        //Import scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis:
        int contador, numEntrada, numMaior, numMenor;

        //Entrada de dados:
        contador = 0;
        numEntrada = 0;
        numMaior = 0;
        numMenor = 0;

        //Entrada de laços de repetição:
        while (contador < 2) {
            System.out.print("Entre com o " + (contador+1) + "º: ");
            numEntrada = input.nextInt();

            if (contador == 0) {
                numMaior = numEntrada;
                numMenor = numEntrada;
            } else {
                if (numEntrada < numMenor) {
                    numMenor = numEntrada;
                }
                if (numEntrada > numMenor) {
                    numMaior = numEntrada;
                }
            }
            contador++;
        }
        System.out.println("O Menor valor = " + numMenor);
        System.out.println("O Maior valor = " + numMaior);
    }
}
