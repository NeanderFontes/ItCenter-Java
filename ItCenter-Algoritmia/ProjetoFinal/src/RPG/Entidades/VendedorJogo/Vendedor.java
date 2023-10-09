package RPG.Entidades.VendedorJogo;

import RPG.Entidades.Heroi;
import RPG.Entidades.Personagens.Aprendiz;
import RPG.Entidades.Personagens.Gatuno;
import RPG.Item.AbstractClass.Consumivel;
import RPG.Item.AbstractClass.ItemHeroi;

import javax.naming.CompositeName;
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
     * Método para imprimir no console até 10 item aleatorios em stock.
     * "Exibit detalhes"
     */
    public void imprimirLojaVendedor() {
        //Import Biblioteca Random para numeros aleatórios
        //Random random = new Random();

        //Atribuindo biblioteca para sortear no min (10 - size())
        //Ou Math.min(10, this.itensLoja.size());
        //int itensAleatorios = random.nextInt(10, this.itensLoja.size());
        //int indexRandom;

        //Ciclo For para imprimir 10 itens do ArrayList<ItemHeroi>
        //for (int numIndice = 0; numIndice < itensAleatorios; numIndice++) {
        //    indexRandom = random.nextInt(this.itensLoja.size());
        //   System.out.print("Item " + (numIndice + 1) + " - ");
        //    this.itensLoja.get(indexRandom).exibirDetalhesItemHeroi();
        //    System.out.println();
        //}
        //Ciclo para Testes:
        for (int numIndice = 0; numIndice < this.itensLoja.size(); numIndice++) {
            System.out.print("Item " + (numIndice + 1) + " - ");
            this.itensLoja.get(numIndice).exibirDetalhesItemHeroi();
            System.out.println();
        }
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
     * Método para Vender itens para o Herói.
     *
     * @param compraHeroi - Boolean para validar a compra do Heroi
     * @return true se quantidade de ouro é igual ou maior que o valor do item
     * @return false se quantidade de ouro é menor que o valor do item
     */
    public boolean venderItem(Heroi compraHeroi) {
        //Scanner para Entrada de dados:
        Scanner input = new Scanner(System.in);

        //Invocação para imprimir itens da loja
        imprimirLojaVendedor();

        //Escolha do item da loja
        System.out.println("Qual item quer comprar: ");
        int indexItemEscolhido = input.nextInt();

        //Atribuindo index do item escolhido a ItemHeroi
        ItemHeroi itemEscolhido = this.itensLoja.get(indexItemEscolhido);

        //Valor do Item
        int valorItem = itemEscolhido.getPrecoItemHeroi();

        System.out.println("\n" + compraHeroi.getNomeEntidade() + " vai tentar comprar: " + itemEscolhido.getNomeItemHeroi());
        System.out.println("Ouro Heroi: " + compraHeroi.getOuroHeroi() + " | Custo Item: " + itemEscolhido.getPrecoItemHeroi());
        if (compraHeroi.getOuroHeroi() < valorItem) {
            System.out.println("Ouro de " + compraHeroi.getNomeEntidade() + " Insuficiente para compra do Item ");
            return false;
        } else if (this.itensLoja.isEmpty()) {
            System.out.println("Sem Itens no Momento!!");
        } else {

            //ForEach para comparar a Class Herói com a Class dos Personagens
            // ...e percorrer o array de herois permitidos do item escolhido.
            for (String heroiPermitido : itemEscolhido.getItemHeroiPermitido()) {
                System.out.println("Estou a comparar " + compraHeroi.getTipoHeroi() + " com " + heroiPermitido);

                //Validação para o Herói usar arma devida da Subclasse do Personagem
                if ((compraHeroi.getTipoHeroi()).equals(heroiPermitido)) {
                    System.out.println("Compra feita com Sucesso!!");
                    //Subtraindo valor do item ao Ouro total do Herói:
                    compraHeroi.setOuroHeroi(compraHeroi.getOuroHeroi() - valorItem);

                    //Item Adicionado ao Inventário do Herói:
                    compraHeroi.getInventarioHeroi().add((Consumivel) itemEscolhido);

                    //Remover item Loja:
                    this.itensLoja.remove(indexItemEscolhido);
                    return true;
                }
            }
        }
        return false;
    }
}
