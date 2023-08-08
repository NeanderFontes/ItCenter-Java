package Poo_estudonauta.Aula_pratica04;

/*
 * Projeto utilizando as estruturas com metodos especiais
 * Metodos get, set e construct.
 * Metodos public, private, protected.
 * Objeto Caneta.
 * Atributos: modelo, cor, tipoPonta, carga, tampada;
 * Metods: rabiscar(), tampar(), destampar();
 * Estado: status();
 */
public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.setModelo("Bic");
        c1.setPonta(0.5f);
        c1.status();

        System.out.println("=========================");

        Caneta c2 = new Caneta();
        c2.setModelo("Cristal");
        c2.setPonta(1.0f);
        c2.status();
    }
}
