package Jogo;

import Jogo.Enum.ClassePersonagem;

import java.util.Random;

/**
 * Implemente um jogo sobre Personagens que enfrentam inimigos perigosos, o objetivo será o jogador
 * definir qual a sua personagem e, seguidamente, jogar contra os inimigos, para isso:
 * b) A classe Personagem terá o atributo nível (int), categoria (ENUM contendo, por exemplo,
 * cavaleiro, mago, arqueiro, etc…) e arma (String).
 */
public class Personagem extends Entidade {
    private String armaPersonagem;
    private int nivelPersonagem;
    private ClassePersonagem classePersonagem;

    /**
     * Método Construtor Personagem da SuperClass <b>Entidade</b>
     *
     * @param nomeEntidade     - Nome do Personagem
     * @param vidaEntidade     - Total de Vida do Personagem (em hp)
     * @param forcaEntidade    - Total de Força do Personagem
     * @param armaPersonagem   - Tipo de Arma que o Personagem usa
     * @param nivelPersonagem  - Nível de Experiência do Personagem (em lvls)
     * @param classePersonagem - Classe do Personagem (ENUM)
     */
    public Personagem(String nomeEntidade, int vidaEntidade, int forcaEntidade, String armaPersonagem, int nivelPersonagem, ClassePersonagem classePersonagem) {
        super(nomeEntidade, vidaEntidade, forcaEntidade);
        this.armaPersonagem = armaPersonagem;
        this.nivelPersonagem = nivelPersonagem;
        this.classePersonagem = classePersonagem;
    }

    public void apresentarAtaque(NPC jogadorNPC) {
        //Função para apresentar os dados dos opnonentes:
        System.out.println("================== STATUS DA LUTA ==================");
        System.out.println("***************** Jogador Principal ****************");
        System.out.println("Jogador Principal: " + this.getNomeEntidade());
        System.out.println("Classe: " + this.getClassePersonagem());
        System.out.println("Level: " + this.getNivelPersonagem());
        System.out.println("Total de HP: " + this.getVidaEntidade());
        System.out.println("Total de For: " + this.getForcaEntidade());
        System.out.println("Arma Principal: " + this.getArmaPersonagem());
        System.out.println("*********************** NPC ************************");
        System.out.println("Jogador NPC: " + jogadorNPC.getNomeEntidade());
        System.out.println("Total de HP: " + jogadorNPC.getVidaEntidade());
        System.out.println("Total de For: " + jogadorNPC.getForcaEntidade());
        System.out.println("====================================================\n");
    }

    /**
     * Métodos Getter
     */
    public void atacar(NPC npcGamer) {
        //Declaração de variáveis:
        int qtRoud = 0;
        int hpNPC = npcGamer.getVidaEntidade();
        int hpPersonagem = this.getVidaEntidade();

        //Chamda de função para apresentar os Oponentes:
        apresentarAtaque(npcGamer);
        System.out.println("Prioridade de Ataque de " + this.getNomeEntidade());
        do {
            System.out.println("======== ROUND " + qtRoud++);
            //Simulação de ataque do Personagem:
            if (hpNPC >= 0) {
                hpNPC -= this.getForcaEntidade();
                //Utilização do setter:
                //npcGamer.setVidaEntidade(npcGamer.getVidaEntidade()-this.getForcaEntidade());
                System.out.println("Hp Atual do " + npcGamer.getNomeEntidade() + " = " + hpNPC + " hp.");
            }
            //Simulação de ataque do NPC:
            if (hpPersonagem >= 0) {
                hpPersonagem -= npcGamer.getForcaEntidade();
                System.out.println("Hp Atual do " + this.getNomeEntidade() + " = " + hpPersonagem + " hp.");
            }

            //Laço executável até a Quantidade de HP de algum dos oponentes acabar.
        } while (hpNPC >= 0 && hpPersonagem >= 0);

        //Dados do Vencedor da Batalha:
        if (getVidaEntidade() <= 0) {
            System.out.println(getNomeEntidade() + "Infelizmente Perdeu a Luta");
        } else {
            System.out.println(getNomeEntidade() + " É o Vencedor!!!");
            this.nivelPersonagem++;
            int aumentoVida = (getVidaEntidade() * 10) / 100;
            this.setVidaEntidade(getVidaEntidade() + aumentoVida);
            int aumentoForca = (getForcaEntidade() * 10 / 100);
            this.setForcaEntidade(getForcaEntidade() + aumentoForca);
        }
    }

    public ClassePersonagem getClassePersonagem() {
        return this.classePersonagem;
    }

    public int getNivelPersonagem() {
        return nivelPersonagem;
    }

    public String getArmaPersonagem() {
        return armaPersonagem;
    }


}
