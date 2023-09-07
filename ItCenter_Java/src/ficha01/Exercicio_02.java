package ficha01;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        //Import Scanner input entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis:
        int num1, num2, numSoma, numSubtracao, numMultiplicacao;
        double numDivisao;

        //Entrada de dados:
        System.out.println("Entre com dois números para Operações Aritméticas ");
        System.out.print("Primeiro número:");
        num1 = input.nextInt();
        System.out.print("Segundo número:");
        num2 = input.nextInt();

        //Cálculos para resultados finais possiveis:
        numSoma = num1 + num2;
        numSubtracao = num1 - num2;
        numMultiplicacao = num1 * num2;
        numDivisao = (double) num1 / num2;

        //Resultados finais:
        System.out.println("Soma: " + numSoma);
        System.out.println("Subtração: " + numSubtracao);
        System.out.println("Multiplicação: " + numMultiplicacao);
        System.out.println("Divisão: " + numDivisao);
    }
}
