package Ex_04;

public class Main {
    /**
     * Função principal
     * @param args
     */
    public static void main(String[] args) {
        //Instanciando objeto Circulo:
        Circulo tipoCirculo1 = new Circulo(5.6);

        //Saída de dados para obter a área do Circulo:
        System.out.println("Área do circulo = " + tipoCirculo1.areaCirculo());
    }
}
