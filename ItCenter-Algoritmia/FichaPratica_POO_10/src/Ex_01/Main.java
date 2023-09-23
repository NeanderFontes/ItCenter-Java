package Ex_01;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        //Instânciando Objeto Carro:
        Carro carro1 = new Carro("Mercedes","A45",2022,420,2200,15,TipoCombustivel.GASOLINA);
        Carro carro2 = new Carro("Ford","Mustang",1970,420,2000,30,TipoCombustivel.GASOLINA);
        Carro carro3 = new Carro("Datsun","1200",1975,90,1200,30,TipoCombustivel.DIESEL);
        Carro carro4= new Carro("Renault", "Clio",2010,110,1600,7,TipoCombustivel.DIESEL);

        //Detalhes e potencia de cada carro:
        //carro1:
        carro1.exibirDetalhes();
        carro1.ligarCarro();
        carro1.desligarCarro();
        System.out.println();

        //carro2:
        carro2.exibirDetalhes();
        carro2.ligarCarro();
        carro2.desligarCarro();
        System.out.println();

        //carro3:
        carro3.exibirDetalhes();
        carro3.ligarCarro();
        carro3.desligarCarro();
        System.out.println();

        //carro4:
        carro4.exibirDetalhes();
        carro4.ligarCarro();
        carro4.desligarCarro();
        System.out.println();

        //Corrida entre carro1 e carro2:
        Carro corrida1 = carro1.corrida(carro2);
        System.out.println("\n+++++++++++ Vencedor +++++++++++++");
        corrida1.exibirDetalhes();
        System.out.println("++++++++++++++++++++++++++++++++++");

        //Corrida entre carro3 e carro4:
        Carro corrida2 = carro3.corrida(carro3);
        System.out.println("\n+++++++++++ Vencedor +++++++++++++");
        corrida2.exibirDetalhes();
        System.out.println("++++++++++++++++++++++++++++++++++");

        //Corrida entre vencedores de corrida1 e corrida2:
        Carro corridaFinal = corrida1.corrida(corrida2);
        if (corridaFinal == null) {
            System.out.println("Empate!!");
        } else {
            corridaFinal.exibirDetalhes();
        }


    }
}
