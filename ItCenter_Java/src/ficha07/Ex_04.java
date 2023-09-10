package ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_04 {
    /** Função para ler aquivo "exercicio_04.csv" e imprimir no console.
     *
     * @throws FileNotFoundException
     */
    public static void lerArquivo() throws FileNotFoundException {
        try {
            //Instância para acessar arquivo "exercicio_04.csv":
            File arquivo04 = new File("files/exercicio_04.csv");

            //Leitura do conteúdo existente no arquivo "exercicio_04.csv":
            Scanner acessarArquivo = new Scanner(arquivo04);

            //Ciclo para imprimir o conteúdo do arquivo "exercicio_04.csv": na IDE:
            while (acessarArquivo.hasNextLine()) {
                System.out.println(acessarArquivo.nextLine());
            }
            //Fechamento do arquivo:
            acessarArquivo.close();
        } catch (FileNotFoundException excecao) {
            //Mensagem padrão da Classe exceção:
            System.err.println("Erro.\n" + excecao.getMessage());
            //Nova mensagem instanciada(Criada) pelo programador:
            throw new FileNotFoundException("Erro: Diretório do Arquivo não encontrado no método lerArquivo().");
        } finally {
        }

    }

    /**
     * Função principal para leitura do código.
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) {
        try {
            lerArquivo();
        } catch (FileNotFoundException excecao) {
            System.err.println(excecao.getMessage());
        }
        System.out.println("Teste de arquivo interrompido");

    }
}
