package RPG.Entidades.Personagens;

import RPG.Entidades.Heroi;
import RPG.Entidades.NPC;
import RPG.Item.ConsumivelCombate;

import java.util.InputMismatchException;
import java.util.Scanner;

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
     * Se o Espadachim ganhar a batalha: Nivel +1, +6% de HP e +6% de Força.
     *
     * @param oponenteNPC - Recebe como Parâmetro o Npc para Batalha
     */
    @Override
    public void atacar(NPC oponenteNPC) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int rodada = 1;
        int hpNPC = oponenteNPC.getVidaEntidade();
        int hpPersonagem = this.getVidaEntidade();
        int opcaoAtaqueHeroi;
        boolean ataqueEspecialUsado = false;
        int ataqueOponenteComDefesaDoHeroi = (oponenteNPC.getForcaEntidade() * 20) / 100;

        System.err.println("\t\t*** Por Ter uma Defesa INCRIÍVEL!! ***");
        System.err.println("\t\t*** Prioridade de Ataque de " + oponenteNPC.getNomeEntidade() + " ***");

        System.out.println("\n" + oponenteNPC.getNomeEntidade() + " Ataca!!! e.......");
        System.out.println("OUCH!-----« \n\t\t\t<-----« \n\t\t\t\t\t\t<-----« \n\t\t\t\t\t\t\t\t\t<-----«");
        System.out.println("\t*** ATAQUE REALIZADO COM SUCESSO!! ***");
        System.out.println("\t\t\t\tDANO = " + (oponenteNPC.getForcaEntidade() - ataqueOponenteComDefesaDoHeroi) + " ATK\n");
        hpPersonagem -= oponenteNPC.getForcaEntidade() - ataqueOponenteComDefesaDoHeroi;

        do {
            System.out.println("======================= ROUND " + rodada++ + " ========================");
            System.out.println("[ 1 ]   -   Ataque Normal");
            System.out.println("[ 2 ]   -   Ataque Especial");
            System.out.println("[ 3 ]   -   Usar Consumível de Ataque");
            System.out.println("========================================================");
            System.out.print(this.getNomeEntidade() + "!! Escolha uma Opção de Atk acima: ");

            try {
                opcaoAtaqueHeroi = input.nextInt();
            } catch (InputMismatchException mismatchException) {
                System.err.println("Erro: Entrada inválida. Certifique-se de digitar um número inteiro.");
                input.next();
                opcaoAtaqueHeroi = 0;
            }

            switch (opcaoAtaqueHeroi) {
                case 1: // Ataque Normal do Espadachim:
                    System.out.println("\n" + this.getNomeEntidade() + " Usa a(o) " + this.getArmaPrincipalHeroi().getNomeItemHeroi() + " e.......");
                    System.out.println("\t\t\t\t\t\t       , , , , ,\n" +
                            "[==|::::::::::::::::::::::::::::>  OUCH !! - \n" +
                            "\t\t\t\t\t\t       ' ' ' ' '");
                    System.out.println("\t*** ATAQUE REALIZADO COM SUCESSO!! ***");
                    Thread.sleep(350);
                    System.out.println("\t\t\t\tDANO = " + this.getArmaPrincipalHeroi().getAtaqueNormal() + " ATK\n");
                    hpNPC -= this.getForcaEntidade() + this.getArmaPrincipalHeroi().getAtaqueNormal();
                    if (hpNPC > 0) {
                        System.out.println("Hp Atual do Oponente " + oponenteNPC.getNomeEntidade() + " = " + hpNPC + " hp.");
                    } else if (hpNPC <= 0) {
                        System.out.println("Hp do Oponente " + oponenteNPC.getNomeEntidade() + " = 0");
                    }
                    break;
                case 2: // Ataque Especial do Espadachim:
                    if (ataqueEspecialUsado) {
                        System.out.println("Ataque Especial só pode usar 1 vez durante a batalha!!");
                        opcaoAtaqueHeroi = 0;
                    } else {
                        System.err.println("\t\t\t   *** " + this.getNomeEntidade() + " USA ***");
                        System.err.println("\t   *** ATAQUE ESPECIAL IMPACTO DE TYR!! ***");
                        System.out.println("... (desenho do ataque especial) ...");
                        System.out.println("\n\t*** ATAQUE ESPECIAL REALIZADO COM SUCESSO!! ***");
                        Thread.sleep(1000);
                        System.out.println("\t\t\t\tDANO = " + this.getArmaPrincipalHeroi().getAtaqueEspecial() + " ATK\n");
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
                        System.out.println("... (desenho do consumível de ataque) ...");
                        System.out.println("\n\t*** ATAQUE ESPECIAL REALIZADO COM SUCESSO!! ***");
                        Thread.sleep(1000);

                        // Remoção do Consumível de Combate Usado:
                        this.inventarioHeroi.remove(consumivelUsado);

                        // Ataque do Consumível de Combate ao NPC:
                        hpNPC -= consumivelUsado.getAtaqueInstataneo();
                        System.out.println("Hp Atual do Oponente " + oponenteNPC.getNomeEntidade() + " = " + hpNPC + " hp.");

                    } else {// Não existe Consumível de combate e retorna para nova opção:
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
                    System.out.println("... (desenho do ataque do NPC) ...");
                    Thread.sleep(350);
                    System.out.println("... (desenho do ataque do NPC) ...");
                    Thread.sleep(350);
                    System.out.println("... (desenho do ataque do NPC) ...");
                    Thread.sleep(350);
                    System.out.println("OUCH!-----«");
                    System.out.println("\t*** ATAQUE REALIZADO COM SUCESSO!! ***");
                    System.out.println("\t\t\t\tDANO = " + (oponenteNPC.getForcaEntidade() - ataqueOponenteComDefesaDoHeroi) + " ATK\n");
                    Thread.sleep(350);
                    hpPersonagem -= oponenteNPC.getForcaEntidade() - ataqueOponenteComDefesaDoHeroi;
                }
                if (hpNPC <= 0) {
                    hpPersonagem -= oponenteNPC.getForcaEntidade() + ataqueOponenteComDefesaDoHeroi;
                }
                if (hpPersonagem > 0) {
                    System.out.println("Hp Atual do Herói " + this.getNomeEntidade() + " = " + hpPersonagem + " hp.");
                } else if (hpPersonagem <= 0) {
                    System.out.println("O Herói Morreu");
                }
            } else {
                rodada--;
            }
        } while (hpNPC > 0 && hpPersonagem > 0);

        if (hpPersonagem <= 0) { //Perder Batalha
            System.out.println(this.getNomeEntidade() + "Infelizmente Perdeu a Luta");
            this.exibirDetalhes();
        } else { // Ganhar Batalha:
            ataqueEspecialUsado = false;
            System.out.println(this.getNomeEntidade() + " É o Vencedor!!!");
            this.setNivelHeroi(this.getNivelHeroi() + 1);

            int aumentoVida = (this.getVidaEntidade() * 6) / 100;
            this.setVidaEntidade(this.getVidaEntidade() + aumentoVida);

            int aumentoForca = (this.getForcaEntidade() * 6 / 100);
            this.setForcaEntidade(this.getForcaEntidade() + aumentoForca);

            this.heroiRecolherItemNPC(oponenteNPC);
        }
    }
}
