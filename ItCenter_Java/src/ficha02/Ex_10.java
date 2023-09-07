package ficha02;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        //Import scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Entrada de variáveis e declarações de valores:
        int num1, num2, numResultado;
        String operador;

        //Entrada de dados
        System.out.print("Insira um valor: ");
        num1 = input.nextInt();
        System.out.print("Insira próximo valor: ");
        num2 = input.nextInt();

        System.out.println("Escolha uma opção para executar a operação aritmética:");
        System.out.print("Entre as opções: '+', '-', '/' ou '*'");
        operador = input.next();

        switch (operador) {
            case "+":
                numResultado = num1 + num2;
                System.out.println("A soma = " + numResultado);
                break;
            case "-":
                numResultado = num1 - num2;
                System.out.println("A subtração = " + numResultado);
                break;
            case "/":
                numResultado = num1 / num2;
                System.out.println("A divisão = " + numResultado);
                break;
            case "*":
                numResultado = num1 * num2;
                System.out.println("A multiplicação = " + numResultado);
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }
}
