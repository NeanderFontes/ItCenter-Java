package Poo_estudonauta.Aula_pratica09;
/*
    Neander Fontes, Braga-Portugal, 28/08/2023
    Exercício pratico Curso POO Java.
    Criação de classe Pessoa.
    Criação de classe agregada Livro.
    Criação da Interface Publicacao.
 */

//CLasse agredada da Pessoa, Livro:
public class Livro implements Publicacao {
    //Atributos abstratos:
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;

    //Atributo agregado específico:
    private Pessoa leitor;

    //Métodos Específico:
    public String detalhes() {
        return "Livro {" +
                "\n\tTitulo = '" + titulo + '\'' +
                "\n\tAutor = '" + autor + '\'' +
                "\n\tTotal de Páginas = " + totPaginas +
                "\n\tLivro Está Aberto? = " + aberto +
                "\n\tPágina Atual = " + pagAtual +
                "\n\tInformações do Leitor {" +
                "\n\t\tLeitor = " + leitor.getNome() +
                "\n\t\tIdade = " + leitor.getIdade() +
                "\n\t\tSexo = " + leitor.getSexo()+
                "\n\t\tPágina Atual = " + getPagAtual()+
                "\n\t}" +
                "\n}";
    }

    //Método Construtor:
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

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

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    //Métodos implementados para definir os dados internos da Interface:
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
