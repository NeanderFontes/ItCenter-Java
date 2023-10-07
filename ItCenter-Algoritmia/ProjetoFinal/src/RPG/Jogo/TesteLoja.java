package RPG.Jogo;

import RPG.Entidades.Heroi;
import RPG.Entidades.Personagens.Gatuno;
import RPG.Entidades.VendedorJogo.Vendedor;
import RPG.Item.AbstractClass.ItemHeroi;
import RPG.Item.ArmaPrincipal;
import RPG.Item.ConsumivelCombate;
import RPG.Item.Pocao;

public class TesteLoja {
    public static void main(String[] args) {

        // Heroi
        Heroi ezio = new Gatuno("Ezio",100,8);

        //Instância de Armas para "Aprendiz":
        ItemHeroi faca = new ArmaPrincipal("Faca de Aprendiz",0,10,15);
        faca.addHeroiPermitido("Aprendiz");
        faca.addHeroiPermitido("Arqueiro");
        faca.addHeroiPermitido("Espadachim");
        faca.addHeroiPermitido("Gatuno");
        faca.addHeroiPermitido("Mago");
        faca.addHeroiPermitido("Mercador");
        faca.addHeroiPermitido("Novico");


        //Instância e Permissão de Armas para "Arqueiro":
        ItemHeroi arco = new ArmaPrincipal("Arco", 60, 60, 110);
        ItemHeroi arcoGrande = new ArmaPrincipal("Arco Grande", 70, 70, 120);
        ItemHeroi arbaleste = new ArmaPrincipal("Arbaleste", 80, 80, 130);
        ItemHeroi gakkung = new ArmaPrincipal("Gakkung", 90, 90, 140);
        ItemHeroi arcoCaca = new ArmaPrincipal("Arco de Caça", 100, 100, 150);
        arco.addHeroiPermitido("Arqueiro");
        arcoGrande.addHeroiPermitido("Arqueiro");
        arbaleste.addHeroiPermitido("Arqueiro");
        gakkung.addHeroiPermitido("Arqueiro");
        arcoCaca.addHeroiPermitido("Arqueiro");


        //Instância e Permissão de Armas para "Espadachim":
        ItemHeroi espada = new ArmaPrincipal("Espada", 60, 60, 110);
        ItemHeroi katana = new ArmaPrincipal("Kataná", 70, 70, 120);
        ItemHeroi espadaBastarda = new ArmaPrincipal("Espada Bastarda", 80, 80, 130);
        ItemHeroi espada2maos = new ArmaPrincipal("Espada de Duas Mãos", 90, 90, 140);
        ItemHeroi laminaSagrada = new ArmaPrincipal("Lâmina Sagrada", 100, 100, 150);
        espada.addHeroiPermitido("Espadachim");
        katana.addHeroiPermitido("Espadachim");
        espadaBastarda.addHeroiPermitido("Espadachim");
        espada2maos.addHeroiPermitido("Espadachim");
        laminaSagrada.addHeroiPermitido("Espadachim");


        //Instância e Permissão de Armas para "Gatuno":
        ItemHeroi punhal = new ArmaPrincipal("Punhal",60, 60, 110);
        ItemHeroi manGauche = new ArmaPrincipal("Main Gauche", 70, 70, 120);
        ItemHeroi stiletto = new ArmaPrincipal("Stiletto",80, 80, 130);
        ItemHeroi gladius = new ArmaPrincipal("Gladius", 90, 90, 140);
        ItemHeroi damascus = new ArmaPrincipal("Damascus", 100,100, 150);
        punhal.addHeroiPermitido("Gatuno");
        manGauche.addHeroiPermitido("Gatuno");
        stiletto.addHeroiPermitido("Gatuno");
        gladius.addHeroiPermitido("Gatuno");
        damascus.addHeroiPermitido("Gatuno");


        //Instância e permissão de Armas para "Mago":
        ItemHeroi bastao = new ArmaPrincipal("Bastão", 60, 60, 110);
        ItemHeroi varinhaMagica = new ArmaPrincipal("Varinha Mágica", 70, 70, 120);
        ItemHeroi bastaoSobrevivente = new ArmaPrincipal("Bastão do Sobrevivente", 80, 80, 130);
        ItemHeroi cajadoAncestral = new ArmaPrincipal("Cajado Ancestral", 90, 90, 140);
        ItemHeroi cajadoFeiticeiro = new ArmaPrincipal("Cajado do Feiticeiro", 100, 100, 150);
        bastao.addHeroiPermitido("Mago");
        varinhaMagica.addHeroiPermitido("Mago");
        bastaoSobrevivente.addHeroiPermitido("Mago");
        cajadoAncestral.addHeroiPermitido("Mago");
        cajadoFeiticeiro.addHeroiPermitido("Mago");


        //Instância e Permissão de Armas para "Mercador":
        ItemHeroi machado = new ArmaPrincipal("Machado", 60, 60, 110);
        ItemHeroi machadoBatalha = new ArmaPrincipal("Machado de Batalha", 70, 70, 120);
        ItemHeroi marreta = new ArmaPrincipal("Marreta", 80, 80, 130);
        ItemHeroi demolidor = new ArmaPrincipal("Demolidor", 90, 90, 140);
        ItemHeroi machado2Maos = new ArmaPrincipal("Machado de Duas Mãos", 100, 100, 150);
        machado.addHeroiPermitido("Mercador");
        machadoBatalha.addHeroiPermitido("Mercador");
        marreta.addHeroiPermitido("Mercador");
        demolidor.addHeroiPermitido("Mercador");
        machado2Maos.addHeroiPermitido("Mercador");


        //Instância e Permissão de Armas para "Noviço":
        ItemHeroi cajado = new ArmaPrincipal("Cajado", 70, 70, 120);
        ItemHeroi rosario = new ArmaPrincipal("Rosário", 80, 80, 130);
        ItemHeroi cetro = new ArmaPrincipal("Cetro", 90, 90, 140);
        ItemHeroi cajadoSarcerdote = new ArmaPrincipal("Cajado do Sarcerdote", 100, 100, 150);
        bastao.addHeroiPermitido("Novico");
        cajado.addHeroiPermitido("Novico");
        rosario.addHeroiPermitido("Novico");
        cetro.addHeroiPermitido("Novico");
        cajadoSarcerdote.addHeroiPermitido("Novico");



        ItemHeroi arcoCacador = new ArmaPrincipal("Arco de Caçador",12,2,5);
        arcoCacador.addHeroiPermitido("Arqueiro");

        ItemHeroi bombaFumo = new ConsumivelCombate("Bomba Fumo",4,7);
        bombaFumo.addHeroiPermitido("Gatuno");

        ItemHeroi superBock = new Pocao("Super Bock Mini",1,4,10);
        superBock.addHeroiPermitido("Arqueiro");
        superBock.addHeroiPermitido("Espadachim");
        superBock.addHeroiPermitido("Gatuno");
        superBock.addHeroiPermitido("Mago");
        superBock.addHeroiPermitido("Mercador");

        Vendedor vendedorRPG = new Vendedor();
        vendedorRPG.adicionarStock(arcoCacador);
        vendedorRPG.adicionarStock(faca);
        vendedorRPG.adicionarStock(bombaFumo);
        vendedorRPG.adicionarStock(superBock);

        vendedorRPG.venderItem(ezio);
    }
}
