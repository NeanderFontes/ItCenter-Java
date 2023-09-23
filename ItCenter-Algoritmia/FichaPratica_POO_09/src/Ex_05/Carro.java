package Ex_05;

import java.util.Scanner;

/**
 * Class Carro
 */
public class Carro {
    private String marca, modelo;
    private int anoFabricacao;
    private boolean ligado = false;

    /**
     * Método Construtor para chamada de instancia
     *
     * @param marca         - Marca do carro
     * @param modelo        - Modelo do carro
     * @param anoFabricacao - Ano de fabricação do carro
     */
    public Carro(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.ligado = false;
    }

    public void ligarCarro() {
        this.ligado = true;
        if (!this.ligado) {
            System.out.println("Carro já está deligado");
        } else {
            System.out.println("Vru vru vruummm.. Carro Ligado!!");
        }
    }

    public void desligarCarro() {
        this.ligado = false;
        System.out.println("***** Carro Desligado!! *****");

    }

/*    public void travarCarro() {
        //Scanner para travar o carro:
        Scanner input = new Scanner(System.in);

        if (ligado) {
            System.out.println("***** Atenção!! Carro ligado, Desligar antes de Travar.");
        } else if (ligado) {
            System.out.println("Carro Está desligado!!");
        } else {
            //this.ligado = true;
            System.out.print("Deseja travar o carro? (S/N):");
            String opcaoTrava = input.next().toUpperCase();
            do {
                if (!opcaoTrava.equals("S") || !opcaoTrava.equals("N")) {
                    System.out.println("Opção inválida, Insira novamente:");
                    opcaoTrava = input.next().toUpperCase();
                } else if (opcaoTrava.equals("N")) {
                    System.out.println("***** Atenção Carro Destravado *****");
                } else if (opcaoTrava.equals("S")) {
                    System.out.println("***** Carro Travado *****");
                }
            } while (opcaoTrava.equals("S"));
        }
    } */
}
