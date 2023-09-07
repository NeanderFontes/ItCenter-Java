package ficha04;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        //Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Sistema de calculadora com repetição:
        //Entrada e declaração de variáveis:
        int numSoma, numSubtracao, numMultiplicacao, numResultado;
        int num1, num2;
        double numDivisao;
        boolean sair = true;
        String operador, opcaoSair;
        numResultado = 0;

        //Entrada de dados:
        System.out.println("============ Calculadora ============");
        System.out.println("\t  Prima '+' para soma");
        System.out.println("\t  Prima '-' para subtração");
        System.out.println("\t  Prima '/' para divisão");
        System.out.println("\t  Prima '*' para multiplicação");
        System.out.println("=====================================");

        //Resolução com laço while:
        do {
            System.out.print("Escolha uma operação acima para realizar o cálculo: ");
            operador = input.next();
            System.out.print("Insira um valor: ");
            num1 = input.nextInt();
            System.out.print("Insira próximo valor: ");
            num2 = input.nextInt();
            switch (operador) {
                //case "soma"
                case "+":
                    numResultado = num1 + num2;
                    System.out.println("A soma = " + numResultado);
                    break;
                //case "subtração"
                case "-":
                    numResultado = num1 - num2;
                    System.out.println("A subtração = " + numResultado);
                    break;
                //case "divisão"
                case "/":
                    numResultado = num1 / num2;
                    System.out.println("A divisão = " + numResultado);
                    break;
                //case "multiplicação"
                case "*":
                    numResultado = num1 * num2;
                    System.out.println("A multiplicação = " + numResultado);
                    break;
                //opção não registrada
                default:
                    System.out.println("Operação inválida");
                    break;
            }

            //Operação de continuação no laço
    /*        while (sair == true) {
                System.out.print("Deseja continuar (S/N)? ");
                opcaoSair = input.next();
                if (opcaoSair.equalsIgnoreCase("S")) {
                    sair = true;
                    break;
                } else if (!opcaoSair.equalsIgnoreCase("N")) {
                    sair = false;
                } else {
                    System.out.println("Opção inválida.");
                }
            }                                                   */


//Operação de continuação no laço
            // Este ciclo só quebra quando a opção de sair for igual a S ou a N
            // Uso o do while para conseguir executar pelo menos uma vez
            do{
                System.out.print("Deseja continuar (S/N)? ");
                opcaoSair = input.next();
                if (opcaoSair.equalsIgnoreCase("S")) {
                    sair = true;
                    break;
                } else if (!opcaoSair.equalsIgnoreCase("N")) {
                    sair = false;
                } else {
                    System.out.println("Opção inválida.");
                }
            }while (!opcaoSair.equalsIgnoreCase("S")&&!opcaoSair.equalsIgnoreCase("N") );
        } while (sair); // opcaoSair == "S"
    }
}