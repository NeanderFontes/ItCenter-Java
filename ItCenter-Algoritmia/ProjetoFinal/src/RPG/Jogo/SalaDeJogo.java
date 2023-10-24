package RPG.Jogo;

import RPG.Entidades.Heroi;
import RPG.Entidades.NPC;
import RPG.Entidades.Personagens.Aprendiz;
import RPG.Entidades.VendedorJogo.Vendedor;
import RPG.Item.AbstractClass.Consumivel;
import RPG.Item.AbstractClass.ItemHeroi;
import RPG.Item.ArmaPrincipal;
import RPG.Item.ConsumivelCombate;

import java.util.ArrayList;
import java.util.Objects;

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



    private void boasVindas(Heroi jogadorAtual) {
        System.out.println("Em um mundo repleto de magia e mistério, " +
                "um jovem aprendiz chamado \n" + jogadorAtual.getNomeEntidade() + " embarca em uma jornada épica em busca de poder e glória. " +
                "\nO reino de Fantasy onde é conhecido por seus inúmeros desafios e segredos mágicos.\n");
    }

    public void adicionarSalaConectada(Integer id) {
        this.idSalaConectada.add(this.id);
    }


    public void start(Heroi jogador) {
        //Invocação de boas vindas:
        boasVindas(jogador);

        //Regras do Jogo:

        //ArrayList para criar relação com as salas de jogo:
        

        //Istancia de Armas pra teste:
        ItemHeroi facaNPC = new ArmaPrincipal("Faca NPC", 10, 12, 12);
        ItemHeroi espada = new ArmaPrincipal("Espada", 60, 60, 110);

        //Instancia de NPC para teste:
        NPC testeNPC = new NPC("Teste", 400, 10, 10);

        //Adicionando Arma ao inventario do NPC:
        testeNPC.addInventarioNPC((ArmaPrincipal) facaNPC);

        //Instância de Consumiveis para teste:
        Consumivel pilulaDeCombate = new ConsumivelCombate("Pilura de Combate", 10, 50);
        Consumivel pocaoDoFuror = new ConsumivelCombate("Poção do Furor", 10, 20);
        Consumivel bombaAcida = new ConsumivelCombate("Bomba Ácida", 10, 20);
        Consumivel venenoMortal = new ConsumivelCombate("Veneno Mortal", 10, 20);

        //Instancia do Heroi Aprendiz:
        // em vez de usar o aprendriz, vai usar o paramentro Heroi
        //Aprendiz aprendiz = new Aprendiz("Aprendiz", 100, 100);

        //Instancia do Heroi:
        espada.addHeroiPermitido("Aprendiz");

        //Permissões para o Heroi:
        facaNPC.addHeroiPermitido(jogador.getTipoHeroi());
        pilulaDeCombate.addHeroiPermitido(jogador.getTipoHeroi());
        jogador.adicionarInventarioHeroi(pocaoDoFuror);
        jogador.adicionarInventarioHeroi(bombaAcida);
        jogador.adicionarInventarioHeroi(pilulaDeCombate);
        jogador.adicionarInventarioHeroi(venenoMortal);
        jogador.adicionarInventarioHeroi(pilulaDeCombate);

        //Adicionar Arma ao Heroi::
        jogador.setArmaPrincipalHeroi((ArmaPrincipal) espada);

        //Exibir Detalhes Antes da Luta:
        jogador.exibirDetalhes();

        //Começo da Batalha
        jogador.atacar(testeNPC);
        System.out.println("FIM do Teste Luta");

    }

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
