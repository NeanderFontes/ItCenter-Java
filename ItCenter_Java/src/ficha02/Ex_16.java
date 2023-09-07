package ficha02;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {
        //Import scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Entrada de variáveis:
        int euroValor, quantidadeNotas;

        //Entrada de dados:
        System.out.print("Introduza o valor para troca das notas: ");
        euroValor = input.nextInt();
        System.out.println("\n==========================================");
        System.out.println("\t\tValor para troca: €" + euroValor);
        System.out.println("==========================================");

        if (euroValor % 5 == 0) {
            quantidadeNotas = euroValor / 200;
            System.out.println("Quantidade de notas de €200 = " + quantidadeNotas);
            euroValor = euroValor % 200;

            quantidadeNotas = euroValor / 100;
            System.out.println("Quantidade de notas de €100 = " + quantidadeNotas);
            euroValor = euroValor % 100;

            quantidadeNotas = euroValor / 50;
            System.out.println("Quantidade de notas de €50 = " + quantidadeNotas);
            euroValor = euroValor % 50;

            quantidadeNotas = euroValor / 20;
            System.out.println("Quantidade de notas de €20 = " + quantidadeNotas);
            euroValor = euroValor % 20;

            quantidadeNotas = euroValor / 10;
            System.out.println("Quantidade de notas de €10 = " + quantidadeNotas);
            euroValor = euroValor % 10;

            quantidadeNotas = euroValor / 5;
            System.out.println("Quantidade de notas de €5 = " + quantidadeNotas);
            euroValor = euroValor % 5;
        } else {
            System.out.println("Valor inserido não é divisor de 5");
        }
    }
}
