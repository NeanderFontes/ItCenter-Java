package Ex_02;

import java.util.Scanner;

public class Conta {
    private Conta novoAtributoObjeto;
    private String titularConta;
    private int numConta, anoAberturaConta;
    private double saldoConta, valorDivida;

    /**
     * Método Construtor para instancia do objeto Conta
     *
     * @param titularConta - Titular da conta
     * @param numConta     - Numero da conta
     */
    public Conta(String titularConta, int numConta) {
        this.titularConta = titularConta;
        this.numConta = numConta;
        this.saldoConta = 0.0;
        this.anoAberturaConta = 2023;
        this.valorDivida = 0.0;
    }

    /**
     *
     */
    public void menuConta() {
        //Scanner para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis:
        double valorLevantado, valorDepositado, valorTransferido;


        int opcaoMenu;

        do {
            System.out.println("1 - Saldo da Conta.");
            System.out.println("2 - Depositar.");
            System.out.println("3 - Levantar(Sacar).");
            System.out.println("4 - Transferir.");
            System.out.println("0 - Sair.");
            System.out.print("Escolha uma opção acima: ");
            opcaoMenu = input.nextInt();
            switch (opcaoMenu) {
                case 1:
                    mostrarSaldo();
                    break;
                case 2:
                    //Saldo atual:
                    System.out.println(this.getTitularConta() + " Seu saldo atual = €" + this.saldoConta);

                    //Entrada de dados:
                    System.out.print("Quanto deseja depositar? €");
                    valorDepositado = input.nextDouble();
                    depositar(valorDepositado);
                    break;
                case 3:
                    //Saldo atual:
                    System.out.println(this.getTitularConta() + " Seu saldo atual = €" + this.saldoConta);

                    //Entrada de dados:
                    System.out.print("Quanto deseja Levantar(Sacar)? €");
                    valorLevantado = input.nextDouble();
                    levantarSacar(valorLevantado);
                    break;
                case 4:
                    //Saldo atual:
                    System.out.println(this.getTitularConta() + " Seu saldo atual = €" + this.saldoConta);

                    //Entrada de dados:
                    System.out.print("Quanto deseja Transferir? €");
                    valorTransferido = input.nextDouble();
                    System.out.print("Para qual conta deseja realizar a transferência? ");
                    int numUtilizador = input.nextInt();
                    //Composição de class Conta para encontrar Numero da Conta:
                    //novoAtributoObjeto = encontrarConta(numUtilizador);
                    transfencia(valorTransferido, novoAtributoObjeto);
                    /*todo Refazer nova Classe Banco
                    if (novoAtributoObjeto != null) {

                    } else {
                        System.out.println("Número de conta " + this.numConta + " não existe!");
                    }
                    */
                    break;
                case 0:
                    System.out.println("Sair.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcaoMenu != 0);
    }


    public void pedirEmprestimo(double valorEmprestimoPedido) {
        //Margem de Emprestimo com valor de 90% do saldo atual.
        double margemEmprestimo = (this.saldoConta * 90) / 100;

        //Condição para autorizar emprestimo:
        if (this.valorDivida != 0 && valorEmprestimoPedido <= margemEmprestimo) {
            System.out.println("Pedido de Emprestimo já foi Utilizado.");
            System.out.println("Valor de €" + valorEmprestimoPedido + " Não autorizado.");
            System.out.println(this.getTitularConta() + " Seu saldo atual = €" + this.saldoConta);
        } else {
            this.saldoConta += valorEmprestimoPedido;
            this.valorDivida++;
            System.out.println("Foram depositado €" + valorEmprestimoPedido);
            System.out.println(this.getTitularConta() + " Seu saldo atualizado = €" + this.saldoConta);
        }
    }

    /**
     * Função para retornar valor Depositado na Conta
     *
     * @return - Saldo da Conta + Depoisto realizado
     */
    public double depositar(double valorDepositado) {
        if (valorDepositado < 0) {
            System.out.println("Valor inválido. O depósito deve ser maior que zero.");
        } else {
            //Valor incremento de valor depositado na conta:
            this.saldoConta += valorDepositado;

            //Saldo Atualizado após deposito:
            System.out.println("Foram depositado €" + valorDepositado);
            System.out.println(this.getTitularConta() + " Seu saldo atual = €" + this.saldoConta);
        }

        return this.saldoConta;
    }

    /**
     * Função criada pra Levantar (Sacar)
     *
     * @return - Valor Levantado
     */
    public double levantarSacar(double valorLevantar) {
        if (this.saldoConta >= valorLevantar && valorLevantar > 0) {
            //Decremento do valor levantado na conta:
            this.saldoConta -= valorLevantar;

            //Saldo Atualizado após levantamento:
            System.out.println("Foram levantado(sacado) €" + valorLevantar);
            System.out.println(this.getTitularConta() + " Seu saldo atual = €" + this.saldoConta);
        } else {
            System.out.println("Saldo Insificiente para Levantar.");
        }
        return this.saldoConta;
    }

    /**
     * Método para Mostrar Saldo altual:
     */
    public void mostrarSaldo() {
        //Mostrar Saldo atualizado da conta utilizador:
        System.out.println(this.getTitularConta() + " Seu saldo atual = €" + this.saldoConta);
    }

    /**
     * Método para Transferência entre contas:
     *
     * @param valorTransferido - Valor de transferência pelo utilizador
     * @param contaDestino     -
     */
    public void transfencia(double valorTransferido, Conta contaDestino) {
        if (this.saldoConta >= valorTransferido && valorTransferido > 0) {
            System.out.println(this.getTitularConta() + " Seu saldo atual = €" + this.saldoConta);
            //Decremento para valor transferido da conta
            this.saldoConta -= valorTransferido;

            //Transferência do valor para conta de destino:
            contaDestino.saldoConta += (valorTransferido);

            //Dados finais:
            System.out.println("Transferência de €" + valorTransferido + " realizada com sucesso para "
                    + contaDestino.getTitularConta() + " Nº Conta: " + contaDestino.getNumConta());

        } else {
            System.out.println("Saldo insuficiente para realizar transferência.");
            ;
        }
    }

    /**
     * Método getter para obter nome do Titular da Conta
     *
     * @return - Nome do Titular da Conta
     */
    public String getTitularConta() {
        return this.titularConta;
    }

    /**
     * Método getter para retornar Numero da COnta
     *
     * @return - Numero da conta
     */
    public int getNumConta() {
        return this.numConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void getValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
}
