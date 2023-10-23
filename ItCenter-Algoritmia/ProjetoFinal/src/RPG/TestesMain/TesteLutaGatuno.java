package RPG.TestesMain;

import RPG.Entidades.NPC;
import RPG.Entidades.Personagens.Arqueiro;
import RPG.Entidades.Personagens.Gatuno;
import RPG.Item.AbstractClass.Consumivel;
import RPG.Item.AbstractClass.ItemHeroi;
import RPG.Item.ArmaPrincipal;
import RPG.Item.ConsumivelCombate;

public class TesteLutaGatuno {
    public static void main(String[] args) {
        //Istancia de Armas pra teste:
        ItemHeroi facaNPC = new ArmaPrincipal("Faca NPC", 10, 12, 12);
        ItemHeroi punhal = new ArmaPrincipal("Punhal", 60, 60, 110);

        //Instancia de NPC para teste:
        NPC testeNPC = new NPC("Teste", 400, 10, 10);

        //Adicionando Arma ao inventario do NPC:
        testeNPC.addInventarioNPC((ArmaPrincipal) facaNPC);

        //Instância de Consumiveis para teste:
        Consumivel pilulaDeCombate = new ConsumivelCombate("Pilura de Combate", 10, 50);
        Consumivel pocaoDoFuror = new ConsumivelCombate("Poção do Furor", 10, 20);
        Consumivel bombaAcida = new ConsumivelCombate("Bomba Ácida", 10, 20);
        Consumivel venenoMortal = new ConsumivelCombate("Veneno Mortal", 10, 20);

        //Instancia do Heroi Gatuno:
        Gatuno gatuno = new Gatuno("Gatuno", 100, 100);

        //Instancia do Heroi:
        punhal.addHeroiPermitido("Gatuno");

        //Permissões para o Heroi:
        facaNPC.addHeroiPermitido(gatuno.getTipoHeroi());
        pilulaDeCombate.addHeroiPermitido(gatuno.getTipoHeroi());
        gatuno.adicionarInventarioHeroi(pocaoDoFuror);
        gatuno.adicionarInventarioHeroi(bombaAcida);
        gatuno.adicionarInventarioHeroi(pilulaDeCombate);
        gatuno.adicionarInventarioHeroi(venenoMortal);
        gatuno.adicionarInventarioHeroi(pilulaDeCombate);

        //Adicionar Arma ao Heroi::
        gatuno.setArmaPrincipalHeroi((ArmaPrincipal) punhal);

        //Exibir Detalhes Antes da Luta:
        gatuno.exibirDetalhes();

        //Começo da Batalha
        gatuno.atacar(testeNPC);
        System.out.println("FIM do Teste Luta");


    }
}
