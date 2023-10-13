package RPG.Jogo;

import java.util.ArrayList;

public class Jogo {
    private String nomeJogo;
    private int indexAtualSalaDoJogo;
    private ArrayList<SalaDeJogo> salasJogo;

    /**
     * Método Construtor do Jogo:
     *
     * @param nomeJogo - Nome Para Criação do Jogo.
     */
    public Jogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
        this.indexAtualSalaDoJogo = 0;
        this.salasJogo = new ArrayList<>();
    }
}
