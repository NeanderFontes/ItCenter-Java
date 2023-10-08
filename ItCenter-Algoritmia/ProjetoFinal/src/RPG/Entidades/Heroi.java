package RPG.Entidades;

import RPG.Item.AbstractClass.Consumivel;
import RPG.Item.ArmaPrincipal;
import RPG.Item.Pocao;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Heroi extends Entidade {
    private int nivelHeroi, ouroHeroi;
    private ArmaPrincipal armaPrincipalHeroi;
    private ArrayList<Consumivel> inventarioHeroi;

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
     * Método para Usar Poção
     */
    public void usarPocao() {
        //Scanner para entrada de dados:
        Scanner input = new Scanner(System.in);
        int itemEscolhido;

        //Acesso ao Inventário do Herós
        if (this.inventarioHeroi.isEmpty()) {
            System.out.println("O Inventário está vazio!");
        } else {
            //Ciclo para Listar as Poções do Herói.
            System.out.println("************* LISTA DE POçÔES *************");
            for (int numIndice = 0; numIndice < this.inventarioHeroi.size(); numIndice++) {
                System.out.println((numIndice + 1) + "º = " + this.inventarioHeroi.get(numIndice).getNomeItemHeroi());
            }

            //Entrada de dados para selecionar e usar a Poção:
            System.out.println("Escolha a Poção acima para usar.");
            itemEscolhido = input.nextInt();
            //todo laço while para validar a escolha e não encerrar o programa correto?
            do {
                if (itemEscolhido < 1 && itemEscolhido > this.inventarioHeroi.size()) {
                    System.out.println("Escolha Inválida");
                } else {
                    //todo Criar condição para usar Poção de For e Poção para Aumentar HP

                    //Remoção do item escohido do ArrayList<Consumivel> todo "REMOVE DO INVENTARIO CONSUMIVEL???"
                    Pocao consumivel = (Pocao) this.inventarioHeroi.remove(itemEscolhido - 1);

                    //todo "aumentar Hp de acordo com a poção usada???"
                    setVidaEntidade(getVidaEntidade() + consumivel.getRecuperarVida());
                    //todo "aumenta For de acordo com poção usada????"
                    setForcaEntidade(getForcaEntidade() + consumivel.getAumentarForca());
                }
            } while (itemEscolhido >= 1 && itemEscolhido <= this.inventarioHeroi.size());
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
        System.out.println("Arma Principal: " + this.armaPrincipalHeroi);
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
}
