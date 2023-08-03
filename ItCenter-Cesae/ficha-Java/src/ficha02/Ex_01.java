package ficha02;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        //Inicializando Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis:
        int num1, num2;

        //Entrada de dados:
        System.out.println("Introduza dois valores para determinar maior entre eles:");
        System.out.print("1º valor: ");
        num1 = input.nextInt();
        System.out.print("2º valor: ");
        num2 = input.nextInt();

        //Estrutura de controle para perceber numero maior:
        if (num1 == num2) {
            System.out.println("Os valores são iguais");
        } else if (num1 > num2) {
            System.out.println("1º valor: " + num1 + " é o maior entre eles.");
        } else {
            System.out.println("2º valor: " + num2 + " é o maior número.");
        }
    }
}
