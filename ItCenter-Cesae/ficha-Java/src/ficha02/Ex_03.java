package ficha02;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        //Import scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração de varáveis:
        double salario, descSalario, taxaSalario;

        //Entrada de dados:
        System.out.print("Introduza o valor do salário:");
        salario = input.nextDouble();

        //Cálculos e estrutura de controle:
        if (salario <= 15000) { //taxa de 20% com valores de 0€ - 15.000€
            System.out.println("Taxa paga de 20%");
            taxaSalario = (salario * 20) / 100;
            descSalario = salario - taxaSalario;
            System.out.println("Taxa a ser paga = " + taxaSalario);
        } else if (salario > 15000 && salario <= 20000) { //taxa de 30% com valores de 15.001€ - 20.000€
            System.out.println("Taxa paga de 30%");
            taxaSalario = (salario * 30) / 100;
            descSalario = salario - taxaSalario;
            System.out.println("Taxa a ser paga = " + taxaSalario);
        } else if (salario > 20000 && salario <= 25000) { //taxa de 35% com valores de 20.001€ - 25.000€
            taxaSalario = (salario * 35) / 100;
            descSalario = salario - taxaSalario;
            System.out.println("Taxa a ser paga = " + taxaSalario);
        } else { //Taxa de 40% com valor superior a 25000€
            taxaSalario = (salario * 40) / 100;
            descSalario = salario - taxaSalario;
            System.out.println("Taxa a ser paga = " + taxaSalario);
        }
    }
}
