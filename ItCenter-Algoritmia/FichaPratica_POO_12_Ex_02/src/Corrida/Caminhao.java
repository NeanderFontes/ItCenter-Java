package Corrida;

import Corrida.Enum.TipoCombustivel;

/**
 * Classe Camião: Para além de se assumir um veículo, deve ter o atributo capacidadeCarga (em Kg).
 * <p>
 * Elabore também o método viagem que recebe como parâmetro a distância e a carga (em Kg), e
 * avalie se o camião tem capacidade para essa carga:
 * o Caso ultrapasse a capacidade deve recusar a viagem.
 * o Caso a carga esteja dentro da capacidade, deve calcular o consumo e custo da viagem
 * (considere que todos os camiões usam DIESEL), sabendo que cada 100Kg de carga
 * aumentam 0,1L/100Km ao consumo.
 */
public class Caminhao extends Veiculos {
    private double capacidadeCargaMax;

    /**
     * Método Construtor da SuperClass <b>Veiculo</b> para Class Caminhao:
     *
     * @param marcaVeiculo           - Marca do Caminhão.
     * @param modeloVeiculo          - Modelo do Caminhão.
     * @param anoFabricacaoVeiculo   - Ano de Fabricação do Caminhão.
     * @param ciclindradaVeiculo     - Cilindradas do Caminhão.
     * @param potenciaVeiculo        - Potência do Caminhão.
     * @param kmPorLitro             - Quantidade em Litros gasto de litro/100Km
     * @param tipoCombustivelVeiculo - ENUM para Tipo de Combustivel (GASOLINA, DIESEL, GPL, ELETRICO)
     * @param capacidadeCargaMax     - Capacidade de Carga do Caminhão (em kg)
     */
    public Caminhao(String marcaVeiculo, String modeloVeiculo, int anoFabricacaoVeiculo, int ciclindradaVeiculo, int potenciaVeiculo, double kmPorLitro, TipoCombustivel tipoCombustivelVeiculo, double capacidadeCargaMax) {
        super(marcaVeiculo, modeloVeiculo, anoFabricacaoVeiculo, ciclindradaVeiculo, potenciaVeiculo, kmPorLitro, tipoCombustivelVeiculo);
        this.capacidadeCargaMax = capacidadeCargaMax;
    }

    /**
     * Método para Avaliar a Capacidade de Carga que recebe como parâmetro a distância e a carga (em Kg),
     * e avalie se o camião tem capacidade para essa carga:
     * <p>
     * o Caso ultrapasse a capacidade deve recusar a viagem.
     * o Caso a carga esteja dentro da capacidade, deve calcular o consumo e custo da viagem
     * (considere que todos os camiões usam DIESEL), sabendo que cada 100Kg de carga
     * aumentam 0,1L/100Km ao consumo.
     *
     * @param distanciaPecorridaEm100Km - Distância Total Pecorrida (a cada 100Km)
     * @param capacidadeCarga           - Capacidade da Carga do Caminhão
     * @return - asd
     */
    public String viagemCaminhao(int distanciaPecorridaEm100Km, double capacidadeCarga) {
        //Caso ultrapasse a capacidade deve recusar a viagem:
        if (capacidadeCarga > this.capacidadeCargaMax) {
            return "Capacidade de Carga acima do limite!!";
        } else {
            System.out.println("Capacidade de Carga Dentro do limite de Carga Maxima");
            calcularConsumoVeiculo(distanciaPecorridaEm100Km);
            System.out.println("De acordo com " + getKmPorLitro() + "/100Km irá conseguir pecorrer " + distanciaPecorridaEm100Km + " Km. \n*** OBS.: Sem Calcular a Carga ***");

            //Consumo Estimado adicionado de acordo com a carga adicional de 0.1L/100km:
            double consumoEstimado = getKmPorLitro() + ((capacidadeCarga / 100) * 0.1);

            //Custo da Viagem, considerando todos os Caminhões a DIESEL:
            double custoDaViagem = (consumoEstimado * 1.95);
            return "» Consumo da Viagem é de " + consumoEstimado + "/100km\n" +
                    "» Custo Total da Viagem = €" + custoDaViagem;
        }
    }
}
