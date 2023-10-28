package RPG.Entidades.Personagens;

import RPG.Entidades.Heroi;
import RPG.Entidades.NPC;
import RPG.Item.ConsumivelCombate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mago extends Heroi {

    /**
     * Método Construtor Mago da Abstract SuperClass <b>Heroi</b>
     *
     * @param nomeEntidade  - Nome do Mago
     * @param vidaEntidade  - Total de Vida do Mago
     * @param forcaEntidade - Total de Força de Ataque do Mago
     */
    public Mago(String nomeEntidade, int vidaEntidade, int forcaEntidade) {
        super(nomeEntidade, vidaEntidade, forcaEntidade);
    }

    /**
     * Método @Override Adaptado ao Mago para Atacar um NPC
     * O Mago por não ter proteção devida recebe 10% de Dano a mais do ataque do NPC...
     * ... que por sua vez também tem 20% de dano a mais por ser Ataque Mágico
     * Se o Mago ganhar a batalha: Nivel +1, +7% de HP e +2% de Força.
     *
     * @param oponenteNPC - Recebe como Parâmetro o Npc para Batalha
     */
    @Override
    public void atacar(NPC oponenteNPC) throws InterruptedException {
        // Scaner para Entrada de dados:
        Scanner input = new Scanner(System.in);

        // Declaração de variáveis do escopo:
        int qtRoud = 1;
        int hpNPC = oponenteNPC.getVidaEntidade();
        int hpPersonagem = this.getVidaEntidade();
        int opcaoAtaqueHeroi;
        boolean ataqueEspecialUsado = false;

        // Criando variável para aumentar 10% do Ataque do Oponente:
        int aumentarAtaqueOponenteDezPorcento = (oponenteNPC.getForcaEntidade() * 10) / 100;
        // Criando variável para aumentar 20% do Ataque Mágico do Herói Mago:
        int aumentarAtaqueMagicoMago = (getForcaEntidade() * 20) / 100;

        // Prioridade de ataque do Mago:
        System.err.println("\t\t*** Prioridade de Ataque de " + this.getNomeEntidade() + " ***");

        do {
            // Simulação de ataque do Mago:
            System.out.println("======================= ROUND " + qtRoud++ + " ========================");
            System.out.println("[ 1 ]   -   Ataque Normal");
            System.out.println("[ 2 ]   -   Ataque Especial");
            System.out.println("[ 3 ]   -   Usar Consumível de Ataque");
            System.out.println("========================================================");
            System.out.print(this.getNomeEntidade() + "!! Escolha uma Opção de Atk acima: ");

            // Tratamento de Erro para "InputMismatchException" entrada de dados diferente de números:
            try {
                opcaoAtaqueHeroi = input.nextInt();
            } catch (InputMismatchException mismatchException) {
                System.err.println("Erro: Entrada inválida. Certifique-se de digitar um número inteiro.");
                input.next();
                opcaoAtaqueHeroi = 0;
            }

            switch (opcaoAtaqueHeroi) {
                case 1: // Ataque Normal do Mago:
                    System.out.println("\n" + this.getNomeEntidade() + " Usa a(o) " + this.getArmaPrincipalHeroi().getNomeItemHeroi() + " e.......");
                    System.out.println("-==== (*)");
                    Thread.sleep(350);
                    System.out.println("\n\t\t\t-==== (*)");
                    Thread.sleep(350);
                    System.out.println("\n\t\t\t\t\t\t-==== (*)");
                    Thread.sleep(350);
                    System.out.println("\n\t\t\t\t\t\t\t\t\t-=== OUCH!");
                    System.out.println("\t\t\t\tDANO = " + this.getArmaPrincipalHeroi().getAtaqueNormal() + " ATK\n");
                    hpNPC -= this.getForcaEntidade() + this.getArmaPrincipalHeroi().getAtaqueNormal() + aumentarAtaqueMagicoMago;
                    if (hpNPC > 0) {
                        System.out.println("Hp Atual do Oponente " + oponenteNPC.getNomeEntidade() + " = " + hpNPC + " hp.");
                    } else if (hpNPC <= 0) {
                        System.out.println("Hp do Oponente " + oponenteNPC.getNomeEntidade() + " = 0");
                    }
                    break;
                case 2: // Ataque Especial do Mago:
                    if (ataqueEspecialUsado) {
                        System.out.println("Ataque Especial só pode usar 1 vez durante a batalha!!");
                        opcaoAtaqueHeroi = 0;
                    } else {
                        System.err.println("\t\t\t   *** " + this.getNomeEntidade() + " USA ***");
                        System.err.println("\t   *** ATAQUE ESPECIAL ATAQUE ESPIRITUAL ***");
                        System.out.println("\n");
                        System.out.println("  _-==---_\t       _-==---_\n" +
                                " -===  _  -\t      -===  _  -\n" +
                                "-==== ( )  -\t -==== ( )  -\n" +
                                "-=====     -\t-=====      -\n" +
                                "-==( )=    -\t -==( )=    -\n" +
                                " -=====  _-\t      -=====  _-\n" +
                                "   -==---     \t\t-==--- ");
                        System.out.println("\n\t*** ATAQUE ESPECIAL REALIZADO COM SUCESSO!! ***");
                        System.out.println("\t\t\t\tDANO = " + (this.getArmaPrincipalHeroi().getAtaqueEspecial() + aumentarAtaqueMagicoMago) + " ATK\n");
                        Thread.sleep(350);

                        hpNPC -= (this.getForcaEntidade() + this.getArmaPrincipalHeroi().getAtaqueEspecial() + aumentarAtaqueMagicoMago);
                        if (hpNPC >= 0) {
                            System.out.println("Hp Atual do Oponente " + oponenteNPC.getNomeEntidade() + " = " + hpNPC + " hp.");
                        }
                        ataqueEspecialUsado = true;
                    }
                    break;
                case 3: // Consumível de Ataque:
                    ConsumivelCombate consumivelUsado = heroiUsarComsumivelCombate();
                    if (consumivelUsado != null) {
                        System.out.println(". . .                         \n" +
                                "              \\|/                          \n" +
                                "            `--+--'                        \n" +
                                "              /|\\                          \n" +
                                "             ' | '                         \n" +
                                "               |                           \n" +
                                "               |                           \n" +
                                "           ,--'#`--.                       \n" +
                                "           |#######|                       \n" +
                                "        _.-'#######`-._                    \n" +
                                "     ,-'##############`-.                 \n" +
                                "   ,'####################`,               \n" +
                                "  /########################\\              \n" +
                                " |##########################|             \n" +
                                "|############################|            \n" +
                                "|############################|            \n" +
                                "|############################|            \n" +
                                "|############################|            \n" +
                                " |##########################|             \n" +
                                "  \\########################/              \n" +
                                "   `.#####################,'               \n" +
                                "     `._###############_,'                 \n" +
                                "        `--..#####..--'");
                        // Remoção do Consumível de Combate Usado:
                        this.inventarioHeroi.remove(consumivelUsado);

                        // Ataque do Consumivel de Combate ao NPC:
                        hpNPC -= consumivelUsado.getAtaqueInstataneo();
                        System.out.println("Hp Atual do Oponente " + oponenteNPC.getNomeEntidade() + " = " + hpNPC + " hp.");
                    } else {// Não existe Consumivel de combate e retorna para nova opção:
                        opcaoAtaqueHeroi = 0;
                    }
                    break;
                default: // Opção Inválida:
                    System.err.println("\n\t\t\t*** Opção Inválida ***\n");
                    break;
            }

            // Simulação de ataque do NPC:
            if (opcaoAtaqueHeroi >= 1 && opcaoAtaqueHeroi <= 3) {
                if (hpNPC >= 0) {
                    System.out.println("\n" + oponenteNPC.getNomeEntidade() + " Ataca!!! e.......");
                    System.out.println("\n\t\t\t\t\t\t\t\t\t<-----«");
                    Thread.sleep(350);
                    System.out.println("\n\t\t\t\t\t\t<-----«");
                    Thread.sleep(350);
                    System.out.println("\n\t\t\t<-----«");
                    Thread.sleep(350);
                    System.out.println("OUCH!-----«");
                    System.out.println("\t*** ATAQUE REALIZADO COM SUCESSO!! ***");
                    System.out.println("\t\t\t\tDANO = " + oponenteNPC.getForcaEntidade() + " ATK\n");
                    hpPersonagem -= oponenteNPC.getForcaEntidade() + aumentarAtaqueOponenteDezPorcento;
                }
                if (hpNPC <= 0) {
                    hpPersonagem += oponenteNPC.getForcaEntidade() - aumentarAtaqueOponenteDezPorcento;
                }
                if (hpPersonagem > 0) {
                    System.out.println("Hp Atual do Herói " + this.getNomeEntidade() + " = " + hpPersonagem + " hp.");
                } else if (hpPersonagem <= 0) {
                    System.out.println("O Herói Morreu");
                }
            } else {
                qtRoud--;
            }

            // Laço executável até a Quantidade de HP de algum dos oponentes acabar:
        } while (hpNPC > 0 && hpPersonagem > 0);

        // Dados finais da Batalha:
        if (hpPersonagem <= 0) { //Perder Batalha
            System.out.println(this.getNomeEntidade() + "Infelizmente Perdeu a Luta");

        } else { // Ganhar Batalha
            // Revalidação do Ataque Especial:
            ataqueEspecialUsado = false;

            System.out.println(this.getNomeEntidade() + " É o Vencedor!!!");
            // Aumenta Nivel + 1:
            this.setNivelHeroi(getNivelHeroi() + 1);

            // Aumenta HP em 7%:
            int aumentoVida = (this.getVidaEntidade() * 7) / 100;
            this.setVidaEntidade(this.getVidaEntidade() + aumentoVida);

            // AUmenta Força em 2%:
            int aumentoForca = (this.getForcaEntidade() * 2 / 100);
            this.setForcaEntidade(this.getForcaEntidade() + aumentoForca);

            // Método para herói Adicionar item contido no NPC:
            this.heroiRecolherItemNPC(oponenteNPC);
        }
    }
}
