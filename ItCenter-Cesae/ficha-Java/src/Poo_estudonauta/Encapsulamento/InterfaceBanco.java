package Poo_estudonauta.Encapsulamento;

/*
 * Criação de Interface para Encapsulamento.
 * Implementando Métodos abstratos para a class ContaBanco
 * Métodos: abrirConta(), fecharConta(), depositar(), sacar(), pagarMensalidade();
 */
public interface InterfaceBanco {
    //Encapsulamento Métodos abstratos:
    public abstract void abrirConta();
    public abstract void fechaConta();
    public abstract void depositar();
    public abstract void sacar();
    public abstract void pagarMensalidade();
}

