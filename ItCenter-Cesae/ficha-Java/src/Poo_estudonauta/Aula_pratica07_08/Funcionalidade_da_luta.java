package Poo_estudonauta.Aula_pratica07_08;

/*
 * Objeto Lutador.
 * Projeto utilizando as estruturas com metodos especiais
 * Metodos get, set e construct.
 * Metodos Visibilidade: public, private, protected.
 * Atributos: nome, nacionalidade, idade,  altura, peso, categoria, vitorias, derrotas, empates;
 * Metodos implementados: apresentador(), status(), ganharLuta(), perderLuta(), empatarLuta();
 * Estado: statusAtual();
 */

//Métodos implementados "abstratos":
public interface Funcionalidade_da_luta {
    void apresentar();
    void status();
    void ganharLuta();
    void perderLuta();
    void emapatarLuta();
}
