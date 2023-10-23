package RPG.TestesMain;

import RPG.Entidades.NPC;
import RPG.Entidades.Personagens.Mago;
import RPG.Entidades.Personagens.Novico;
import RPG.Item.AbstractClass.Consumivel;
import RPG.Item.AbstractClass.ItemHeroi;
import RPG.Item.ArmaPrincipal;
import RPG.Item.ConsumivelCombate;

public class TesteLutaNovico {
    public static void main(String[] args) {
        //Istancia de Armas pra teste:
        ItemHeroi facaNPC = new ArmaPrincipal("Faca NPC", 10, 12, 12);
        ItemHeroi bastao = new ArmaPrincipal("Bastão", 60, 60, 110);

        //Instancia de NPC para teste:
        NPC testeNPC = new NPC("Teste", 400, 10, 10);

        //Adicionando Arma ao inventario do NPC:
        testeNPC.addInventarioNPC((ArmaPrincipal) facaNPC);

        //Instância de Consumiveis para teste:
        Consumivel pilulaDeCombate = new ConsumivelCombate("Pilura de Combate", 10, 50);
        Consumivel pocaoDoFuror = new ConsumivelCombate("Poção do Furor", 10, 20);
        Consumivel bombaAcida = new ConsumivelCombate("Bomba Ácida", 10, 20);
        Consumivel venenoMortal = new ConsumivelCombate("Veneno Mortal", 10, 20);

        //Instancia do Heroi Mago:
        Novico novico = new Novico("Novico", 100, 100);

        //Instancia do Heroi:
        bastao.addHeroiPermitido("Novico");

        //Permissões para o Heroi:
        facaNPC.addHeroiPermitido(novico.getTipoHeroi());
        pilulaDeCombate.addHeroiPermitido(novico.getTipoHeroi());
        novico.adicionarInventarioHeroi(pocaoDoFuror);
        novico.adicionarInventarioHeroi(bombaAcida);
        novico.adicionarInventarioHeroi(pilulaDeCombate);
        novico.adicionarInventarioHeroi(venenoMortal);
        novico.adicionarInventarioHeroi(pilulaDeCombate);

        //Adicionar Arma ao Heroi::
        novico.setArmaPrincipalHeroi((ArmaPrincipal) bastao);

        //Exibir Detalhes Antes da Luta:
        novico.exibirDetalhes();

        //Começo da Batalha
        novico.atacar(testeNPC);
        System.out.println("FIM do Teste Luta");


    }
}
