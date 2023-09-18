package Ex_09;

import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

/**
 * Crie uma classe Produto que tenha os atributos nome, preço e quantidade em stock
    (deve ser inicializada a 0), e os métodos comprar e vender, que recebam a
    quantidade desejada como parâmetro e atualizem o stock.
    I - Para vender um produto, deve analisar se existe stock suficiente. Caso exista stock suficiente deve
        atualizar o stock. Caso não exista stock suficiente deve informar o utilizador que tal transação não
        é possível por quebra de stock do produto.
    II - No método main, crie um objeto dessa classe Produto e chame o método para comprar 5 unidades.
    III - Invoque o método para vender 2 unidades, e imprima a quantidade de stock.
    IV - Invoque o método para comprar 10 unidades.
    V - Invoque o método para vender 35 unidades
 */
public class Produto {
    private String cliente ,nomePruduto;
    private double precoProduto;
    private int qtProduto = 0, qtStock = 0;

    /**
     * Método Construtor para obter Nome e Preço do Produto
     * @param cliente - Nome do Cliente
     * @param nomePruduto - Nome Produto
     * @param precoProduto - Preço Produto
     */
    public Produto(String cliente, String nomePruduto, double precoProduto) {
        this.cliente = cliente;
        this.nomePruduto = nomePruduto;
        this.precoProduto = precoProduto;
    }

    public void menuProduto() {
        Scanner input = new Scanner(System.in);

        String opcaoStock;
        int opcaoMenu;

        do {
            System.out.println("==== Mercado Sozinho ====");
            System.out.println("1 - Comprar.");
            System.out.println("2 - Stock.");
            System.out.println("0 - Sair.");
            System.out.print("Escolha uma opção acima: ");
            opcaoMenu = input.nextInt();
            switch (opcaoMenu) {
                case 1:
                    comprar();
                    break;
                case 2:
                    System.out.println("Disponível " + getNomePruduto() + "[" + this.qtStock + "] no momento.");
                    System.out.println("Deseja atualizar o Stock? [S/N]");
                    opcaoStock = input.next();
                    if (opcaoStock.equalsIgnoreCase("S") && this.qtStock == 0) {
                        System.out.print("Quanto deseja adicionar ao Stock? ");
                        this.qtStock = input.nextInt();
                        atualizarEstoque(this.qtStock);
                        System.out.println("Disponível " + getNomePruduto() + "[" + this.qtStock + "] no momento.");
                    } else {
                        if (opcaoStock.equalsIgnoreCase("N")) {
                            break;
                        } else {
                            System.out.print("Quanto deseja adicionar ao Stock? ");
                            this.qtStock = input.nextInt();
                            atualizarEstoque(this.qtStock);
                            System.out.println("Disponível " + getNomePruduto() + "[" + this.qtStock + "] no momento.");
                        }
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

    public void comprar() {
        //Entrada para quantidade de produtos;
        Scanner input = new Scanner(System.in);

        //Entrada e saída de dados:
        System.out.println(getCliente() + " Seja bem vindo!");
        System.out.println("Disponível " + getNomePruduto() + "[" + this.qtStock + "] no momento.");

        //Se quantidade de stock maior que 0 intriduzir quantidade do produto
        if (this.qtStock > 0) {
            System.out.print("Quantos " + getNomePruduto() + " deseja comprar? ");
            this.qtProduto = input.nextInt();
            if (this.qtProduto > 0 && this.qtProduto <= this.qtStock) {
                this.precoProduto *= this.qtProduto;
                System.out.println("Valor total = €" + this.precoProduto);
                if (this.precoProduto > 0 && this.qtProduto > 0) {
                    //Chamada da função para validar a venda:
                    vender();
                }
            } else {
                System.out.println("Quantidade maior do que contem no Stock");
                System.out.println("Disponível " + getNomePruduto() + "[" + this.qtStock + "] no momento.");
            }
        } else {
            //Se não, quantidade de stock = 0
            System.out.println("Infelizmente estamos sem stock de " +getNomePruduto());
        }
    }
    public void vender() {
        //SCanner para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis locais:
        String opcaoStock;
        boolean atualizarStock = false;

        //Se quantidade de stock = 0, atualizar stock
        if (this.qtStock <= 0) {
            System.out.println(getNomePruduto() + " Indisponível no momento.");
            System.out.println("Deseja atualizar stock? ");
            opcaoStock = input.next();
            if (opcaoStock.equalsIgnoreCase("S")) {
                atualizarStock = true;
                if (atualizarStock) {
                    System.out.print("Quantos produtos deseja adicionar ao Stock? ");
                    int qtMaisStock = input.nextInt();
                    this.qtStock += qtMaisStock;
                }
            } else {
                System.out.println(getNomePruduto() + "Indisponível no momento.");
            }
        } else {
            System.out.println("Deseja comprar " + this.qtProduto + " de " + getNomePruduto() + "? [S/N]");
            String opcaoCompra = input.next();
            if (opcaoCompra.equalsIgnoreCase("S")) {
                this.qtStock -= this.qtProduto;
                System.out.println("Disponível " + getNomePruduto() + "[" + this.qtStock + "] no momento.");
            } else {
                this.precoProduto /= this.qtProduto;
                System.out.println("Disponível " + getNomePruduto() + "[" + this.qtStock + "] no momento.");
            }
        }
    }

    /**
     * Função para retornar atribuição ao valor de Stock
     * @param qtMaisStock
     * @return
     */
    private int atualizarEstoque(int qtMaisStock) {
        this.qtStock = qtMaisStock;
            return this.qtStock ;
    }

    /**
     * Método getter para nome Cliente
     * @return - Nome do Cliente
     */
    public String getCliente() {
        return this.cliente;
    }

    /**
     * Método getter para nome do Produto
     * @return - Nome do Produto
     */
    public String getNomePruduto() {
        return this.nomePruduto;
    }
}
