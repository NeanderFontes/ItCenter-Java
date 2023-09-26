package Corrida;

import Corrida.Enum.TipoCombustivel;

import static Corrida.Enum.TipoCombustivel.*;

/**
 * Classe Carro: Para além de se assumir um veículo, deve ter o atributo quantidadePassageiros.
 * Elabore o método calcularCusto que com base no tipoCombustivel deve apresentar em € o custo da
 * viagem (pode fazer uso de outros métodos).
 * (GASOLINA = 2.10€/L, DIESEL = 1.95€/L, GPL = 1.15€/L, ELETRICO = 0.12€/L).
 */
public class Carro extends Veiculos {
    private int quantidadePassageiros;

    /**
     * Método Construtor da SuperClass <b>Veiculo</b> extend Carro:
     *
     * @param marcaCarro            - Marca do Carro
     * @param modeloCarro           - Modelo do Carro
     * @param anoFabricacaoCarro    - Ano de Fabricação do Carro
     * @param ciclindradaCarro      - Cilindrada do Carro
     * @param potenciaCarro         - Potência do Carro
     * @param kmPorLitro            - Quantidade em Litros gasto de litro/100Km
     * @param tipoCombustivelCarro  - ENUM para Tipo de Combustivel (GASOLINA, DIESEL, GPL, ELETRICO)
     * @param quantidadePassageiros - Quantidade de Passageiros do Carro
     */
    public Carro(String marcaCarro, String modeloCarro, int anoFabricacaoCarro, int ciclindradaCarro, int potenciaCarro, double kmPorLitro, TipoCombustivel tipoCombustivelCarro, int quantidadePassageiros) {
        super(marcaCarro, modeloCarro, anoFabricacaoCarro, ciclindradaCarro, potenciaCarro, kmPorLitro, tipoCombustivelCarro);
        this.quantidadePassageiros = quantidadePassageiros;
    }

    /**
     * Método para Calcular Custo total do Km Pecorrido.
     *
     * @return - Preço do Custo de acordo com tipo de Combustivel do Carro.
     * (GASOLINA = 2.10€/L, DIESEL = 1.95€/L, GPL = 1.15€/L, ELETRICO = 0.12€/L).
     */
    public double calcularCustoKmPecorrido(int kmPecorrido) {
        double precoCombustivel = 0.0;
        double calcularCustoKmTotal;

        switch (super.getTipoCombustivelVeiculo()) {
            case GASOLINA:
                precoCombustivel = 2.1;
                break;
            case DIESEL:
                precoCombustivel = 1.95;
                break;
            case GPL:
                precoCombustivel = 1.15;
                break;
            case ELETRICO:
                precoCombustivel = 0.12;
                break;
        }

        calcularCustoKmTotal = (precoCombustivel * this.calcularConsumoVeiculo(kmPecorrido));

        System.out.println("Custo Total da Viagem = €" + calcularCustoKmTotal);
        return calcularCustoKmTotal;
    }
}
