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
        int qtRoud = 0;
        int hpNPC = oponenteNPC.getVidaEntidade();
        int hpPersonagem = this.getVidaEntidade();
        int opcaoAtaqueHeroi;

        //Prioridade de ataque do Arqueiro:
        System.out.println("Prioridade de Ataque de " + this.getNomeEntidade());
        do {
            System.out.println("======== ROUND " + qtRoud++ + "========");
            //Simulação de ataque do Arqueiro:
            System.out.println("============ OPÇÕES DE ATAQUE ============");
            System.out.println("Ataque Normal   = [1]");
            System.out.println("Ataque Especial = [2]");
            System.out.println("Usar Consumível de Ataque = [3]");
            System.out.println("==========================================");
            System.out.print("Seu Turno!! Escolha uma Opção Acima: ");
            opcaoAtaqueHeroi = input.nextInt();
            switch (opcaoAtaqueHeroi) {
                case 1: //Ataque Normal do Arqueiro:
                    if (hpNPC >= 0) {
                        hpNPC -= this.getForcaEntidade() + this.getArmaPrincipalHeroi().getAtaqueNormal();
                        //Utilização do setter:
                        //npcGamer.setVidaEntidade(npcGamer.getVidaEntidade()-this.getForcaEntidade());
                        System.out.println("Hp Atual do " + oponenteNPC.getNomeEntidade() + " = " + hpNPC + " hp.");
                    }
                    break;
                case 2: //Ataque Especial do Arqueiro:
                    if (hpNPC >= 0) {
                        hpNPC -= this.getForcaEntidade() + this.getArmaPrincipalHeroi().getAtaqueEspecial();
                        //Utilização do setter:
                        //npcGamer.setVidaEntidade(npcGamer.getVidaEntidade()-this.getForcaEntidade());
                        System.out.println("Hp Atual do " + oponenteNPC.getNomeEntidade() + " = " + hpNPC + " hp.");
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
                    System.out.println("Opção Inválida.");
                    break;
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

            //Adicionar a quantidade de Ouro perdido na batalha do NPC para o Herói:
            this.setOuroHeroi(getOuroHeroi() + oponenteNPC.getOuroNPC());

            //Ciclo ForEach para percorrer o inventário do NPC
            for (ItemHeroi itemHeroiAtual : oponenteNPC.getInventarioNPC()) {
                int numIndice = 0;
                if (itemHeroiAtual instanceof Consumivel) {
                    // Imprimir os detalhes
                    System.out.println("========== Lista dos Consumiveis dropado pelo NPC ==========");
                    System.out.println((numIndice + 1) + "º - " + itemHeroiAtual.getNomeItemHeroi());
                    System.out.println("============================================================");
                }
                String opcaoParaAdicionarItemHeroi = "";
                boolean entradaValida = false;

                while (!entradaValida) {
                    // Perguntar ao utilizador se quer ou não
                    System.out.print("Gostaria de Adicionar o Item ao seu inventário? ");
                    opcaoParaAdicionarItemHeroi = input.nextLine();

                    if (opcaoParaAdicionarItemHeroi.equalsIgnoreCase("S") || opcaoParaAdicionarItemHeroi.equalsIgnoreCase("N")) {//Opção de condição "S" = Aceite para Adicionar as Poções:

                        //Adicionar o Item ao ArrayList<Consumivel> inventarioHeroi:
                        if (opcaoParaAdicionarItemHeroi.equalsIgnoreCase("S")) {
                            // Adicionar ao inventário
                            itemHeroiAtual.getItemHeroiPermitido().add(String.valueOf(numIndice));
                            entradaValida = true;
                        } else {
                            //Item Fica ao Chão
                            System.out.println("Cheio de poeira fica item ao chão");
                        }
                    } else {
                        System.out.println("Opção inválida. Por favor, digite 'S' para Sim ou 'N' para Não.");
                    }
                }

                // Se for ArmaPrincipal
                if (itemHeroiAtual instanceof ArmaPrincipal) {
                    numIndice = 0;
                    // Imprimir os detalhes
                    System.out.println("========== Lista da Arma Principal dropado pelo NPC ==========");
                    System.out.println((numIndice + 1) + "º - " + itemHeroiAtual.getNomeItemHeroi());
                    System.out.println("Ataque Normal = " + ((ArmaPrincipal) itemHeroiAtual).getAtaqueNormal());
                    System.out.println("Ataque Especial = " + ((ArmaPrincipal) itemHeroiAtual).getAtaqueEspecial());
                    System.out.println("============================================================");
                }

                //TODO PROCURAR SABER SE CODIGO PARA TROCAR A ARMA PRINCIPAL ESTÁ CORRETO!!!!
                // Perguntar ao utilizador se quer ou não (aqui vai substituir)
                System.out.println("Deseja Substituir pela" + itemHeroiAtual.getNomeItemHeroi() + " arma principal?");
                String opcaoTrocaArmaPrincipal = input.nextLine();
                if (opcaoTrocaArmaPrincipal.equalsIgnoreCase("S")) {

                    //Laço ForEach para percorrer o Arraylist e comparar se o Herói Pode Utilizar a Arma ganhada na batalha:
                    for (String heroiPermitido : itemHeroiAtual.getItemHeroiPermitido()) {
                        System.out.println("Estou a comparar " + getTipoHeroi() + " com " + heroiPermitido);

                        //Validação Tipo do Heroi se é Igual a SubClasse do utilizador permite a troca da arma:
                        if (itemHeroiAtual.getItemHeroiPermitido().equals(heroiPermitido)) {

                            //Arma Substituida caso aceite:
                            this.setArmaPrincipalHeroi((ArmaPrincipal) itemHeroiAtual);
                        } else {
                            System.out.println("Arma " + itemHeroiAtual.getNomeItemHeroi() + " não é para seu tipo de Herói");
                        }
                    }
                } else {
                    System.out.println("Arma ficou ao chão empoeirada");
                }
            }
        }
    }
}
