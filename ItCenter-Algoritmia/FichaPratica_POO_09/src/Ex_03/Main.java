package Ex_03;

public class Main {
    /**
     * Método principal da funão
     * @param args
     */
    public static void main(String[] args) {
        //Instancia do objeto Retangulo:
        Retangulo tipo1 = new Retangulo(5, 10);

        //Saída de dados para identificar área do retangulo criado:
        System.out.println("Área do Retângulo = " + tipo1.areaRetangulo());
        System.out.println("Petrimetro do Retângulo = " + tipo1.perimetroRetangulo());
    }
}
