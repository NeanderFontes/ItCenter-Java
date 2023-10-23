package RPG.Jogo;

import java.util.ArrayList;

import RPG.Entidades.Heroi;
import RPG.Entidades.NPC;
import RPG.Entidades.Personagens.*;
import RPG.Entidades.VendedorJogo.Vendedor;
import RPG.Item.AbstractClass.Consumivel;
import RPG.Item.AbstractClass.ItemHeroi;
import RPG.Item.ArmaPrincipal;
import RPG.Item.ConsumivelCombate;
import RPG.Item.Pocao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Jogo {
    private String nomeJogo;
    private int indexAtualSalaDoJogo;
    private ArrayList<SalaDeJogo> salasJogo;

    /**
     * Método Construtor do Jogo:
     *
     * @param nomeJogo - Nome Para Criação do Jogo.
     */
    public Jogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
        this.indexAtualSalaDoJogo = 0;
        this.salasJogo = new ArrayList<>();

        //Instância de Armas para "Aprendiz":
        ItemHeroi faca = new ArmaPrincipal("Faca de Aprendiz", 0, 10, 15);
        faca.addHeroiPermitido("Aprendiz");
        faca.addHeroiPermitido("Arqueiro");
        faca.addHeroiPermitido("Espadachim");
        faca.addHeroiPermitido("Gatuno");
        faca.addHeroiPermitido("Mago");
        faca.addHeroiPermitido("Mercador");
        faca.addHeroiPermitido("Novico");


        //Instância e Permissão de Armas para "Arqueiro":
        ItemHeroi arco = new ArmaPrincipal("Arco", 60, 60, 110);
        ItemHeroi arcoGrande = new ArmaPrincipal("Arco Grande", 70, 70, 120);
        ItemHeroi arbaleste = new ArmaPrincipal("Arbaleste", 80, 80, 130);
        ItemHeroi gakkung = new ArmaPrincipal("Gakkung", 90, 90, 140);
        ItemHeroi arcoCaca = new ArmaPrincipal("Arco de Caça", 100, 100, 150);
        arco.addHeroiPermitido("Arqueiro");
        arcoGrande.addHeroiPermitido("Arqueiro");
        arbaleste.addHeroiPermitido("Arqueiro");
        gakkung.addHeroiPermitido("Arqueiro");
        arcoCaca.addHeroiPermitido("Arqueiro");


        //Instância e Permissão de Armas para "Espadachim":
        ItemHeroi espada = new ArmaPrincipal("Espada", 60, 60, 110);
        ItemHeroi katana = new ArmaPrincipal("Kataná", 70, 70, 120);
        ItemHeroi espadaBastarda = new ArmaPrincipal("Espada Bastarda", 80, 80, 130);
        ItemHeroi espada2maos = new ArmaPrincipal("Espada de Duas Mãos", 90, 90, 140);
        ItemHeroi laminaSagrada = new ArmaPrincipal("Lâmina Sagrada", 100, 100, 150);
        espada.addHeroiPermitido("Espadachim");
        katana.addHeroiPermitido("Espadachim");
        espadaBastarda.addHeroiPermitido("Espadachim");
        espada2maos.addHeroiPermitido("Espadachim");
        laminaSagrada.addHeroiPermitido("Espadachim");


        //Instância e Permissão de Armas para "Gatuno":
        ItemHeroi punhal = new ArmaPrincipal("Punhal", 60, 60, 110);
        ItemHeroi mainGauche = new ArmaPrincipal("Main Gauche", 70, 70, 120);
        ItemHeroi stiletto = new ArmaPrincipal("Stiletto", 80, 80, 130);
        ItemHeroi gladius = new ArmaPrincipal("Gladius", 90, 90, 140);
        ItemHeroi damascus = new ArmaPrincipal("Damascus", 100, 100, 150);
        punhal.addHeroiPermitido("Gatuno");
        mainGauche.addHeroiPermitido("Gatuno");
        stiletto.addHeroiPermitido("Gatuno");
        gladius.addHeroiPermitido("Gatuno");
        damascus.addHeroiPermitido("Gatuno");


        //Instância e permissão de Armas para "Mago":
        ItemHeroi bastao = new ArmaPrincipal("Bastão", 60, 60, 110);
        ItemHeroi varinhaMagica = new ArmaPrincipal("Varinha Mágica", 70, 70, 120);
        ItemHeroi bastaoSobrevivente = new ArmaPrincipal("Bastão do Sobrevivente", 80, 80, 130);
        ItemHeroi cajadoAncestral = new ArmaPrincipal("Cajado Ancestral", 90, 90, 140);
        ItemHeroi cajadoFeiticeiro = new ArmaPrincipal("Cajado do Feiticeiro", 100, 100, 150);
        bastao.addHeroiPermitido("Mago");
        varinhaMagica.addHeroiPermitido("Mago");
        bastaoSobrevivente.addHeroiPermitido("Mago");
        cajadoAncestral.addHeroiPermitido("Mago");
        cajadoFeiticeiro.addHeroiPermitido("Mago");


        //Instância e Permissão de Armas para "Mercador":
        ItemHeroi machado = new ArmaPrincipal("Machado", 60, 60, 110);
        ItemHeroi machadoBatalha = new ArmaPrincipal("Machado de Batalha", 70, 70, 120);
        ItemHeroi marreta = new ArmaPrincipal("Marreta", 80, 80, 130);
        ItemHeroi demolidor = new ArmaPrincipal("Demolidor", 90, 90, 140);
        ItemHeroi machado2Maos = new ArmaPrincipal("Machado de Duas Mãos", 100, 100, 150);
        machado.addHeroiPermitido("Mercador");
        machadoBatalha.addHeroiPermitido("Mercador");
        marreta.addHeroiPermitido("Mercador");
        demolidor.addHeroiPermitido("Mercador");
        machado2Maos.addHeroiPermitido("Mercador");


        //Instância e Permissão de Armas para "Noviço":
        ItemHeroi cajado = new ArmaPrincipal("Cajado", 70, 70, 120);
        ItemHeroi rosario = new ArmaPrincipal("Rosário", 80, 80, 130);
        ItemHeroi cetro = new ArmaPrincipal("Cetro", 90, 90, 140);
        ItemHeroi cajadoSarcerdote = new ArmaPrincipal("Cajado do Sarcerdote", 100, 100, 150);
        bastao.addHeroiPermitido("Novico");
        cajado.addHeroiPermitido("Novico");
        rosario.addHeroiPermitido("Novico");
        cetro.addHeroiPermitido("Novico");
        cajadoSarcerdote.addHeroiPermitido("Novico");

        //Instância de Consumiveis de Combate:
        Consumivel pilulaDeCombate = new ConsumivelCombate("Pilura de Combate", 10, 20);
        Consumivel pocaoDoFuror = new ConsumivelCombate("Poção do Furor", 10, 20);
        Consumivel bombaAcida = new ConsumivelCombate("Bomba Ácida", 10, 20);
        Consumivel venenoMortal = new ConsumivelCombate("Veneno Mortal", 10, 20);

        //Instancia de Poção para restaurar Vida:
        Consumivel churrascoDeSelvagem = new Pocao("Churrasco de Selvagem", 10, 10, 10);
        Consumivel coquetelUivante = new Pocao("Coquetel Uivante", 10, 10, 10);
        Consumivel carneAoVinho = new Pocao("Carne ao Vinho", 10, 10, 10);
        Consumivel frutoDeYggdrasil = new Pocao("Fruto de Yggdrasil", 10, 10, 10);
        Consumivel bolinhoDivino = new Pocao("Bolinho Divino", 10, 10, 10);


        //Instância para o Vendedor:
        Vendedor vendedorRPG = new Vendedor();

        //Adicionando Armas para o Arqueiro ao stock do Vendedor:
        vendedorRPG.adicionarStock(arco);
        vendedorRPG.adicionarStock(arcoGrande);
        vendedorRPG.adicionarStock(arbaleste);
        vendedorRPG.adicionarStock(gakkung);
        vendedorRPG.adicionarStock(arcoCaca);

        //Adicionando Armas para o Espadachim ao stock do Vendedor:
        vendedorRPG.adicionarStock(espada);
        vendedorRPG.adicionarStock(katana);
        vendedorRPG.adicionarStock(espadaBastarda);
        vendedorRPG.adicionarStock(espada2maos);
        vendedorRPG.adicionarStock(laminaSagrada);

        //Adicionando Armas para o Gatuno ao stock do Vendedor:
        vendedorRPG.adicionarStock(punhal);
        vendedorRPG.adicionarStock(mainGauche);
        vendedorRPG.adicionarStock(stiletto);
        vendedorRPG.adicionarStock(gladius);
        vendedorRPG.adicionarStock(damascus);

        //Adicionando Armas para o Mago ao stock do Vendedor:
        vendedorRPG.adicionarStock(bastao);
        vendedorRPG.adicionarStock(varinhaMagica);
        vendedorRPG.adicionarStock(bastaoSobrevivente);
        vendedorRPG.adicionarStock(cajadoAncestral);
        vendedorRPG.adicionarStock(cajadoFeiticeiro);

        //Adicionando Armas para o Mercador ao stock do Vendedor:
        vendedorRPG.adicionarStock(machado);
        vendedorRPG.adicionarStock(machadoBatalha);
        vendedorRPG.adicionarStock(marreta);
        vendedorRPG.adicionarStock(demolidor);
        vendedorRPG.adicionarStock(machado2Maos);

        //Adicionando Armas para o Noviço ao stock do Vendedor:
        vendedorRPG.adicionarStock(cajado);
        vendedorRPG.adicionarStock(rosario);
        vendedorRPG.adicionarStock(cetro);
        vendedorRPG.adicionarStock(cajadoSarcerdote);

        //Adicionando Consumiveis de Combate ao stock do Vendedor
        vendedorRPG.adicionarStock(pilulaDeCombate);
        vendedorRPG.adicionarStock(pocaoDoFuror);
        vendedorRPG.adicionarStock(bombaAcida);
        vendedorRPG.adicionarStock(venenoMortal);

        //Adicionando Poção de recuperação de vida ao stock do Vendedor:
        vendedorRPG.adicionarStock(churrascoDeSelvagem);
        vendedorRPG.adicionarStock(coquetelUivante);
        vendedorRPG.adicionarStock(carneAoVinho);
        vendedorRPG.adicionarStock(bolinhoDivino);
        vendedorRPG.adicionarStock(frutoDeYggdrasil);

        //Adicionando permissões para Heroi usar Comsumiveis de Combate:
        pilulaDeCombate.addHeroiPermitido("Arqueiro");
        pocaoDoFuror.addHeroiPermitido("Arqueiro");
        bombaAcida.addHeroiPermitido("Arqueiro");
        venenoMortal.addHeroiPermitido("Arqueiro");

        pilulaDeCombate.addHeroiPermitido("Espadachim");
        pocaoDoFuror.addHeroiPermitido("Espadachim");
        bombaAcida.addHeroiPermitido("Espadachim");
        venenoMortal.addHeroiPermitido("Espadachim");

        pilulaDeCombate.addHeroiPermitido("Gatuno");
        pocaoDoFuror.addHeroiPermitido("Gatuno");
        bombaAcida.addHeroiPermitido("Gatuno");
        venenoMortal.addHeroiPermitido("Gatuno");

        pilulaDeCombate.addHeroiPermitido("Mago");
        pocaoDoFuror.addHeroiPermitido("Mago");
        bombaAcida.addHeroiPermitido("Mago");
        venenoMortal.addHeroiPermitido("Mago");

        pilulaDeCombate.addHeroiPermitido("Mercador");
        pocaoDoFuror.addHeroiPermitido("Mercador");
        bombaAcida.addHeroiPermitido("Mercador");
        venenoMortal.addHeroiPermitido("Mercador");

        pilulaDeCombate.addHeroiPermitido("Novico");
        pocaoDoFuror.addHeroiPermitido("Novico");
        bombaAcida.addHeroiPermitido("Novico");
        venenoMortal.addHeroiPermitido("Novico");

        //Adicionando Poção de recuperação de vida ao stock do Vendedor:
        vendedorRPG.adicionarStock(churrascoDeSelvagem);
        vendedorRPG.adicionarStock(coquetelUivante);
        vendedorRPG.adicionarStock(carneAoVinho);
        vendedorRPG.adicionarStock(bolinhoDivino);
        vendedorRPG.adicionarStock(frutoDeYggdrasil);

        //Adicionando permissões para Heroi usar Poção:
        churrascoDeSelvagem.addHeroiPermitido("Arqueiro");
        coquetelUivante.addHeroiPermitido("Arqueiro");
        carneAoVinho.addHeroiPermitido("Arqueiro");
        frutoDeYggdrasil.addHeroiPermitido("Arqueiro");
        bolinhoDivino.addHeroiPermitido("Arqueiro");

        churrascoDeSelvagem.addHeroiPermitido("Espadachim");
        coquetelUivante.addHeroiPermitido("Espadachim");
        carneAoVinho.addHeroiPermitido("Espadachim");
        frutoDeYggdrasil.addHeroiPermitido("Espadachim");
        bolinhoDivino.addHeroiPermitido("Espadachim");

        churrascoDeSelvagem.addHeroiPermitido("Gatuno");
        coquetelUivante.addHeroiPermitido("Gatuno");
        carneAoVinho.addHeroiPermitido("Gatuno");
        frutoDeYggdrasil.addHeroiPermitido("Gatuno");
        bolinhoDivino.addHeroiPermitido("Gatuno");

        churrascoDeSelvagem.addHeroiPermitido("Mago");
        coquetelUivante.addHeroiPermitido("Mago");
        carneAoVinho.addHeroiPermitido("Mago");
        frutoDeYggdrasil.addHeroiPermitido("Mago");
        bolinhoDivino.addHeroiPermitido("Mago");

        churrascoDeSelvagem.addHeroiPermitido("Mercador");
        coquetelUivante.addHeroiPermitido("Mercador");
        carneAoVinho.addHeroiPermitido("Mercador");
        frutoDeYggdrasil.addHeroiPermitido("Mercador");
        bolinhoDivino.addHeroiPermitido("Mercador");

        churrascoDeSelvagem.addHeroiPermitido("Novico");
        coquetelUivante.addHeroiPermitido("Novico");
        carneAoVinho.addHeroiPermitido("Novico");
        frutoDeYggdrasil.addHeroiPermitido("Novico");
        bolinhoDivino.addHeroiPermitido("Novico");

        //Instancias de NPC para Sala01 "Campo Treinamento" até NV 12:
        NPC poring = new NPC("Poring", 100, 20, 10);
        NPC lunatico = new NPC("Lunático", 100, 20, 10);
        NPC mandragora = new NPC("Mandrágora", 100, 20, 10);
        NPC picky = new NPC("Picky", 100, 20, 10);
        NPC fabre = new NPC("Fabre", 100, 20, 10);
        NPC drops = new NPC("Drops", 100, 20, 10);
        NPC condor = new NPC("Condor", 100, 20, 10);
        NPC salgueiro = new NPC("Salgueiro", 100, 20, 10);
        NPC cogumeloNegro = new NPC("Cogumelo Negro", 100, 20, 10);
        NPC pickyComCasca = new NPC("Picky com Casca", 100, 20, 10);
        NPC poringAzul = new NPC("Poring Azul", 100, 20, 10);
        NPC hornet = new NPC("Hornet", 100, 20, 10);
        //Arma Principal, Poção de Vida e Consumivel de Combate na Sala01:
        picky.addInventarioNPC((ArmaPrincipal) arco);
        poring.addInventarioNPC((ArmaPrincipal) espada);
        lunatico.addInventarioNPC((ArmaPrincipal) punhal);
        mandragora.addInventarioNPC((ArmaPrincipal) bastao);
        fabre.addInventarioNPC((ArmaPrincipal) machado);

        //Sala 02: Opção de Mudança de Classe + Vendedor:

        //Instância de NPC para Sala03 "Deserto" : até NV 15:
        NPC pecoPeco = new NPC("Peco Peco", 120, 30, 10);
        NPC loboDeserto = new NPC("Lobo do Deserto", 120, 30, 10);
        NPC escorpiao = new NPC("Escorpião", 120, 30, 10);

        //Instancia de NPC para Sala04 "Apocalipse" : até NV 20:
        NPC zumbi = new NPC("Zumbi", 150, 50, 10);
        NPC zumbiPrisioneiro = new NPC("Zumbi Prisioneiro", 150, 50, 10);
        NPC esqueletoSoldado = new NPC("Esqueleto Soldado", 150, 50, 10);
        NPC sussurro = new NPC("Sussurro", 150, 50, 10);
        NPC esqueletoPirata = new NPC("Esqueleto Pirata", 150, 50, 10);


        //Instância de NPC para Sala 05: "Mini Boss": Nv 25:
        NPC dracula = new NPC("Drácula", 250, 100, 40);

        //Instância de NPC para Sala 06: "Vila dos orcs": até Nv 25:
        NPC orcGuerreiro = new NPC("Orc Guerreiro", 170, 70, 10);
        NPC orcArqueiro = new NPC("Orc Arqueiro", 170, 70, 10);
        NPC filhoteOrc = new NPC("Filhote de Orc", 170, 70, 10);
        NPC senhoraOrc = new NPC("Senhora Orc", 170, 70, 10);
        NPC senhorDosOrcs = new NPC("Senhor dos Orcs", 170, 70, 10);

        //Instância de NPC para Sala 07 "Floresta Brasileira" até NV 30:
        NPC curupira = new NPC("Curupira", 200, 90, 10);
        NPC saciPerere = new NPC("Saçi Pererê", 200, 90, 10);
        NPC mulaSemCabeca = new NPC("Mula Sem Cabeça", 200, 90, 10);
        NPC boitata = new NPC("Boitatá", 200, 90, 10);
        NPC iara = new NPC("Iara", 200, 90, 10);

        //INstância de NPC para sala 08 "Esfinge" até NV 35:
        NPC mumia = new NPC("Múmia", 230, 110, 10);
        NPC osiris = new NPC("Osíris", 230, 110, 10);
        NPC requiem = new NPC("Requiém", 230, 110, 10);
        NPC pasana = new NPC("Pasana", 230, 110, 10);
        NPC farao = new NPC("Faraó", 230, 110, 10);

        //Instância de NPC para sala 09 "Fundo do Mar" até NV 40:
        NPC peixeEspada = new NPC("Peixe Espada", 260, 140, 10);
        NPC sereiaRevoltada = new NPC("Sereia Revoltada", 260, 140, 10);
        NPC penomena = new NPC("Penomena", 260, 140, 10);
        NPC tritao = new NPC("Tritão", 260, 140, 10);
        NPC medusaGigante = new NPC("Medusa Gigante", 260, 140, 10);

        //Instância de NPC para Sala 10: "Mini Boss":
        NPC megalodon = new NPC("Megalodon", 500, 200, 40);

        //Instância de NPC para sala 11 "Fábrica de Brinquedos" NV 45:
        NPC bonecoAssassino = new NPC("Boneco Assassino", 290, 170, 10);
        NPC presenteAmaldicoado = new NPC("Presente Amaldiçoado", 290, 170, 10);
        NPC duendeVerde = new NPC("Duende Verde", 290, 170, 10);
        NPC duendeVermelho = new NPC("Duende Vermelho", 290, 170, 10);
        NPC rudolfZangado = new NPC("Rudolf Zangado", 290, 170, 10);

        //Instância de NPC para a sala 12 "Alpes Suíços" NV 50:
        NPC yeti = new NPC("Yeti", 320, 200, 10);
        NPC titaDeGelo = new NPC("Titã de Gelo", 320, 200, 10);
        NPC siroma = new NPC("Siroma", 320, 200, 10);
        NPC peGrande = new NPC("Pé Grande", 320, 200, 10);
        NPC grinch = new NPC("Grinch", 320, 200, 10);

        //Instância de NPC para a sala 13 "Vulcão Maldito" NV 55:
        NPC salamandra = new NPC("Salamandra", 350, 230, 10);
        NPC fenix = new NPC("Fênix", 350, 230, 10);
        NPC magmaring = new NPC("Magmaring", 350, 230, 10);
        NPC golemDeLava = new NPC("Golém de Lava", 350, 230, 10);
        NPC labareda = new NPC("Labareda", 350, 230, 10);

        //Instância de NPC para a sala 14 "Céu Errado" NV 60:
        NPC arcAngeling = new NPC("Arc Angeling", 380, 250, 10);
        NPC angeling = new NPC("Angeling", 380, 250, 10);
        NPC anjoFajuto = new NPC("Anjo Fajuto", 380, 250, 10);
        NPC valquiria = new NPC("Valquiria", 380, 250, 10);
        NPC damaDaGuarda = new NPC("Dama da Guarda", 380, 250, 10);

        //Instância de NPC para a sala 15 "Fake Final Boss":
        NPC jackWolf = new NPC("Jack Wolf", 1, 1, 0);
        //Instância de NPC para a sala 16 "Real Final Boss":
        NPC guardiaoMortoKades = new NPC("Guardião Morto Kades", 1000, 300, 100);
    }

    /**
     * Método para Adicionar Salas do Jogo Principal.
     *
     * @param salaDeJogo - Sala do Jogo 01 - 16
     */
    private void adicionarMapa(SalaDeJogo salaDeJogo) {
        this.salasJogo.add(salaDeJogo);
    }

    /**
     * Método do Jogo Principal.
     *
     * @param jogadorAtual - Jogador Atual da Class <>Heroi</>
     */
    public void fantasy(Heroi jogadorAtual) {
        //Criar Personagem:
        criarPersonagem(jogadorAtual);

        //Boas Vindas:
        boasVindas(jogadorAtual);

        //Regras do Jogo:
        regrasJogo(jogadorAtual);
    }

    /**
     * Método para Ler Ficheiro de regras do Jogo.
     *
     * @param jogadorAtual - Jogador Atual.
     */
    private void regrasJogo(Heroi jogadorAtual) {
        Scanner lerArquivo = new Scanner("/");


        lerArquivo.hasNextLine();

        //Fechamento do Arquivo:
        lerArquivo.close();
    }

    private void boasVindas(Heroi jogadorAtual) {
        System.out.println("Em um mundo repleto de magia e mistério, " +
                "um jovem aprendiz chamado " + jogadorAtual.getNomeEntidade() + " embarca em uma jornada épica em busca de poder e glória. " +
                "O reino de Fantasy onde é conhecido por seus inúmeros desafios e segredos mágicos.");
    }

    /**
     * Método para Criar o personagem Aprendiz Principal.
     *
     * @param jogadorAtual - Jogador Atual da Class <>Heroi</>
     */
    private void criarPersonagem(Heroi jogadorAtual) {
        //Input para entrada de dados:
        Scanner input = new Scanner(System.in);
        String jogadorNome = "";

        //Validação de dados para entrada de nome do personagem:
        do {
            System.out.print("Digite o nome do seu personagem: ");
            jogadorNome = input.nextLine();

            if (jogadorNome.isEmpty()) {
                System.err.println("Erro: O nome do personagem não pode ser vazio. Tente novamente.");
            }
        } while (jogadorNome.isEmpty());

        //Tipo de Herói para começar como Aprendiz:
        jogadorAtual = new Aprendiz(jogadorNome, 100, 20);

        //Exibir Detalhes do Jogador:
        jogadorAtual.exibirDetalhes();
    }


    /**
     * Método para Jogador Escolher SubClasse Após Sala de treinamento.
     *
     * @param jogadorAtual Heroi Atual do Jogo.
     */
    private void escolherClasse(Heroi jogadorAtual) {

        //Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);
        int opcaoJogador;

        do {
            System.out.println("Escolha a classe para o seu personagem:");
            System.out.println("[ 1 ] - Arqueiro");
            System.out.println("[ 2 ] - Espadachim");
            System.out.println("[ 3 ] - Gatuno");
            System.out.println("[ 4 ] - Mago");
            System.out.println("[ 5 ] - Mercador");
            System.out.println("[ 6 ] - Noviço");
            System.out.print("Escolha uma Opção Acima: ");

            //Tratamento de Erro para "InputMismatchException" entrada de dados diferente de números:
            try {
                opcaoJogador = input.nextInt();
            } catch (InputMismatchException mismatchException) {
                System.err.println("Erro: Entrada inválida. Certifique-se de digitar um número inteiro.");
                input.next();
                opcaoJogador = 0;
            }

            switch (opcaoJogador) {
                case 1: //Opção SubClasse Arqueiro
                    jogadorAtual = new Arqueiro(jogadorAtual.getNomeEntidade(), jogadorAtual.getVidaEntidade(), jogadorAtual.getForcaEntidade());
                    break;
                case 2: //Opção SubClasse Espadachim
                    jogadorAtual = new Espadachim(jogadorAtual.getNomeEntidade(), jogadorAtual.getVidaEntidade(), jogadorAtual.getForcaEntidade());
                    break;
                case 3: //Opção SubClasse Gatuno
                    jogadorAtual = new Gatuno(jogadorAtual.getNomeEntidade(), jogadorAtual.getVidaEntidade(), jogadorAtual.getForcaEntidade());
                    break;
                case 4: //Opção SubClasse Mago
                    jogadorAtual = new Mago(jogadorAtual.getNomeEntidade(), jogadorAtual.getVidaEntidade(), jogadorAtual.getForcaEntidade());
                    break;
                case 5: //Opção SubClasse Mercador
                    jogadorAtual = new Mercador(jogadorAtual.getNomeEntidade(), jogadorAtual.getVidaEntidade(), jogadorAtual.getForcaEntidade());
                    break;
                case 6: //Opção Classe Noviço
                    jogadorAtual = new Novico(jogadorAtual.getNomeEntidade(), jogadorAtual.getVidaEntidade(), jogadorAtual.getForcaEntidade());
                    break;
                default: //Opção Inválida
                    System.err.println("\n\t\t\t*** Opção Inválida ***\n");
                    break;
            }
        } while (opcaoJogador < 1 || opcaoJogador > 6);
    }


    /**
     * Métodos Getter e Setter
     */
    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public int getIndexAtualSalaDoJogo() {
        return indexAtualSalaDoJogo;
    }

    public void setIndexAtualSalaDoJogo(int indexAtualSalaDoJogo) {
        this.indexAtualSalaDoJogo = indexAtualSalaDoJogo;
    }

    public ArrayList<SalaDeJogo> getSalasJogo() {
        return salasJogo;
    }

    public void setSalasJogo(ArrayList<SalaDeJogo> salasJogo) {
        this.salasJogo = salasJogo;
    }
}