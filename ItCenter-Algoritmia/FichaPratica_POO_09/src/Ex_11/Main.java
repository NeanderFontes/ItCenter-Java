package Ex_11;

public class Main {
    /**
     * Função principal para instanciar objeto criado Conta
     * @param args
     */
    public static void main(String[] args) {
        //Instância de Objeto Conta com array:
        Conta[] contaExemplo = new Conta[3];

        //Dados criado a partir de cada array:
        contaExemplo[0] = new Conta("Neander", 1111);
        contaExemplo[1] = new Conta("Rebeca", 2222);
        contaExemplo[2] = new Conta("Doreia", 3333);

        //Entrada de dados:
        contaExemplo[1].mostrarSaldo();
        contaExemplo[0].menuConta();

        //Saida de dados finais:
        contaExemplo[1].mostrarSaldo();
        contaExemplo[0].mostrarSaldo();
    }
}
