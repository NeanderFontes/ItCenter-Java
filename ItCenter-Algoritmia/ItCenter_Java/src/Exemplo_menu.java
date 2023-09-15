import java.util.Scanner;
public class Exemplo_menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Somar dois números");
            System.out.println("2. Subtrair dois números");
            System.out.println("3. Alterar números de entrada");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    int resultadoSoma = num1 + num2;
                    System.out.println("Resultado da soma: " + resultadoSoma);
                    break;
                case 2:
                    int resultadoSubtracao = num1 - num2;
                    System.out.println("Resultado da subtração: " + resultadoSubtracao);
                    break;
                case 3:
                    System.out.print("Digite o novo primeiro número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Digite o novo segundo número: ");
                    num2 = scanner.nextInt();
                    System.out.println("Números atualizados com sucesso!");
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
