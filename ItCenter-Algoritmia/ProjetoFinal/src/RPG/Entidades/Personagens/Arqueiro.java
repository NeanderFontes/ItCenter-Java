package RPG.Entidades.Personagens;

import RPG.Entidades.Heroi;
import RPG.Entidades.NPC;
import RPG.Item.AbstractClass.Consumivel;
import RPG.Item.AbstractClass.ItemHeroi;
import RPG.Item.ArmaPrincipal;
import RPG.Item.ConsumivelCombate;
import RPG.Item.Pocao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

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
     *
     * @param oponenteNPC - Recebe como Parâmetro o Npc para Batalha
     */
    @Override
    public void atacar(NPC oponenteNPC) {
        //Scaner para Entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis do escopo:
        int qtRoud = 1;
        int hpNPC = oponenteNPC.getVidaEntidade();
        int hpPersonagem = this.getVidaEntidade();
        int opcaoAtaqueHeroi;
        boolean venceuBatalha = false;

        //Prioridade de ataque do Arqueiro:
        System.err.println("\t\t*** Prioridade de Ataque de " + this.getNomeEntidade() + " ***");

        do {
            //Simulação de ataque do Arqueiro:
            System.out.println("======================= ROUND " + qtRoud++ + " ========================");
            System.out.println("[ 1 ]   -   Ataque Normal");
            System.out.println("[ 2 ]   -   Ataque Especial");
            System.out.println("[ 3 ]   -   Usar Consumível de Ataque");
            System.out.println("========================================================");
            System.out.print(this.getNomeEntidade() + "!! Escolha uma Opção de Atk acima: ");

            //Tratamento de Erro para "InputMismatchException" entrada de dados diferente de números:
            try {
                opcaoAtaqueHeroi = input.nextInt();
            } catch (InputMismatchException mismatchException) {
                System.err.println("Erro: Entrada inválida. Certifique-se de digitar um número inteiro.");
                input.next();
                opcaoAtaqueHeroi = 0;
            }

            switch (opcaoAtaqueHeroi) {
                case 1: //Ataque Normal do Arqueiro:
                    System.out.println("\n" + this.getNomeEntidade() + " Usa a(o) " + this.getArmaPrincipalHeroi().getNomeItemHeroi() + " e.......");
                    System.out.println("»-----> \n\t\t\t»-----> \n\t\t\t\t\t\t»-----> \n\t\t\t\t\t\t\t\t\t»--- OUCH!");
                    System.out.println("\t*** ATAQUE REALIZADO COM SUCESSO!! ***");
                    System.out.println("\t\t\t\tDANO = " + this.getArmaPrincipalHeroi().getAtaqueNormal() + " ATK\n");
                    hpNPC -= this.getForcaEntidade() + this.getArmaPrincipalHeroi().getAtaqueNormal();
                    if (hpNPC > 0) {
                        //Utilização do setter:
                        //npcGamer.setVidaEntidade(npcGamer.getVidaEntidade()-this.getForcaEntidade());
                        System.out.println("Hp Atual do Oponente " + oponenteNPC.getNomeEntidade() + " = " + hpNPC + " hp.");
                    } else if (hpNPC <= 0) {
                        System.out.println("Hp do Oponente " + oponenteNPC.getNomeEntidade() + " = 0");
                    }
                    break;
                case 2: //Ataque Especial do Arqueiro:
                    System.err.println("\t\t\t   *** " + this.getNomeEntidade() + " USA ***");
                    System.err.println("\t   *** ATAQUE ESPECIAL CHUVA DE FLECHAS!! ***");
                    System.out.println("»----->\t\t»----->\t\t»----->\t\t \n »----->\t\t»----->\t\t»----->\t\t»----   , , , , ,  \n  »----->\t\t  »----->\t\t»----->\t\t»--- OUCH !! -\n »----->\t\t»----->\t\t»----->\t\t»----   ' ' ' ' '  \n»----->\t\t»----->\t\t»----->");
                    System.out.println("\t*** ATAQUE ESPECIAL REALIZADO COM SUCESSO!! ***");
                    System.out.println("\t\t\t\tDANO = " + this.getArmaPrincipalHeroi().getAtaqueNormal() + " ATK\n");
                    hpNPC -= this.getForcaEntidade() + this.getArmaPrincipalHeroi().getAtaqueEspecial();
                    if (hpNPC >= 0) {
                        //Utilização do setter:
                        //npcGamer.setVidaEntidade(npcGamer.getVidaEntidade()-this.getForcaEntidade());
                        System.out.println("Hp Atual do Oponente " + oponenteNPC.getNomeEntidade() + " = " + hpNPC + " hp.");
                    }
                    break;
                case 3: //Consumível de Ataque:
                    ConsumivelCombate consumivelUsado = heroiUsarComsumivelCombate();
                    if (consumivelUsado != null) {
                        //Remoção do Consumível de Combate Usado.
                        this.inventarioHeroi.remove(consumivelUsado);

                        //Ataque do Consumivel de Combate ao NPC:
                        hpNPC -= consumivelUsado.getAtaqueInstataneo();
                    }
                    break;
                default: //Opção Inválida
                    System.err.println("\n\t\t\t*** Opção Inválida ***\n");
                    break;
            }

            //Simulação de ataque do NPC:
            if (opcaoAtaqueHeroi >= 1 && opcaoAtaqueHeroi <= 3) {
                System.out.println("\n" + oponenteNPC.getNomeEntidade() + " Ataca!!! e.......");
                System.out.println("OUCH!-----« \n\t\t\t<-----« \n\t\t\t\t\t\t<-----« \n\t\t\t\t\t\t\t\t\t<-----«");
                System.out.println("\t*** ATAQUE REALIZADO COM SUCESSO!! ***");
                System.out.println("\t\t\t\tDANO = " + oponenteNPC.getForcaEntidade() + " ATK\n");
                hpPersonagem -= oponenteNPC.getForcaEntidade();
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

            //Laço executável até a Quantidade de HP de algum dos oponentes acabar.
        } while (hpNPC > 0 && hpPersonagem > 0);

        //Dados finais da Batalha:
        if (hpPersonagem <= 0) { //Perder Batalha
            System.out.println(this.getNomeEntidade() + "Infelizmente Perdeu a Luta");

            //Teste para resultados:
            System.out.println("Teste de Resultados: ");
            System.out.println("Nivel do Heroi: " + this.getNivelHeroi());
            System.out.println("For = " + this.getForcaEntidade());
            //TODO HP FICANDO NEGATIVO AO FINAL DA DERROTA
            System.out.println("HP = " + hpPersonagem);
            System.out.println("Ouro = " + this.getOuroHeroi());

        } else { //Ganhar Batalha
            System.out.println(this.getNomeEntidade() + " É o Vencedor!!!");
            //Aumenta Nivel + 1:
            this.setNivelHeroi(getNivelHeroi() + 1);

            //Aumenta HP em 5%:
            int aumentoVida = (this.getVidaEntidade() * 5) / 100;
            this.setVidaEntidade(this.getVidaEntidade() + aumentoVida);

            //AUmenta Força em 2%:
            int aumentoForca = (this.getForcaEntidade() * 2 / 100);
            this.setForcaEntidade(this.getForcaEntidade() + aumentoForca);

            //Chamda de função da SuperClass<b>Heroi<b>
            this.heroiRecolherItemNPC(oponenteNPC);

            //Teste para resultados:
            System.out.println("Teste de Resultados: ");
            System.out.println("Nivel do Heroi: " + this.getNivelHeroi());
            System.out.println("For = " + this.getForcaEntidade());
            System.out.println("HP = " + hpPersonagem);
            System.out.println("Ouro = " + this.getOuroHeroi());
            System.out.println("Arma Principal: " + this.getArmaPrincipalHeroi().getNomeItemHeroi());
        }
    }
}
