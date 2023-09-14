package ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_10 {
    /**
     * Procedimento para escrever um programa que leia o conteúdo do arquivo "exercicio_10.csv"
     * contendo informações de vendas (tipo de produto, produto, quantidade vendida, valor unitario)
     * e calcular o valor total das vendas.
     * @param diretorio
     */
    public static void arquivo10(String diretorio) throws FileNotFoundException {
        //Tratamento de exceção:
        try {
            //Instanciamento da criação do arquivo:
            File arquivo10 = new File(diretorio);

            //Scanner para leitura do arquivo:
            Scanner lerArquivo = new Scanner(arquivo10);

            //Declaração de variáveis:
            int quantidadeTipoProduto = 0, quantidadeProduto = 0, quantidadeProdutoVendido = 0;
            int produtoTipoAlimentacao = 0;
            int produtoParaCasa = 0;
            int produtoHigiene = 0;
            double somaTotalVendas = 0;
            String conteudoLinha = "";

            //Ciclo para executar leitura e calcular valor do arquivo "exercicio_10.csv":
            //execução pulando a primeira linha:
            //lerArquivo.nextLine();
            while (lerArquivo.hasNextLine()) {

                //Gravar na variável o conteúdo da linha do arquivo:
                conteudoLinha = lerArquivo.nextLine();

                //Array[3] para separar por "virgula" o conteúdo da linha:
                //tipo_produto,produto,quantidade_vendida,preco_unitario
                //[0] = tipo_produto;
                //[1] = produto;
                //[2] = quantidade_vendida;
                //[3] = preco_unitario;
                String[] parteLinha = conteudoLinha.split(",");
                if (parteLinha[0].equals("Alimentacao")) {
                    //Quantidade de produtos Alimentacao
                    produtoTipoAlimentacao++;
                }
                if (parteLinha[0].equals("Produtos para Casa")) {
                    //Quantidade de produtos Produtos para Casa
                    produtoParaCasa++;
                }
                if (parteLinha[0].equals("Higiene")) {
                    //Quantidade de produtos de Higiene
                    produtoHigiene++;
                }
                //Soma de quantidade total de produtos:
                quantidadeProduto = (produtoTipoAlimentacao + produtoParaCasa + produtoHigiene);

                //Condição para ignorar a primeira linha do arquivo:
                if(!parteLinha[2].equals("quantidade_vendida")) {
                    //Quantidade total de produtos vendidos:
                    quantidadeProdutoVendido += Integer.parseInt(parteLinha[2]);

                    //Soma total da vendas de todos produtos:
                    somaTotalVendas += Double.parseDouble(parteLinha[2]) * Double.parseDouble(parteLinha[3]);
                }

            }

            System.out.println("Relação Exercicio 10:");
            System.out.println("Quantidade total de Produtos Cadastrados = " + quantidadeProduto);
            System.out.println("Tipos de Produtos cadastrados:\n» Alimentação: " + produtoTipoAlimentacao);
            System.out.println("» Produtos para Casa: " + produtoParaCasa);
            System.out.println("» Produtos de Higiene: " + produtoHigiene);
            System.out.println("Quantidade Total de Produtos Vendidos = " + quantidadeProdutoVendido);
            System.out.println("Soma total da vendas de todos produtos: €" + somaTotalVendas);

            //Fechamento do scanner:
            lerArquivo.close();


        } catch (FileNotFoundException exception) {
            exception.getMessage();
            throw new FileNotFoundException("Erro: Diretorio não encontrado.");
        }
    }

    /**
     * Função principal main()
     * @param args
     */
    public static void main(String[] args) {
        //Tratamento de exceções:
        try {
            arquivo10("files/exercicio_10.csv");
        } catch (FileNotFoundException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }
}
