package ficha02;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        //Import para scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração e inicialização de variáveis:
        int contador;
        double numEntrada, primeiraNota, segundaNota, terceiraNota, somaNotas, mediaNotas;
        contador = 0;
        primeiraNota = 0.0;
        segundaNota = 0.0;
        terceiraNota = 0.0;
        somaNotas = 0.0;
        mediaNotas = 0.0;

        //Laço de repetição e estrutura de controle:
        while (contador < 3) {
            System.out.print("Insira o valor da " + (contador+1) + "ª nota: ");
            numEntrada = input.nextDouble();

            if (contador < 0 && contador > 20) {
                System.out.println("Valor inválido para a média final.");
            } else {
                //Atribuição para as notas:
                if (contador == 0) {
                    primeiraNota = numEntrada;
                } else if (contador == 1) {
                    segundaNota = numEntrada;
                } else {
                    terceiraNota = numEntrada;
                }
                somaNotas = primeiraNota + segundaNota + terceiraNota;
                mediaNotas = somaNotas / 60;
            }
            contador++;
        }

        //Resultado para as médias ponderadas:
        //completar o código abaixo*********
        if (mediaNotas >= 9.5) {
            System.out.println("Aprovado");
        } else {
            System.out.println("reprovado");
        }
        System.out.println("Resultados");
    }
}
