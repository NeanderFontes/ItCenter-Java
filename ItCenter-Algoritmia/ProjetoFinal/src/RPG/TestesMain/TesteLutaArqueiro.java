package RPG.TestesMain;

import RPG.Entidades.NPC;
import RPG.Entidades.Personagens.Aprendiz;
import RPG.Entidades.Personagens.Arqueiro;
import RPG.Item.AbstractClass.Consumivel;
import RPG.Item.AbstractClass.ItemHeroi;
import RPG.Item.ArmaPrincipal;
import RPG.Item.ConsumivelCombate;
import RPG.Item.Pocao;

public class TesteLutaArqueiro {
    public static void main(String[] args) {
        //Istancia de Armas pra teste:
        ItemHeroi facaNPC = new ArmaPrincipal("Faca NPC", 10, 12, 12);
        ItemHeroi arco = new ArmaPrincipal("Arco", 60, 60, 110);

        //Instancia de NPC para teste:
        NPC testeNPC = new NPC("Teste", 400, 10, 10);

        //Adicionando Arma ao inventario do NPC:
        testeNPC.addInventarioNPC((ArmaPrincipal) facaNPC);

        //Instância de Consumiveis para teste:
        Consumivel pilulaDeCombate = new ConsumivelCombate("Pilura de Combate", 10, 50);
        Consumivel pocaoDoFuror = new ConsumivelCombate("Poção do Furor", 10, 20);
        Consumivel bombaAcida = new ConsumivelCombate("Bomba Ácida", 10, 20);
        Consumivel venenoMortal = new ConsumivelCombate("Veneno Mortal", 10, 20);

        //Instancia de Poção:
        Consumivel churrascoDeSelvagem = new Pocao("Churrasco de Selvagem", 10, 10, 10);
        Consumivel coquetelUivante = new Pocao("Coquetel Uivante", 10, 10, 10);
        Consumivel carneAoVinho = new Pocao("Carne ao Vinho", 10, 10, 10);
        Consumivel frutoDeYggdrasil = new Pocao("Fruto de Yggdrasil", 10, 10, 10);
        Consumivel bolinhoDivino = new Pocao("Bolinho Divino", 10, 10, 10);



        //Instancia do Heroi Arqueiro:
        Arqueiro arqueiro = new Arqueiro("Arqueiro", 100, 100);

        //Instancia do Heroi:
        arco.addHeroiPermitido("Arqueiro");

        //Permissões para o Heroi:
        facaNPC.addHeroiPermitido(arqueiro.getTipoHeroi());
        pilulaDeCombate.addHeroiPermitido(arqueiro.getTipoHeroi());
        arqueiro.adicionarInventarioHeroi(pocaoDoFuror);
        arqueiro.adicionarInventarioHeroi(bombaAcida);
        arqueiro.adicionarInventarioHeroi(pilulaDeCombate);
        arqueiro.adicionarInventarioHeroi(venenoMortal);
        arqueiro.adicionarInventarioHeroi(pilulaDeCombate);
        arqueiro.adicionarInventarioHeroi(churrascoDeSelvagem);
        arqueiro.adicionarInventarioHeroi(coquetelUivante);
        arqueiro.adicionarInventarioHeroi(carneAoVinho);

        //Adicionando Consumivel ao inventário do NPC:
        //testeNPC.addConsumivelNPC((Consumivel) frutoDeYggdrasil);

        //Adicionar Arma ao Heroi:
        arqueiro.setArmaPrincipalHeroi((ArmaPrincipal) arco);

        //Exibir Detalhes Antes da Luta:
        arqueiro.exibirDetalhes();

        //Começo da Batalha
        arqueiro.atacar(testeNPC);
        arqueiro.heroiUsarPocao();
        arqueiro.exibirDetalhes();
        System.out.println("FIM do Teste Luta");
    }
}
