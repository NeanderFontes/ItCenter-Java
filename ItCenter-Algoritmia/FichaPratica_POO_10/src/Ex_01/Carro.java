package Ex_01;

import java.time.LocalDate;

public class Carro {
    private Carro carroAdversario;
    private TipoCombustivel tipoCombustivelCarro;
    private String marcaCarro, modeloCarro;
    private int anoFabricacaoCarro, ciclindradaCarro, potenciaCarro, diaAtual, mesAtual, anoAtual;
    private double kmPorLitro;

    public Carro(String marcaCarro, String modeloCarro, int anoFabricacaoCarro, int ciclindradaCarro, int potenciaCarro, double kmPorLitro, TipoCombustivel tipoCombustivelCarro) {
        this.tipoCombustivelCarro = tipoCombustivelCarro;
        this.marcaCarro = marcaCarro;
        this.modeloCarro = modeloCarro;
        this.anoFabricacaoCarro = anoFabricacaoCarro;
        this.ciclindradaCarro = ciclindradaCarro;
        this.potenciaCarro = potenciaCarro;
        this.anoAtual = anoAtual;
        this.kmPorLitro = kmPorLitro;
    }

    public void anoAtual() {
        LocalDate dataAtual = LocalDate.now();
        this.anoAtual = dataAtual.getYear();
        this.diaAtual = dataAtual.getDayOfMonth();
        this.mesAtual = dataAtual.getMonthValue();
    }

    /**
     * Método Ligar carro e imprimir parâmetros de acordo com o
     * tipo de combustivel(enum) se ano do carro maior que 30
     * Se ano do carro menor ou igual 30 imprimir no console o
     * som do carro de acordo com a potência do Carro
     */
    public void ligarCarro() {
        int idadeCarro = this.anoAtual - this.anoFabricacaoCarro;

        if (idadeCarro > 30) {
            if (this.tipoCombustivelCarro.equals(TipoCombustivel.DIESEL)) {
                System.out.println("“Deita um pouco de fumo… Custa a pegar… O carro está ligado!”" +
                        "“Vrum-vrum-vrum”");
            } else {
                System.out.println("“Custa a pegar… O carro está ligado!”" +
                        "“Vrum-vrum-vrum");
            }
        } else {
            if (this.potenciaCarro >= 250) {
                System.out.println("“Alta Potência!! O carro está ligado!” “VRUUMMMMMMVRUUMMMMMM”");
            } else {
                System.out.println("“O carro está ligado!“ “Vruummmmm“");
            }
        }
    }

    /**
     * Método para imprimir no console os Detalhes do Carro
     */
    public void exibirDetalhes() {
        System.out.println("Estamos Atualmente em: " + this.diaAtual + "/" + this.mesAtual + "/" + anoAtual);
        System.out.println("Marca: " + this.marcaCarro);
        System.out.println("Modelo: " + this.modeloCarro);
        System.out.println("Ano Fabricação: " + this.anoFabricacaoCarro);
        System.out.println("Cilindrada: " + this.ciclindradaCarro);
        System.out.println("Potência: " + this.potenciaCarro);
        System.out.println("Tipo de Combustivel: " + this.tipoCombustivelCarro);
    }

    public void apresentarCorrida(Carro carroAdversario) {
        System.out.println("================= TOP GEAR =================");
        System.out.println("\t\t***** Carro 1 *****");
        System.out.println("Marca: " + this.marcaCarro);
        System.out.println("Potência: " + this.potenciaCarro);
        System.out.println("Cilindrada: " + this.ciclindradaCarro);
        System.out.println("Tipo de Combustivel: " + this.tipoCombustivelCarro);
        System.out.println("\t\t***** Carro 2 *****");
        System.out.println("Marca: " + carroAdversario.marcaCarro);
        System.out.println("Potência: " + carroAdversario.potenciaCarro);
        System.out.println("Cilindrada: " + carroAdversario.ciclindradaCarro);
        System.out.println("Tipo de Combustivel: " + carroAdversario.tipoCombustivelCarro);
        System.out.println("=============================================");
    }

    /**
     * Método de Corrida de acordo com Maiores Potência e Cilindrada
     * @param carroAdversario Parâmetro de Adversário a escolher
     * @return - Vencedor da Corrida
     */
    public Carro corrida(Carro carroAdversario) {
        apresentarCorrida(carroAdversario);
        if (this.potenciaCarro > carroAdversario.getPotenciaCarro()) {
            return this;
        } else {
            if (this.potenciaCarro < carroAdversario.getPotenciaCarro()) {
                return carroAdversario;
            } else {
                if (this.ciclindradaCarro > carroAdversario.getCiclindradaCarro()) {
                    return this;
                } else {
                    if (this.ciclindradaCarro < carroAdversario.getCiclindradaCarro()) {
                        return carroAdversario;
                    } else {
                        if (this.anoFabricacaoCarro > carroAdversario.getAnoFabricacaoCarro()) {
                            return this;
                        } else if (this.anoFabricacaoCarro > carroAdversario.getAnoFabricacaoCarro()) {
                            return carroAdversario;
                        } else {
                            System.out.println("Empate Total!!");
                        }
                    }
                }
            }
        }
        return null;
    }

    /**
     * Método para calcular Consumo do Carro por distância Pecorrida em Km
     * @param kmPecorrido - Distância em Km
     * @return - Valor Pecorrido de acordo com Km/Litro do Carro.
     */
    public double consumoCarro(int kmPecorrido) {
        return kmPecorrido * kmPorLitro;
    }

    /**
     * Método para Desligar o Carro
     */
    public void desligarCarro() {
        System.out.println("***** Atenção Carro Desligado!! *****");

    }

    /**
     * Métodos Getter:
     * @return valores de acordo com os Atributos atribuido
     */
    public int getCiclindradaCarro() {
        return this.ciclindradaCarro;
    }

    public int getPotenciaCarro() {
        return this.potenciaCarro;
    }

    public int getAnoFabricacaoCarro() {
        return this.anoFabricacaoCarro;
    }
}
