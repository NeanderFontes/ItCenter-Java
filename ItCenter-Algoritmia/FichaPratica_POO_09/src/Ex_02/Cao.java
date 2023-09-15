package Ex_02;

public class Cao {
    private String nome, raca, latido = "au au au";

    /**
     * Método Construtor
     * @param nome - Nome do cao
     * @param raca - Raça do cao
     */
    public Cao(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    /**
     *
     * @param latido
     */
    public void setLatido(String latido) {
        this.latido = latido;
    }

    public void latir() {
        System.out.println(this.latido);
    }
}
