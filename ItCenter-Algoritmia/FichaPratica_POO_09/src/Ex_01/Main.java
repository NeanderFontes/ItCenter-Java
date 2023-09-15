package Ex_01;

public class Main {
    /**
     * Função principal:
     * @param args
     */
    public static void main(String[] args) {
        //Instancia da Pessoa:
        Pessoa pessoa1 = new Pessoa("Neander", 34, 1.82);
        Pessoa pessoa2 = new Pessoa("Rebeca", 35, 1.50);

        //Imprimir no console dados da pessoa1:
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade() + "anos");
        System.out.println("Altura: " + pessoa1.getAltura() + "m");

        //Imprimir no console dados da pessoa2:
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade() + "anos");
        System.out.println("Altura: " + pessoa2.getAltura() + "m");
    }
}
