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
        Lutador lutador[] = new Lutador[5];
        lutador[0] = new Lutador("Alpha", "Fraça", 31, 11 , 1, 3, 1.75f,81.9f);
        lutador[1] = new Lutador("Bravo", "Portugal", 29, 0,0, 0, 1.60f, 68.1f);
        lutador[2] = new Lutador("Charlie", "Espanha", 28, 0, 0, 0, 1.65f, 100.5f);
        lutador[3] = new Lutador("Delta", "Brasil", 34, 0, 0, 0, 1.81f, 94.5f);
        lutador[4] = new Lutador("Echo","Italia", 0, 0, 0, 0, 1.70f, 69.5f);
        lutador[5] = new Lutador("FoxTrot", "Suica", 30, 0, 0, 0,1.70f,102.5f);

        UFC luta01 = new UFC();
    }
}
