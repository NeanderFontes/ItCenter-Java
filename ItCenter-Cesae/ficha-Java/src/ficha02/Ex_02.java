package ficha02;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        //Import Scann input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis:
        double salario, taxaSalario, descSalario;

        //Entrada de dados:
        System.out.print("Introduza o salário: ");
        salario = input.nextDouble();

        //Cálculos e estrutura de controle:
        if (salario > 15000) { //taxa a pagar maior que 15.000€
            System.out.println("Paga taxa de 30%:");
            taxaSalario = ((salario * 30) / 100);
            descSalario = salario - taxaSalario;
            System.out.println("Taxa a ser paga = " + taxaSalario);
        } else { //taxa a pagar menor ou igual que 15.000€
            System.out.println("Paga taxa de 20%:");
            taxaSalario = (salario * 20) / 100;
            descSalario = salario - taxaSalario;
            System.out.println("Taxa a ser paga = " + taxaSalario);
        }
    }
}
