package Projeto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    /**
     * Função principal
     * @param args
     */
    public static void main(String[] args) {
        //Tratamento de exceção para arquivo não encontrado:
        try {
            menuImbd("files/imdb.txt");
        } catch (FileNotFoundException exception) {
            System.err.println(exception.getMessage());
            System.out.println("Continuando programa... ");
        }
        menuPrincipal();
    }

    /**
     * Procedimento para menu principal
     */
    public static void menuPrincipal() {
        //Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis:
        int opcaoMenu;

        do {
            System.out.println(" ================================== CLASSIFICAÇÕES IMBD =================================");
            System.out.println(" |\t\t\t\t\t\t1 - Lista de Filmes.\t\t\t\t\t\t\t\t\t\t\t|");
            System.out.println(" |\t\t\t\t\t\t2 - Quantidade total de Filmes em IMBD.\t\t\t\t\t\t\t|");
            System.out.println(" |\t\t\t\t\t\t3 - Pesquisar filmes por produtores.\t\t\t\t\t\t\t|");
            System.out.println(" |\t\t\t\t\t\t4 - Informações de filmes desejado.\t\t\t\t\t\t\t\t|");
            System.out.println(" |\t\t\t\t\t\t5 - Melhor e Pior filmes de acordo com produtores(realizador)");
            System.out.println(" |\t\t\t\t\t\t6 - Pesquisar filmes por Estudio.\t\t\t\t\t\t\t\t|");
            System.out.println(" |\t\t\t\t\t\t0 - Sair.\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
            System.out.println(" ========================================================================================");
            System.out.print("\t\t\t\t\t\t» Escolha alguma das opções acima: ");
            opcaoMenu = input.nextInt();

            //Construção de cada opção desejada:
            switch (opcaoMenu) {
                case 1: //Lista de todos os filmes do arquivo "IMBD.csv"
                    try {
                        listarFilmes("files/IMBD.csv");
                    } catch (FileNotFoundException exception) {
                        System.err.println("\t\t\t\t\t\t"+exception.getMessage());
                        System.out.println("\t\t\t\t\t\tContinuando programa... ");
                    }
                    break;
                case 2: //Quantidade total de Filmes no arquivo "IMBD.csv"
                    try {
                        quantidadeFilme("files/IMBD.csv");
                    } catch (FileNotFoundException exception) {
                        System.err.println("\t\t\t\t\t\t"+exception.getMessage());
                        System.out.println("\t\t\t\t\t\tContinuando programa... ");
                    }
                    break;
                case 3: //Classificação média de filmes do Produtor(realizador)
                    System.out.println("Opção 3 Escolhida");
                    break;
                case 4: //Todas informações do arquivo para imprimir na consla
                    System.out.println("Opção 4 Escolhida");
                    break;
                case 5: //Melhor e Pior filmes de acordo com produtores(realizador)"
                    System.out.println("Opção 5 Escolhida");
                    break;
                case 6: //'Imprimir no console todos filmes do estudio'
                    System.out.println("Opção 6 Escolhida");
                    break;
                case 0: //Finalizar programa
                    System.out.println("\t\t\t\t\t\t******* Finalizando programa *******");
                    break;
                default:
                    System.out.println("\t\t\t\t\t\t  ******* Opção inválida *******");
            }
        } while (opcaoMenu != 0);
    }

    /**
     * Método para imprimir no console arquivo "imdb.txt"
     * @param diretorio - Diretorio do arquivo
     * @throws FileNotFoundException
     */
    public static void menuImbd(String diretorio) throws FileNotFoundException {
        //Tratamento de exceção para arquivo não encontrado:
        try {
            //Instancia de arquivo imdb.txt
            File menuImbd = new File(diretorio);

            //Scanner para leitura do arquivo:
            Scanner lerArquivo = new Scanner(menuImbd);

            //Ciclo para imprimir no console cada linha do arquivo:
            while (lerArquivo.hasNextLine()) {
                System.out.println(lerArquivo.nextLine());
            }

            //Fechamento do arquivo:
            lerArquivo.close();
        } catch (FileNotFoundException exception) {
            exception.getMessage();
            throw new FileNotFoundException("Erro de Leitura: Arquivo não encontrado");
        }
    }

    /**
     * Menu Opção 1:
     * Método para imprimir no console todos os filmes do arquivo "IMBD.csv"
     * @param diretorio - Diretorio do arquivo
     * @throws FileNotFoundException
     */
    public static void listarFilmes(String diretorio) throws FileNotFoundException {
        //Tratamento de exceção para arquivo não encontrado:
        try {
            //Instancia de arquivo imdb.txt
            File menuImbd = new File(diretorio);

            //Scanner para leitura do arquivo:
            Scanner lerArquivo = new Scanner(menuImbd);

            //Ciclo para imprimir no console cada linha do arquivo:
            while (lerArquivo.hasNextLine()) {
                System.out.println(lerArquivo.nextLine());
            }

            //Fechamento do arquivo:
            lerArquivo.close();
        } catch (FileNotFoundException exception) {
            exception.getMessage();
            throw new FileNotFoundException("Erro de Leitura: Arquivo não encontrado");
        }
    }

    /**
     * Menu Opção 2:
     * Método para imprimir no console quantidade total de filmes no arquivo "IMBD.csv":
     * @param diretorio - Diretorio do arquivo
     * @throws FileNotFoundException
     */
    private static void quantidadeFilme(String diretorio) throws FileNotFoundException {
        //Tratamento de exceção para arquivo não encontrado:
        try {
            //Instancia de arquivo imdb.txt
            File menuImbd = new File(diretorio);

            //Scanner para leitura do arquivo:
            Scanner lerArquivo = new Scanner(menuImbd);

            //Declaração de variáveis:
            int numFilme = 0;

            //Ciclo para executar cada linha do arquivo:
            lerArquivo.nextLine();
            while (lerArquivo.hasNextLine()) {
                numFilme++;
                lerArquivo.nextLine();
            }

            //Saida de dados:
            System.out.println("\t\t\t\t\t\tTotal de 'LINHAS' registrados: " + numFilme);

            //Fechamento do arquivo:
            lerArquivo.close();
        } catch (FileNotFoundException exception) {
            exception.getMessage();
            throw new FileNotFoundException("Erro de Leitura: Arquivo não encontrado");
        }
    }
}