package ficha01;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        //Scanner input import para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis:
        int areaRetangulo, baseRetangulo, alturaRetangulo, pRetangulo;

        //Entrada de dados:
        //Area do Retângulo: A = b * h
        //Para calcular o perímetro de um retângulo, deve-se somar os seus quatro lados: p = (b + h) * 2
        System.out.print("Introduza o valor da base do retângulo:");
        baseRetangulo = input.nextInt();
        System.out.print("Introduza o valor da altura do retângulo:");
        alturaRetangulo = input.nextInt();

        //CálculosCálculos para resultados finais possiveis:
        areaRetangulo = baseRetangulo * alturaRetangulo;
        pRetangulo = (baseRetangulo + alturaRetangulo) * 2;
        System.out.println("Área = " + areaRetangulo);
        System.out.println("Perímetro = " + pRetangulo);

    }
}
