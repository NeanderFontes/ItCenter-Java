package ficha03;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        //Impor Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Entrada e iniciação de variáveis:
        int numInicial, numFinal;

        //Entrada de dados:
        System.out.print("Insira um valor inicial para a contagem: ");
        numInicial = input.nextInt();
        System.out.print("Insira um valor final da contagem: ");
        numFinal = input.nextInt();

        while (numInicial <= numFinal) {
            System.out.println(numInicial);
            numInicial++;
        }
    }
}
