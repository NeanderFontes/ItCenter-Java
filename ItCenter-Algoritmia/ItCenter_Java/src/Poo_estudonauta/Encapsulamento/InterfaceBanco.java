package Poo_estudonauta.Encapsulamento;

/*
 * Criação de Interface para Encapsulamento.
 * Implementando Métodos abstratos para a class ContaBanco
 * Métodos: abrirConta(), fecharConta(), depositar(), sacar(), pagarMensalidade();
 */
public interface InterfaceBanco {
    //Encapsulamento Métodos abstratos:
    public abstract void statusAtual();
    public abstract void abrirConta(String tipoConta);
    public abstract void fechaConta();
    public abstract void depositar(int valorDepositado);
    public abstract void sacar(int valorSacar);
    public abstract void pagarMensalidade();
}

