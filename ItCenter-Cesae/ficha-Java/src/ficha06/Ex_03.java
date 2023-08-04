package ficha06;

import java.util.Scanner;

public class Ex_03 {

    /**
     * Analisando o Método se numero o número é Par ou Não.
     *
     * @param numPar - Numero a ser analizado
     * @return true- se for par || false - se for impar
     */
    public static boolean funcaoPar(int numPar) {

        if (numPar % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método para analisar se o número é positivo
     *
     * @param numPositivo - Valor de parâmetro formal a ser analizado e
     *                    será devolvido ao paâmetro real o valor final.
     * @return true || false na Condição declarada dentro do método.
     */
    public static boolean funcaoPositivo(int numPositivo) {

        if (numPositivo >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Analisando o Método se numero o número é Primo ou não.
     *
     * @param numPrimo - Valor de parâmetro formal a ser analizado e
     *                 será devolvido ao paâmetro real o valor final.
     * @return true- se for par || false - se for impar
     */
    public static boolean funcaoPrimo(int numPrimo) {
        for (int numIndice = 1; numIndice < numPrimo; numIndice++) {
            if (numPrimo % numIndice != numPrimo || numPrimo % numPrimo != 1) {
                return false;
            }
        }
        return true;
    }

    /**
     * Analisando o Método se numero o número é Primo ou não.
     *
     * @param numPerfeito - Valor de parâmetro formal a ser analizado e
     *                    será devolvido ao paâmetro real o valor final.
     * @return true- se for par || false - se for impar
     */

    public static boolean funcaoPerfeito(int numPerfeito) {
        int numSoma = 0, numIndice;
        for (numIndice = 0; numIndice < numPerfeito; numIndice++) {
            numSoma += numIndice;
            if (numSoma == numPerfeito) {
                return true;
            }
        }
        return false;
    }

    //Entrada de dados Ex_04:
    public static void main(String[] args) {
        //Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração e inicialização de variáveis:
        int opcaoMenu = 0, numEntrada;

        //Entrada de dados:
        System.out.println("**********************************");
        System.out.println("\t\tAnalise de Número");
        System.out.println("**********************************");
        System.out.print("Digite o numero desejado: ");
        numEntrada = input.nextInt();
        System.out.println("***************************************");
        do {
            //Menu para analise do numero de entrada:
            System.out.println("===================== Analisando =====================");
            System.out.println("Escolha as opções abaixo para analisar se o número é:");
            System.out.println("1 - Par ou Impar.");
            System.out.println("2 - Positivo ou Negativo.");
            System.out.println("3 - Primo ou não.");
            System.out.println("4 - Perfeito ou não Perfeito.");
            System.out.println("5 - Triângular ou Não.");
            System.out.println("6 - Trocar de Número.");
            System.out.println("0 - Opção Sair.");
            System.out.println("======================================================\n");
            //Numero entrada opção menu:
            System.out.print("Escolha uma opção acima: ");
            opcaoMenu = input.nextInt();
            switch (opcaoMenu) {
                case 1: //funcaoPar ou impar
                    if (funcaoPar(numEntrada)) {
                        System.out.println("O valor inserido é Par!!");
                    } else {
                        System.out.println("O valor inserido é Impar!!");
                    }
                    break;
                case 2: //funcaoPositivo ou negativo
                    if (funcaoPositivo(numEntrada)) {
                        System.out.println("O valor inserido é Positivo!!");
                    } else {
                        System.out.println("O valor inserido é Negativo!!");
                    }
                    break;
                case 3: //funcaoPrimo ou não
                    if (funcaoPrimo(numEntrada)) {
                        System.out.println("O valor inserido é Primo!!");
                    } else {

                        System.out.println("O valor inserido Não é primo!!");
                    }
                    break;
                case 4: //funcaoPerfeito ou não
                    if (funcaoPerfeito(numEntrada)) {
                        System.out.println("O valor inserido é Perfeito!!");
                    } else {
                        System.out.println("O valor inserido não é perfeito!!");
                    }
                    break;
                case 5:
                    break;
                case 6: //Novo valor para numEntrada
                    System.out.print("Qual novo valor deseja analisar? ");
                    numEntrada = input.nextInt();
                    System.out.println("Valor alterado com sucesso! \nNovo valor = " + numEntrada);
                    break;
                case 0: //Finalização da analise do código.
                    System.out.println("Finalizando analise.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcaoMenu != 0);
    }
}
