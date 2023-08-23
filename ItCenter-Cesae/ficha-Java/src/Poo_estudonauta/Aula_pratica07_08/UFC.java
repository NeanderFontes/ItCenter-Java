package Poo_estudonauta.Aula_pratica07_08;
/*
 * Programa Principal "UFC"
 * Objeto Lutador.
 * Projeto utilizando as estruturas com metodos especiais
 * Metodos get, set e construct.
 * Metodos Visibilidade: public, private, protected.
 * Atributos: nome, nacionalidade, idade,  altura, peso, categoria, vitorias, derrotas, empates;
 * Metodos implementados: apresentador(), status(), ganharLuta(), perderLuta(), empatarLuta();
 * Estado: statusAtual();
 */
public class UFC {
    //Função main UFC:
    public static void main(String[] args) {
        //Instaciamento do objeto Lutador utilizando array com 6 lutadores
        Lutador lutador[] = new Lutador[6];
        lutador[0] = new Lutador("Alpha", "Fraça", 31, 11 , 1, 3, 1.75f,68.9f);
        lutador[1] = new Lutador("Bravo", "Portugal", 29, 0,0, 0, 1.60f, 57.8f);
        lutador[2] = new Lutador("Charlie", "Espanha", 28, 0, 0, 0, 1.65f, 80.9f);
        lutador[3] = new Lutador("Delta", "Brasil", 34, 0, 0, 0, 1.81f, 81.6f);
        lutador[4] = new Lutador("Echo","Italia", 0, 0, 0, 0, 1.70f, 119.3f);
        lutador[5] = new Lutador("FoxTrot", "Suica", 30, 0, 0, 0,1.70f,105.7f);

        //Instanciamenta da agregação entre classes:
        Luta UFC01 = new Luta();
        UFC01.marcarLuta(lutador[0], lutador[1]);
        UFC01.lutar();
    }
}
