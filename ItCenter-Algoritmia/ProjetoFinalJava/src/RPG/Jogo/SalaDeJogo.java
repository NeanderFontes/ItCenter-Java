package RPG.Jogo;

import RPG.Entidades.NPC;
import RPG.Entidades.VendedorJogo.Vendedor;
import RPG.Item.AbstractClass.ItemHeroi;

import java.util.ArrayList;

public class SalaDeJogo {
    private String nomeSala;
    private int id;
    private ArrayList<Integer> idSalaConectada;
    private ArrayList<NPC> inimigoNaSala;
    private ArrayList<ItemHeroi> itemPerdido;
    private Vendedor vendedorPresente;
    private int danoArmadilha;
    private int ouroPerdido;

    public SalaDeJogo(String nomeSala, int id) {
        this.nomeSala = nomeSala;
        this.id = id;
        this.idSalaConectada = new ArrayList<>();
        this.inimigoNaSala = new ArrayList<>();
        this.itemPerdido = new ArrayList<>();
        this.vendedorPresente = new Vendedor();
        this.danoArmadilha = 0;
        this.ouroPerdido = 0;
    }

    public void adicionarSalaConectada(Integer id) {
        this.idSalaConectada.add(id);
    }

    /**
     * Método Para Adicionar NPC em cada Sala Criada.
     * @param addnpc
     */
    public void addNPC(NPC addnpc) {
        this.inimigoNaSala.add(addnpc);
    }

    /**
     * Métodos Getter e Setter
     */
    public String getNomeSala() {
        return nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Integer> getIdSalaConectada() {
        return idSalaConectada;
    }

    public void setIdSalaConectada(ArrayList<Integer> idSalaConectada) {
        this.idSalaConectada = idSalaConectada;
    }

    public ArrayList<NPC> getInimigoNaSala() {
        return inimigoNaSala;
    }

    public void setInimigoNaSala(ArrayList<NPC> inimigoNaSala) {
        this.inimigoNaSala = inimigoNaSala;
    }

    public ArrayList<ItemHeroi> getItemPerdido() {
        return itemPerdido;
    }

    public void setItemPerdido(ArrayList<ItemHeroi> itemPerdido) {
        this.itemPerdido = itemPerdido;
    }

    public Vendedor getVendedorPresente() {
        return vendedorPresente;
    }

    public void setVendedorPresente(Vendedor vendedorPresente) {
        this.vendedorPresente = vendedorPresente;
    }

    public int getDanoArmadilha() {
        return danoArmadilha;
    }

    public void setDanoArmadilha(int danoArmadilha) {
        this.danoArmadilha = danoArmadilha;
    }

    public int getOuroPerdido() {
        return ouroPerdido;
    }

    public void setOuroPerdido(int ouroPerdido) {
        this.ouroPerdido = ouroPerdido;
    }
}
