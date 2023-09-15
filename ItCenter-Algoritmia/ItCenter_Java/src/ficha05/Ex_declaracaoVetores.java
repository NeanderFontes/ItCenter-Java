package ficha05;

public class Ex_declaracaoVetores {
    public static void main(String[] args) {
        //Declaração de vetores
        int numVetores[] = new int[10];//numero de indice = (0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        numVetores[0] = 1;
        numVetores[1] = 2;
        numVetores[2] = 3;
        numVetores[3] = 4;
        numVetores[4] = 5;
        numVetores[5] = 6;
        numVetores[6] = 7;
        numVetores[7] = 8;
        numVetores[8] = 9;
        numVetores[9] = 10;


        //Forma simples da declaração
        //Vetor com 10 indices de (0 - 9) e 10 valores inerentes de (1-10)
        int numVetores2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Forma de print na tela do vetor:
        for (int numIndice = 0; numIndice < 10; numIndice++) {
            System.out.print("Número de índice [" + numIndice + "] = " + numVetores[numIndice] + "\n");
        }
    }
}
