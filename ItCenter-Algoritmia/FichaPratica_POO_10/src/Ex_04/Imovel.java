package Ex_04;

import static Ex_04.TipoApartamento.APARTAMENTO;

/**
 * Crie uma classe Imóvel, que tenha como atributos: rua, número da porta, cidade, tipo (apartamento, casa,
 * mansão), acabamento (para restauro, usada, nova, nova com alto acabamento), área, número de quartos,
 * número de casas de banho e área da piscina.
 * a. Crie um método para calcular o valor do imóvel com base nas seguintes regras:
 * i. Apartamento: cada m2 vale 1000€.
 * ii. Casa: cada m2 vale 3000€
 * iii. Mansão: cada m2 vale 5000€
 * iv. Para Restauro: preço total tem 50% de desconto
 * v. Usada: preço total tem 10% de desconto
 * vi. Nova: preço reflete sem desconto
 * vii. Nova com alto acabamento: preço total valoriza 25%
 * viii. Cada quarto incrementa 7500€ ao custo
 * ix. Cada casa de banho incrementa 10500€ ao custo
 * x. A piscina custa 1000/m2
 * b. Crie um método para mudar o estado de uma casa.
 * c. Crie um método chamado imprimirDescricao que imprima as especificações do imóvel.
 * d. Crie um método chamado compararImoveis, que receba outro imóvel como parâmetro e retorne
 * qual o imóvel mais caro.
 */
public class Imovel {
    private int numRuaImovel, numPortaImovel, numQuartosImovel, numBanheiroImovel, tamanhoPiscinaImivel;
    private double areaImovel, precoTotalImovel;
    private String cidadeImovel;
    private AcabamentoImovel tipoAcabamentoImovel;
    private TipoApartamento tipoApartamentoImovel;

    /**
     * Método para instanciar objeto Class Imovel
     *
     * @param numRuaImovel          - Nome da Rua do Imovel
     * @param numPortaImovel        - Número da Porta do Imovel
     * @param numQuartosImovel      - Número de Quartos do Imovel
     * @param numBanheiroImovel     - Número de Banheiro do Imovel
     * @param areaImovel            - Área total do Imovel (m2)
     * @param tamanhoPiscinaImivel  - Tamanho da Piscina (m2)
     * @param cidadeImovel          - Cidade do Imovel
     * @param tipoAcabamentoImovel  - Tipo de Acabamento enum (RESTAURO, USADO, NOVO, ALTA_QUALIDADE)
     * @param tipoApartamentoImovel - Tipo de Apartamento enum (CASA, APARTAMENTO, MANSAO)
     */
    public Imovel(int numRuaImovel, int numPortaImovel, int numQuartosImovel, int numBanheiroImovel, double areaImovel, int tamanhoPiscinaImivel, String cidadeImovel, AcabamentoImovel tipoAcabamentoImovel, TipoApartamento tipoApartamentoImovel) {
        this.numRuaImovel = numRuaImovel;
        this.numPortaImovel = numPortaImovel;
        this.numQuartosImovel = numQuartosImovel;
        this.numBanheiroImovel = numBanheiroImovel;
        this.areaImovel = areaImovel;
        this.tamanhoPiscinaImivel = tamanhoPiscinaImivel;
        this.cidadeImovel = cidadeImovel;
        this.tipoAcabamentoImovel = tipoAcabamentoImovel;
        this.tipoApartamentoImovel = tipoApartamentoImovel;
        this.precoTotalImovel = valorImovel();
    }

    /**
     * Método para obter Valor do Preço do Imovel de acordo com as condições dada
     */
    public double valorImovel() {
        //Declaração de variáveis:
        double valorM2 = 0.0;

        //Switch Case para Valores ENUM Tipo Apartamento do Imovel
        switch (this.tipoApartamentoImovel) {
            case APARTAMENTO:
                valorM2 = 1000;
                break;
            case CASA:
                valorM2 = 2000;
                break;
            case MANSAO:
                valorM2 = 3000;
                break;
        }
        //Valores para preço final do Imovel:
        this.precoTotalImovel = (this.areaImovel * valorM2);

        //Desconto para ENUM Acabamento Imovel:
        double desconto = 0.0;

        //Switch Case para Acabamento Imovel
        switch (this.tipoAcabamentoImovel) {
            case RESTAURO: //Desconto 50%
                desconto = (precoTotalImovel * 50) / 100;
                this.precoTotalImovel -= desconto;
                break;
            case USADO: //Desconto 10%
                desconto = (precoTotalImovel * 10) / 100;
                this.precoTotalImovel -= desconto;
                break;
            case NOVO: //Preço Mantém Igual
                break;
            case ALTA_QUALIDADE: //Valoriza 25%
                desconto = (precoTotalImovel * 25) / 100;
                this.precoTotalImovel += desconto;
                break;
        }

        //Agregar valor de acordo com numero de quartos:
        this.precoTotalImovel += (this.numQuartosImovel * 7500);

        //Agregar valor de acordo com numero de banheiro:
        this.precoTotalImovel += (this.numBanheiroImovel * 10500);

        //Agregar valor de acordo com tamanho da piscina:
        this.precoTotalImovel += (this.tamanhoPiscinaImivel * 1000);

        //Resultado Valor Total Final do Imovel:
        System.out.println("Valor Final do Imovel = €" + this.precoTotalImovel);

        return this.precoTotalImovel;
    }

    /**
     * Método para comprar Imovel através de comparação
     *
     * @param imovelComparado - Imovel a comparar
     * @return - Imovel com preço Maior, menor ou igual de acordo com valores total
     */
    public Imovel comprarImovel(Imovel imovelComparado) {
        if (this.precoTotalImovel > imovelComparado.precoTotalImovel) {
            System.out.println("Preço do Imovel " + getCidadeImovel() + " €" + this.precoTotalImovel + " é o Maior valor");
            return this;
        } else {
            if (this.precoTotalImovel < imovelComparado.precoTotalImovel) {
                System.out.println("Preço do Imovel " + getCidadeImovel() + " €" + this.precoTotalImovel + " é o Menor valor");
                return this;
            } else {
                if (imovelComparado.precoTotalImovel > this.precoTotalImovel) {
                    System.out.println("Preço do Imovel " + getCidadeImovel() + " €" + this.precoTotalImovel + " é o Maior valor");
                } else {
                    System.out.println("Preço do Imovel " + getCidadeImovel() + " €" + this.precoTotalImovel + " é o Menor valor");
                }
            }
        }
        return imovelComparado;
    }

    /**
     * Método para Mudar de Cidade o Imovel
     *
     * @param mudarCidadeImovel
     * @return - Cidade Nova
     */
    public String mudarCidadeImovel(String mudarCidadeImovel) {
        setCidadeImovel(mudarCidadeImovel);
        return this.cidadeImovel;
    }

    /**
     * Método para Exibir a Descrição do Imovel
     */
    public void descricaoImovel() {
        System.out.println("Especificações dos Imoveis: ");
        System.out.println("Tipo do Imovel: " + this.tipoApartamentoImovel);
        System.out.println("Acabamento do Imovel: " + this.tipoAcabamentoImovel);
        System.out.println("Cidade: " + this.cidadeImovel);
        System.out.println("Rua: " + this.numRuaImovel);
        System.out.println("Nº da Porta Principal: " + this.numPortaImovel);
        System.out.println("Area total do Imovel: " + this.areaImovel + " m2");
        System.out.println("Nº de Quartos: " + this.numQuartosImovel);
        System.out.println("Nº de Banheiro: " + this.numBanheiroImovel);
        System.out.println("Area total da Piscina: " + this.tamanhoPiscinaImivel + " m2");
    }

    /**
     * Método Getter e Setter
     *
     * @param cidadeImovel
     */
    public void setCidadeImovel(String cidadeImovel) {
        this.cidadeImovel = cidadeImovel;
    }

    public String getCidadeImovel() {
        return cidadeImovel;
    }
}
