package Ex_01;

/**
 * Desenvolva um programa para uma estação de rádio programar as músicas a passar. Deve conter a classe
 * Música com atributos de título, género, artista e duração (segundos). Seguidamente a classe MusicPlayer
 * deve conter um atributo ArrayList de Musicas nomeado programacao.
 * Na classe MusicPlayer programe o método para adicionar músicas ao ArrayList.
 * Na classe MusicPlayer programe o método para trocar músicas ao ArrayList.
 * Na classe MusicPlayer programe o método para remover músicas ao ArrayList.
 * Na classe MusicPlayer programe o método para remover todas as músicas ao ArrayList.
 * Na classe Music Player programe o método imprimirRelatorio que imprima na consola todas as músicas da
 * programação com o seguinte exemplo de aspeto:
 * Música 1: The Scientist | Rock Alternativo | Coldplay | 260
 * Música 2: Bohemian Rapsody | Rock | Queen | 359
 * …
 */
public class Musica {
    private String tituloMusica, generoMusica, artistaMusica;
    private int duracaoSegundoMusica;

    /**
     * Método Construtor para Objeto Musica para instanciar
     *
     * @param tituloMusica         - Titulo da Musica
     * @param generoMusica         - Genero da Musica
     * @param artistaMusica        - Artista da Musica
     * @param duracaoSegundoMusica - Duração total da Musica (em segundos)
     */
    public Musica(String tituloMusica, String generoMusica, String artistaMusica, int duracaoSegundoMusica) {
        this.tituloMusica = tituloMusica;
        this.generoMusica = generoMusica;
        this.artistaMusica = artistaMusica;
        this.duracaoSegundoMusica = duracaoSegundoMusica;
    }

    /**
     * Métodos Getter e Setter de Musica
     */
    public String getTituloMusica() {
        return tituloMusica;
    }

    public void setTituloMusica(String tituloMusica) {
        this.tituloMusica = tituloMusica;
    }

    public String getGeneroMusica() {
        return generoMusica;
    }

    public void setGeneroMusica(String generoMusica) {
        this.generoMusica = generoMusica;
    }

    public String getArtistaMusica() {
        return artistaMusica;
    }

    public void setArtistaMusica(String artistaMusica) {
        this.artistaMusica = artistaMusica;
    }

    public int getDuracaoSegundoMusica() {
        return duracaoSegundoMusica;
    }

    public void setDuracaoSegundoMusica(int duracaoSegundoMusica) {
        this.duracaoSegundoMusica = duracaoSegundoMusica;
    }
}
