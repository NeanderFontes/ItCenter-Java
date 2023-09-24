package Ex_01;

import java.util.ArrayList;

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
public class MusicPlayer {
    private ArrayList<Musica> programacaoMusical;

    /**
     * Método Construtor do Objeto MusicPlayer para Criar ArrayList<Musica>
     */
    public MusicPlayer() {
        this.programacaoMusical = new ArrayList<Musica>();
    }


    /**
     * Método para adicionar nova musica com ArrayList<Musica>
     * Criar laço for ou forEach para pecorrer o arraylist
     *
     * @param novaMusica - Nome da Musica Adicionada ao ArrayList<Musica>
     */
    public void addMusica(Musica novaMusica) {
        this.programacaoMusical.add(novaMusica);
    }

    /**
     * Método para Trocar as posições do indice do ArrayList<Musica>
     *
     * @param indexMusica1  - Indice que deseja trocar a Musica
     * @param indexMusica2 - Indice da Musica qual deseja vai ser trocada no indice desejado
     */
    public void trocarPosicaoMusica(int indexMusica1, int indexMusica2) {
        Musica musicaAuxNum = this.programacaoMusical.get(indexMusica1);
        this.programacaoMusical.set(indexMusica1, this.programacaoMusical.get(indexMusica2));
        this.programacaoMusical.set(indexMusica2, musicaAuxNum);
    }

    /**
     * Método para Remover Musica através do Objeto Musica
     *
     * @param removerMusica - Nome da Musica para remover da ArrayList<Musica>
     */
    public void removerMusica(Musica removerMusica) {
        this.programacaoMusical.remove(removerMusica);
    }

    /**
     * Método para Remover Musica através do Indice do ArrayList<Musica>
     *
     * @param removerIndiceMusica - Número de Indice da Musica para remover
     */
    public void removerIndiceMusica(int removerIndiceMusica) {
        this.programacaoMusical.remove(removerIndiceMusica);
    }

    /**
     * Método para Remover Todas as Musicas do ArrayList<Musica>
     */
    public void removerTodasMusicas() {
        this.programacaoMusical.clear();
        System.out.println("\t##### Todas as Músicas Removida com Sucesso #####\t");
    }

    /**
     * Método para Imprimir Relatório utilizando forEach:
     */
    public void exibirDetalhesMusicas() {
        for (Musica musica : this.programacaoMusical) {
            int numIndice = 0;
            System.out.print("Indice: " + this.programacaoMusical.get(numIndice) + "\n");
            System.out.println("Nome da Musica: " + musica.getTituloMusica() + " | Genero: " + musica.getGeneroMusica() + " | Artista: " + musica.getArtistaMusica() + " | Tempo Total: " + musica.getDuracaoSegundoMusica() + "'s");
            System.out.println();
        }
    }

    /**
     * Método para Imprimir total em Segundos da Musica em
     * Horas
     * Minutos
     * Segundos
     */
    public void imprimirDuracaoProgramacao() {

        int totalSegundos = 0;
        int horas, minutos, segundos;

        for (Musica musica : this.programacaoMusical) {
            totalSegundos += musica.getDuracaoSegundoMusica();
        }

        System.out.println("Total de Segundos da Programação: " + totalSegundos);

        horas = totalSegundos / 3600;

        minutos = (totalSegundos / 60) - (horas * 60);

        segundos = totalSegundos - (horas * 3600) - (minutos * 60);

        System.out.println("Duração Total: " + horas + "h " + minutos + "m " + segundos + "s");
    }
}
