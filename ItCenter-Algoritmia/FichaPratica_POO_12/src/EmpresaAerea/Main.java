package EmpresaAerea;

import EmpresaAerea.Enum.Arma;
import EmpresaAerea.Enum.Categoria;
import EmpresaAerea.Enum.Instalacao;

public class Main {
    public static void main(String[] args) {

        JatoPrivado gulfstream = new JatoPrivado(111222, 2005,2,"Gulfstream A15",5500,15,18,3,8000,400,5000000,8,1000, Categoria.LIGHT_JET);
        gulfstream.addInstalacao(Instalacao.WC);
        gulfstream.addInstalacao(Instalacao.TOMADAS);
        gulfstream.addInstalacao(Instalacao.CINEMA);

        JatoPrivado cessna = new JatoPrivado(111333, 2016, 2, "Cessna Citation", 8000,22,26,4,7900,420,7500000,10,1500,Categoria.MIDSIZE_JET);
        cessna.addInstalacao(Instalacao.WC);
        cessna.addInstalacao(Instalacao.TOMADAS);
        cessna.addInstalacao(Instalacao.SUITE);
        cessna.addInstalacao(Instalacao.ESCRITORIO);

        JatoPrivado bombardier = new JatoPrivado(111444,2020,2,"Bombardier Learjet", 11500,28,34,6,8100,450,10000000,22,1800,Categoria.HEAVY_JET);
        bombardier.addInstalacao(Instalacao.WC);
        bombardier.addInstalacao(Instalacao.WC);
        bombardier.addInstalacao(Instalacao.TOMADAS);
        bombardier.addInstalacao(Instalacao.TOMADAS);
        bombardier.addInstalacao(Instalacao.COZINHA);


        Catalogo airplaneStore = new Catalogo();

        airplaneStore.adquirirAviao(gulfstream);
        airplaneStore.adquirirAviao(cessna);
        airplaneStore.adquirirAviao(bombardier);

        airplaneStore.imprimirCatalogo();

    }
}
