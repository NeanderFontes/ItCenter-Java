package Ex_02;

/**
 * Exemplo de teste: Instancie 5 pessoas (uma delas com menos de 18 anos). De seguida tente adicionar todas
 * as 5 ao array de participantes. Imprima a lista de participantes e seguidamente imprima qual o vencedor
 */
public class Main {
    public static void main(String[] args) {
        //Instanciando objeto Pessoa:
        Pessoa[] grupo1 = new Pessoa[5];

        //Instancia de 5 Pessoa; "Neander" com idade menor a 18 anos.
        grupo1[0] = new Pessoa("Neander", 17,"999-999-999","neander@email.com");
        grupo1[1] = new Pessoa("Rebeca", 35, "988-888-888", "rebeca@email.com");
        grupo1[2] = new Pessoa("Doreia", 60,"+55 (71)99111-1111", "doreia@email.com");
        grupo1[3] = new Pessoa("Igor", 32,"+55 (91)99222-2222", "igor@email.com");
        grupo1[4] = new Pessoa("Hugo", 31,"+55 (71)99333-3333","hugo@email.com");

        //Instanciar objeto Sorteio:
        Sorteio megaSena = new Sorteio(100000);

        //Adicionando Participantes do grupo1[] em ArrayList<Pessoa> para Sorteio Criado:
        for(int numIndice = 0; numIndice < grupo1.length; numIndice++) {
            megaSena.addParticipante(grupo1[numIndice]);
        }

        //Exibir Lista de Participantes com 18+ Adicionado no Sorteio:
        megaSena.exibirListaSorteio();

        //Sortear Ganhador com biblioteca Random
        megaSena.sortearGanhador();
    }
}
