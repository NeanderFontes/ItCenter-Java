package RPG.Jogo;

import RPG.Entidades.NPC;
import RPG.Entidades.Personagens.Aprendiz;
import RPG.Entidades.Personagens.Arqueiro;
import RPG.Entidades.Personagens.Espadachim;
import RPG.Entidades.Personagens.Gatuno;
import RPG.Item.AbstractClass.ItemHeroi;
import RPG.Item.ArmaPrincipal;

public class TesteLuta {
    public static void main(String[] args) {
        ArmaPrincipal faca = new ArmaPrincipal("Faca de Iniciante", 0, 10, 12);
        Aprendiz novoAprendiz = new Aprendiz("Aprendiz Eterno", 50,10);
        //novoAprendiz.exibirDetalhes();
        Gatuno assassinCred = new Gatuno("Assassin´s Cred", 100,100);
        //assassinCred.exibirDetalhes();

        ArmaPrincipal facaNPC = new ArmaPrincipal("Faca NPC", 10,12,12);
        facaNPC.addHeroiPermitido("Arqueiro");

        NPC testeNPC = new NPC("Teste",400,10,10);
        testeNPC.addInventarioNPC(facaNPC);

        //Teste de Luta para Arqueiro:
        Arqueiro robinHood = new Arqueiro("Robin Hood", 100, 100);
        ItemHeroi arco = new ArmaPrincipal("Arco", 60, 60, 110);
        arco.addHeroiPermitido("Arqueiro");
        robinHood.setArmaPrincipalHeroi((ArmaPrincipal) arco);
        robinHood.exibirDetalhes();
        //robinHood.atacar(testeNPC);

        //TEste de Luta para Espadachim:
        Espadachim reiArthur = new Espadachim("Rei Arthur", 100, 100);
        ItemHeroi espada = new ArmaPrincipal("Espada", 60, 60, 110);
        espada.addHeroiPermitido("Espadachim");
        reiArthur.setArmaPrincipalHeroi((ArmaPrincipal) espada);
        reiArthur.exibirDetalhes();
        reiArthur.atacar(testeNPC);
    }
}
