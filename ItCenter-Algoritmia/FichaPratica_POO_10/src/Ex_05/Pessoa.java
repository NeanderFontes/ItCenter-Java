package Ex_05;

/**
 * Crie uma classe chamada "Pessoa" que armazena informações básicas sobre uma pessoa, como nome,
 * idade, email e telemóvel. De seguida, crie uma classe chamada "Agenda" que armazena um conjunto de
 * objetos Pessoa num array. A classe Agenda terá um método para adicionar novas pessoas e outro para
 * listar todas as pessoas registadas.
 */

public class Pessoa {
    private String nomePessoa, emailPessoa, telefonePessoa;
    private int idadePessoa;

    /**
     * Criando Método de Class Pessoa para instanciamento do objeto
     *
     * @param nomePessoa     - Nome da Pessoa
     * @param emailPessoa    - Email da Pessoa
     * @param telefonePessoa - Telefone da Pessoa
     * @param idadePessoa    - Idade da Pessoa
     */
    public Pessoa(String nomePessoa, String emailPessoa, String telefonePessoa, int idadePessoa) {
        this.nomePessoa = nomePessoa;
        this.emailPessoa = emailPessoa;
        this.telefonePessoa = telefonePessoa;
        this.idadePessoa = idadePessoa;
    }

    /**
     * Método para Exibir detalhes das pessoas cadastradas em objeto Pessoa:
     */
    public void exibirDetalhePessoa() {
        System.out.print("Nome: " + this.nomePessoa + " | Idade: " + this.idadePessoa + " | Telefone: " + this.telefonePessoa);
    }
}
