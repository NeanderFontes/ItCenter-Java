package RPG.Jogo;

import RPG.Entidades.Personagens.Aprendiz;
import RPG.Entidades.Personagens.Gatuno;
import RPG.Item.ArmaPrincipal;

public class TesteLuta {
    public static void main(String[] args) {
        ArmaPrincipal faca = new ArmaPrincipal("Faca de Iniciante", 0, 10, 12);
        Aprendiz novoAprendiz = new Aprendiz("Aprendiz Eterno", 50,10);
        novoAprendiz.exibirDetalhes();
        Gatuno assassinCred = new Gatuno("Assassin´s Cred", 100,100);
        assassinCred.exibirDetalhes();
    }
}
