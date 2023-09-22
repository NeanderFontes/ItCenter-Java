package EmpresaAerea;

import EmpresaAerea.Enum.Categoria;
import EmpresaAerea.Enum.Instalacao;

import java.util.ArrayList;

public class JatoPrivado extends Aviao {
    private int lotacao;
    private double capacidadeBagagem;
    private Categoria categoria;
    private ArrayList<Instalacao> instalacoes;

    /**
     * Método Construtor de <b>Jato Privado</b>
     *
     * @param serial
     * @param anoFabricacao
     * @param numMotores
     * @param modelo
     * @param peso
     * @param cumprimentoFuselagem
     * @param envergaduraAsas
     * @param alturaCauda
     * @param autonomia
     * @param velMax
     * @param precoAviao
     * @param lotacao
     * @param capacidadeBagagem
     * @param categoria
     */
    public JatoPrivado(int serial, int anoFabricacao, int numMotores, String modelo, double peso, double cumprimentoFuselagem, double envergaduraAsas, double alturaCauda, double autonomia, double velMax, double precoAviao, int lotacao, double capacidadeBagagem, Categoria categoria) {
        super(serial, anoFabricacao, numMotores, modelo, peso, cumprimentoFuselagem, envergaduraAsas, alturaCauda, autonomia, velMax, precoAviao);
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.categoria = categoria;
        this.instalacoes = new ArrayList<Instalacao>();
    }

    /**
     * Método par adicionar uma nova Instalação
     * @param instalacaoNova - Para adicionar Novas Instalações.
     */
    public void addInstalacao(Instalacao instalacaoNova) {
        this.instalacoes.add(instalacaoNova);
    }

    /**
     * Método para remover uma Instalação
     * @param index - Para remover a instalação
     */
    public void removeInstalacao(int index) {
        this.instalacoes.remove(index);
    }

    /**
     * Método para exibir detalhes do <b>Jato Privado</b>
     */
    public void exibirDetalhesJato(){
        System.out.println("\nJato Privado");
        super.exibirDetalhes();
        System.out.println("Lotação: "+this.lotacao+" passageiros");
        System.out.println("Capacidade de Bagagem: "+this.lotacao+" cm3");
        System.out.print("Instalações: ");
        for(Instalacao instalacaoAtual : this.instalacoes){
            System.out.print(instalacaoAtual+" | ");
        }
        System.out.println("\n");
    }
}
