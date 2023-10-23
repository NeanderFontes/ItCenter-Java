package RPG.TestesMain;

import RPG.Entidades.NPC;
import RPG.Entidades.Personagens.Espadachim;
import RPG.Item.AbstractClass.Consumivel;
import RPG.Item.AbstractClass.ItemHeroi;
import RPG.Item.ArmaPrincipal;
import RPG.Item.ConsumivelCombate;

public class TesteLutaEspadachim {
    public static void main(String[] args) {
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

        //Instancia do Heroi Espadachim:
        Espadachim reiArthur = new Espadachim("Rei Arthur", 100, 100);

        //Instancia do Heroi:
        espada.addHeroiPermitido("Espadachim");

        //Permissões para o Heroi:
        facaNPC.addHeroiPermitido(reiArthur.getTipoHeroi());
        pilulaDeCombate.addHeroiPermitido(reiArthur.getTipoHeroi());
        reiArthur.adicionarInventarioHeroi(pocaoDoFuror);
        reiArthur.adicionarInventarioHeroi(bombaAcida);
        reiArthur.adicionarInventarioHeroi(pilulaDeCombate);
        reiArthur.adicionarInventarioHeroi(venenoMortal);
        reiArthur.adicionarInventarioHeroi(pilulaDeCombate);

        //Adicionar Arma ao Heroi:
        reiArthur.setArmaPrincipalHeroi((ArmaPrincipal) espada);

        //Exibir Detalhes Antes da Luta:
        reiArthur.exibirDetalhes();

        //Começo da Batalha
        reiArthur.atacar(testeNPC);
        System.out.println("FIM do Teste Luta");
    }
}
