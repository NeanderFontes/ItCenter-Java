package ficha02;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        //Import scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Entrada de dados:
        int contador, numMaior, numMenor, numEntrada;

        //Inicialização de variáveis:
        contador = 0;
        numMaior = 0;
        numMenor = 0;

        //Laço de repetição e estrutura de controle:
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
                if (numMaior > numEntrada) {
                    numMaior = numEntrada;
                }
            }
            contador++;
        }
        System.out.println("Maior número = " + numMaior);
        System.out.println("Menor número = " + numMenor);
    }
}
