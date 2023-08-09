package Poo_estudonauta.Teste_metodos;

/*
 * Projeto utilizando as estruturas com metodos especiais
 * Metodos get, set e construct.
 * Metodos Visibilidade: public, private, protected.
 * Objeto ContaBanco.
 * Atributos: dono, numConta, tipo, saldo, statusConta;
 * Metods: abrirConta(), fecharConta(), depositar(), sacar(), pagarMensalidade();
 * Estado: status();
 */

import java.util.Scanner;

public class ContaBanco {
    //Atributos do Objeto ContaBanco:
    public int numConta;
    protected String tipoConta;
    private String dono;
    private int saldo;
    private boolean statusConta;

    //Métodos personalizados para os dados da conta:
    public void abrirConta(String tipoConta) {
        this.setTipoConta(tipoConta);
        this.setStatusConta(true);
        //Se abrir contaCorrente recebe 50 reais:
        if ((tipoConta).equalsIgnoreCase("contaCorrente")) {
            this.setSaldo(50);
        //Se abrir contaPoupanca recebe 150 reais:
        } else if ((tipoConta).equalsIgnoreCase("contaPoupanca")) {
           this.setSaldo(150);
        }
    }

    public void fecharConta() {
        //Fechar conta somente se numConta == 0 reais
        if (this.getSaldo() == 0) {
            System.out.println("Conta fechada com sucesso.");
            this.setStatusConta(false);
        //Se Saldo positivo sacar dinheiro
        } else if (this.getSaldo() > 0) {
            System.out.println("Conta contém dinheiro, precisa saca para fechar conta.");
        //Se Saldo negativo depositar dinheiro
        } else {
            System.out.println("Conta em débito, precisa negociar para fechar conta.");
        }
    }

    public void depositar(int valorDepositado) {
        //Se statusConta for verdadeiro
        if (this.getStatusConta()) {
            //this.saldo = this.saldo + valorDepositado;
            this.setSaldo(this.getSaldo() + valorDepositado);
            System.out.println("Depósito realizado na conta de " + getDono());
        } else {
            System.out.println("Conta inexistente.");
        }
    }

    public void sacar(int valorSacar) {
        //Se statusConta for verdadeiro
        if (this.getStatusConta()) {
            //Se saldo maior que 0 e saldo menor ou igual que valor do saldo
            if (this.getSaldo() > 0) {
                this.setSaldo(this.getSaldo() - valorSacar);
                System.out.println("Valor sacado na conta de " + getDono());
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Conta inexistente.");
        }
    }

    public void pagarMensalidade() {
        int valorMensalidade = 0;
        //Mensalidade cobrada quando chamar o metodo
        //Mensalidade contaCorrente = 12 reais
        if (this.getTipoConta().equalsIgnoreCase("contaCorrente")) {
            valorMensalidade = 12 ;
        //Mensalidade contaPoupanca = 20 reais
        } else if (this.getTipoConta().equalsIgnoreCase("contaPoupanca")) {
            valorMensalidade = 20;
        }
        if (this.getStatusConta()) {
            if (this.getSaldo() > valorMensalidade) {
                this.setSaldo(this.getSaldo() - valorMensalidade);
                System.out.println("Valor de mensalidade " + valorMensalidade + "debitada na conta de " + getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Conta inexistente.");
        }
    }

    //Métodos especiais construct, getter e setter dos atributos:

    //Método construct:
    public void ContaBanco() {
        //Se nova conta conta não existe.
        this.setSaldo(0);
        //Se nova conta saldo == 0
        this.setStatusConta(false);
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public int getNumConta() {
        return numConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    public String getTipoConta() {
        return tipoConta;
    }


    public void setDono(String dono) {
        this.dono = dono;
    }
    public String getDono() {
        return dono;
    }


    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public int getSaldo() {
        return saldo;
    }


    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
    public boolean getStatusConta() {
        return statusConta;
    }
}
