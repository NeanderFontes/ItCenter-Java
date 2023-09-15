package Ex_02;

public class Main {
    /**
     * Método principal
     * @param args
     */
    public static void main(String[] args) {
        //Instancia de classe Cao:
        Cao bali = new Cao("Bali","Labrador");
        Cao marrie = new Cao("Marrie", "");
        Cao caramelo = new Cao("Caramelo", "Vira-Lata");

        //Invocação de metodos para funcionalidade:
        bali.latir();

        //Chamada para mudar valor através do setter:
        bali.setLatido("rouf!");
        bali.latir();

        //Chamada do metodo criado para "latir":
        marrie.latir();
    }
}
