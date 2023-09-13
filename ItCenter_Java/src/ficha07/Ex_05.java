package ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_05 {
    /**
     * Procedimento para escrever um programa que leia o arquivo "exercicio_05_31.txt"
     * que contém números inteiros separados por espaço e
     * calcular a soma desses números.
     * @throws FileNotFoundException
     */
    public static void arquivo05_31() throws FileNotFoundException {
        //Intância para acessar o arquivo "exercicio_05_31.txt":
        File arquivo05 = new File("files/exercicio_05_31.txt");

        //Scanner para leitura do arquivo "exercicio_05_31.txt":
        Scanner acessarArquivo = new Scanner(arquivo05);

        //Declaração de variáveis:
        int numTemp, numSoma = 0;

        //Entrada de dados:
        System.out.print("A soma dos valores: ");

        //Ciclo while para ler o arquivo e fazer o cálculo:
        while (acessarArquivo.hasNextInt()) {
            numTemp = acessarArquivo.nextInt();
            numSoma += numTemp;
            System.out.print(numTemp + " + ");
        }
        System.out.println(" = " + numSoma);
        System.out.println("A soma do conteúdo do arquivo 'exercicio_05_31.txt' = " + numSoma);
    }

    /**
     * Função principal para execução de chamada de procedimento do "arquivo05_31".
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        arquivo05_31();
    }
}
