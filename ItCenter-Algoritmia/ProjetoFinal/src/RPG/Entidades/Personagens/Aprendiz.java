package RPG.Entidades.Personagens;

import RPG.Entidades.Heroi;
import RPG.Entidades.NPC;
import RPG.Item.AbstractClass.ItemHeroi;
import RPG.Item.Pocao;

public class Aprendiz extends Heroi {

    /**
     * Método Construtor Aprendiz da Abstract SuperClass <b>Heroi</b>
     *
     * @param nomeEntidade       - Nome do Aprendiz
     * @param vidaEntidade       - Total de Vida do Aprendiz
     * @param forcaEntidade      - Total de Força de Ataque do Aprendiz
     */
    public Aprendiz(String nomeEntidade, int vidaEntidade, int forcaEntidade) {
        super(nomeEntidade, vidaEntidade, forcaEntidade);

    }

    /**
     * Método para o Herói Usar Poção
     */
    public void usarPocao(ItemHeroi usarPocao) {
        usarPocao.getNomeItemHeroi();
    }

    /**
     * Método @Override Adaptado ao Aprendiz para Atacar um NPC
     *
     * @param oponenteNPC - Recebe como Parâmetro o Npc para Batalha
     */
    @Override
    public void atacar(NPC oponenteNPC) {
        //Declaração de variáveis:
        int qtRoud = 0;
        int hpNPC = oponenteNPC.getVidaEntidade();
        int hpPersonagem = this.getVidaEntidade();

        //Chamda de função para apresentar os Oponentes:
        System.out.println("Prioridade de Ataque de " + this.getNomeEntidade());
        do {
            System.out.println("======== ROUND " + qtRoud++);
            //Simulação de ataque do Personagem:
            if (hpNPC >= 0) {
                hpNPC -= this.getForcaEntidade();
                //Utilização do setter:
                //npcGamer.setVidaEntidade(npcGamer.getVidaEntidade()-this.getForcaEntidade());
                System.out.println("Hp Atual do " + oponenteNPC.getNomeEntidade() + " = " + hpNPC + " hp.");
            }
            //Simulação de ataque do NPC:
            if (hpPersonagem >= 0) {
                hpPersonagem -= oponenteNPC.getForcaEntidade();
                System.out.println("Hp Atual do " + this.getNomeEntidade() + " = " + hpPersonagem + " hp.");
            }

            //Laço executável até a Quantidade de HP de algum dos oponentes acabar.
        } while (hpNPC >= 0 && hpPersonagem >= 0);

        //Dados do Vencedor da Batalha:
        if (getVidaEntidade() <= 0) {
            System.out.println(getNomeEntidade() + "Infelizmente Perdeu a Luta");
        } else {
            System.out.println(getNomeEntidade() + " É o Vencedor!!!");
            this.setNivelHeroi(getNivelHeroi() + 1);
            int aumentoVida = (getVidaEntidade() * 10) / 100;
            this.setVidaEntidade(getVidaEntidade() + aumentoVida);
            int aumentoForca = (getForcaEntidade() * 10 / 100);
            this.setForcaEntidade(getForcaEntidade() + aumentoForca);
        }
    }
}
