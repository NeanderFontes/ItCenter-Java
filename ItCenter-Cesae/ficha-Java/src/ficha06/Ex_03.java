package ficha06;

public class Ex_03 {

    /**
     * Analisando o Método se numero o número é Par ou Não.
     * @param num - Numero a ser analizado
     * @return true- se for par || false - se for impar
     */
    public static boolean numPar (int num) {

        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método para analisar se o número é positivo
     * @param num - Parâmetro da Variável num a ser analizado.
     * @return true || false na Condição declarada dentro do método.
     */
    public static boolean numPositivo(int num) {

        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }
    //


}
