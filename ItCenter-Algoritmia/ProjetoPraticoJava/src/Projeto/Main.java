package Projeto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
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
        } catch (InputMismatchException mismatchException) {
            System.err.println(mismatchException.getMessage());
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
            System.out.println(" |\t\t\t\t\t\t3 - Média da classificação por Produtores.\t\t\t\t\t\t|");
            System.out.println(" |\t\t\t\t\t\t4 - Informações dos filmes em IMBD.\t\t\t\t\t\t\t\t|");
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
                    } catch (InputMismatchException mismatchException) {
                        System.err.println("\t\t\t\t\t\t"+mismatchException.getMessage());
                        System.out.println("\t\t\t\t\t\tContinuando programa... ");
                    }
                    break;
                case 3: //Classificação média de filmes do Produtor(realizador)
                    try {
                        mediaFilme("files/IMBD.csv");
                    } catch (FileNotFoundException exception) {
                        System.err.println("\t\t\t\t\t\t"+exception.getMessage());
                        System.out.println("\t\t\t\t\t\tContinuando programa... ");
                    } catch (InputMismatchException mismatchException) {
                        System.err.println("\t\t\t\t\t\t"+mismatchException.getMessage());
                        System.out.println("\t\t\t\t\t\tContinuando programa... ");
                    }
                    break;
                case 4: //Todas informações do arquivo para imprimir na consla
                    try {
                        idFilme("files/IMBD.csv");
                    } catch (FileNotFoundException exception) {
                        System.err.println("\t\t\t\t\t\t"+exception.getMessage());
                        System.out.println("\t\t\t\t\t\tContinuando programa... ");
                    } catch (InputMismatchException mismatchException) {
                        System.err.println("\t\t\t\t\t\t"+mismatchException.getMessage());
                        System.out.println("\t\t\t\t\t\tContinuando programa... ");
                    }
                    break;
                case 5: //Melhor e Pior filmes de acordo com produtores(realizador)"
                    try {
                        melhorPiorFilme("files/IMBD.csv");
                    } catch (FileNotFoundException exception) {
                        System.err.println("\t\t\t\t\t\t"+exception.getMessage());
                        System.out.println("\t\t\t\t\t\tContinuando programa... ");
                    } catch (InputMismatchException mismatchException) {
                        System.err.println("\t\t\t\t\t\t"+mismatchException.getMessage());
                        System.out.println("\t\t\t\t\t\tContinuando programa... ");
                    }
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
        } catch (InputMismatchException mismatchException) {
            mismatchException.getMessage();
            throw new InputMismatchException("Erro de entrada incompatível.");
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
     * Método para imprimir no console quantidade total de filmes no arquivo "IMBD.csv"
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
            System.out.println("\t\t\t\t\t\tTotal de " + numFilme + " Filmes registrados: ");

            //Fechamento do arquivo:
            lerArquivo.close();
        } catch (FileNotFoundException exception) {
            exception.getMessage();
            throw new FileNotFoundException("Erro de Leitura: Arquivo não encontrado");
        } catch (InputMismatchException mismatchException) {
            mismatchException.getMessage();
            throw new InputMismatchException("Erro de entrada incompatível.");
        }
    }

    /**
     * Menu Opção 3:
     * Método para imprimir no console media dos filmes por Produtor no arquivo "IMBD.csv"
     * @param diretorio - Diretorio do arquivo
     * @throws FileNotFoundException
     */
    private static void mediaFilme(String diretorio) throws FileNotFoundException {
        //Tratamento de exceção para arquivo não encontrado:
        try {
            //Instancia de arquivo imdb.txt
            File menuImbd = new File(diretorio);

            //Scanner para entrada de dados e leitura de arquivo:
            Scanner lerArquivo = new Scanner(menuImbd);
            Scanner input = new Scanner(System.in);

            //Declaração de variáveis:
            boolean produtorExiste = false;
            int quantidadeProdutor = 0;
            double somaLinha = 0.0, mediaFilme = 0.0;
            String nomeProdutor, conteudoLinha = "";

            //Entrada de dados:
            System.out.print("\t\t\t\t\t\t» Por Produtor deseja pesquisar? ");
            nomeProdutor = input.nextLine();

            //Ciclo para executar o arquivo:
            lerArquivo.nextLine();
            while (lerArquivo.hasNextLine()) {
                //Atribuir na variável o conteúdo da linha do arquivo:
                conteudoLinha = lerArquivo.nextLine();

                String[] parteLinha = conteudoLinha.split(";");
                if (parteLinha[6].equalsIgnoreCase(nomeProdutor)) {
                    produtorExiste = true;
                    if (produtorExiste == true) {
                        quantidadeProdutor++;
                        somaLinha += Double.parseDouble(parteLinha[2]);
                        mediaFilme = (somaLinha / quantidadeProdutor);
                    }
                }
            }

            //Saida de dados:
            if (produtorExiste == true) {
                System.out.println("\t\t\t\t\t\t» O Produtor " + nomeProdutor + " contém " + quantidadeProdutor + " filmes na lista IMBD.");
                System.out.println("\t\t\t\t\t\t» Média = " + mediaFilme);
            } else {
                System.out.println("\t\t\t\t\t\t» Produtor não existe na Lista IMBD.");
                System.out.println("\t\t\t\t\t\t» Verifique o Nome e Sobrenome.");
            }

            //Fechamento do arquivo:
            lerArquivo.close();
        } catch (FileNotFoundException exception) {
            exception.getMessage();
            throw new FileNotFoundException("Erro de Leitura: Arquivo não encontrado");
        } catch (InputMismatchException mismatchException) {
            mismatchException.getMessage();
            throw new InputMismatchException("Erro de entrada incompatível.");
        }
    }

    /**
     * Menu Opção 4:
     * Método para imprimir no console filmes filtrados pelo idFilme no arquivo "IMBD.csv"
     * @param diretorio - Diretorio do arquivo
     * @throws FileNotFoundException
     */
    private static void idFilme(String diretorio) throws FileNotFoundException {
        //Tratamento de exceção para arquivo não encontrado:
        try {
            //Instancia de arquivo imdb.txt
            File menuImbd = new File(diretorio);

            //Scanner para entrada de dados e leitura de arquivo:
            Scanner lerArquivo = new Scanner(menuImbd);
            Scanner input = new Scanner(System.in);

            //Declaração de variáveis:
            boolean filmeExiste = false;
            String idFilmeAux = "", idFilmePesquisa, conteudoLinha = "";

            //Entrada de dados:
            System.out.println("\t\t\t\t\t\t» Para informações do filme indique a identificação entre os valosres abaixo:");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t» 001 - 129 «");
            System.out.print("\t\t\t\t\t\t» Por qual ID deseja pesquisar? ");
            idFilmePesquisa = input.nextLine();

            //Ciclo para executar o arquivo:
            lerArquivo.nextLine();
            while (lerArquivo.hasNextLine()) {
                //Atribuir na variável o conteúdo da linha do arquivo:
                conteudoLinha = lerArquivo.nextLine();

                String[] parteLinha = conteudoLinha.split(";");
                if (parteLinha[0].equalsIgnoreCase("F00-" + idFilmePesquisa)) {
                    filmeExiste = true;
                    if (filmeExiste == true) {
                        idFilmeAux = conteudoLinha;
                    }
                }
            }

            //Saida de dados:
            if (filmeExiste == true) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t» Opção valida «");
                System.out.println("\t\t\t\t\t\t» Informações do filme: ");
                System.out.println("\t\t\t\t\t\tID do Filme;Titulo do Filme;Rating;Duração;Ano;Estudio;Realizador;Genero");
                System.out.println("\t\t\t\t\t\t" + idFilmeAux);
            } else {
                System.out.println("\t\t\t\t\t\t» Identificação inválida.");
                System.out.println("\t\t\t\t\t\t» Verifique se escreveu corretamente \n\t\t\t\t\t\t\t\t\t\t\t» Exemplo: '001' «");
            }

            //Fechamento do arquivo:
            lerArquivo.close();
        } catch (FileNotFoundException exception) {
            exception.getMessage();
            throw new FileNotFoundException("Erro de Leitura: Arquivo não encontrado");
        } catch (InputMismatchException mismatchException) {
            mismatchException.getMessage();
            throw new InputMismatchException("Erro de entrada incompatível.");
        }
    }

    /**
     * Menu Opção 5:
     * Método para imprimir no console o melhor e pior filme do Produtor
     * filtrados de acordo com Ranting no arquivo "IMBD.csv"
     * @param diretorio - Diretorio do arquivo
     * @throws FileNotFoundException
     */
    private static void melhorPiorFilme(String diretorio) throws FileNotFoundException {
        //Tratamento de exceção para arquivo não encontrado:
        try {
            //Instancia de arquivo imdb.txt
            File menuImbd = new File(diretorio);

            //Scanner para entrada de dados e leitura de arquivo:
            Scanner lerArquivo = new Scanner(menuImbd);
            Scanner input = new Scanner(System.in);

            //Declaração de variáveis:
            boolean produtorIsTrue = false;
            double maiorRating = 0, menorRating = 0;
            String nomeProdutor, idFilmeAuxMaior = "" , idFilmeAuxMenor = "", conteudoLinha = "";
            int qt = 0;

            //Entrada de dados:
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t» Análise de Filmes «");
            System.out.print("\t\t\t\t\t\t» Por qual Produtor deseja pesquisar? ");
            nomeProdutor = input.nextLine();

            //Ciclo para executar o arquivo:
            lerArquivo.nextLine();
            while (lerArquivo.hasNextLine()) {
                //Atribuir na variável o conteúdo da linha do arquivo:
                conteudoLinha = lerArquivo.nextLine();

                String[] parteLinha = conteudoLinha.split(";");

                if (parteLinha[6].equalsIgnoreCase(nomeProdutor)) {
                    produtorIsTrue = true;
                    if (qt == 0) {
                        //idFilmeAux = conteudoLinha;
                        maiorRating = Double.parseDouble(parteLinha[2]);
                        menorRating = Double.parseDouble(parteLinha[2]);
                        idFilmeAuxMaior = parteLinha[1];
                        idFilmeAuxMenor = parteLinha[1];
                        qt++;
                    } else {
                        if (Double.parseDouble(parteLinha[2]) > maiorRating) {
                            maiorRating = Double.parseDouble(parteLinha[2]);
                            idFilmeAuxMaior = parteLinha[1];
                        }
                        if (Double.parseDouble(parteLinha[2]) < menorRating) {
                            menorRating = Double.parseDouble(parteLinha[2]);
                            idFilmeAuxMenor = parteLinha[1];
                        }
                    }
                }
            }

            //Saida de dados:
            if (produtorIsTrue == true) {
                System.out.println("\t\t\t\t\t\t» Rating do Produtor " + nomeProdutor + " filmes na lista IMBD.");
                System.out.println("\t\t\t\t\t\t\t\t\t\t» Maior Rating de nota " + maiorRating + " «");
                System.out.println("\t\t\t\t\t\t\t\t\t\t» Nome do Filme: " + idFilmeAuxMaior + " «");
                System.out.println("\t\t\t\t\t\t\t\t\t\t» Menor Rating de nota " + menorRating + " «");
                System.out.println("\t\t\t\t\t\t\t\t\t\t» Nome do Filme: " + idFilmeAuxMenor + " «");
            } else {
                System.out.println("\t\t\t\t\t\t» Produtor não existe na Lista IMBD.");
                System.out.println("\t\t\t\t\t\t» Verifique o Nome e Sobrenome.");
            }

            //Fechamento do arquivo:
            lerArquivo.close();
        } catch (FileNotFoundException exception) {
            exception.getMessage();
            throw new FileNotFoundException("Erro de Leitura: Arquivo não encontrado");
        } catch (InputMismatchException mismatchException) {
            mismatchException.getMessage();
            throw new InputMismatchException("Erro de entrada incompatível.");
        }
    }
}