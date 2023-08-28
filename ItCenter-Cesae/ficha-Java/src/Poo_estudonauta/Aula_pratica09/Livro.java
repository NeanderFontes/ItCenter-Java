package Poo_estudonauta.Aula_pratica09;
/*
    Neander Fontes, Braga-Portugal, 28/08/2023
    Exercício pratico Curso POO Java.
    Criação de classe Pessoa.
    Criação de classe agregada Livro.
    Criação da Interface Publicacao.
 */

//CLasse agredada da Pessoa, Livro:
public class Livro {
    //Atributos abstratos:
    private String titulo;
    private String autor;
    private int totPaginas;
    private boolean pagAtual;
    private boolean aberto;

    //Atributo agregado específico:
    private Pessoa leitor;

    //Métodos especiais Getter and Setter:
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public boolean isPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(boolean pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
}
