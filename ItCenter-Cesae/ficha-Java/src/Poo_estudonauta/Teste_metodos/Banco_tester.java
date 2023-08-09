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
        registro1.setNumConta(1111);
        registro1.setDono("Igor");
        registro1.setTipoConta("CP");
        //Criação da conta em estado atual:
        registro1.statusAtual();
    }
}
