package ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//Criar uma função para ler o conteúdo "String" do arquivo "meu_arquivo01.txt"
// e gravar no aquivo "meu_arquivo02.txt"
public class Ex_03 {
    /** Função para ler aquivo "meu_arquivo01.txt" e copiar o conteúdo em "meu_arquivo02.txt"
     *
     * @throws FileNotFoundException
     */
    public static void lerRescreverArquivo() throws FileNotFoundException {
        //Instancia para acessar os arquivos:
        File arquivo01 = new File("files/meu_arquivo01.txt");
        File arquivo02 = new File("files/meu_arquivo02.txt");
        //Instancia para escrever no arquivo:
        PrintWriter escreverArquivo = new PrintWriter(arquivo02);

        //Scanner para leitura de conteúdo do arquivo submetido:
        Scanner inArquivo01 = new Scanner(arquivo01);
        Scanner inArquivo02 = new Scanner(arquivo02);


        //Ciclo para execução da leitura das linhas existentes no arquivo "meu_arquivo01.txt"
        while (inArquivo01.hasNextLine()) {
            //Escrever conteúdo lido no "meu_arquivo01" e escrever o conteúdo em "meu_arquivo02":
            escreverArquivo.println(inArquivo01.nextLine());
        }

        //Fechamento dos arquivos:
        inArquivo01.close();

        //Escrevendo novo conteúdo antes de fechar o arquivo:
        escreverArquivo.println("Criando novo conteúdo no 'meu_arquivo02.txt'" +
                " copiando o conteúdo nas linhas(1, 2) que existe em 'meu_arquivo01.txt'.");
        escreverArquivo.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        lerRescreverArquivo();
    }
}
