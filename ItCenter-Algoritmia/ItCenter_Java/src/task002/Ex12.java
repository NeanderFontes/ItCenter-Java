package task002;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        /**
         * 12. Implemente um programa de menu (opções do menu: 1. Criar 2. Atualizar 3. Eliminar 4. Sair). Se uma das opções
         * 1, 2 ou 3 for escolhida, imprima na tela a opção selecionada, se for a 4 não deve fazer nada. Caso a opção for
         * inválida, deve informar o utilizador.
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        int userOption;
        String declarationOption = "";

        // Data input by the user
        System.out.println("------------ MENU ------------");
        System.out.println("[ 1 ] - Create");
        System.out.println("[ 2 ] - Update");
        System.out.println("[ 3 ] - Eliminate");
        System.out.println("[ 4 ] - Finish");
        System.out.println("------------------------------");
        System.out.print("Chose one option above: ");
        userOption = input.nextInt();

        switch (userOption) {
            case 1 -> declarationOption = "Create data";
            case 2 -> declarationOption = "Update data";
            case 3 -> declarationOption = "Eliminate data";
            case 4 -> declarationOption = "Finish program.";
            default -> System.out.println("Invalid option");
        }

        // Final data
        System.out.println(declarationOption);

        // Close scanner to prevent resouce leak
        input.close();
    }
}
