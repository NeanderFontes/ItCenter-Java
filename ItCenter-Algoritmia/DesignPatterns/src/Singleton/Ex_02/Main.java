package Singleton.Ex_02;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance("Exemplo");

        logger.Logtxt("Mensagem Já Existente");
        logger.Logtxt("Mensagem Log2");
    }
}
