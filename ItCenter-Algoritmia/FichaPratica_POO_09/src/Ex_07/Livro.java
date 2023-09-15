package Ex_07;

import java.math.BigInteger;

public class Livro {
    private String titulo, autor, categoria, iSBN;
    private int numPagina;
    //private long iSBNL;

    /**
     * Método Construtor para construção da instancia
     * @param titulo - Titulo do Livro
     * @param autor - Autor do Livro
     * @param categoria - Categoria do Livro
     * @param numPagina - Numero total de Paginas do Livro
     * @param iSBN - ISBN (International Standard Book Number)
     */
    public Livro(String titulo, String autor, String categoria, int numPagina, String iSBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numPagina = numPagina;
        this.iSBN = iSBN;
    }

    /**
     * Método para Exibir detalhes do livro:
     */
    public void exibirDetalhes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Páginas: " + this.numPagina);
        System.out.println("ISBN: " + this.iSBN);
    }
}
