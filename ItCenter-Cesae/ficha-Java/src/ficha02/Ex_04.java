package ficha02;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        //Import scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis:
        int posicaoF1;
        System.out.print("Informe sua posição para saber quantos pontos ganha: ");
        posicaoF1 = input.nextInt();

        //Declaração de estrutura de controle Sw
        switch (posicaoF1) {
            case 1:
                System.out.println("Ganhou 10 pontos");
                break;
            case 2:
                System.out.println("Ganhou 8 pontos");
                break;
            case 3:
                System.out.println("Ganhou 6 pontos");
                break;
            case 4:
                System.out.println("Ganhou 5 pontos");
                break;
            case 5:
                System.out.println("Ganhou 4 pontos");
                break;
            case 6:
                System.out.println("Ganhou 3 pontos");
                break;
            case 7:
                System.out.println("Ganhou 2 pontos");
                break;
            case 8:
                System.out.println("Ganhou 1 pontos");
                break;

        }

    }
}
