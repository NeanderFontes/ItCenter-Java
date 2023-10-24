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
/*
    public Heroi(){
        super(nomeEntidade, vidaEntidade, forcaEntidade);
        this.nivelHeroi = 1;
        this.ouroHeroi = 0;
        this.armaPrincipalHeroi = null;
        this.inventarioHeroi = new ArrayList<>();
    } */

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
    public Pocao heroiUsarPocao() {
        // Scanner para Entrada de dados:
        Scanner input = new Scanner(System.in);

        // Construir novo menu de ArrayList<Pocao>:
        ArrayList<Pocao> pocao = new ArrayList<>();

        for (int numIndice = 0; numIndice < this.inventarioHeroi.size(); numIndice++) {
            // Se o Item for uma instância de Poção, adicioná-lo ao ArrayList
            if (this.inventarioHeroi.get(numIndice) instanceof Pocao) {

                pocao.add((Pocao) this.inventarioHeroi.get(numIndice));
            }
        }

        // Listagem dos Itens Adicionados ao ArrayList<Pocao>:
        if (pocao.isEmpty()) {
            System.out.println("Inventário Vazio...");
            return null;
        } else {
            // Ciclo for para apresentar os itens de Consumível de Combate existentes:
            System.out.println("=========== LISTA(S) DA(S) POÇÃO(ÕES) DE RECUPERAÇÃO ===========");
            for (int numIndice = 0; numIndice < pocao.size(); numIndice++) {
                System.out.println((numIndice + 1) + "º - " + pocao.get(numIndice).getNomeItemHeroi() + "; HP + " + pocao.get(numIndice).getRecuperarVida() + "; FOR + " + pocao.get(numIndice).getAumentarForca());
            }
            System.out.println("=================================================================");

            // Tratamento de Erros para Opções inválidas do Usuário:
            System.out.print("Escolha uma opção dos itens acima: ");
            int indexEscolhido = 0;
            try {
                indexEscolhido = input.nextInt();
                if (indexEscolhido > pocao.size() || indexEscolhido < 1) {
                    throw new IllegalArgumentException();
                } else {
                    // Remoção do item escolhido do ArrayList<Consumivel>:
                    Pocao consumivel = (Pocao) pocao.remove(indexEscolhido - 1);

                    //TODO Ajustar aumento do HP sem Alterar o HP do Herói
                    // Aumentar Hp de acordo com a poção usada:
                    int vidaRecuperada = consumivel.getRecuperarVida();
                    this.setVidaEntidade(this.getVidaEntidade() + vidaRecuperada);

                    // Aumenta Força de acordo com a poção usada:
                    int forcaAumentada = consumivel.getAumentarForca();
                    this.setForcaEntidade(this.getForcaEntidade() + forcaAumentada);

                    // Mensagem de feedback sobre o uso da poção
                    System.out.println("Você usou " + consumivel.getNomeItemHeroi() + " e recuperou " + vidaRecuperada + " de vida e aumentou sua força em " + forcaAumentada + ".");

                }
                // Retornar o consumível selecionado
                //return pocao.get(indexEscolhido - 1);
            } catch (InputMismatchException mismatchException) {
                System.out.println("Erro: A entrada deve ser um número inteiro.");
            } catch (IllegalArgumentException argumentException) {
                System.out.println("Erro: A escolha deve estar entre 1 e " + pocao.size() + ".");
            }
            return null;
        }
    }

    /**
     * Método para Herói usar Comsumivel de Combate:
     *
     * @return null para Inventário ArrayList<ConsumivelCombate> Vazio
     * @return O Item Desejado para uso do Herói no Combate
     */
    protected ConsumivelCombate heroiUsarComsumivelCombate() {
        // Scanner para Entrada de dados:
        Scanner input = new Scanner(System.in);

        // Construir novo menu de ArrayList<ConsumivelCombate>:
        ArrayList<ConsumivelCombate> consumivelCombates = new ArrayList<>();

        for (int numIndice = 0; numIndice < this.inventarioHeroi.size(); numIndice++) {
            // Se o Item for uma instância de ConsumivelCombate, adicioná-lo ao ArrayList
            if (this.inventarioHeroi.get(numIndice) instanceof ConsumivelCombate) {
                consumivelCombates.add((ConsumivelCombate) this.inventarioHeroi.get(numIndice));
            }
        }

        // Listagem dos Itens Adicionados ao ArrayList<ConsumivelCombate>:
        if (consumivelCombates.isEmpty()) {
            System.out.println("Inventário Vazio...");
            return null;
        } else {
            // Ciclo for para apresentar os itens de Consumível de Combate existentes:
            System.out.println("=========== LISTA(S) DO(S) CONSUMIVÉL(EIS) DE COMBATE ===========");
            for (int numIndice = 0; numIndice < consumivelCombates.size(); numIndice++) {
                System.out.println((numIndice + 1) + "º - " + consumivelCombates.get(numIndice).getNomeItemHeroi() + "; ATK = " + consumivelCombates.get(numIndice).getAtaqueInstataneo());
            }
            System.out.println("=================================================================");

            // Tratamento de Erros para Opções inválidas do Usuário:
            System.out.print("Escolha uma opção dos itens acima: ");
            int indexEscolhido = 0;
            try {
                indexEscolhido = input.nextInt();
                if (indexEscolhido > consumivelCombates.size() || indexEscolhido < 1) {
                    throw new IllegalArgumentException();
                }
                // Retornar o consumível selecionado
                return consumivelCombates.get(indexEscolhido - 1);
            } catch (InputMismatchException mismatchException) {
                System.out.println("Erro: A entrada deve ser um número inteiro.");
            } catch (IllegalArgumentException argumentException) {
                System.out.println("Erro: A escolha deve estar entre 1 e " + consumivelCombates.size() + ".");
            }
            return null;
        }
    }

    /**
     * Método para o Herói Recolher o Item do NPC se Vencer a Batalha
     *
     * @param oponenteNPC
     */
    protected void heroiRecolherItemNPC(NPC oponenteNPC) {
        //TODO Refazer código utilizando ArmaHeroi horoiRecolherArma() e Consumivel heroiRecolherConsumivel()
        //Declaração de variáveis e Import Scanner para Entrada de dados:
        Scanner input = new Scanner(System.in);
        String opcaoParaAdicionarItemHeroi = "";
        boolean entradaValida = false;
        int numIndice = 0;

        //Adicionar a quantidade de Ouro perdido na batalha do NPC para o Herói:
        this.setOuroHeroi(getOuroHeroi() + oponenteNPC.getOuroNPC());

        if (oponenteNPC.getInventarioNPC().isEmpty()) {
            System.out.println("=======================================");
            System.out.println("INVENTÁRIO DO NPC ESTÁ VAZIO!!");
            System.out.println("=======================================");
        } else {
            // Ciclo ForEach para percorrer o inventário do NPC
            for (ItemHeroi itemHeroiAtual : oponenteNPC.getInventarioNPC()) {
                if (itemHeroiAtual instanceof Consumivel) {
                    // Imprimir os detalhes
                    System.out.println("========== LISTA(S) DO(S) CONSUMIVEL(EIS) EXISTENTE(S) DO NPC ==========");
                    System.out.println((numIndice + 1) + "º - " + itemHeroiAtual.getNomeItemHeroi());
                    System.out.println("========================================================================");

                    // Perguntar ao utilizador se quer ou não
                    do {
                        System.out.print("Gostaria de Adicionar o(s) consumível(eis) ao seu inventário? [S/N]: ");
                        try {
                            opcaoParaAdicionarItemHeroi = input.nextLine();

                            if (opcaoParaAdicionarItemHeroi.equalsIgnoreCase("S")) {
                                // Adicionar ao inventário
                                this.inventarioHeroi.add((Consumivel) itemHeroiAtual);
                            } else if (!opcaoParaAdicionarItemHeroi.equalsIgnoreCase("N")) {
                                System.err.println("Entrada inválida. Digite 'S' para Sim ou 'N' para Não.");
                            }
                        } catch (InputMismatchException mismatchException) {
                            System.err.println("Entrada inválida. Digite 'S' para Sim ou 'N' para Não.");
                            opcaoParaAdicionarItemHeroi = "";
                            input.next(); // Limpar o buffer do scanner
                        }
                    } while (!opcaoParaAdicionarItemHeroi.equalsIgnoreCase("S") && !opcaoParaAdicionarItemHeroi.equalsIgnoreCase("N"));
                } else {
                    // Caso não contenha Consumíveis para adicionar ao Herói
                    System.out.println("Desta Vez não tem Consumíveis no Inventário do Oponente " + oponenteNPC.getNomeEntidade());
                }


                //Verificar se o itemHeroiAtual é uma instância de ArmaPrincipal
                if (itemHeroiAtual instanceof ArmaPrincipal) {
                    // Imprimir os detalhes do item
                    System.out.println("========== Lista da Arma Principal dropada pelo NPC ==========");
                    System.out.println("1º - " + itemHeroiAtual.getNomeItemHeroi());
                    System.out.println("Ataque Normal = " + ((ArmaPrincipal) itemHeroiAtual).getAtaqueNormal());
                    System.out.println("Ataque Especial = " + ((ArmaPrincipal) itemHeroiAtual).getAtaqueEspecial());
                    System.out.println("============================================================");

                    //Perguntar ao usuário se deseja substituir a arma principal
                    System.out.print("Deseja Substituir sua Arma Principal '" + this.armaPrincipalHeroi.getNomeItemHeroi() + "' por '" + itemHeroiAtual.getNomeItemHeroi() + "'? [S/N]: ");


                    //Adicionar Tratamento de Erro para Opção de Troca da Arma Principal
                    String opcaoTrocaArmaPrincipal = input.nextLine();

                    if (opcaoTrocaArmaPrincipal.equalsIgnoreCase("S")) {
                        boolean permitido = false;

                        //Laço forEach para percorrer o ArrayList de permissões
                        for (String heroiPermitido : itemHeroiAtual.getItemHeroiPermitido()) {
                            //Verificar se o tipo do herói coincide com uma das permissões
                            System.out.println("Estou a comparar " + getTipoHeroi() + " com " + heroiPermitido);

                            if (getTipoHeroi().equals(heroiPermitido)) {
                                permitido = true;
                                break;
                            }
                        }

                        if (permitido) {
                            // Substituir a arma principal
                            this.setArmaPrincipalHeroi((ArmaPrincipal) itemHeroiAtual);
                            System.out.println("Substituição de arma: ");
                            this.exibirDetalhes();
                        } else {
                            System.out.println("Arma " + itemHeroiAtual.getNomeItemHeroi() + " não é para seu tipo de Herói");
                        }
                    } else {
                        System.out.println(itemHeroiAtual.getNomeItemHeroi() + " ficou ao chão empoeirada");
                    }
                } else {
                    System.out.println("Oponente " + oponenteNPC.getNomeEntidade() + " não contém nenhuma Arma desta vez!");
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
