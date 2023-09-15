package ficha06;

import java.util.Scanner;

public class Ex_01 {

    //Método fazerBarulho
    static void fazerBarulho(String animal) {
        //Inicialização para "igualar" a forma escrita e seguir a compilação.
        switch (animal) {
            case "CACHORRO":
                System.out.print("O Cachorro faz: ");
                System.out.println("au au");
                break;

            case "GATO":
                System.out.print("O Gato faz: ");
                System.out.println("miau");
                break;

            case "PEIXE":
                System.out.print("O Peixe faz: ");
                System.out.println("glub glub");
                break;

            case "VACA":
                System.out.print("A Vaca faz: ");
                System.out.println("muuuuuuuu");
                break;

            case "PORCO":
                System.out.print("O Porco faz: ");
                System.out.println("oinc oinc");
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
        System.out.println("Escolha algum animal: ");
        do {
            System.out.println("Cachorro");
            System.out.println("Gato");
            System.out.println("Peixe");
            System.out.println("Vaca");
            System.out.println("Porco");
            System.out.println("Ou digite 'sair' para finalizar.");
            System.out.print("Digite o nome do anial desejado: ");
            //Entrada de dados com caixa alta:
            animal = input.next().toUpperCase();

            //Saída de dados do utilizador em método.
            fazerBarulho(animal);
            System.out.println();
        } while (!animal.equalsIgnoreCase("sair"));

    }
}
