package Poo_estudonauta.Aula_pratica04;

/*
 * Projeto utilizando as estruturas com metodos especiais
 * Metodos get, set e construct.
 * Metodos Visibilidade: public, private, protected.
 * Objeto Caneta.
 * Atributos: modelo, cor, tipoPonta, carga, tampada;
 * Metods: rabiscar(), tampar(), destampar();
 * Estado: status();
 */
public class Caneta {
    //Atributos "Características" private da Caneta:
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    //Métodos set(parâmetro) para modificar "passagem" de valores para as variáveis criadas.
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modeloSet) {
        this.modelo = modeloSet;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float pontaSet) {
        this.ponta = pontaSet;
    }

    public void status() {
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Tipo da ponta: " + this.ponta);
    }
}
