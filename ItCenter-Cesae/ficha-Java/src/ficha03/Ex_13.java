package ficha03;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        //Impor Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Entrada e declaração de dados:
        int numContador, numEntrada, numInseridoDesejado;
        int numMaior, numMenor, numFinal;
        boolean numIdentificador = true;
        numContador = 0;
        numMaior = 0;
        numMenor = 0;

        //Entrada de dados:
        System.out.print("Para determinar uma sequência introduza a quantidade de numeros desejados: ");
        numInseridoDesejado = input.nextInt();
        System.out.print("Insira o " + (numContador + 1) + "º: ");
        numEntrada = input.nextInt();
        numContador++;

        //Resolução com laço while:
        while (numContador < numInseridoDesejado) {
            numContador++;
            System.out.print("Insira o " + (numContador) + "º: ");
            numFinal = input.nextInt();

    /*
            Teste para numero inserido:
            System.out.print("Quantidade de numero desejado = " + numInseridoDesejado);
            System.out.println();
            System.out.println("Entra do(s) valore(s) = " + numEntrada);
                                                                                        */
            if (numEntrada < numFinal) {

            } else {
                numIdentificador = false;
            }
            numEntrada = numFinal;

        }


        if (numIdentificador == true) {
            System.out.println("Ordem crescente!");
        } else {
            System.out.println("Ordem não crescente!");
        }
    }
}
