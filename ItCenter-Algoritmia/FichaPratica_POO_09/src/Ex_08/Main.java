package Ex_08;

public class Main {
    /**
     * Função principal:
     * @param args
     */
    public static void main(String[] args) {
        //Instância do objeto Aluno:
        Aluno novoAluno1 = new Aluno("Neander", "SMF", 34);
        novoAluno1.mediaAluno();
        System.out.println("Aluno : " + novoAluno1.getNome() + "\nStatus: " + novoAluno1.resultadoAluno());

    }
}
