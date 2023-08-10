package Poo_estudonauta.Encapsulamento;

public class PraticaEncapsulamento implements InterfaceBanco{
    //Atributos do Objeto ContaBanco:
    private int numConta;
    private String tipoConta;
    private String dono;
    private int saldo;
    private boolean statusConta;

    //Método construct:
    public PraticaEncapsulamento() {
        //Se nova conta conta não existe.
        this.saldo = 0;
        //Se nova conta saldo == 0
        this.statusConta = false;
    }

    //Métodos Especiais getter e setter:
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

    //Métodos Abstratos
    @Override
    public void statusAtual() {
        System.out.println("====================== STATUS ATUAL DA CONTA ======================");
        System.out.println("Conta nº: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipoConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo Atual R$" + this.getSaldo());
        if (this.getStatusConta()) {
            System.out.println("Status da conta: Ativada!!");
        } else {
            System.out.println("Status da conta: Desativada!!");
        }
        System.out.println("===================================================================");
    }

    @Override
    public void abrirConta(String tipoConta) {
        this.setTipoConta(tipoConta);
        this.setStatusConta(true);
        //Se abrir Conta Corrente, recebe 50€:
        if ((tipoConta).equalsIgnoreCase("CC")) {
            this.setSaldo(50);
            //Se abrir Conta Poupança, recebe 50€:
        } else if ((tipoConta).equalsIgnoreCase("CP")) {
            this.setSaldo(150);
        }
        System.out.println("Conta Aberta com Sucesso!!");
    }

    @Override
    public void fechaConta() {
        //Se Saldo positivo pedir pra retirar dinheiro
        if(this.getSaldo() > 0) {
            System.out.println("Conta contém dinheir, precisa zerar");
        //Se Saldo negativo pedir para pagar o débito
        } else if (this.getSaldo() < 0) {
            System.out.println("Você precisa pagar débito para fechar conta.");
        //Fechar conta somentne se Saldo == 0€
        } else {
            this.setStatusConta(false);
            System.out.println("Conta Fechada com Sucesso!");
        }
    }

    @Override
    public void depositar(int valorDepositado) {
        //Se status da conta for verdadeiro efetuar depósito:
        if (this.getStatusConta()) {
            this.setSaldo(getSaldo() + valorDepositado);
            System.out.println("Depósito realizado com sucesso");
        } else {
            System.out.println("Abra conta para realizar depósito");
        }
    }

    @Override
    public void sacar(int valorSacar) {
        //Se status da conta for verdadeiro e se saldo maior que 0
        if (this.getStatusConta()) {
            if (this.getSaldo() >= valorSacar) {
                this.setSaldo(getSaldo() - valorSacar);
                System.out.println("Valor levantado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Abra conta para poder realizar levantamento");
        }
    }

    @Override
    public void pagarMensalidade() {
        //Obs: Mensalidade cobrada quando chamar o metodo
        int valorMensalidade = 0;
        //Mensalidade contaCorrente = 12 reais
        if (this.getTipoConta().equalsIgnoreCase("CC")) {
            valorMensalidade = 12 ;
            //Mensalidade contaPoupanca = 20 reais
        } else if (this.getTipoConta().equalsIgnoreCase("CP")) {
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
}
