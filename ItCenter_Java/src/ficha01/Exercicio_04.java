package ficha01;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        /*  4.Escreva um programa para calcular a área da circunferência.
            As dimensões devem ser requisitadas ao utilizador.          */

        //Scanner input import para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis:
        double areaCircunferencia, raioCircunferencia;
        double constPi = 3.1415926;

        //Entrada de dados:
        System.out.print("Qual o raio da Circunferência?");
        raioCircunferencia = input.nextDouble();

        //Cálculos para possíveis resultados:
        //Área da circunferência: A = π * (r * 2).
        areaCircunferencia = constPi * (raioCircunferencia * 2);

        //Saída de dados:
        System.out.println("Área da circunferencia = " + areaCircunferencia);
    }
}
