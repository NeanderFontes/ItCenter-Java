package RPG.Entidades.Personagens;

import RPG.Entidades.Heroi;
import RPG.Entidades.NPC;
import RPG.Item.AbstractClass.ItemHeroi;
import RPG.Item.Pocao;

public class Aprendiz extends Heroi {

    /**
     * Método Construtor Aprendiz da Abstract SuperClass <b>Heroi</b>
     *
     * @param nomeEntidade  - Nome do Aprendiz
     * @param vidaEntidade  - Total de Vida do Aprendiz
     * @param forcaEntidade - Total de Força de Ataque do Aprendiz
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
     * Aprendiz tem Prioridade de Ataque e ao ganhar recebe +10% de HP e Força
     *
     * @param oponenteNPC - Recebe como Parâmetro o Npc para Batalha
     */
    @Override
    public void atacar(NPC oponenteNPC) {
        //Declaração de variáveis do escopo:
        int qtRoud = 0;
        int hpNPC = oponenteNPC.getVidaEntidade();
        int hpPersonagem = this.getVidaEntidade();

        //Caso Aprendiz esteja Nível 12 Escolher Outra SubClasse para continuar labirinto...
        if (this.getVidaEntidade() >= 12) {
            System.out.println(this.getTipoHeroi() + "Já está bem Treinado! Siga Caminho...");
            System.out.println("Está na hora de definir o seu destino.");
        } else {
            //Prioridade de ataque do Aprendiz:
            System.out.println("Prioridade de Ataque de " + this.getNomeEntidade());
            do {
                System.out.println("======== ROUND " + qtRoud++ + "========");
                //Simulação de ataque do Aprendiz:
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
}
