package ficha06;

public class Ex_03 {

    /**
     * Analisando o Método se numero o número é Par ou Não.
     * @param numPar - Numero a ser analizado
     * @return true- se for par || false - se for impar
     */
    public static boolean funcaoPar (int numPar) {

        if (numPar % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método para analisar se o número é positivo
     * @param numPositivo - Valor de parâmetro formal a ser analizado e
        será devolvido ao paâmetro real o valor final.
     * @return true || false na Condição declarada dentro do método.
     */
    public static boolean funcaoPositivo(int numPositivo) {

        if (numPositivo >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Analisando o Método se numero o número é Primo ou não.
     * @param numPrimo - Valor de parâmetro formal a ser analizado e
    será devolvido ao paâmetro real o valor final.
     * @return true- se for par || false - se for impar
     */
    public static boolean funcaoPrimo(int numPrimo) {
        for (int numIndice = 0; numIndice < numPrimo; numIndice++) {
            if (numPrimo % numIndice == numPrimo || numPrimo % numPrimo == 0) {
                return true;
            }
        }
        return false;
    }

}
