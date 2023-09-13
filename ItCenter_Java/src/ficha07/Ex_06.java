package ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_06 {
    /**
     * Procedimento para escrever um programa que leia o arquivo "exercicio_06.txt"
     * que contém nomes e idades separados por virgulas e
     * imprimir o nome da pessoa mais velha no main.
     *
     * @param diretorio
     */
    public static void arquivo06(String diretorio) throws FileNotFoundException{
        //Tratamento de exceção em arquivos não encontrados:
        try {
            //Instancia de novo arquivo:
            File documento = new File(diretorio);

            //Scanner para leitura do conteúdo do arquivo:
            Scanner lerArquivo = new Scanner(documento);

            //Declaração de variáveis:
            String conteudoLinha, nomeMaiorIdade = "";
            int maiorIdade = 0;

            //Ciclo para exercutar cada linha do arquivo "exercicio_06.txt":
            while (lerArquivo.hasNextLine()) {
                //Gravar na variável o conteúdo da linha do arquivo:
                conteudoLinha = lerArquivo.nextLine();

                //Dividir da linha em partes após cada virgula utilizando metodo split:
                //Armazenando cada parte no array criado "partesLinha[]"
                String[] partesLinha = conteudoLinha.split(",");

                //Condição para acessar valores:
                if (maiorIdade == 0) {
                    nomeMaiorIdade = partesLinha[0];
                    maiorIdade = Integer.parseInt(partesLinha[1]);
                } else {
                    if (Integer.parseInt(partesLinha[1]) > maiorIdade) {
                        //Mudança para o valor da maior idade:
                        maiorIdade = Integer.parseInt(partesLinha[1]);
                        //Mudança para o nome que contém valor maior de idade:
                        nomeMaiorIdade = partesLinha[0];
                    }
                }
            }

            //Saída de dados finais:
            System.out.println("Programa para encontrar pessoa e idade mais velha do arquivo:");
            System.out.println("Nome: " + nomeMaiorIdade);
            System.out.println("Idade: " + maiorIdade);

            //Fechamento do scanner:
            lerArquivo.close();

            //Caso arquivo não encontrado para leitura:
        } catch (FileNotFoundException exception) {
            exception.getMessage();
            throw new FileNotFoundException("Erro: Diretorio não encontrado.");
        } catch (ArrayIndexOutOfBoundsException exceptionArray) {
            exceptionArray.getMessage();
            throw new ArrayIndexOutOfBoundsException("Erro: Número de índice fora do limite do Vetor");
        }

    }

    public static void main(String[] args) {
        //Tratamento de exceções:
        try {
            arquivo06("files/exercicio_06.txt");
        } catch (FileNotFoundException exception) {
            System.err.println(exception.getMessage());
        } catch (ArrayIndexOutOfBoundsException exceptionArray) {
            System.err.println(exceptionArray.getMessage());
        }
    }
}
