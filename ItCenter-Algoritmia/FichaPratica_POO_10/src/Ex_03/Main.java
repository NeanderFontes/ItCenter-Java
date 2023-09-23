package Ex_03;

import Ex_04.AcabamentoImovel;
import Ex_04.Imovel;
import Ex_04.TipoApartamento;

public class Main {
    public static void main(String[] args) {
        //Instânciando objeto Imovel:
        Imovel aptoBraga = new Imovel(10,12,1,1,75.0, 0,"PT - Braga", AcabamentoImovel.USADO, TipoApartamento.APARTAMENTO);
        Imovel aptoIgual = new Imovel(10,12,1,1,75.0, 0,"APT IGUAL", AcabamentoImovel.USADO, TipoApartamento.APARTAMENTO);
        Imovel aptoImbui = new Imovel(214, 902,2,2,75.5,0,"BR - Salvador/BA", AcabamentoImovel.USADO, TipoApartamento.APARTAMENTO);
        aptoBraga.descricaoImovel();
        aptoBraga.valorImovel();
        System.out.println("====================================");
        System.out.println("\t\tVALOR DO IMOVEL");
        aptoImbui.descricaoImovel();
        aptoImbui.valorImovel();
        System.out.println("=====================================");
        System.out.println("\t\tCOMPARAÇÃO DE PREÇOS");
        aptoBraga.comprarImovel(aptoImbui);
        aptoImbui.comprarImovel(aptoBraga);
        aptoBraga.comprarImovel(aptoIgual);
    }
}
