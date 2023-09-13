package ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07 {
    /**
     * Escrever um programa que leia o conteúdo do arquivo "exercicio_07.txt"
     * e imprimir o numero de linhas na função main principal.
     *
     * @param diretorio
     */
    public static void arquivo07(String diretorio) throws FileNotFoundException {
        //Tratamendo de exceção na leitura de arquivo:
        try {
            //Instanciando arquivo novo:
            File arquivo07 = new File(diretorio);

            //Scanner para leitura do arquivo:
            Scanner lerArquivo = new Scanner(arquivo07);

            //Declaração de variáveis:
            int numLinhas = 0, numPalavras = 0;

            //Ciclo para exercutar cada linha do arquivo "exercicio_07.txt":
            while (lerArquivo.hasNextLine()) {
                numLinhas++;
                lerArquivo.nextLine();
            }

            //Scanner para leitura do arquivo:
            Scanner lerPalavras = new Scanner(arquivo07);

            //Ciclo para exercutar cada linha do arquivo "exercicio_07.txt":
            while (lerPalavras.hasNext()) {
                numPalavras++;
                lerPalavras.next();
            }

            //Saída de dados finais::
            System.out.println("Quantidade de linhas: " + numLinhas);
            System.out.println("Quantidade de palavras: " + numPalavras);

            //Fechamento do scanner:
            lerArquivo.close();

        } catch (FileNotFoundException exception) {
            exception.getMessage();
            throw new FileNotFoundException("Erro: Diretorio do arquivo não encontrado:");
        }
    }

    /**
     * Função main principal:
     * @param args
     */
    public static void main(String[] args) {
        try {
            //Chamada do parâmetro com arqumento:
            arquivo07("files/exercicio_07.txt");
        } catch (FileNotFoundException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
