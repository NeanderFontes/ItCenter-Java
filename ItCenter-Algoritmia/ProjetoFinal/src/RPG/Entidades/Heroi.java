package RPG.Entidades;

import RPG.Item.AbstractClass.Consumivel;
import RPG.Item.AbstractClass.ItemHeroi;
import RPG.Item.ArmaPrincipal;
import RPG.Item.ConsumivelCombate;
import RPG.Item.Pocao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Heroi extends Entidade {
    private int nivelHeroi, ouroHeroi;
    private ArmaPrincipal armaPrincipalHeroi;
    protected ArrayList<Consumivel> inventarioHeroi;

    /**
     * Método Construtor da SuperClass abstrata <b>Entidade</b>
     *
     * @param nomeEntidade  - Nome do Herói
     * @param vidaEntidade  - Total de Vida do Herói (em hp)
     * @param forcaEntidade - Total de Força do Herói
     */
    public Heroi(String nomeEntidade, int vidaEntidade, int forcaEntidade) {
        super(nomeEntidade, vidaEntidade, forcaEntidade);
        this.nivelHeroi = 1;
        this.ouroHeroi = 0;
        this.armaPrincipalHeroi = null;
        this.inventarioHeroi = new ArrayList<>();
    }

    /**
     * Método para Adicionar Consumivel ao Inventário do Herói
     *
     * @param itemAdicionado - Item Adicionado ArrayList<Consumivel>
     */
    public void adicionarInventarioHeroi(Consumivel itemAdicionado) {
        this.inventarioHeroi.add(itemAdicionado);
    }

    /**
     * Método para o Herói Usar Poção
     */
    public void heroiUsarPocao() {
        //Scanner para entrada de dados:
        Scanner input = new Scanner(System.in);
        int itemEscolhido;
        int numIndice = 0;

        //Acesso ao Inventário do Herós
        if (this.inventarioHeroi.isEmpty()) {
            System.out.println("O Inventário está vazio!");
        } else {
            //Ciclo para Listar as Poções do Herói.
            System.out.println("************* LISTA DE POçÔES *************");
            for (numIndice = 0; numIndice < this.inventarioHeroi.size(); numIndice++) {
                System.out.println((numIndice + 1) + "º = " + this.inventarioHeroi.get(numIndice).getNomeItemHeroi());
            }

            //Entrada de dados para selecionar e usar a Poção:
            System.out.println("Escolha a Poção acima para usar.");
            itemEscolhido = input.nextInt();
            //todo Tratamento de erro para validar entrada de dados pelo utilizador
            do {
                //Escolha Inválida do Item no Inventário do Herois:
                if (itemEscolhido < 1 || itemEscolhido > this.inventarioHeroi.size()) {
                    System.out.println("Escolha Inválida");
                } else {
                    //Remoção do item escohido do ArrayList<Consumivel>:
                    Pocao consumivel = (Pocao) this.inventarioHeroi.remove(itemEscolhido - 1);

                    //Aumentar Hp de acordo com a poção usada:
                    this.setVidaEntidade(this.getVidaEntidade() + consumivel.getRecuperarVida());

                    //Aumenta For de acordo com poção usada:
                    this.setForcaEntidade(this.getForcaEntidade() + consumivel.getAumentarForca());
                }
            } while (itemEscolhido >= 1 && itemEscolhido <= this.inventarioHeroi.size());
        }
    }

    /**
     * Método para Herói usar Comsumivel de Combate:
     *
     * @return null para Inventário ArrayList<ConsumivelCombate> Vazio
     * @return O Item Desejado para uso do Herói no Combate
     */
    protected ConsumivelCombate heroiUsarComsumivelCombate() {
        //Scanner para Entrada de dados:
        Scanner input = new Scanner(System.in);

        //Construir novo menu de ArrayList<ConsumivelCombate>:
        ArrayList<ConsumivelCombate> consumivelCombates = new ArrayList<>();
        int numIndice = 0;

        for (numIndice = 0; numIndice < this.inventarioHeroi.size(); numIndice++) {
            //Se o Item for instancia de ComsumivelCombate adicionará:
            if (this.inventarioHeroi.get(numIndice) instanceof ConsumivelCombate) {
                consumivelCombates.add((ConsumivelCombate) this.inventarioHeroi.get(numIndice));
            }
        }

        //Listagem dos Itens Adicionados ao ArrayList<ConsumivelCombate>:
        if (consumivelCombates.isEmpty()) {
            System.out.println("Inventário Vazio...");
            return null;
        } else {
            //Ciclo for para apresentar os itens de Consumivel de Combate existentes:
            System.out.println("=========== LISTA(S) DO(S) CONSUMIVÉL(EIS) DE COMBATE ===========");
            for (numIndice = 0; numIndice < consumivelCombates.size(); numIndice++) {
                System.out.println((numIndice + 1) + "º - " + consumivelCombates.get(numIndice - 1));
            }
            System.out.println("=================================================================");

            //Tratamento de Erros para Opções inválidas do Usuário:
            System.out.print("Escolha uma opção dos itens acima: ");
            int indexEscolhido = 0;
            try {
                indexEscolhido = input.nextInt();
                if (indexEscolhido > consumivelCombates.size() || indexEscolhido < 1) { //Condição para definir se está fora
                    throw new IllegalArgumentException();
                }
            } catch (InputMismatchException mismatchException) { //Tratamento para entrada de dados != numeros
                System.out.println("Tem de ser numero");
            } catch (
                    IllegalArgumentException argumentException) { //Tratamento para caso número fora do intervalo válido
                System.out.println("Tem de ser entre 1 e " + consumivelCombates.size());
            }
            return consumivelCombates.get(numIndice - 1);
        }
    }

    /**
     * Método para o Herói Recolher o Item do NPC se Vencer a Batalha
     *
     * @param oponenteNPC
     */
    protected void heroiRecolherItemNPC(NPC oponenteNPC) {
        //Declaração de variáveis e Import Scanner para Entrada de dados:
        Scanner input = new Scanner(System.in);
        String opcaoParaAdicionarItemHeroi = "";
        boolean entradaValida = false;

        //Adicionar a quantidade de Ouro perdido na batalha do NPC para o Herói:
        this.setOuroHeroi(getOuroHeroi() + oponenteNPC.getOuroNPC());

        if (oponenteNPC.getInventarioNPC().isEmpty()) {
            System.out.println("=======================================");
            System.out.println("Inventário do NPC está vazio!!");
            System.out.println("=======================================");
        } else {
            //Ciclo ForEach para percorrer o inventário do NPC
            for (ItemHeroi itemHeroiAtual : oponenteNPC.getInventarioNPC()) {
                int numIndice = 0;
                if (itemHeroiAtual instanceof Consumivel) {
                    // Imprimir os detalhes
                    System.out.println("========== Lista dos Consumiveis dropado pelo NPC ==========");
                    System.out.println((numIndice + 1) + "º - " + itemHeroiAtual.getNomeItemHeroi());
                    System.out.println("============================================================");

                    //TODO ACRESCENTAR TRATAMENTO DE ERRO PARA ENTRADA DE DADOS:
                    // Perguntar ao utilizador se quer ou não
                    do {
                        System.out.print("Gostaria de Adicionar o(s) consumível(eis) ao seu inventário? [S/N]: ");
                        try {
                            opcaoParaAdicionarItemHeroi = input.nextLine();//Opção de condição "S" = Aceite para Adicionar as Poções:
                            if (opcaoParaAdicionarItemHeroi.equalsIgnoreCase("S") || opcaoParaAdicionarItemHeroi.equalsIgnoreCase("N")) {

                                //Adicionar o Item ao ArrayList<Consumivel> inventarioHeroi:
                                if (opcaoParaAdicionarItemHeroi.equalsIgnoreCase("S")) {
                                    // Adicionar ao inventário
                                    this.inventarioHeroi.add((Consumivel) itemHeroiAtual);
                                } else {
                                    //Item Fica ao Chão
                                    System.out.println("Cheio de poeira fica item ao chão");
                                }
                            }
                        } catch (InputMismatchException mismatchException) {
                            System.err.println("Entrada inválida. Digite 'S' para Sim ou 'N' para Não.");
                            opcaoParaAdicionarItemHeroi = "";
                            input.next();
                        }
                    } while (opcaoParaAdicionarItemHeroi.equalsIgnoreCase("N"));

                } else {//Caso não contenha Consumiveis para adicionar ao Herói:
                    System.out.println("Desta Vez não tem Consimiveis no Inventário do Oponente " + oponenteNPC.getNomeEntidade());
                }


                // Se houver ArmaPrincipal ArrayList<ArmaPrincipal>
                if (itemHeroiAtual instanceof ArmaPrincipal) {
                    numIndice = 0;
                    // Imprimir os detalhes
                    System.out.println("========== Lista da Arma Principal dropado pelo NPC ==========");
                    System.out.println((numIndice + 1) + "º - " + itemHeroiAtual.getNomeItemHeroi());
                    System.out.println("Ataque Normal = " + ((ArmaPrincipal) itemHeroiAtual).getAtaqueNormal());
                    System.out.println("Ataque Especial = " + ((ArmaPrincipal) itemHeroiAtual).getAtaqueEspecial());
                    System.out.println("============================================================");


                    // Perguntar ao utilizador se quer ou não (aqui vai substituir)
                    System.out.print("Deseja Substituir sua Arma Principal '" + this.armaPrincipalHeroi.getNomeItemHeroi() + "' por '" + itemHeroiAtual.getNomeItemHeroi() + "'?[S/N]: ");
                    String opcaoTrocaArmaPrincipal = input.nextLine();
                    if (opcaoTrocaArmaPrincipal.equalsIgnoreCase("S")) {

                        //Laço ForEach para percorrer o Arraylist e comparar se o Herói Pode Utilizar a Arma ganhada na batalha:
                        for (String heroiPermitido : itemHeroiAtual.getItemHeroiPermitido()) {
                            System.out.println("Estou a comparar " + getTipoHeroi() + " com " + heroiPermitido);

                            //Validação para o Tipo do Heroi == SubClasse do utilizador permite a troca da arma:
                            if (itemHeroiAtual.getItemHeroiPermitido().equals(heroiPermitido)) {

                                //Arma Substituida caso aceite:
                                this.setArmaPrincipalHeroi((ArmaPrincipal) itemHeroiAtual);

                            } else {// Caso o Item não seja do mesmo "tipo" de Equipamento Permitido com a SubClasse do Herói:
                                System.out.println("Arma " + itemHeroiAtual.getNomeItemHeroi() + " não é para seu tipo de Herói");
                            }
                        }
                    } else {// Caso o Herói não queira trocar arma principal:
                        System.out.println(itemHeroiAtual.getNomeItemHeroi() + " ficou ao chão empoeirada");
                    }

                } else {// Caso não contenha Opção de Arma para adicionar ao Herói:
                    System.out.println("Oponente " + oponenteNPC.getNomeEntidade() + " não contém Nenhuma Arma desta vez!");
                }
            }
        }
    }


    /**
     * Método Abstrato Atacar da Class <b>Heroi</b> para Criar implementações de acordo com cada @override
     *
     * @param oponenteNPC - Recebe como Parâmetro o Npc para Batalha
     */
    public abstract void atacar(NPC oponenteNPC);

    /**
     * Método para Exibir Detalhes do Herói:
     */
    public void exibirDetalhes() {
        System.out.println("************************ Herói ************************");
        System.out.println("SubClasse do Herói: " + this.getTipoHeroi());
        System.out.println("Nickname: " + this.getNomeEntidade());
        System.out.println("Nivel: " + this.getNivelHeroi());
        System.out.println("Total HP: " + this.getVidaEntidade());
        System.out.println("Força: " + this.getForcaEntidade());
        System.out.println("Quantidade Ouro: " + this.getOuroHeroi());
        if (this.getArmaPrincipalHeroi() == null) {
            System.out.println("Arma Principal: Sem Arma Equipada");
        } else {
            System.out.println("Arma Principal: " + this.getArmaPrincipalHeroi().getNomeItemHeroi());
        }
        //TODO Acrescenter uma Opção para "Escolher ver inventário utilizando ArrayList<>"
        System.out.println("Inventário: " + this.getInventarioHeroi());
        System.out.println("*******************************************************");
    }

    /**
     * Método para Completar a comparação entre tipos de classes
     *
     * @return - Tipo do Personagem "Aprendiz, Arqueiro, Espadachim..."
     */
    public String getTipoHeroi() {
        String classeCompleta = this.getClass().getName();
        //RPG.Entidades.Personagens.Gatuno

        String[] classeCompletaPartida = classeCompleta.split("\\.");
        return classeCompletaPartida[3];
    }

    /**
     * Métodos Getter e Setter da SubClass <b>Heroi</b>
     */
    public int getNivelHeroi() {
        return this.nivelHeroi;
    }

    public void setNivelHeroi(int nivelHeroi) {
        this.nivelHeroi = nivelHeroi;
    }

    public int getOuroHeroi() {
        return this.ouroHeroi;
    }

    public void setOuroHeroi(int ouroHeroi) {
        this.ouroHeroi = ouroHeroi;
    }

    public ArrayList<Consumivel> getInventarioHeroi() {
        return this.inventarioHeroi;
    }

    public void setInventarioHeroi(ArrayList<Consumivel> inventarioHeroi) {
        this.inventarioHeroi = inventarioHeroi;
    }

    public void setArmaPrincipalHeroi(ArmaPrincipal armaPrincipalHeroi) {
        this.armaPrincipalHeroi = armaPrincipalHeroi;
    }

    public ArmaPrincipal getArmaPrincipalHeroi() {
        return armaPrincipalHeroi;
    }
}
