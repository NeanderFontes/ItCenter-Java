package RPG.Item.AbstractClass;

import java.util.ArrayList;

public abstract class ItemHeroi {
    //todo preço em moedas de ouro (int)
    private String nomeItemHeroi;
    private ArrayList<String> itemHeroiPermitido;

    /**
     * Método Construtor da Abstract Class <b>ItemHeroi</b>
     * @param nomeItemHeroi - Nome do Item
     */
    public ItemHeroi(String nomeItemHeroi) {
        this.nomeItemHeroi = nomeItemHeroi;
        this.itemHeroiPermitido = new ArrayList<>();
    }

    /**
     * Método para Mostra Detalhe dos Itens
     */
    public void mostrarDetalheItem() {
        System.out.println("Os Itens são: " + this.nomeItemHeroi);
    }

    /**
     * Métodos Getter e Setter da Abstract Class <b>ItemHeroi</b>
     */
    public String getNomeItemHeroi() {
        return this.nomeItemHeroi;
    }

    public void setNomeItemHeroi(String nomeItemHeroi) {
        this.nomeItemHeroi = nomeItemHeroi;
    }

    public ArrayList<String> getItemHeroiPermitido() {
        return this.itemHeroiPermitido;
    }

    public void setItemHeroiPermitido(ArrayList<String> itemHeroiPermitido) {
        this.itemHeroiPermitido = itemHeroiPermitido;
    }
}
