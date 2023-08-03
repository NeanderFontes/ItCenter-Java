package ficha03;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        //Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Entrada e declaração de variáveis:
        int numEntrada, numContador, numIncrementoSalto;
        numContador = 0;

        //Entrada de dados:
        System.out.println("Insira um valor e contagem a partir do mesmo: ");
        System.out.print("Insira o valor limite da contagem: ");
        numEntrada = input.nextInt();
        System.out.print("Deseja realizar a contagem saltando de quanto a quato? ");
        numIncrementoSalto = input.nextInt();

        //Estrutura resolvida com laço while:
        while (numContador <= numEntrada) {
            System.out.print(numContador + " -> ");
            numContador += numIncrementoSalto;
        }
        System.out.println("Fim.");
    }
}
