package Ex_01;

/**
 * Classe Pessoa
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    /**
     * Método Construtor
     * @param nome Nome da Pessoa
     * @param idade Idade Atual
     * @param altura Altura em metros
     */
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    /**
     * Métodos especiais Getter
     * @return Nome, Idade, Altura
     */
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getAltura() {
        return this.altura;
    }
}
