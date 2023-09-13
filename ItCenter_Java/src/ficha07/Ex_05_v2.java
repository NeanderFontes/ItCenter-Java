package ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_05_v2 {
    /**
     * Escrever um programa que leia o arquivo "exercicio_05_1999.txt"
     * que contém números inteiros separados por espaço e
     * calcular a soma desses números.
     * @throws FileNotFoundException
     */
    public static void arquivo1999(String diretorio) throws FileNotFoundException {
        //Tratamento de exceção "tente" ler caso ocorrer bem:
        try {
            //Instância para iniciar arquivo:
            File arquivo05 = new File(diretorio);

            //Scanner para leitura do arquivo05:
            Scanner lerArquivo05 = new Scanner(arquivo05);

            //Declaração de variáveis:
            int numSoma = 0;

            //Leitura do arquivo:
            while (lerArquivo05.hasNextInt()) {
                numSoma += lerArquivo05.nextInt();
            }
            System.out.println("A soma dos valores = " + numSoma);

            //Close scanner:
            lerArquivo05.close();

        } catch (FileNotFoundException excecao) {
            //se não ocorrer bem, "pegue a exceção":
            excecao.getMessage();
            throw new FileNotFoundException("Erro. Diretorio do arquivo não encontrado.");
        }
    }

    /**
     * Função principal
     * @param args
     */
    public static void main(String[] args) {
        //Tratamento de exceções:
        try {
            //Passagem da função de parametro "String":
            arquivo1999("files/exercicio_05_1999.txt");
        } catch (FileNotFoundException exception) {
            //Passagem do lançamento de erro por msg:
            System.err.println(exception.getMessage());
        }
    }
}
