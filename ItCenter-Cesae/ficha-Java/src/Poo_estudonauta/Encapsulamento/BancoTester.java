package Poo_estudonauta.Encapsulamento;

import Poo_estudonauta.Teste_metodos.ContaBanco;

public class BancoTester {
    public static void main(String[] args) {
        //Método main principal:
        //Inicializando o Objeto ContaBanco e criando nova variável:
        PraticaEncapsulamento conta1 = new PraticaEncapsulamento();
        //Atribuição direto por parâmetro:
        conta1.setNumConta(1111);
        conta1.setDono("Neander");

        //Abertura de conta
        conta1.abrirConta("CC");

        //Estado atual da conta:
        conta1.statusAtual();
    }
}
