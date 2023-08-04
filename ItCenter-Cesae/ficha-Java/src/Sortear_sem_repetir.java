import java.util.Random;
import java.util.Scanner;

public class Sortear_sem_repetir {
    //Import Random para sortear numeros:
    static Random random = new Random();

    /**
     * Analisando o Método do vetor para verificar qual o numero Maior.
     * @param numVetor - Valor de parâmetro formal a ser analizado e
        será devolvido ao parâmetro real o valor na função main.
     * @return true- se for par || false - se for impar
     */
    public static int funcaoRandom(int numVetor[]) {
        for (int numIndice = 0; numIndice < numVetor.length; numIndice++) {
            numVetor[numIndice] = random.nextInt(1,10);
        }
        return numVetor;
    }

    public static void main(String[] args) {
        //Import Scanner input para entrada de valores:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis e array:
        int numVetor[] = new int[10];
        int numIndice, numRandom;

        //Inicialização do vetor:
        
    }

}
