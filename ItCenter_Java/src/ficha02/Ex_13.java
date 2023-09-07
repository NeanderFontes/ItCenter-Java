package ficha02;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        //Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis:
        int horas, minutos;

        //Entrada de dados:
        System.out.print("Introduza às horas: ");
        horas = input.nextInt();
        System.out.print("Introduza os minutos: ");
        minutos = input.nextInt();

        //Resolução do programa com estrutura de controle:
        if (horas < 0 && horas > 24) {
            System.out.println("Hora inválida.");
        } else if (horas == 13) {
            horas = 01;
            System.out.println(horas + ":" + minutos + " PM");
        } else if (horas == 14) {
            horas = 02;
            System.out.println(horas + ":" + minutos + " PM");
        } else if (horas == 15) {
            horas = 03;
            System.out.println(horas + ":" + minutos + " PM");
        } else if (horas == 16) {
            horas = 04;
            System.out.println(horas + ":" + minutos + " PM");
        } else if (horas == 17) {
            horas = 05;
            System.out.println(horas + ":" + minutos + " PM");
        } else if (horas == 18) {
            horas = 06;
            System.out.println(horas + ":" + minutos + " PM");
        } else if (horas == 19) {
            horas = 07;
            System.out.println(horas + ":" + minutos + " PM");
        } else if (horas == 20) {
            horas = 8;
            System.out.println(horas + ":" + minutos + " PM");
        } else if (horas == 21) {
            horas = 9;
            System.out.println(horas + ":" + minutos + " PM");
        } else if (horas == 22) {
            horas = 10;
            System.out.println(horas + ":" + minutos + " PM");
        } else if (horas == 23) {
            horas = 11;
            System.out.println(horas + ":" + minutos + " PM");
        } else if (horas == 24) {
            horas = 12;
            System.out.println(horas + ":" + minutos + " PM");
        } else {
            if (horas > 0 && horas <= 12) {
                System.out.println(horas + ":" + minutos + " AM");
            }
        }
    }
}
