package ficha03;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        //Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Entrada e declaração de variáveis:
        int numContador, numEntrada, numQuantidade_0_25, numQuantidade_26_50;
        int numQuantidade_51_75, numQuantidade_76_100;
        numContador = 0;
        numQuantidade_0_25 = 0;
        numQuantidade_26_50 = 0;
        numQuantidade_51_75 = 0;
        numQuantidade_76_100 = 0;

        //Entrada de dados e estrutura do while:
        do {
            System.out.print("Insira um valor: ");
            numEntrada = input.nextInt();
            if (numEntrada >= 0 && numEntrada <= 25) {
                numContador++;
                numQuantidade_0_25 += numContador;
            } else if (numEntrada >= 26 && numEntrada <= 50) {
                numContador++;
                numQuantidade_26_50 += numContador;
            } else if (numEntrada >= 51 && numEntrada <= 75) {
                numContador++;
                numQuantidade_51_75 += numContador;
            } else if (numEntrada >= 76 && numEntrada <= 100) {
                numContador++;
                numQuantidade_76_100 += numContador;
            } else {
                System.out.println("Contagem inválidas entre os valores permitidos do programa.");
            }

            //Saída com número negativo:
        } while (numEntrada % 2 != -1);

        //Saída de resultados:
        System.out.println("Foram inseridos " + numQuantidade_0_25 + " entre 0 - 25");
        System.out.println("Foram inseridos " + numQuantidade_26_50 + " entre 26 - 50");
        System.out.println("Foram inseridos " + numQuantidade_51_75 + " entre 51 - 75");
        System.out.println("Foram inseridos " + numQuantidade_76_100 + " entre 76 - 100");
    }
}
