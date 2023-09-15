package ficha04;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        //Import Scanner para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis:
        int operador;

        //Entrada de dados:
        do {
            System.out.println("========== MENU ===========");
            System.out.println("1: Criar.");
            System.out.println("2: Atualizar.");
            System.out.println("3: Eliminar.");
            System.out.println("4: Sair.");
            System.out.println("===========================");
            System.out.print("Digite uma opção desejada: ");
            operador = input.nextInt();
            switch (operador) {
                case 1: //Opção Criar
                    System.out.println("Opção Criar.\n\n");
                    break;
                case 2: //Opção Atualizar
                    System.out.println("Opção Atualizar.\n\n");
                    break;
                case 3: //Opção Eliminar
                    System.out.println("Opção Eliminar.\n\n");
                    break;
                case 4: //Opção sair
                    System.out.println("Opção Sair.\n\n");
                    break;
                default:
                    System.out.println("Opção Inválida.\n\n");
                    break;
            }
        } while (operador != 4);
    }
}
