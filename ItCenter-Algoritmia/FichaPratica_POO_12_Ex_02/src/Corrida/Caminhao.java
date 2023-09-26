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
     * @param distanciaKm     -
     * @param capacidadeCarga -
     * @return -
     */
    public boolean viagemCaminhao(int distanciaKm, double capacidadeCarga) {
        return true;
    }
}
