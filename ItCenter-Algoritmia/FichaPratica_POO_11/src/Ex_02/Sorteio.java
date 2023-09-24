package Ex_02;

import java.util.ArrayList;
import java.util.Random;

/**
 * Desenvolva uma classe Pessoa que tenha como atributos: nome, idade, telemovel e email.
 * Desenvolva uma classe Sorteio que tenha como atributos: premio (double) e participantes (ArrayList de
 * Pessoas).
 * Na classe Sorteio programe o método adicionarParticipante que receba uma Pessoa como parâmetro e
 * adicione a Pessoa ao Array de Participantes. Deve verificar se a idade é igual ou maior a 18, sendo que deve
 * apresentar a mensagem de aviso caso a pessoa seja menor de idade.
 * Na classe Sorteio programe o método sortear que retorna uma Pessoa que será o vencedor do sorteio. Para
 * escolher o vencedor deve fazer uso da biblioteca random de java, para escolher um índice do Array.
 * Na classe Sorteio programe o método imprimir lista de participantes que imprime com o seguinte exemplo
 * de aspeto:
 * Participante 1: Neander | 24 | 911 111 111 | neander@email.com
 * Participante 2: Rebeca | 20 | 922 222 222 | rebeca@email.com
 * …
 */
public class Sorteio {
    private ArrayList<Pessoa> listPessoaSorteio = new ArrayList<>();
    private double premioSorteio;

    /**
     * Método Construtor do Objeto Sorteio para instanciar o valor do Prêmio e criar ArrayList<Pessoa>
     *
     * @param premioSorteio - Valor do Prêmio do Sorteio.
     */
    public Sorteio(double premioSorteio) {
        this.premioSorteio = premioSorteio;
        this.listPessoaSorteio = new ArrayList<>();
    }

    /**
     * Método para Adicionar Novo Participante no ArrayList<Pessoa>
     *
     * @param novoParticipante - Participante da classe Pessoa adicionada
     */
    public void addParticipante(Pessoa novoParticipante) {
        this.listPessoaSorteio.add(novoParticipante);
        if (novoParticipante.getIdadePessoa() < 18) {
            System.out.println("Participante " + novoParticipante.getNomePessoa() + " do Sorteio é menor de idade.\nNão pode Participar.");
        }
    }

    /**
     * Método para Sortear um ganhador do ArrayList<Pessoa>
     * Será Utilizado biblioteca Random para sortear o index dos participantes adicionados.
     *
     * @return - Index do Ganhador
     */
    public Pessoa sortearGanhador() {
        //Import Biblioteca Random para sorteio
        Random random = new Random();

        //Gerar numero aleatório entre 0 e total de participantes do ArrayList<Pessoa>
        Pessoa ganhador = this.listPessoaSorteio.get(random.nextInt(this.listPessoaSorteio.size()));

        System.out.println("Ganhador = " + ganhador);
        return ganhador;
    }
}
