package Corrida;

import Corrida.Enum.TipoCombustivel;

import java.time.LocalDate;

/**
 * Transforme a Classe Carro numa Classe denominada Veículo. De seguida, crie a classe Carro, a classe Mota e
 * a classe Camião devendo herdar os atributos e comportamentos de Veículo.
 * <p>
 * • Classe Veículo: Deve ter atributos de Marca, Modelo, Ano de Fabrico, Potência, Cilindrada,
 * TipoCombustivel e litros100Km. Os métodos deverão ser os previamente implementados, ou seja,
 * ligar( ), corrida( ) e calcularConsumo( ).
 * <p>
 * I - Classe Carro: Para além de se assumir um veículo, deve ter o atributo quantidadePassageiros.
 * Elabore o método calcularCusto que com base no tipoCombustivel deve apresentar em € o custo da
 * viagem (pode fazer uso de outros métodos).
 * <p>
 * (GASOLINA = 2.10€/L, DIESEL = 1.95€/L, GPL = 1.15€/L, ELETRICO = 0.12€/L).
 * II - Classe Mota: Para além de se assumir um veículo, deve também ter o método imagem que imprime
 * o conteúdo do ficheiro mota.txt na consola.
 * <p>
 * III - Classe Camião: Para além de se assumir um veículo, deve ter o atributo capacidadeCarga (em Kg).
 * Elabore também o método viagem que recebe como parâmetro a distância e a carga (em Kg),
 * e avalie se o camião tem capacidade para essa carga:
 * o Caso ultrapasse a capacidade deve recusar a viagem.
 * o Caso a carga esteja dentro da capacidade, deve calcular o consumo e custo da viagem
 * (considere que todos os camiões usam DIESEL), sabendo que cada 100Kg de carga aumentam 0,1L/100Km ao consumo.
 */

public class Veiculos {
    private Veiculos veiculoAdversario;
    private TipoCombustivel tipoCombustivelVeiculo;
    private String marcaVeiculo, modeloVeiculo;
    private int anoFabricacaoVeiculo, ciclindradaVeiculo, potenciaVeiculo, diaAtual, mesAtual, anoAtual;
    private double kmPorLitro;

    /**
     * Método Construtor da Super Classe Veiculo
     *
     * @param marcaVeiculo           - Marca do Veiculo
     * @param modeloVeiculo          - Modelo do Veiculo
     * @param anoFabricacaoVeiculo   - Ano de Fabricação do Veiculo
     * @param ciclindradaVeiculo     - Cinlindrada do Veiculo
     * @param potenciaVeiculo        - Potencia do Veiculo (cc)
     * @param kmPorLitro             - Quantidade em Litros gasto de litro/100Km
     * @param tipoCombustivelVeiculo - ENUM para Tipo de Combustivel (GASOLINA, DIESEL, GPL, ELETRICO)
     */
    public Veiculos(String marcaVeiculo, String modeloVeiculo, int anoFabricacaoVeiculo, int ciclindradaVeiculo, int potenciaVeiculo, double kmPorLitro, TipoCombustivel tipoCombustivelVeiculo) {
        this.tipoCombustivelVeiculo = tipoCombustivelVeiculo;
        this.marcaVeiculo = marcaVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.anoFabricacaoVeiculo = anoFabricacaoVeiculo;
        this.ciclindradaVeiculo = ciclindradaVeiculo;
        this.potenciaVeiculo = potenciaVeiculo;
        this.anoAtual = getAnoAtual();
        this.kmPorLitro = kmPorLitro;
        this.anoAtual();
    }

    /**
     * Método para Atribuir Data atual do Sistema Operacional;
     */
    private void anoAtual() {
        //Import Biblioteca LocalDate para data atual
        LocalDate dataAtual = LocalDate.now();
        this.anoAtual = dataAtual.getYear();
        this.diaAtual = dataAtual.getDayOfMonth();
        this.mesAtual = dataAtual.getMonthValue();
        System.out.println("Estamos Atualmente em: " + getDiaAtual() + "/" + getMesAtual() + "/" + getAnoAtual());
    }

    /**
     * Método Ligar veiculo e imprimir parâmetros de acordo com o
     * tipo de combustivel(ENUM) se ano do veiculo maior que 30
     * Se ano do veiculo menor ou igual 30 imprimir no console o
     * som do veiculo de acordo com a potência do Veiculo
     */
    public void ligarVeiculo() {
        int idadeVeiculo = this.anoAtual - this.anoFabricacaoVeiculo;

        if (idadeVeiculo > 30) {
            if (this.tipoCombustivelVeiculo.equals(TipoCombustivel.DIESEL)) {
                System.out.println("“Deita um pouco de fumo… Custa a pegar… O veiculo está ligado!”" +
                        "“Vrum-vrum-vrum”");
            } else {
                System.out.println("“Custa a pegar… O veiculo está ligado!”" +
                        "“Vrum-vrum-vrum");
            }
        } else {
            if (this.potenciaVeiculo >= 250) {
                System.out.println("“Alta Potência!! O veiculo está ligado!” “VRUUMMMMMMVRUUMMMMMM”");
            } else {
                System.out.println("“O veiculo está ligado!“ “Vruummmmm“");
            }
        }
    }

    /**
     * Método para imprimir no console os Detalhes do Veiculo
     */
    public void exibirDetalhes() {
        System.out.println("Marca: " + this.marcaVeiculo);
        System.out.println("Modelo: " + this.modeloVeiculo);
        System.out.println("Ano Fabricação: " + this.anoFabricacaoVeiculo);
        System.out.println("Cilindrada: " + this.ciclindradaVeiculo);
        System.out.println("Potência: " + this.potenciaVeiculo);
        System.out.println("Tipo de Combustivel: " + this.tipoCombustivelVeiculo);
    }

    /**
     * Método para Apresentar os veiculos da corrida:
     *
     * @param veiculoAdversario - Usado como parâmetro na instancia
     */
    public void apresentarCorrida(Veiculos veiculoAdversario) {
        System.out.println("================= TOP GEAR =================");
        System.out.println("\t\t***** Veiculo 1 *****");
        System.out.println("Marca: " + this.marcaVeiculo);
        System.out.println("Potência: " + this.potenciaVeiculo);
        System.out.println("Cilindrada: " + this.ciclindradaVeiculo);
        System.out.println("Tipo de Combustivel: " + this.tipoCombustivelVeiculo);
        System.out.println("Ano do Veiculo: " + this.anoFabricacaoVeiculo);
        System.out.println("\t\t***** Veiculo 2 *****");
        System.out.println("Marca: " + veiculoAdversario.marcaVeiculo);
        System.out.println("Potência: " + veiculoAdversario.potenciaVeiculo);
        System.out.println("Cilindrada: " + veiculoAdversario.ciclindradaVeiculo);
        System.out.println("Tipo de Combustivel: " + veiculoAdversario.tipoCombustivelVeiculo);
        System.out.println("Ano do Veiculo: " + veiculoAdversario.anoFabricacaoVeiculo);
        System.out.println("=============================================");
    }

    /**
     * Método de Corrida de acordo com Maiores Potência e Cilindrada
     *
     * @param veiculoAdversario Parâmetro de Adversário a escolher
     * @return - Vencedor da Corrida
     */
    public Veiculos corrida(Veiculos veiculoAdversario) {
        apresentarCorrida(veiculoAdversario);
        if (this.potenciaVeiculo > veiculoAdversario.getPotenciaVeiculo()) {
            return this;
        } else {
            if (this.potenciaVeiculo < veiculoAdversario.getPotenciaVeiculo()) {
                return veiculoAdversario;
            } else {
                if (this.ciclindradaVeiculo > veiculoAdversario.getCiclindradaVeiculo()) {
                    return this;
                } else {
                    if (this.ciclindradaVeiculo < veiculoAdversario.getCiclindradaVeiculo()) {
                        return veiculoAdversario;
                    } else {
                        if (this.anoFabricacaoVeiculo > veiculoAdversario.getAnoFabricacaoVeiculo()) {
                            return this;
                        } else {
                            if (this.anoFabricacaoVeiculo < veiculoAdversario.getAnoFabricacaoVeiculo()) {
                                return veiculoAdversario;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /**
     * Método para calcular Consumo do Veiculo por distância Pecorrida em Km
     *
     * @param kmPecorrido - Distância em Km
     * @return - Valor Pecorrido de acordo com Km/Litro do Veiculo.
     */
    public double calcularConsumoVeiculo(int kmPecorrido) {
        return (kmPecorrido * this.kmPorLitro) / 100;
    }

    /**
     * Método para Desligar o Veiculo
     */
    public void desligarVeiculo() {
        System.out.println("***** Atenção Veiculo Desligado!! *****");

    }

    /**
     * Métodos Getter:
     *
     * @return valores de acordo com os Atributos atribuido
     */
    public int getCiclindradaVeiculo() {
        return this.ciclindradaVeiculo;
    }

    public int getPotenciaVeiculo() {
        return this.potenciaVeiculo;
    }

    public int getAnoFabricacaoVeiculo() {
        return this.anoFabricacaoVeiculo;
    }

    public TipoCombustivel getTipoCombustivelVeiculo() {
        return this.tipoCombustivelVeiculo;
    }

    public int getDiaAtual() {
        return this.diaAtual;
    }

    public int getMesAtual() {
        return this.mesAtual;
    }

    public int getAnoAtual() {
        return this.anoAtual;
    }

    public double getKmPorLitro() {
        return kmPorLitro;
    }
}
