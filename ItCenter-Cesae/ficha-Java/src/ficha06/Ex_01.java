package ficha06;

import java.util.Scanner;

public class Ex_01 {

    //Método fazerBarulho
    static void fazerBarulho(String animal) {
        //Inicialização para "igualar" a forma escrita e seguir a compilação.
        animal.toUpperCase();
        switch (animal) {
            case "CACHORRO":
                System.out.println("");
                break;
            case "GATO":
                System.out.println("");
                break;
            case "PEIXE":
                System.out.println("");
                break;
            case "VACA":
                System.out.println("");
                break;
            case "PORCO":
                System.out.println("");
                break;
            default:
                System.out.println("");
                break;
        }
    }


    public static void main(String[] args) {
        //Import Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis:
        String animal;

        //Entrada de dados
        System.out.println("Escolha algum animal");
        do {
            System.out.println("cachorro");
            System.out.println("gato");
            System.out.println();
            animal = input.next();
            animal.toUpperCase();
        } while (!animal.equals("cachorro"));
        //Saída de dados do utilizador em método.
        fazerBarulho(animal);

    }
}
