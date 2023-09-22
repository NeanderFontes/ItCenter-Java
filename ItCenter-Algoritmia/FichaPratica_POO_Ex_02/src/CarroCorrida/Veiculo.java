package CarroCorrida;

public class Veiculo {
    private String marcaVeiculo, modeloVeiculo, tipoCombustivelVeiculo;
    private int anoFabricacaoVeiculo, potenciaVeiculo, cilindradaVeiculo;
    private double comsumoVeiculo;

    /**
     * Método Construtor da Super Class <b>Veiculo</b>
     * @param marcaVeiculo - Marca do Veiculo
     * @param modeloVeiculo - Modelo do Veiculo
     * @param tipoCombustivelVeiculo - Tipo de combustivel do Veiculo
     * @param anoFabricacaoVeiculo - Ano de Fabricação do Veiculo
     * @param potenciaVeiculo - Potência do Veiculo
     * @param cilindradaVeiculo - Cilindrada do Veiculo
     * @param comsumoVeiculo - Consumo 100km/litro do Veiculo
     */
    public Veiculo(String marcaVeiculo, String modeloVeiculo, String tipoCombustivelVeiculo, int anoFabricacaoVeiculo, int potenciaVeiculo, int cilindradaVeiculo, double comsumoVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.tipoCombustivelVeiculo = tipoCombustivelVeiculo;
        this.anoFabricacaoVeiculo = anoFabricacaoVeiculo;
        this.potenciaVeiculo = potenciaVeiculo;
        this.cilindradaVeiculo = cilindradaVeiculo;
        this.comsumoVeiculo = comsumoVeiculo;
    }

    public void ligarCarro() {

    }
}