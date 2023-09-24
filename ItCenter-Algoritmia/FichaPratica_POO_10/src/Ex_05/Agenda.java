package Ex_05;

/**
 * Crie uma classe chamada "Pessoa" que armazena informações básicas sobre uma pessoa, como nome,
 * idade, email e telemóvel. De seguida, crie uma classe chamada "Agenda" que armazena um conjunto de
 * objetos Pessoa num array. A classe Agenda terá um método para adicionar novas pessoas e outro para
 * listar todas as pessoas registadas.
 */
public class Agenda {
    private Pessoa[] pessoaAgenda;
    private int contadorPessoaAgenda;

    public Agenda() {
        this.pessoaAgenda = new Pessoa[50];
        this.contadorPessoaAgenda = 0;
    }

    /**
     * Método para Adicionar novas pessoa a agenda.
     * @param addNovaPessoa - Adicionando Nova pessoa da Class Pessoa
     */
    public void adicionarPessoaAgenda(Pessoa addNovaPessoa) {
        this.pessoaAgenda[contadorPessoaAgenda++] = addNovaPessoa;
    }

    /**
     * Método para listar Pessoas adicionadas na Agenda
     */
    public void listarPessoaAgenda() {
        System.out.println("Total de Pessoas cadastradas = " + this.contadorPessoaAgenda);
        for (int numIndice = 0; numIndice < this.contadorPessoaAgenda; numIndice++) {
            System.out.print((numIndice + 1) + "ª: ");
            this.pessoaAgenda[numIndice].exibirDetalhePessoa();
            System.out.println();
        }
    }

}
