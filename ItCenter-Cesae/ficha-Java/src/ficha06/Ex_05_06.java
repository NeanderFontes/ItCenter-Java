package ficha06;

import java.util.Scanner;

public class Ex_05_06 {
    //Analise através de metodos em vetores:
    /**
     * Analisando o Método do vetor para verificar qual o numero Maior.
     * @param numVetor - Valor de parâmetro formal a ser analizado e
        será devolvido ao parâmetro real o valor na função main.
     * @return true- se for par || false - se for impar
     */
    public static int funcaoMaior(int numVetor[]) {
        int numMaior = 0, numIndice;
        for (numIndice = 0; numIndice <= numVetor.length; numIndice++) {
            if (numIndice == 0) {
                numMaior = numVetor[numIndice];
            } else {
                if (numVetor[numIndice] > numMaior) {
                    numMaior = numVetor[numIndice];
                    System.out.println("Numero Maior = " + numMaior);
                }
            }
        }
        return numMaior;
    }

    /**
     * Analisando o Método do vetor para verificar qual o numero Menor.
     * @param numVetor - Valor de parâmetro formal a ser analizado e
        será devolvido ao parâmetro real o valor na função main.
     * @return true- se for par || false - se for impar
     */
    public static int funcaoMenor(int numVetor[]) {
        int numMenor = 0, numIndice;
        for (numIndice = 0; numIndice <= numVetor.length; numIndice++) {
            if (numIndice == 0) {
                numMenor = numVetor[numIndice];
            } else {
                if (numVetor[numIndice] > numMenor) {
                    numMenor = numVetor[numIndice];
                }
            }
        }
        return numMenor;
    }

    /**
     * Analisando o Método do vetor para verificar se o vetor é em ordem crescente.
     * @param numCrescente - Valor de parâmetro formal a ser analizado e
        será devolvido ao parâmetro real o valor na função main.
     * @return true- se for par || false - se for impar
     */

    public static boolean funcaoCrescente(int numCrescente[]) {
        for (int numIndice = 0; numIndice < numCrescente.length - 1; numIndice++) {
            if (numCrescente[numIndice] > numCrescente[numIndice + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Analisando o Método do vetor para verificar se o vetor é em ordem decrescente.
     * @param numDecrescente - Valor de parâmetro formal a ser analizado e
    será devolvido ao parâmetro real o valor na função main.
     * @return true- se for par || false - se for impar
     */

    public static boolean funcaoDecrescente(int numDecrescente[]) {
        for (int numIndice = 0; numIndice < numDecrescente.length - 1; numIndice++) {
            if (numDecrescente[numIndice] < numDecrescente[numIndice + 1]) {
                return false;
            }
        }
        return true;
    }

    //Função Principal: Ex_06
    public static void main(String[] args) {
        //Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);
        
        //Declaração e inicialização de variáveis e vetores:
        int numVetor[] = new int[5];
        int opcaoMenu, numEntrada, numIndice = 0;

        //Entrada de dados:
        System.out.println("**********************************");
        System.out.println("\t\tAnalise de Número");
        System.out.println("**********************************");
        System.out.print("Digite uma sequência de numero desejado: ");
        for (numIndice = 0; numIndice < numVetor.length; numIndice++) {
            System.out.print("Digite o + " + (numIndice + 1) + "º Valor: ");
            numVetor[numIndice] = input.nextInt();
        }
        System.out.println("***************************************");

        //Menu para analise do numero de entrada:
        do {
            System.out.println("===================== Analisando =====================");
            System.out.println("Escolha as opções abaixo para analisar se o número é:");
            System.out.println("1 - Maior Elemento.");
            System.out.println("2 - Menor Elemento.");
            System.out.println("3 - Crescento ou não crescente.");
            System.out.println("0 - Opção sair.");
            System.out.println("======================================================");

            //Entrada de dados para analisar opção desejada:
            System.out.print("Escolha a opção desejada de acordo com os valores inseridos: ");
            opcaoMenu = input.nextInt();

            //Opção saida de dados do menu com switch:
            switch (opcaoMenu) {
                case 1: //Maior elemento
                    int numMaior = funcaoMaior(numVetor);
                    System.out.print("Maior valor: " + numMaior);
                    break;
                case 2://Menor elemento
                    int numMenor = funcaoMaior(numVetor);
                    System.out.print("Menor valor: " + numMenor);
                    break;
                case 3:
                    if (funcaoCrescente(numVetor)) {
                        System.out.println("Os numeros estão em ordem Crescente.");
                    } else if (funcaoDecrescente(numVetor)) {
                        System.out.println("Os numeros estão em ordem Descrecentes.");
                    } else {
                        System.out.println("Os números estão em ordem aleatória.");
                    }
                    break;
                case 0:
                    System.out.println("Finalizando Programa.");
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    break;
            }
        } while (opcaoMenu != 0);
    }
}
