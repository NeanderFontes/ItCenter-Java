package Poo_estudonauta.Aula_pratica2;

//Criação da classe caneta e seus Atributos, Metodos() e Estado:
public class Caneta {
    //Atributos "Características" da Caneta:
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //Estado do obejto:
    void status() {
        System.out.println("O Modelo da Caneta: " + this.modelo);
        System.out.println("A caneta é de qual cor: " + this.cor);
        System.out.println("Qual tipo da ponta desta caneta " + this.cor +"? " + this.ponta);
        System.out.println("Qual a Carga atual da Caneta? " + this.carga + "%");
        System.out.println("A caneta está tampada? " + this.tampada);
    }

    //Métodos(Comportamentos) da Caneta:
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro, A Caneta está tampada, não da pra Rabiscar.");
        } else {
            System.out.println("A Caneta está destampada, pode Rabiscar!");
        }
    }
    void tampar() {
        this.tampada = true;
    }
    void destapar() {
        this.tampada = false;
    }
}
