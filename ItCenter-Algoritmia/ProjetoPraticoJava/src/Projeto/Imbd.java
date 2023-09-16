package Projeto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Imbd {

    //Método para menu principal:
    public void menuPrincipal() {
        //Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis:
        int opcaoMenu;

        //Tratamento de exceção para arquivo não encontrado:
        try {
            menuImbd();
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }

        do {
            System.out.println(" =============== CLASSIFICAÇÕES IMBD ==================");
            System.out.println("1 - Lista de Filmes.");
            System.out.println("2 - Quantidade total de Filmes em IMBD.");
            System.out.println("3 - Pesquisar filmes por produtores");
            System.out.println("4 - Informações de filmes desejado.");
            System.out.println("5 - Melhor e Pior filmes de acordo com produtores(realizador)");
            System.out.println("6 - Pesquisar filmes por Estudio.");
            System.out.println("0 - Sair.");
            System.out.println("Escolha alguma das opções acima: ");
            opcaoMenu = input.nextInt();

            //Construção de cada opção desejada:
            switch (opcaoMenu) {
                case 1: //Lista de todos os filmes do arquivo "IMBD.csv"
                    listarFilmes();
                    break;
                case 2: //Quantidade total de Filmes no arquivo "IMBD.csv"
                    break;
                case 3: //Classificação média de filmes do Produtor(realizador)
                    break;
                case 4: //Todas informações do arquivo para imprimir na consla
                    break;
                case 5: //Melhor e Pior filmes de acordo com produtores(realizador)"
                    break;
                case 6: //'Imprimir no console todos filmes do estudio'
                    break;
                case 0: //Finalizar programa
                    System.out.println("Finalizando programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcaoMenu != 0);
    }

    /**
     * Método para imprimir no console arquivo "imdb.txt"
     */
    private static void menuImbd() throws FileNotFoundException {
        //Tratamento de exceção para arquivo não encontrado:
        try {
            //Instancia de arquivo imdb.txt
            File menuImbd = new File("files/imdb.txt");

            //Scanner para leitura do arquivo:
            Scanner lerArquivo = new Scanner(menuImbd);

            //Fechamento do arquivo:
            lerArquivo.close();
        } catch (FileNotFoundException exception) {
            throw new FileNotFoundException(exception.getMessage());
        }
    }
    private static void listarFilmes() {
        //
    }
}
