package Poo_estudonauta.Teste_metodos;

/*
 * Projeto utilizando as estruturas com metodos especiais
 * Metodos get, set e construct.
 * Metodos Visibilidade: public, private, protected.
 * Objeto ContaBanco.
 * Atributos: dono, numConta, tipo, saldo, statusConta;
 * Metods: abrirConta(), fecharConta(), depositar(), sacar(), pagarMensalidade();
 * Estado: statusAtual();
 */
public class Banco_tester {
    //Método main principal:
    public static void main(String[] args) {
        //Inicializando o Objeto ContaBanco e criando nova variável:
        ContaBanco registro1 = new ContaBanco();
        ContaBanco registro2 = new ContaBanco();
        //Atribuição direto por parâmetro:
        registro1.setNumConta(1111);
        registro1.setDono("Neander");

        //Método para abrir conta:
        registro1.abrirConta("CC");

        //Estado atual da conta:
        registro1.statusAtual();

        //Registro novo cliente
        //Atribuição direto por parâmetro:
        registro2.setNumConta(2222);
        registro2.setDono("Igor");

        //Método para abrir conta:
        registro2.abrirConta("CP");

        //Estado atual da conta:
        registro2.statusAtual();
    }
}
