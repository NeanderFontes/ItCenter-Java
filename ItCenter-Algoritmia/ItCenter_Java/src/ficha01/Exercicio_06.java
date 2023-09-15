package ficha01;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        /*
            6.Escreva um programa que leia dois valores inteiros e os armazene na variáveis valor1 e valor2.
            Permute o valor das variáveis e apresente o resultado.
            De seguida, verifique se consegue efetuar esta troca sem criar variáveis adicionais
         */

        //Scanner input para import de entrada de dados:
        Scanner input = new Scanner(System.in);

        //Entrada de variáveis:
        int valor1, valor2, valor3;

        //Entrada de dados:
        System.out.print("Inverter valores de variáveis, Digite primeiro valor: ");
        valor1 = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = input.nextInt();
        System.out.println("1º valor = " + valor1);
        System.out.println("2º valor = " + valor2);

        //Iversão de valores:
        valor3 = valor1;
        valor1 = valor2;

        //Saída de dados:
        System.out.println("1º valor inverso = " + valor1);
        System.out.println("2º valor inverso = " + valor3);

    }
}
