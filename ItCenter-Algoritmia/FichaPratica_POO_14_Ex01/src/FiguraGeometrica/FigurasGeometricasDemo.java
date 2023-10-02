package FiguraGeometrica;

/**
 * Método main
 * Criar uma classe chamada "FigurasGeometricasDemo" com um método main que cria um objeto de
 * cada uma das classes (FiguraGeometrica, Retangulo, Circulo e Triangulo) e chama o método
 * “mostrarCor()” e "calcularArea()" de cada um deles
 */
public class FigurasGeometricasDemo {
    public static void main(String[] args) {
        //Instanciar Objetos:
        Retangulo retangulo = new Retangulo("Azul",2,2);
        Triangulo triangulo = new Triangulo("Vermelho", 2, 3,2,5);
        Circulo circulo = new Circulo("Verde", 3);

        //Saída de dados:
        System.out.println("As cores são: ");
        System.out.println(retangulo.mostrarCor());
        System.out.println(triangulo.mostrarCor());
        System.out.println(circulo.mostrarCor());
        System.out.println();

        //Calcular área das figuras geométricas:
        System.out.println("As áreas são: ");
        System.out.println(retangulo.calcularArea());
        System.out.println(triangulo.calcularArea());
        System.out.println(circulo.calcularArea());
    }
}
