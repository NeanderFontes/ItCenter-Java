package RPG.Item.AbstractClass;

import java.util.ArrayList;

public abstract class ItemHeroi {
    private String nomeItemHeroi;
    private int precoItemHeroi;
    private ArrayList<String> itemHeroiPermitido;

    /**
     * Método Construtor da Abstract SuperClass <b>ItemHeroi</b>
     *
     * @param nomeItemHeroi  - Nome do Item
     * @param precoItemHeroi - Preço do Item
     */
    public ItemHeroi(String nomeItemHeroi, int precoItemHeroi) {
        this.nomeItemHeroi = nomeItemHeroi;
        this.precoItemHeroi = precoItemHeroi;
        this.itemHeroiPermitido = new ArrayList<>();
    }

    /**
     * Método Abstrato para Mostra Detalhe dos Itens
     */
    public void exibirDetalhesItemHeroi() {
        System.out.println("nomeItemHeroi='" + nomeItemHeroi + '\'' +
                ", precoItemHeroi=" + precoItemHeroi +
                ", itemHeroiPermitido=" + itemHeroiPermitido);
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

    /**
     * Método para Adicionar ao Herói
     * @param heroiPermitido - Personagens que são permitidos
     */
    public void addHeroiPermitido(String heroiPermitido){
        this.itemHeroiPermitido.add(heroiPermitido);
    }

    public ArrayList<String> getItemHeroiPermitido() {
        return this.itemHeroiPermitido;
    }

    public void setItemHeroiPermitido(ArrayList<String> itemHeroiPermitido) {
        this.itemHeroiPermitido = itemHeroiPermitido;
    }

    public int getPrecoItemHeroi() {
        return precoItemHeroi;
    }

    public void setPrecoItemHeroi(int precoItemHeroi) {
        this.precoItemHeroi = precoItemHeroi;
    }

}
