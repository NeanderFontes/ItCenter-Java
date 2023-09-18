package Ex_10;

public class Main {
    public static void main(String[] args) {
        //Instanciando array Funcionário com 6 posições.
        Funcionario exemploFuncionario[] = new Funcionario[6];
        exemploFuncionario[0] = new Funcionario("Neander", "ItCenter", 1500);
        exemploFuncionario[1] = new Funcionario("Rebeca", "Dentista", 1500);
        exemploFuncionario[2] = new Funcionario("Igor", "Sgt Aeronautica", 1500);
        exemploFuncionario[3] = new Funcionario("Hugo", "Empresario", 1500);
        exemploFuncionario[4] = new Funcionario("Adinalvo", "Advogado", 1500);
        exemploFuncionario[5] = new Funcionario("Doreia", "Dentista", 1500);

        // Ciclo for para pecorrer o array
        for (int numIndice = 0; numIndice < exemploFuncionario.length; numIndice++) {
            exemploFuncionario[numIndice].exibirDados();
            System.out.println();
            if (numIndice == 0) {
                exemploFuncionario[0].aumentarSalario();
            }
        }
        System.out.println("Funcionario " + exemploFuncionario[0].getNomeFuncionario() + " vai receber aumento de €" + exemploFuncionario[0].getAumentoFuncionario());
        exemploFuncionario[0].exibirDados();
    }
}
