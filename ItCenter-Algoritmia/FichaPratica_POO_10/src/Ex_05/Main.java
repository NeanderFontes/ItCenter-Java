package Ex_05;

public class Main {
    public static void main(String[] args) {
        //Instanciando objeto Pessoa:
        Pessoa neander = new Pessoa("Neander", "neander@email.com", "+351 999-999-999", 34);
        Pessoa rebeca = new Pessoa("Rebeca", "rebeca@email.com", "+351 988-888-888", 35);
        Pessoa igor = new Pessoa("Igor", "igor@email.com", "+55 (71)9111-1111",33);
        Pessoa hugo = new Pessoa("Hugo", "hugo@email.com", "+55 (71)9222-2222",32);

        //Instanciando objeto Agenda:
        Agenda novaAgenda = new Agenda();

        //Adicionando Objeto Pessoa em Objeto Agenda:
        novaAgenda.adicionarPessoaAgenda(neander);
        novaAgenda.adicionarPessoaAgenda(rebeca);
        novaAgenda.adicionarPessoaAgenda(igor);
        novaAgenda.adicionarPessoaAgenda(hugo);
        novaAgenda.listarPessoaAgenda();
    }
}
