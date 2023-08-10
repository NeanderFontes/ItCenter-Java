package Poo_estudonauta.Encapsulamento;

public class PraticaEncapsulamento implements InterfaceBanco{
    //Atributos do Objeto ContaBanco:
    private int numConta;
    protected String tipoConta;
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
    public void abrirConta() {

    }

    @Override
    public void fechaConta() {

    }

    @Override
    public void depositar() {

    }

    @Override
    public void sacar() {

    }

    @Override
    public void pagarMensalidade() {

    }
}
