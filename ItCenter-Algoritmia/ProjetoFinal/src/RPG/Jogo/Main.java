package RPG.Jogo;

import RPG.Entidades.Heroi;

public class Main {
    public static void main(String[] args) {
        Jogo novoJogo = new Jogo();

        Heroi criarPersonagem = novoJogo.criarPersonagem();

        novoJogo.fantasy(criarPersonagem);

    }
}
