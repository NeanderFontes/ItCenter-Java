package ficha03;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        //Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Entrada e declaração de variáveis:
        int numEntrada, numSoma, numMedia, numContador;
        numEntrada = 0;
        numSoma = 0;
        numContador = 0;

        do {
            System.out.print("Insira valores para obter a média entre ele Ou digite (-1 para sair).: ");
            numEntrada = input.nextInt();
            if(numEntrada != -1) {
                numSoma += numEntrada;
                numContador++;
            }

        /*
            Teste de mesa para auxiliar no resultado
            System.out.println("numEntrada: "+numEntrada);
            System.out.println("numContador: "+numContador);
            System.out.println("numSoma: "+numSoma);
            System.out.println();
                                                                */
        } while (numEntrada != -1);

        //Calculos se necessários:
        numMedia = numSoma / numContador;

        //Saída de dados finais:
        System.out.print("A média entre os números é = " + numMedia);
    }
}
