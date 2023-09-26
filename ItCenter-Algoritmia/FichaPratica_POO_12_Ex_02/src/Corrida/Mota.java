package Corrida;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Classe Mota: Para além de se assumir um veículo, deve também ter o método imagem que imprime
 * o conteúdo do ficheiro mota.txt na consola.
 */
public class Mota {
    /**
     * Método para Ler Arquivo e Imprimir no Console o conteúdo do Arquivo
     *
     * @param diretorioArquivo - Local do Arquivo no Sistema Operacional
     * @throws FileNotFoundException - Tratamento de Erros
     */
    public void imprimirConsole(String diretorioArquivo) throws FileNotFoundException {
        //Import para acesso ao local do arquivo:
        File novoArquivo = new File(diretorioArquivo);

        try {
            //Scanner para leitura do arquivo:
            Scanner lerArquivo = new Scanner(novoArquivo);

            //Ciclo para percorrer o arquivo:
            while (lerArquivo.hasNextLine()) {
                System.out.println(lerArquivo.nextLine());
            }

            //Fechamento do Arquivo:
            lerArquivo.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Erro de localização do arquivo");
        }
    }
}
