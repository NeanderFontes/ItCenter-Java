package Ex_02;

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
public class Pessoa {
    private String nomePessoa, emailPessoa, telefonePessoa;
    private int idadePessoa;

    /**
     * Criando Método de Class Pessoa para instanciamento do objeto
     *
     * @param nomePessoa     - Nome da Pessoa
     * @param idadePessoa    - Idade da Pessoa
     * @param telefonePessoa - Telefone da Pessoa
     * @param emailPessoa    - Email da Pessoa
     */
    public Pessoa(String nomePessoa, int idadePessoa, String telefonePessoa, String emailPessoa) {
        this.nomePessoa = nomePessoa;
        this.idadePessoa = idadePessoa;
        this.telefonePessoa = telefonePessoa;
        this.emailPessoa = emailPessoa;
    }

    /**
     * Método para Exibir detalhes das pessoas cadastradas em objeto Pessoa:
     */
    public void exibirDetalhePessoa() {
        System.out.print("Nome: " + this.nomePessoa + " | Idade: " + this.idadePessoa + " | Telefone: " + this.telefonePessoa);
    }

    /**
     * Métodos Getter e Setter
     */
    public String getNomePessoa() {
        return nomePessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }
}
