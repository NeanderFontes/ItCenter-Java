package ficha02;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        //Import scanner input para entrada da dados:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis:
        int numEntrada;

        //Entrada de dados:
        System.out.print("Insira um valor qualquer para declarar se é Par ou Impar: ");
        numEntrada = input.nextInt();

        // Estrutura de controle:
        if (numEntrada % 2 == 0) {
            System.out.println("O número " + numEntrada + " é Par.");
        } else {
            System.out.println("O número " + numEntrada + " é Impar.");
        }
    }
}
