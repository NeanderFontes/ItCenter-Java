package ficha02;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {
        //Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Entrada de variáveis:
        double saldoAtual, saldoCredito;

        //Entrada de dados:
        System.out.println("Conceção de crédito especial");
        System.out.print("Introduza os saldo: ");
        saldoAtual = input.nextDouble();

        //Código principal:
        if (saldoAtual > 0 && saldoAtual <= 2000) {
            System.out.println("Nenhum crédito dispónivel.");
        } else if (saldoAtual > 2000 && saldoAtual <= 4000) {
            saldoCredito = (saldoAtual * 20) / 100;
            System.out.print("Crédito disponível de: €" + saldoCredito);
        } else if (saldoAtual > 4000 && saldoAtual <= 6000) {
            saldoCredito = (saldoAtual * 30) / 100;
            System.out.print("Crédito disponível de: €" + saldoCredito);
        } else if (saldoAtual > 6000) {
            saldoCredito = (saldoAtual * 40) / 100;
            System.out.print("Crédito disponível de: €" + saldoCredito);
        } else {
            System.out.println("Saldo indisponível.");
        }
    }
}
