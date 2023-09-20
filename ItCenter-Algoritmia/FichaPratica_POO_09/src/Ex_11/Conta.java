package Ex_11;

import java.util.Scanner;

/**
 * 11) Crie um programa para fazer a gestão de contas bancárias:
 *  • Crie uma classe chamada "Conta" com os seguintes atributos: número da conta, saldo e titular da conta.
 *  • Crie um método “transferência” que tenha como parâmetros o valor a transferir e a conta de destinatário.
 *  • Crie os métodos depositar (aumentar saldo), levantar (diminuir saldo) e mostrarSaldo.
        (Exemplo de mostarSaldo: “Saldo da conta 12345: 950 EUR”)
 *  • O método depositar deve receber um valor como parâmetro e atualizar o saldo.
 *  • O método levantar deve receber um valor como parâmetro e verificar se é possível realizar a
        operação, considerando o saldo. De seguida, atualiza o saldo se a transação for possível.
 *  • O método exibirSaldo deve exibir na consola o saldo atual da conta.
 *  • No método main, crie um objeto da classe Conta e invoque os métodos para depositar 1000€ e exibir o saldo.
 *  • De seguida, invoque o método para levantar 120€ e exiba o saldo.
 *  • De seguida, crie mais dois objetos da classe e atribua valores aos seus atributos. De seguida,
        transfira um valor de uma conta para a outra.
 *  • No fim, deve exibir o saldo atual das três contas.
 */
public class Conta {
    private Conta novoAtributoObjeto;
    private String titularConta;
    private int numConta;
    private double saldoConta = 0;

    /**
     * Método Construtor para instancia do objeto Conta
     * @param titularConta - Titular da conta
     * @param numConta - Numero da conta
     */
    public Conta(String titularConta, int numConta) {
        this.titularConta = titularConta;
        this.numConta = numConta;
        this.saldoConta = 0.0;
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
                    //Composição da class Conta para encontrar Numero da Conta:
                    novoAtributoObjeto = encontrarConta(numUtilizador);
                    if (novoAtributoObjeto != null) {
                        transfencia(valorTransferido, novoAtributoObjeto);
                    } else {
                        System.out.println("Número de conta " + getNumConta() + "não existe!");
                    }
                    break;
                case 0:
                    System.out.println("Sair.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcaoMenu != 0);
    }

    /**
     * Método de lógica criado para Composição da class Conta Numero da Conta
     * @param numUtilizador - Numero de entrada pelo utilizador
     * @return - Null ou Numero de Conta se existir
     */
    private Conta encontrarConta(int numUtilizador) {
        if (this.numConta == numUtilizador) {
            return this; //Retorna valor do Numero da conta
        }
        return null;
    }

    /**
     * Função para retornar valor Depositado na Conta
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
     * @param valorTransferido - Valor de transferência pelo utilizador
     * @param contaDestino -
     */
    public void transfencia(double valorTransferido, Conta contaDestino) {
        if (this.saldoConta >= valorTransferido && valorTransferido > 0) {
            System.out.println(this.getTitularConta() + " Seu saldo atual = €" + this.saldoConta);
            //Decremento para valor transferido da conta
            this.saldoConta -= valorTransferido;
            System.out.println("Transferência de €" + valorTransferido + " realizada com sucesso para "
                    + contaDestino.getTitularConta() + " Nº Conta: " + contaDestino.getNumConta());

        } else {
            System.out.println("Saldo insuficiente para realizar transferência.");;
        }
    }

    /**
     * Método getter para obter nome do Titular da Conta
     * @return - Nome do Titular da Conta
     */
    public String getTitularConta() {
        return this.titularConta;
    }

    /**
     * Método getter para retornar Numero da COnta
     * @return - Numero da conta
     */
    public int getNumConta() {
        return this.numConta;
    }
}
