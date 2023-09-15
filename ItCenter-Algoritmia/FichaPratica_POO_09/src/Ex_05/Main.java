package Ex_05;

public class Main {
    /**
     * Função principal:
     * @param args
     */
    public static void main(String[] args) {
        //Instancia de objeto Carro:
        Carro carroTipo1 = new Carro("BMW", "Série 1", 2023);

        //Saída de dados para obter resultado para ligar/desligar/travar Caro:
        carroTipo1.travarCarro();
        carroTipo1.desligarCarro();
    }
}
