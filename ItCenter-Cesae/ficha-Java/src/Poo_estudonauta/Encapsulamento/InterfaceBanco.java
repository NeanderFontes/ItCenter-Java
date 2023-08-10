package Poo_estudonauta.Encapsulamento;

/*
 * Criação de Interface para Encapsulamento.
 * Implementando Métodos abstratos para a class ContaBanco
 * Métodos: abrirConta(), fecharConta(), depositar(), sacar(), pagarMensalidade();
 */
public interface InterfaceBanco {
    //Encapsulamento Métodos abstratos:
    void fechaConta();
    void depositar(int valorDepositado);
    void sacar(int valorSacar);
    void pagarMensalidade();
}

