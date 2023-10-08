package RPG.Entidades.Personagens;

import RPG.Entidades.Heroi;
import RPG.Entidades.NPC;
import RPG.Item.AbstractClass.ItemHeroi;

public class Espadachim extends Heroi {

    /**
     * Método Construtor Espadachim da Abstract SuperClass <b>Heroi</b>
     *
     * @param nomeEntidade  - Nome do Espadachim
     * @param vidaEntidade  - Total de Vida do Espadachim
     * @param forcaEntidade - Total de Força de Ataque do Espadachim
     */
    public Espadachim(String nomeEntidade, int vidaEntidade, int forcaEntidade) {
        super(nomeEntidade, vidaEntidade, forcaEntidade);
    }

    /**
     * Método @Override Adaptado ao Espadachim para Atacar um NPC
     * Espadachim por ter melhor amardura recebe 80% de Dano ao Ataque do NPC...
     * ...que por sua vez tem prioridade de ataque!
     * Se o Espadachim ganhar a batalha: Nivel +1, +5% de HP e +5% de Força.
     *
     * @param oponenteNPC - Recebe como Parâmetro o Npc para Batalha
     */
    @Override
    public void atacar(NPC oponenteNPC) {
        //Declaração de variáveis do escopo:
        int qtRoud = 0;
        int hpNPC = oponenteNPC.getVidaEntidade();
        int hpPersonagem = this.getVidaEntidade();

        //Prioridade de ataque do NPC:
        System.out.println("Prioridade de Ataque de " + this.getNomeEntidade());
        do {
            System.out.println("======== ROUND " + qtRoud++ + "========");
            //Simulação de ataque do NPC:
            if (hpPersonagem >= 0) {
                hpPersonagem -= oponenteNPC.getForcaEntidade();
                System.out.println("Hp Atual do " + this.getNomeEntidade() + " = " + hpPersonagem + " hp.");
            }

            //Simulação de ataque do Espadachim:
            if (hpNPC >= 0) {
                hpNPC -= this.getForcaEntidade();
                //Utilização do setter:
                //npcGamer.setVidaEntidade(npcGamer.getVidaEntidade()-this.getForcaEntidade());
                System.out.println("Hp Atual do " + oponenteNPC.getNomeEntidade() + " = " + hpNPC + " hp.");
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

            //AUmenta Força em 5%:
            int aumentoForca = (getForcaEntidade() * 5 / 100);
            this.setForcaEntidade(getForcaEntidade() + aumentoForca);
        }
    }
}
