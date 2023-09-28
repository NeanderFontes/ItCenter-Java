package Corrida;

import Corrida.Enum.TipoCombustivel;

import java.io.FileNotFoundException;

/**
 * Teste as classes instanciando um veículo de cada tipo.
 * Faça uma corrida entre dois carros e imprima os dados do vencedor.
 * Faça uma corrida entre uma mota e um camião e imprima os dados do vencedor.
 * Calcule o custo de uma viagem do carro (por exemplo para 150Km.).
 * Efetue uma viagem válida e outra inválida (excesso peso) para o camião
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Instanciando Veiculo de cada tipo:
        //Objeto Carro:
        Carro mercedesBenz = new Carro("Mercedes-Benz", "CLS-C218", 2010, 2143, 204, 5, TipoCombustivel.GASOLINA, 4);

        //Objeto Moto:
        Mota moto = new Mota();

        //Objeto Caminhão:
        Caminhao volvoFh = new Caminhao("Volvo", "FH 4x2T",2010,3100,420, 8,TipoCombustivel.DIESEL,500);

        //Corrida entre MOto e Caminhão:
        //volvoFh.corrida(moto);

        //Custo de uma Viagem de Carro:
        System.out.println("\n============= CONSUMO DE VIAGEM CARRO =============");
        System.out.println("» Consumo Estimado de " + mercedesBenz.calcularConsumoVeiculo(150) + "L para 150km");
        System.out.println("===================================================");
        System.out.println();

        //Imprimir no console arquivo Mota.txt em files:
        System.out.println("====================== ARQUIVO Mota.txt MOTO NO CONSOLE ======================");
        moto.imprimirConsole("files/Mota.txt");
        System.out.println("==============================================================================");
        System.out.println();

        //Imprimir no console Viagem válida para o Caminhão:
        System.out.println("============= Viagem com Carga de 200k para o Caminhão =============");
        System.out.println(volvoFh.viagemCaminhao(150,200));
        System.out.println("====================================================================");
        System.out.println();


        //Imprimir no console Viagem inválida para o Caminhão:
        System.out.println("============= Viagem com Carga de 600k para o Caminhão =============");
        System.out.println(volvoFh.viagemCaminhao(150,600));
        System.out.println("====================================================================");
    }
}
