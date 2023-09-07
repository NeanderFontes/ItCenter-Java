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
    //Método principal:
    public static void main(String[] args) {
        //Criando Objeto Caneta instânciado para entrada de dados atributos através de cada parâmetro criado:
        Caneta c1 = new Caneta("Bic","Azul", 0.5f, 90, true);
        //Saída de dados do metodo estado atual status:
        c1.status();


        System.out.println("=========================");

        Caneta c2 = new Caneta("Cristal","Preta", 1.0f, 50, false);
    /*  c2.setModelo("Cristal");
        c2.setCor("Preta");
        c2.setPonta(1.0f);
        c2.setCarga(50);
        c2.setTampada(false); */
        c2.status();
    }
}
