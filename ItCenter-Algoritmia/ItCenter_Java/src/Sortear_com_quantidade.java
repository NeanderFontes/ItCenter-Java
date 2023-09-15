import java.util.Random;
import java.util.Scanner;


public class Sortear_com_quantidade {
    //Import Random para sortear numeros:
    static Random random = new Random();

    //Import Scanner input para entrada de valores:
    static Scanner input = new Scanner(System.in);

    /**
     * Analisando o Método do vetor para verificar qual o numero Maior.
     * @param numVetor - Valor de parâmetro formal a ser analizado e
    será devolvido ao parâmetro real o valor na função main.
     * @return true- se for par || false - se for impar
     */
    public static int funcaoRandom(int numVetor[]) {
        int numIndice, numSorteado = 0;
        System.out.print("Números sorteados são: ");
        for (numIndice = 0; numIndice < numVetor.length; numIndice++) {
            numSorteado = numVetor[numIndice];
            System.out.print("[" + numSorteado + "] ");
        }
        return numSorteado;
    }

    public static void main(String[] args) {

        //Declaração de variáveis e array:
        int numIndice, numRandom, numEntrada;

        //Variável numEntrada para declarar quantidade de numeros a sortear:
        System.out.print("Quantos numeros deseja sortear? ");
        numEntrada = input.nextInt();
        int numVetor[] = new int[numEntrada];

        //Inicialização do vetor:
        for (numIndice = 0; numIndice < numEntrada; numIndice++) {
            numVetor[numIndice] = random.nextInt(1,60);
        }
        //Chamda do parâmetro da função:
        funcaoRandom(numVetor);
    }

}
