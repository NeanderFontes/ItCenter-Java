package RPG.Entidades.Personagens;

import RPG.Entidades.Heroi;
import RPG.Entidades.NPC;
import RPG.Item.ConsumivelCombate;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Gatuno extends Heroi {

    /**
     * Método Construtor Gatuno da Abstract SuperClass <b>Heroi</b>
     *
     * @param nomeEntidade  - Nome do Gatuno
     * @param vidaEntidade  - Total de Vida do Gatuno
     * @param forcaEntidade - Total de Força de Ataque do Gatuno
     */
    public Gatuno(String nomeEntidade, int vidaEntidade, int forcaEntidade) {
        super(nomeEntidade, vidaEntidade, forcaEntidade);
    }

    /**
     * Método @Override Adaptado ao Gatuno para Atacar um NPC
     * Gatuno Por ter uma boa Agilidade tem a chance de atacar 2x o NPC.
     * Se o Gatuno ganhar a batalha: Nivel +1, +5% de HP e +3% de Força.
     *
     * @param oponenteNPC - Recebe como Parâmetro o Npc para Batalha
     */
    @Override
    public void atacar(NPC oponenteNPC) throws InterruptedException {
        // Import Random para Duplo Ataque do Gatuno:
        Random ataqueRandom = new Random();

        // Scaner para Entrada de dados:
        Scanner input = new Scanner(System.in);

        // Declaração de variáveis do escopo:
        int qtRoud = 1;
        int hpNPC = oponenteNPC.getVidaEntidade();
        int hpPersonagem = this.getVidaEntidade();
        int opcaoAtaqueHeroi, ataqueDuploEfeito;
        boolean ataqueEspecialUsado = false;

        // Prioridade de ataque do Gatuno:
        System.err.println("\t\t*** Prioridade de Ataque de " + this.getNomeEntidade() + " ***");

        do {
            // Simulação de ataque do Gatuno:
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
                case 1: // Ataque Normal do Gatuno:
                    System.out.println("\n" + this.getNomeEntidade() + " Usa a(o) " + this.getArmaPrincipalHeroi().getNomeItemHeroi() + " e.......");
                    System.out.println("[==|:::::>");
                    Thread.sleep(350);
                    System.out.println("\n\t\t\t»[==|:::::>");
                    Thread.sleep(350);
                    System.out.println("\n\t\t\t\t\t\t[==|:::::>");
                    Thread.sleep(350);
                    System.out.println("\n\t\t\t\t\t\t\t\t\t[==|::::: OUCH!");
                    System.out.println("\t*** ATAQUE REALIZADO COM SUCESSO!! ***");
                    System.out.println("\t\t\t\tDANO = " + this.getArmaPrincipalHeroi().getAtaqueNormal() + " ATK\n");
                    hpNPC -= this.getForcaEntidade() + this.getArmaPrincipalHeroi().getAtaqueNormal();
                    if (hpNPC > 0) {
                        System.out.println("Hp Atual do Oponente " + oponenteNPC.getNomeEntidade() + " = " + hpNPC + " hp.");
                    } else if (hpNPC <= 0) {
                        System.out.println("Hp do Oponente " + oponenteNPC.getNomeEntidade() + " = 0");
                    }
                    break;
                case 2: // Ataque Especial do Gatuno:
                    if (ataqueEspecialUsado) {
                        System.out.println("Ataque Especial só pode usar 1 vez durante a batalha!!");
                        opcaoAtaqueHeroi = 0;
                    } else {
                        System.err.println("\t\t\t   *** " + this.getNomeEntidade() + " USA ***");
                        System.err.println("\t   *** ATAQUE ESPECIAL MÃOS LEVES!! ***");
                        System.out.println("\n");
                        System.out.println("           _____   _____\n" +
                                "          /     \\ /     \\\n" +
                                "     ,   |       '       |\n" +
                                "     I __L________       L__  , , , , ,\n" +
                                "O====IE__________/     ./___>   OUCH !! -\n" +
                                "     I      \\.       ./\t      ' ' ' ' '  \n" +
                                "     `        \\.   ./\n" +
                                "                \\ /\n" +
                                "                 '");
                        System.out.println("\n\t*** ATAQUE ESPECIAL REALIZADO COM SUCESSO!! ***");
                        Thread.sleep(1000);

                        System.out.println("\t\t\t\tDANO = " + (this.getArmaPrincipalHeroi().getAtaqueEspecial() + this.getForcaEntidade() ) + " ATK\n");
                        hpNPC -= (this.getForcaEntidade() + this.getArmaPrincipalHeroi().getAtaqueEspecial());
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
                        System.out.println("\n\t*** ATAQUE ESPECIAL REALIZADO COM SUCESSO!! ***");
                        Thread.sleep(1000);

                        // Remoção do Consumível de Combate Usado:
                        this.inventarioHeroi.remove(consumivelUsado);

                        // Ataque do Consumivel de Combate ao NPC:
                        hpNPC -= consumivelUsado.getAtaqueInstataneo();
                        System.out.println("Hp Atual do Oponente " + oponenteNPC.getNomeEntidade() + " = " + hpNPC + " hp.");
                    } else {//Não existe Consumivel de combate e retorna para nova opção:
                        opcaoAtaqueHeroi = 0;
                    }
                    break;
                default: // Opção Inválida:
                    System.err.println("\n\t\t\t*** Opção Inválida ***\n");
                    break;
            }

            // Condição do Herói Gatuno realizar 2 Ataques:
            ataqueDuploEfeito = ataqueRandom.nextInt(1, 6);
            if (ataqueDuploEfeito == 1) {
                if (hpNPC > 0) {
                    System.out.println("*** ATAQUE DUPLO SURPRESA ***");
                    opcaoAtaqueHeroi = 0;
                }
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
                    Thread.sleep(350);
                    hpPersonagem -= oponenteNPC.getForcaEntidade();
                }
                if (hpNPC <= 0) {
                    hpPersonagem += oponenteNPC.getForcaEntidade();
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
        if (hpPersonagem <= 0) { // Perder Batalha:
            System.out.println(this.getNomeEntidade() + "Infelizmente Perdeu a Luta");

        } else { // Ganhar Batalha:
            // Revalidação do Ataque Especial:
            ataqueEspecialUsado = false;

            System.out.println(this.getNomeEntidade() + " É o Vencedor!!!");
            // Aumenta Nivel + 1:
            this.setNivelHeroi(getNivelHeroi() + 1);

            // Aumenta HP em 5%:
            int aumentoVida = (this.getVidaEntidade() * 5) / 100;
            this.setVidaEntidade(this.getVidaEntidade() + aumentoVida);

            // AUmenta Força em 3%:
            int aumentoForca = (this.getForcaEntidade() * 3 / 100);
            this.setForcaEntidade(this.getForcaEntidade() + aumentoForca);

            // Método para herói Adicionar item contido no NPC:
            this.heroiRecolherItemNPC(oponenteNPC);
        }
    }
}
