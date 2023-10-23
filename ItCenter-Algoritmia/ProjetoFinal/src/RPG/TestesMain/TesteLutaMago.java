package RPG.TestesMain;

import RPG.Entidades.NPC;
import RPG.Entidades.Personagens.Gatuno;
import RPG.Entidades.Personagens.Mago;
import RPG.Item.AbstractClass.Consumivel;
import RPG.Item.AbstractClass.ItemHeroi;
import RPG.Item.ArmaPrincipal;
import RPG.Item.ConsumivelCombate;

public class TesteLutaMago {
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
        Mago mago = new Mago("Mago", 100, 100);

        //Instancia do Heroi:
        bastao.addHeroiPermitido("Mago");

        //Permissões para o Heroi:
        facaNPC.addHeroiPermitido(mago.getTipoHeroi());
        pilulaDeCombate.addHeroiPermitido(mago.getTipoHeroi());
        mago.adicionarInventarioHeroi(pocaoDoFuror);
        mago.adicionarInventarioHeroi(bombaAcida);
        mago.adicionarInventarioHeroi(pilulaDeCombate);
        mago.adicionarInventarioHeroi(venenoMortal);
        mago.adicionarInventarioHeroi(pilulaDeCombate);

        //Adicionar Arma ao Heroi::
        mago.setArmaPrincipalHeroi((ArmaPrincipal) bastao);

        //Exibir Detalhes Antes da Luta:
        mago.exibirDetalhes();

        //Começo da Batalha
        mago.atacar(testeNPC);
        System.out.println("FIM do Teste Luta");


    }
}
