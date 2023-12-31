package Poo_estudonauta.Aula_pratica2;

public class Aula2 {
    public static void main(String[] args) {
        //Objeto instanciado da classe Caneta:
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();
        Caderno note = new Caderno();

        //Criação de novos objetos a partir da instância para definir os
        // atributos, metodos() e estado do meu objeto:
        //Objeto c1:
        System.out.println("======= Objeto c1 ======");
        c1.modelo = "Bic";
        note.marca = "China cervantes";
        note.materias = 5;
        note.totalFolhas = 100;
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 90;
        c1.status();
        note.statusCaderno();
        c1.tampar();
        c1.rabiscar();
        note.cadernoFechado();
        note.rabiscarCaderno();

        System.out.println("\n======= Objeto c2 ======");

        //Objeto c2:
        c2.modelo = "Bic Estilo";
        c2.cor = "Vermelho";
        c2.ponta = 1.0f;
        c2.carga = 50;
        c2.status();
        note.statusCaderno();
        c2.destapar();
        c2.rabiscar();
        note.cadernoAberto();
        note.rabiscarCaderno();
    }
}
