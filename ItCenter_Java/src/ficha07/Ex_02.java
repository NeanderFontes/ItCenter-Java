package ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex_02 {
    //Função "novoArquivo" para criar novos ficheiro ou "arquivo" através do "throws":
    public static void novoArquivo() throws FileNotFoundException {
        //Variável para novo arquivo:
        String novoArquivo = "Criando novo ficheiro com tratamento de exceções.";

        //Instancia para criar novo ficheiro:
        File meuArquivo = new File("files/meu_arquivo01.txt");
        //File meuArquivo02 = new File("files/meu_arquivo02.txt");

        //Instância para escrever "algo no arquivo01.txt":
        PrintWriter escrever = new PrintWriter(meuArquivo);

        //Instância para criar e escrever "algo" no "arquivo01.txt":
        PrintWriter escrever02 = new PrintWriter(new File("files/meu_arquivo02.txt"));

        //Execução direta para criar "conteúdo" no "meu_arquivo01.txt" utilizando conteúdo da "String":
        escrever.println(novoArquivo);

        //Rescrevendo e acrescentando "novo conteúdo a partir de uma nova chamada com conteúdo "String":
        escrever.println("Novo conteúdo gerado a partir de nova escrita.");
        escrever.println("Adicionando conteúdo no dia 11/09 às 12h54 no 'meu_arquivo01'.");

        //Fechamento do arquivo salvando o mesmo, "correção do flush":
        escrever.close();

        //Boa prática "close()" para criar o "meu_arquivo02.txt" sem a criação de "conteúdo":
        escrever02.close();
    }

    //Função principal e criação dos arquivos:
    public static void main(String[] args) throws FileNotFoundException {
        //Chamada da função:
        novoArquivo();
    }
}
