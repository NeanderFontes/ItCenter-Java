package Ex_02;

public class Main {
    public static void main(String[] args) {
        //Instância de Objeto Conta com array:
        Conta[] contaExemplo = new Conta[3];

        //Dados criado a partir de cada array:
        contaExemplo[0] = new Conta("Neander", 1111);
        contaExemplo[1] = new Conta("Rebeca", 2222);
        contaExemplo[2] = new Conta("Doreia", 3333);

        contaExemplo[0].depositar(1000);
        contaExemplo[0].pedirEmprestimo(200);
        contaExemplo[0].pedirEmprestimo(200);
    }
}
