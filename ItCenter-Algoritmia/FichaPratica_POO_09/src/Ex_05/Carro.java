package Ex_05;

/**
 * Class Carro
 */
public class Carro {
    private String marca, modelo;
    private int anoFabricacao;
    private boolean ligado = false;

    /**
     * Método Construtor para chamada de instancia
     * @param marca - Marca do carro
     * @param modelo - Modelo do carro
     * @param anoFabricacao - Ano de fabricação do carro
     */
    public Carro(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public void ligarCarro() {
        if (ligado) {
            System.out.println("Carro Desligado.\nPrecisa Ligar o carro.");
        } else {
            this.ligado = true;
            System.out.println("Atenção Carro Ligado!!");
        }

    }

    public void desligarCarro() {
        if (ligado == true) {
            System.out.println("");
        }
        this.ligado = false;
        
    }

    public void travarCarro() {

    }
}
