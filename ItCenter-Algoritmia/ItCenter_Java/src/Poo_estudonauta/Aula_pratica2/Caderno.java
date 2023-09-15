package Poo_estudonauta.Aula_pratica2;

//Criação da classe caderno e seus Atributos, Metodos() e Estado:
public class Caderno {
    //Atributos "Características" do caderno:
    String marca;
    int materias, totalFolhas;
    boolean setCaderno;

    //Estado do Objeto:
    protected void statusCaderno(){
        System.out.println("O Modelo deste caderno é " + this.marca);
        System.out.println("Ele contém " + this.materias + " matérias com total de " + this.totalFolhas + " folhas.");
        System.out.println("O Caderno está aberto? " + this.setCaderno);
    }


    //Métodos(Comportamentos) da Caneta:
    void rabiscarCaderno() {
        if (this.setCaderno == true) {
            System.out.println("Caderno está aberto, pode rabiscar!");
        } else {
            System.out.println("E abra o caderno para poder rabiscar, está fechado!");
        }
    }
    void cadernoAberto() {
        this.setCaderno = true;
    }

    void cadernoFechado() {
        this.setCaderno = false;
    }
}
