package Ex_01;

/**
 * Exemplo de teste:
 * Deve instanciar 4 músicas.
 * Adicionar as 4 à programacaoMusical.
 * De seguida troque a última com a primeira.
 * Seguidamente remova a número 3.
 * Posteriormente calcule a duração da programação.
 * Remova todas as músicas e calcule de novo a duração.
 */
public class Main {
    public static void main(String[] args) {
        //Instanciando de 4 objeto Musica:
        Musica musica1 = new Musica("Exemplo1", "Rock", "Neander", 1900);
        Musica musica2 = new Musica("Exemplo2", "PoP", "Rebeca", 1000);
        Musica musica3 = new Musica("Exemplo3", "Pagode", "Igor", 300);
        Musica musica4 = new Musica("Exemplo4", "Gospel", "Hugo", 400);

        //Instanciando objeto MusicPlayer:
        MusicPlayer cdPlayer = new MusicPlayer();

        //Adicionando Musica ao MusicPlayer através de forEach:
        //for (cdPlayer addNovasMusicas : MusicPlayer) {
        //    addNovasMusicas.addMusica(musica1);
        //}

        //Adicionando os 4 objeto Musica ao "cdPlayer" MusicPlayer:
        cdPlayer.addMusica(musica1);
        cdPlayer.addMusica(musica2);
        cdPlayer.addMusica(musica3);
        cdPlayer.addMusica(musica4);

        //Exibir detalhes de novo "álbum" MusicPlayer:
        cdPlayer.exibirDetalhesMusicas();

        //Trocar a Última "musica4" com a Primeira "musica1" alterando posições de índice:
        cdPlayer.trocarPosicaoMusica(0, 3);

        //Exibir detalhes de novo "álbum" MusicPlayer:
        System.out.println("Troca de Posição dos indices da Ultima pela Primeira:");
        cdPlayer.exibirDetalhesMusicas();

        //Remover do MusicPlayer o terceiro indice:
        //cdPlayer.removerIndiceMusica(1);
        cdPlayer.removerMusica(musica3);

        //Calcular duração total em Horas, Minutos e Segundos da MusicPlayer criada:
        cdPlayer.imprimirDuracaoProgramacao();

        //Remova todas as músicas e calcule de novo a duração:
        cdPlayer.removerTodasMusicas();
        cdPlayer.imprimirDuracaoProgramacao();
    }
}
