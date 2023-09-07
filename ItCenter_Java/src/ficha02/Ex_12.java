package ficha02;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        //Import scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        //opções do menu:
        // 1. Criar
        // 2. Atualizar
        // 3. Eliminar
        // 4. Sair

        //Declaração de variáveis:
        int operador;

        //Entrada ded dados:
        System.out.print("Escolha uma opção entre 1 - 4: ");
        System.out.println("1 - Criar");
        System.out.println("2 - Atualizar");
        System.out.println("3 - Eliminar");
        System.out.println("4 - Sair");
        operador = input.nextInt();

        switch (operador) {
            case 1:
                System.out.println("Escolheu Criar");
                break;
            case 2:
                System.out.println("Escolheu Atualizar");
                break;
            case 3:
                System.out.println("Escolheu Eliminar");
                break;
            case 4:
                System.out.println("Escolheu Sair");
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
    }
}
