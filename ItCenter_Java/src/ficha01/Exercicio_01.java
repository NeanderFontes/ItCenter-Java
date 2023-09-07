package ficha01;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        //Comando de entrada de dados Scanner input:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis:
        int num1, num2, numSoma;

        //Entrada de dados:
        System.out.println("Introduza número para a soma");
        System.out.print("Primeiro número: ");
        num1 = input.nextInt();
        System.out.print("Segundo número: ");
        num2 = input.nextInt();

        //Cálculos de resultados finais:
        numSoma = num1 + num2;

        //Saída de dados:
        System.out.println("A soma de " + num1 + " + " + num2 + " = " + numSoma);

    }
}
