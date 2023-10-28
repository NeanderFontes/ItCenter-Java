package RPG.Entidades.VendedorJogo;

import RPG.Entidades.Heroi;
import RPG.Item.AbstractClass.Consumivel;
import RPG.Item.AbstractClass.ItemHeroi;
import RPG.Item.ArmaPrincipal;
import RPG.Item.ConsumivelCombate;
import RPG.Item.Pocao;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Vendedor {
    private ArrayList<ItemHeroi> itensLoja;

    /**
     * Método Construtor da Class <b>Vendedor</b>
     */
    public Vendedor() {
        this.itensLoja = new ArrayList<>();
    }

    /**
     * Método para Adicionar Novo item em Stock do Vendedor
     *
     * @param itemNovo - Item Adicionado
     */
    public void adicionarStock(ItemHeroi itemNovo) {
        this.itensLoja.add(itemNovo);
    }

    /**
     * Método Para Vendedor Vender 10 Itens aleatórios:
     *
     * @param compraHeroi - Heroi / Jogador Atual
     * @return - O Item de Acordo com o tipo do item
     */
    public boolean venderItem(Heroi compraHeroi) throws InterruptedException {
        // Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        // Import Random random para Imprimir ArrayList aleatório:
        Random random = new Random();

        // Declaração de Variáveis:
        int maxItens;
        int indexRandom;
        int indexItemEscolhido;
        int valorItem;

        // Se o ArrayList<ItemHeroi> Vazio:
        if (itensLoja.isEmpty()) {
            System.out.println("A loja do vendedor está vazia no momento.");
            return false;
        }

        System.out.println("**********************************************************************");
        System.out.println("\t\t\t\tBEM VINDO A SALA DAS OPORTUNIDADES SE VOCÊ TIVER $$$ APROVEITE!!");
        System.out.println("\t\tDesfrute com inteligência para sua viagem!!");
        System.out.println("**********************************************************************");
        Thread.sleep(1000);
        maxItens = Math.min(10, itensLoja.size());

        ArrayList<ItemHeroi> itensAleatorios = new ArrayList<>();

        // Laço para pecorrer ArrayList<ItemHeroi> aleatórios:
        while (itensAleatorios.size() < maxItens) {
            indexRandom = random.nextInt(itensLoja.size());
            ItemHeroi itemAleatorio = itensLoja.get(indexRandom);
            if (!itensAleatorios.contains(itemAleatorio)) {
                itensAleatorios.add(itemAleatorio);
                System.out.print("Item " + (itensAleatorios.size()) + " - ");
                itemAleatorio.exibirDetalhesItemHeroi();
            }
        }
        System.out.println();
        System.out.println("» Status Atual do Ouro = $" + compraHeroi.getOuroHeroi());
        System.out.println("[ 0 ] - Para Sair:");
        System.out.print("» Qual item deseja comprar acima? ");
        indexItemEscolhido = input.nextInt();

        if (indexItemEscolhido == 0) {
            return false;
        }

        if (indexItemEscolhido < 0 || indexItemEscolhido > maxItens) {
            System.err.println("Opção inválida.");
            return false;
        }

        ItemHeroi itemEscolhido = itensAleatorios.get(indexItemEscolhido - 1);
        valorItem = itemEscolhido.getPrecoItemHeroi();

        System.out.println("\n" + compraHeroi.getNomeEntidade() + " vai tentar comprar: " + itemEscolhido.getNomeItemHeroi());
        System.out.println("Ouro Herói: " + compraHeroi.getOuroHeroi() + " | Custo Item: " + valorItem);

        if (compraHeroi.getOuroHeroi() < valorItem) {
            System.out.println("Ouro de " + compraHeroi.getNomeEntidade() + " Insuficiente para compra do Item ");
            return false;
        }

        // ArrayList<ItemHeroi> Para permissão de itens de acordo com getTipoHeroi do Jogador:
        for (String heroiPermitido : itemEscolhido.getItemHeroiPermitido()) {
            if (compraHeroi.getTipoHeroi().equals(heroiPermitido)) {
                if (itemEscolhido instanceof Consumivel) {
                    compraHeroi.getInventarioHeroi().add((Consumivel) itemEscolhido);
                } else if (itemEscolhido instanceof ArmaPrincipal) {
                    compraHeroi.setArmaPrincipalHeroi((ArmaPrincipal) itemEscolhido);
                }

                compraHeroi.setOuroHeroi(compraHeroi.getOuroHeroi() - valorItem);
                System.out.println("\n» Compra feita com Sucesso!! " + itemEscolhido.getNomeItemHeroi());

                // Remoção do Item:
                this.itensLoja.remove(itemEscolhido);
                return true;
            }
        }
        return false;
    }


    /**
     * Método do Vendedor para Imprimir no console todos os itens da Loja:
     *
     * @param compraHeroi - Heroi / Jogador Atual
     * @return - O Item de Acordo com o tipo do item
     * @throws InterruptedException
     */
    public boolean venderTodosItens(Heroi compraHeroi) throws InterruptedException {
        // Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        // Declaração de variáveis:
        boolean categoriaJaImpressa = false;
        int numIndice = 0;
        int indexItemEscolhido;

        System.out.println("*********************************************************************************");
        System.out.println("\t\t\tBEM VINDO A SALA DAS OPORTUNIDADES SE VOCÊ TIVER $$$ APROVEITE!!");
        System.out.println("\t\t\t\tDesfrute com inteligência para sua viagem!!");
        System.out.println("*********************************************************************************");
        Thread.sleep(1000);

        // Laços para pecorrer ArrayList<ItemHeroi> aleatórios:
        System.out.println("******************************** ARMA(S) DO JOGO ********************************");
        for (numIndice = 1; numIndice < this.itensLoja.size(); numIndice++) {
            Thread.sleep(150);
            if (this.itensLoja.get(numIndice) instanceof ArmaPrincipal) {
                System.out.print("Item [ " + numIndice + " ] - ");
                this.itensLoja.get(numIndice).exibirDetalhesItemHeroi();
                if (this.itensLoja.isEmpty()) {
                    System.out.println(" »»» Por Enquanto Não Há mais Arma no momento ««« ");
                }
            }
        }
        System.out.println();
        System.out.println("******************************** CONSUMIVEL(IS) DE COMBATE ********************************");
        for (numIndice = 1; numIndice < this.itensLoja.size(); numIndice++) {
            Thread.sleep(150);
            if (this.itensLoja.get(numIndice) instanceof ConsumivelCombate) {
                System.out.print("Item [ " + numIndice + " ] - ");
                this.itensLoja.get(numIndice).exibirDetalhesItemHeroi();
                if (this.itensLoja.isEmpty()) {
                    System.out.println(" »»» Por Enquanto Não Há mais Consumiveis de Combate no momento ««« ");
                }
            }
        }
        System.out.println();
        System.out.println("******************************** POÇÃO(OS) DE RECUPERAÇÃO ********************************");
        for (numIndice = 1; numIndice < this.itensLoja.size(); numIndice++) {
            Thread.sleep(150);
            if (this.itensLoja.get(numIndice) instanceof Pocao) {
                System.out.print("Item [ " + numIndice + " ] - ");
                this.itensLoja.get(numIndice).exibirDetalhesItemHeroi();
                if (this.itensLoja.isEmpty()) {
                    System.out.println(" »»» Por Enquanto Não Há mais Poção de Recuperação no momento ««« ");
                }
            }
        }
        System.out.println();
        System.out.println("» Status Atual do Ouro = $" + compraHeroi.getOuroHeroi());
        System.out.println("[ 0 ] - Para Sair:");
        System.out.print("» Qual item deseja comprar acima? ");
        indexItemEscolhido = input.nextInt();

        if (indexItemEscolhido == 0) {
            return false;
        }

        if (indexItemEscolhido < 0 || indexItemEscolhido >= this.itensLoja.size()) {
            System.err.println("\t\t\t*** Opção inválida ***");
            return false;
        }

        ItemHeroi itemEscolhido = this.itensLoja.get(indexItemEscolhido);
        int valorItem = itemEscolhido.getPrecoItemHeroi();

        System.out.println("\n" + compraHeroi.getNomeEntidade() + " vai tentar comprar: " + itemEscolhido.getNomeItemHeroi());
        System.out.println("Ouro Herói: " + compraHeroi.getOuroHeroi() + " | Custo Item: " + valorItem);

        if (compraHeroi.getOuroHeroi() < valorItem) {
            System.out.println("Ouro de " + compraHeroi.getNomeEntidade() + " Insuficiente para compra do Item ");
            return false;
        }

        if (this.itensLoja.isEmpty()) {
            System.out.println("Sem Itens no Momento!!");
            return false;
        }


        // forEach ArrayList<ItemHeroi> para Validar tipo do item com tipo do heroi / jogador:
        for (String heroiPermitido : itemEscolhido.getItemHeroiPermitido()) {

            if (compraHeroi.getTipoHeroi().equals(heroiPermitido)) {
                if (itemEscolhido instanceof Consumivel) {
                    compraHeroi.getInventarioHeroi().add((Consumivel) itemEscolhido);
                } else if (itemEscolhido instanceof ArmaPrincipal) {
                    compraHeroi.setArmaPrincipalHeroi((ArmaPrincipal) itemEscolhido);
                }

                compraHeroi.setOuroHeroi(compraHeroi.getOuroHeroi() - valorItem);
                System.out.println("\n» Compra feita com Sucesso!! " + itemEscolhido.getNomeItemHeroi());

                this.itensLoja.remove(indexItemEscolhido);
                return true;
            }
        }
        return false;
    }
}
