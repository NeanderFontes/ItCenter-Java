package task004;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        /**
         * 2. Implemente um programa que leia a opção do menu desejada (opções: 1. Criar, 2. Atualizar, 3. Eliminar, 0. Sair).
         * Se uma das opções 1, 2 e 3 for escolhida, deverá apresentar um texto com a opção escolhida. Caso a escolha
         * esteja fora das opções válidas, deverá informar o utilizador. De seguida, deverá apresentar novamente o menu
         * para poder selecionar novas opções até que a opção 4 seja escolhida.
         */
        
        // Scanner input for data
        Scanner input = new Scanner(System.in);
        
        // Declaration of variables
        int userOption;
        String userOptionChoose = "";
        
        // Input data by the user
        do {
            System.out.println("----------- MENU -----------");
            System.out.println("[ 1 ] - Create");
            System.out.println("[ 2 ] - Update");
            System.out.println("[ 3 ] - Eliminate");
            System.out.println("[ 0 ] - Exit");
            System.out.println("----------------------------");
            System.out.print("Choose an option above: ");
            userOption = input.nextInt();
            switch (userOption) {
                case 1 -> userOptionChoose = "Create";
                case 2 -> userOptionChoose = "Update";
                case 3 -> userOptionChoose = "Eliminate";
                case 0 -> userOptionChoose = "Exit";
                default -> System.out.println("Invalid Option");
            }
        } while (userOption != 0);
        
        // Final data
        System.out.println(userOptionChoose);
        
        // Close Scanner to prevent resource leak
        input.close();
    }
}
