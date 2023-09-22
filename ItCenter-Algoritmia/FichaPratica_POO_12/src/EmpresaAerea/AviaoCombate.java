package EmpresaAerea;

import EmpresaAerea.Enum.Arma;

import java.util.ArrayList;

public class AviaoCombate extends Aviao {
    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Arma> arsenal;

    /**
     * Método Constutor de SuperClass <b>Aviao</b>
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
     * @param paisOrigem
     * @param camuflagem
     * @param arsenal
     */
    public AviaoCombate(int serial, int anoFabricacao, int numMotores, String modelo, double peso, double cumprimentoFuselagem, double envergaduraAsas, double alturaCauda, double autonomia, double velMax, double precoAviao, String paisOrigem, boolean camuflagem, ArrayList<Arma> arsenal) {
        super(serial, anoFabricacao, numMotores, modelo, peso, cumprimentoFuselagem, envergaduraAsas, alturaCauda, autonomia, velMax, precoAviao);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.arsenal = new ArrayList<Arma>();
    }

    /**
     * Método para adicionar Arma nova ao arsenal:
     * @param armaNova
     */
    public void addArma(Arma armaNova) {
        if (this.arsenal.size() != 3) {
            this.arsenal.add(armaNova);
        } else {
            System.out.println("Arsenal já cheio do " + super.getModelo());
        }
    }

    /**
     * Método que remove uma Arma
     * @param index Indíce da Arma a Remover
     */
    public void removeArma(int index){
        this.arsenal.remove(index);
    }

    /**
     * Método para exibir detalhes do <b>Avião de Combate</b>
     */
    public void exibirDetalhesCombate(){
        System.out.println("\nAvião de Combate");
        super.exibirDetalhes();
        System.out.println("Pais de Origem: "+this.paisOrigem);
        System.out.println("Camuflagem: "+this.camuflagem);
        System.out.print("Arsenal: ");
        for(Arma armaAtual : this.arsenal){
            System.out.print(armaAtual+" | ");
        }
        System.out.println("\n");
    }
}
