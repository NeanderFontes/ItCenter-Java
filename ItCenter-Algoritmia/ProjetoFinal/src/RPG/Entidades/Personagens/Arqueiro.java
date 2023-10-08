package RPG.Entidades.Personagens;

import RPG.Entidades.Heroi;
import RPG.Entidades.NPC;

public class Arqueiro extends Heroi {

    /**
     * Método Construtor Arqueiro da Abstract SuperClass <b>Heroi</b>
     *
     * @param nomeEntidade  - Nome do Arqueiro
     * @param vidaEntidade  - Total de Vida do Arqueiro
     * @param forcaEntidade - Total de Força de Ataque do Arqueiro
     */
    public Arqueiro(String nomeEntidade, int vidaEntidade, int forcaEntidade) {
        super(nomeEntidade, vidaEntidade, forcaEntidade);
    }

    /**
     * Método @Override Adaptado ao Arqueiro para Atacar um NPC
     * Arqueiro tem Prioridade de Ataque por usar ataque a distância.
     * Se o Arqueiro ganhar a batalha: Nivel +1, +5% de HP e +3% de Força.
     * @param oponenteNPC - Recebe como Parâmetro o Npc para Batalha
     */
    @Override
    public void atacar(NPC oponenteNPC) {
        //Declaração de variáveis do escopo:
        int qtRoud = 0;
        int hpNPC = oponenteNPC.getVidaEntidade();
        int hpPersonagem = this.getVidaEntidade();

        //Prioridade de ataque do Arqueiro:
        System.out.println("Prioridade de Ataque de " + this.getNomeEntidade());
        do {
            System.out.println("======== ROUND " + qtRoud++ + "========");
            //Simulação de ataque do Arqueiro:
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
        if (getVidaEntidade() <= 0) { //Perder Batalha
            System.out.println(getNomeEntidade() + "Infelizmente Perdeu a Luta");
        } else { //Ganhar Batalha
            System.out.println(getNomeEntidade() + " É o Vencedor!!!");
            //Aumenta Nivel + 1:
            this.setNivelHeroi(getNivelHeroi() + 1);

            //Aumenta HP em 5%:
            int aumentoVida = (getVidaEntidade() * 5) / 100;
            this.setVidaEntidade(getVidaEntidade() + aumentoVida);

            //AUmenta Força em 2%:
            int aumentoForca = (getForcaEntidade() * 2 / 100);
            this.setForcaEntidade(getForcaEntidade() + aumentoForca);
        }
    }
}
