package ficha05;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        //Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis e arrays:
        double numVetor[] = new double[12];
        String[] meses = {"Janeiro", "Fevereiro",
                "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro"};
        int numIndice;
        double numSoma, numMedia;
        numIndice = 0;
        numSoma = 0;
        numMedia = 0;

        //Entrada de dados:
        System.out.println("Insira os valores das comissões mensais.");

        //Declaração do array:
        for (numIndice = 0; numIndice < numVetor.length; numIndice++) {
            System.out.print("Introduza o " + (numIndice + 1) + "º valor do Mês de " + meses[numIndice] + " = € ");
            numVetor[numIndice] = input.nextDouble();

            //Cáuculos dos indices inseridos ao array:
            numSoma += numVetor[numIndice];
            numMedia = numSoma / numVetor.length;
        }

        //Saida de dados e resultados finais:
        System.out.println();
        System.out.println("================== RESULTADOS ==================");
        System.out.println("A soma do total anual = €" + numSoma);
        System.out.println("A média anual é = €" + numMedia);
    }
}
