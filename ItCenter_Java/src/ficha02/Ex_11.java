package ficha02;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        //Import scanner para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Entrada de variáveis:
        double saldoBancario, saldoAlterado, saldoFinal = 0;
        int operador;

        //Entrada de dados:
        System.out.print("Introduza o seu saldo bancário: ");
        saldoBancario = input.nextDouble();
        System.out.println("\n=========================================");
        System.out.println("Seu saldo bancário atual é de: €" + saldoBancario);
        System.out.println("=========================================\n");

        //Informação do tipo de operação desejada através de switch case:
        System.out.println("Informe o tipo de operação que deseja realizar:");
        System.out.println("1 - Creditar");
        System.out.println("2 - Debitar");
        System.out.println("0 - Sair");
        operador = input.nextInt();

        //cálculos:


        switch (operador) {
            case 1:
                System.out.print("Quanto deseja creditar a tua conta? ");
                saldoAlterado = input.nextDouble();
                saldoFinal = saldoBancario + saldoAlterado;
                if (saldoFinal < 0) {
                    System.out.println("Operação inválida, saldo final ficará negativo.");
                } else {
                    System.out.println("Saldo após creditar: €" + saldoFinal);
                }
                break;
            case 2:
                System.out.print("Quanto deseja debitar a tua conta? ");
                saldoAlterado = input.nextDouble();
                saldoFinal = saldoBancario - saldoAlterado;
                if (saldoFinal < 0) {
                    System.out.println("Operação inválida, saldo final ficará negativo.");
                } else {
                    System.out.println("Saldo após creditar: €" + saldoFinal);
                }
                break;
            case 0:
                System.out.println("Filizando sistema.");
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
    }
}
