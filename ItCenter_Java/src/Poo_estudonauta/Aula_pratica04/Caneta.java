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

    //Método constutor: "Serve como passagem de parâmetros para a função main principal".
    public Caneta(String m, String c, float p, int cg, boolean t) {
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.carga = cg;
        this.tampada = t;
    }

    private void destampar() {
        this.tampada = false;
    }

    private void tampar() {
        this.tampada = true;
    }

    //Métodos get & set criados a partir dos atributos:
    //Passagem de parâmetro para o atributo "String modelo" do objeto caneta criado.
    public void setModelo(String modeloSet) {
        this.modelo = modeloSet;
    }
    //Métodos get() para modelo:
    public String getModelo() {
        return modelo;
    }

    //Passagem de parâmetro para o atributo "String cor" do objeto caneta criado.
    public void setCor(String corSet) {
        this.cor = corSet;
    }
    //Método get() para cor:
    public String getCor() {
        return cor;
    }

    //Passagem de parâmetro para o atributo "float ponta" do objeto caneta criado.
    public void setPonta(float pontaSet) {
        this.ponta = pontaSet;
    }
    //Metodo get() para ponta:
    public float getPonta() {
        return ponta;
    }

    //Passagem de parâmetro para o atributo "int carga" do objeto caneta criado.
    public void setCarga(int cargaSet) {
        this.carga = cargaSet;
    }
    //Método get() para carga:
    public int getCarga() {
        return carga;
    }

    //Passagem de parâmetro para o atributo "boolean tampada" do objeto caneta criado.
    public void setTampada(boolean tampadaSet) {
        this.tampada = tampadaSet;
    }
    //Método get() para tampada:
    public boolean getTampada() {
        return true;
    }

    //Estado atual do Objeto para saída de informações na função main principal:
    public void status() {
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo é: " + this.modelo);
        System.out.println("A Cor da caneta é: " + this.cor);
        System.out.println("Tipo da ponta: " + this.ponta);
        System.out.println("A carga atual = " + this.carga + "%");
        System.out.println("Está tampada? ");

        if (this.tampada == true) {
            System.out.println("Caneta está tampada");
        } else {
            System.out.println("Caneta está destampada");
        }
    }
}
