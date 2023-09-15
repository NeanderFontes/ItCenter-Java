package ficha03;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        //Insirir numero inteiro e imprimir 5 anterior e posterior ao numero

        //Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Entrada e declaração de variáveis:
        int numAnterior, numPosterior, numEntrada;

        //Entrada de dados:
        System.out.print("Insira um valor para obter o resultado: ");
        numEntrada = input.nextInt();

        //Cálculos quando necessário:
        numPosterior = numEntrada + 5;
        numAnterior = numEntrada - 5;

        //Estrutura laço while para resolução:

        while (numAnterior < numEntrada) {
            System.out.println(numAnterior);
            numAnterior++;
        }

        while (numPosterior > numEntrada) {
            numPosterior--;
            System.out.println(numPosterior);
        }


    }
}
