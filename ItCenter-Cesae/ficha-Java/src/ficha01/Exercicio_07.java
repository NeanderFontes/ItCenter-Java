package ficha01;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        /*
            7.Escreva um programa que requisite ao utilizador o preço de 3 produtos adquiridos.
            Apresente o valor a pagar, considerando que deverá ter um desconto de 10% sobre o total dos produtos.
         */

        //Scanner input para import de entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis:
        double produto1, produto2, produto3, descontoTotal10, somaProdutos, valorDesconto10;

        //Entrada de dados:
        System.out.print("Entre com valor do Produto 1: ");
        produto1 = input.nextDouble();
        System.out.print("Entre com valor do Produto 2: ");
        produto2 = input.nextDouble();
        System.out.print("Entre com valor do Produto 3: ");
        produto3 = input.nextDouble();

        //Calculos para possíveis resultados:
        somaProdutos = (produto1 + produto2 + produto3);
        valorDesconto10 = (somaProdutos * 10 / 100);
        descontoTotal10 = somaProdutos * 0.9; // Ou usar somaProdutos - valorDesconto10;

        //Resultados Finais:
        System.out.println("A soma dos Produtos = " + somaProdutos);
        System.out.println("Todos os valores com 10% de desconto = " + descontoTotal10);
        //Buscar valor de desconto:
        System.out.println("O Valor do desconto de 10% equivale à " + valorDesconto10);
    }
}
