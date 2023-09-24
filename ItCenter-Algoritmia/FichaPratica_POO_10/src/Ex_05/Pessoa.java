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

    public Pessoa(String nomePessoa, String emailPessoa, String telefonePessoa, int idadePessoa) {
        this.nomePessoa = nomePessoa;
        this.emailPessoa = emailPessoa;
        this.telefonePessoa = telefonePessoa;
        this.idadePessoa = idadePessoa;
    }

    public void exibirDetalhePessoa() {
        System.out.print("Nome: " + this.nomePessoa + " | Idade: " + this.idadePessoa + " | Telefone: " + this.telefonePessoa);
    }
}
