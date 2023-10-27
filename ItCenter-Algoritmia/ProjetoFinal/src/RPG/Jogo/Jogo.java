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

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Jogo {
    private String nomeJogo;
    private int indexAtualSalaDoJogo;
    private ArrayList<SalaDeJogo> salasJogo;
    private Vendedor vendedorRPG;

    /**
     * Método Construtor do Jogo:
     */
    public Jogo() {
        this.nomeJogo = nomeJogo;
        this.indexAtualSalaDoJogo = 0;
        this.salasJogo = new ArrayList<>();
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
     * @param jogadorAtual - Jogador Atual da Class <b>Heroi</b>
     * @throws InterruptedException
     */
    protected void fantasy(Heroi jogadorAtual) throws InterruptedException {
        // Criar todas as salas
        SalaDeJogo sj0Treinamento = new SalaDeJogo("Treinamento", 0);
        SalaDeJogo sj1Vendedor = new SalaDeJogo("Vendedor", 1);
        SalaDeJogo sj2Deserto = new SalaDeJogo("Deserto", 2);
        SalaDeJogo sj3Apocalipse = new SalaDeJogo("Apocalispse", 3);
        SalaDeJogo sj4MiniBoss = new SalaDeJogo("Mini Boss", 4);
        SalaDeJogo sj5VilaOrcs = new SalaDeJogo("Vila dos Orcs", 5);
        SalaDeJogo sj6FlorestaBrasileira = new SalaDeJogo("Floresta Brasileira", 6);
        SalaDeJogo sj7Esfinge = new SalaDeJogo("Esfinge", 7);
        SalaDeJogo sj8FundoMar = new SalaDeJogo("Fundo do Mar", 8);
        SalaDeJogo sj9MiniBoss2 = new SalaDeJogo("Mini Boss 2", 9);
        SalaDeJogo sj10FabricaBrinquedo = new SalaDeJogo("Fábrica de Brinquedo", 10);
        SalaDeJogo sj11AlpesSuicos = new SalaDeJogo("Alpes Suíços", 11);
        SalaDeJogo sj12VulcaoMaldito = new SalaDeJogo("Vulcão Maldito", 12);
        SalaDeJogo sj13CeuInvertido = new SalaDeJogo("Céu Invertido", 13);
        SalaDeJogo sj14FakeBoss = new SalaDeJogo("Fake Boss", 14);
        SalaDeJogo sj15RealFinalBoss = new SalaDeJogo("Real Final Boss", 15);


        // Adicionar ligações do Labirinto das salas:
        sj0Treinamento.adicionarSalaConectada(1);

        sj1Vendedor.adicionarSalaConectada(2);
        sj1Vendedor.adicionarSalaConectada(3);

        sj2Deserto.adicionarSalaConectada(4);
        sj3Apocalipse.adicionarSalaConectada(4);

        sj4MiniBoss.adicionarSalaConectada(5);

        sj5VilaOrcs.adicionarSalaConectada(6);
        sj5VilaOrcs.adicionarSalaConectada(7);
        sj5VilaOrcs.adicionarSalaConectada(8);

        sj6FlorestaBrasileira.adicionarSalaConectada(9);
        sj7Esfinge.adicionarSalaConectada(9);
        sj8FundoMar.adicionarSalaConectada(9);

        sj9MiniBoss2.adicionarSalaConectada(10);
        sj9MiniBoss2.adicionarSalaConectada(11);

        sj10FabricaBrinquedo.adicionarSalaConectada(12);
        sj11AlpesSuicos.adicionarSalaConectada(12);

        sj12VulcaoMaldito.adicionarSalaConectada(13);

        sj13CeuInvertido.adicionarSalaConectada(14);

        sj14FakeBoss.adicionarSalaConectada(15);

        // Criar NPC
        NPC poring = new NPC("Poring", 50, 5, 10);
        NPC lunatico = new NPC("Lunático", 50, 5, 10);
        NPC salgueiro = new NPC("Salgueiro", 50, 5, 10);
        NPC picky = new NPC("Picky", 50, 20, 5);
        NPC mandragora = new NPC("Mandragora", 50, 5, 10);
        NPC fabre = new NPC("Fabre", 50, 5, 10);

        NPC loboDeserto = new NPC("Lobo do Deserto", 120, 30, 10);
        NPC orcGuerreiro = new NPC("Orc Guerreiro", 170, 70, 10);
        NPC zumbiPrisioneiro = new NPC("Zumbi Prisioneiro", 150, 50, 10);
        NPC boitata = new NPC("Boitatá", 200, 90, 10);
        NPC farao = new NPC("Faraó", 230, 110, 10);
        NPC tritao = new NPC("Tritão", 260, 140, 10);
        NPC duendeVerde = new NPC("Duende Verde", 290, 170, 10);
        NPC grinch = new NPC("Grinch", 320, 200, 10);
        NPC salamandra = new NPC("Salamandra", 350, 230, 10);
        NPC arcAngeling = new NPC("Arc Angeling", 380, 250, 10);

        // MiniBoss 1 e 2:
        NPC dracula = new NPC("Drácula", 250, 100, 40);
        NPC megalodon = new NPC("Megalodon", 500, 200, 40);

        // Instância de NPC para a sala 15 "Fake Final Boss":
        NPC jackWolf = new NPC("Jack Wolf", 1, 1, 0);

        // Instância de NPC para a sala 16 "Real Final Boss":
        NPC guardiaoMortoKades = new NPC("Guardião Morto Kades", 1000, 300, 100);

        // Adicionar npc Sala de Jogo 0:
        sj0Treinamento.addNPC(poring);
        sj0Treinamento.addNPC(lunatico);
        sj0Treinamento.addNPC(salgueiro);
        sj0Treinamento.addNPC(picky);
        sj0Treinamento.addNPC(mandragora);
        sj0Treinamento.addNPC(fabre);

        // Adicionar NPC Sala de Jogo 1:
        // Vendedor Na Sala

        // Adicionar NPC Sala de Jogo 2:
        sj2Deserto.addNPC(loboDeserto);

        // Adicionar NPC Sala de Jogo 3:
        sj3Apocalipse.addNPC(zumbiPrisioneiro);

        // Adicionar NPC Sala de Jogo 4:
        sj4MiniBoss.addNPC(dracula);

        // Adicionar NPC Sala de Jogo 5:
        // Contexto Diferente Surpresa

        // Adicionar NPC Sala de Jogo 6:
        sj6FlorestaBrasileira.addNPC(boitata);

        // Adicionar NPC Sala de Jogo 7:
        sj7Esfinge.addNPC(farao);

        // Adicionar NPC Sala de Jogo 8:
        sj8FundoMar.addNPC(tritao);

        // Adicionar NPC Sala de Jogo 9:
        sj9MiniBoss2.addNPC(megalodon);

        // Adicionar NPC Sala de Jogo 10:
        sj10FabricaBrinquedo.addNPC(duendeVerde);

        // Adicionar NPC Sala de Jogo 11:
        sj11AlpesSuicos.addNPC(grinch);

        // Adicionar NPC Sala de Jogo 12:
        // Contexto Diferente Surpresa

        // Adicionar NPC Sala de Jogo 13:
        sj13CeuInvertido.addNPC(arcAngeling);

        // Adicionar NPC Sala de Jogo 14:
        sj14FakeBoss.addNPC(jackWolf);

        // Adicionar NPC Sala de Jogo 15:
        sj15RealFinalBoss.addNPC(guardiaoMortoKades);

        // Instância para o Vendedor:
        this.vendedorRPG = new Vendedor();

        // Criar Armas
        ItemHeroi faca = new ArmaPrincipal("Faca de Aprendiz", 0, 10, 15);
        ItemHeroi arco = new ArmaPrincipal("Arco", 60, 60, 110);
        ItemHeroi arcoCaca = new ArmaPrincipal("Arco de Caça", 100, 100, 150);
        ItemHeroi espada = new ArmaPrincipal("Espada", 60, 60, 110);
        ItemHeroi laminaSagrada = new ArmaPrincipal("Lâmina Sagrada", 100, 100, 150);
        ItemHeroi punhal = new ArmaPrincipal("Punhal", 60, 60, 110);
        ItemHeroi gladius = new ArmaPrincipal("Gladius", 90, 90, 140);
        ItemHeroi bastao = new ArmaPrincipal("Bastão", 60, 60, 110);
        ItemHeroi cajadoFeiticeiro = new ArmaPrincipal("Cajado do Feiticeiro", 100, 100, 150);
        ItemHeroi machado = new ArmaPrincipal("Machado", 60, 60, 110);
        ItemHeroi machado2Maos = new ArmaPrincipal("Machado de Duas Mãos", 100, 100, 150);
        ItemHeroi cajadoSarcerdote = new ArmaPrincipal("Cajado do Sarcerdote", 100, 100, 150);

        // Adicionando Faca de Aprendiz para Todos:
        faca.addHeroiPermitido("Arqueiro");
        faca.addHeroiPermitido("Espadachim");
        faca.addHeroiPermitido("Gatuno");
        faca.addHeroiPermitido("Mago");
        faca.addHeroiPermitido("Mercador");
        faca.addHeroiPermitido("Novico");

        // Adicionando permissão de arma para tipo do herói:
        arco.addHeroiPermitido("Arqueiro");
        arcoCaca.addHeroiPermitido("Arqueiro");
        espada.addHeroiPermitido("Espadachim");
        laminaSagrada.addHeroiPermitido("Espadachim");
        punhal.addHeroiPermitido("Gatuno");
        gladius.addHeroiPermitido("Gatuno");
        bastao.addHeroiPermitido("Mago");
        cajadoFeiticeiro.addHeroiPermitido("Mago");
        machado.addHeroiPermitido("Mercador");
        machado2Maos.addHeroiPermitido("Mercador");
        bastao.addHeroiPermitido("Novico");
        cajadoSarcerdote.addHeroiPermitido("Novico");

        // Instância de Consumiveis de Combate:
        Consumivel pilulaDeCombate = new ConsumivelCombate("Pilura de Combate", 10, 20);
        Consumivel pocaoDoFuror = new ConsumivelCombate("Poção do Furor", 10, 20);
        Consumivel bombaAcida = new ConsumivelCombate("Bomba Ácida", 10, 20);
        Consumivel venenoMortal = new ConsumivelCombate("Veneno Mortal", 10, 20);

        // Instancia de Poção para restaurar Vida:
        Consumivel churrascoDeSelvagem = new Pocao("Churrasco de Selvagem", 10, 10, 10);
        Consumivel coquetelUivante = new Pocao("Coquetel Uivante", 10, 10, 10);
        Consumivel carneAoVinho = new Pocao("Carne ao Vinho", 10, 10, 10);
        Consumivel frutoDeYggdrasil = new Pocao("Fruto de Yggdrasil", 10, 10, 10);
        Consumivel bolinhoDivino = new Pocao("Bolinho Divino", 10, 10, 10);


        // Adicionando permissões para Heroi usar Comsumiveis de Combate:
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

        // Adicionando permissões para Heroi usar Poção:
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


        // Adicionando Armas para o Arqueiro ao stock do Vendedor:
        this.vendedorRPG.adicionarStock(arco);
        this.vendedorRPG.adicionarStock(arcoCaca);

        // Adicionando Armas para o Espadachim ao stock do Vendedor:
        this.vendedorRPG.adicionarStock(espada);
        this.vendedorRPG.adicionarStock(laminaSagrada);

        // Adicionando Armas para o Gatuno ao stock do Vendedor:
        this.vendedorRPG.adicionarStock(punhal);
        this.vendedorRPG.adicionarStock(gladius);

        // Adicionando Armas para o Mago ao stock do Vendedor:
        this.vendedorRPG.adicionarStock(bastao);
        this.vendedorRPG.adicionarStock(cajadoFeiticeiro);

        // Adicionando Armas para o Mercador ao stock do Vendedor:
        this.vendedorRPG.adicionarStock(machado);
        this.vendedorRPG.adicionarStock(machado2Maos);

        // Adicionando Armas para o Noviço ao stock do Vendedor:
        this.vendedorRPG.adicionarStock(bastao);
        this.vendedorRPG.adicionarStock(cajadoSarcerdote);

        // Adicionando Consumiveis de Combate ao stock do Vendedor
        this.vendedorRPG.adicionarStock(pilulaDeCombate);
        this.vendedorRPG.adicionarStock(pocaoDoFuror);
        this.vendedorRPG.adicionarStock(bombaAcida);
        this.vendedorRPG.adicionarStock(venenoMortal);

        // Adicionando Poção de recuperação de vida ao stock do Vendedor:
        this.vendedorRPG.adicionarStock(churrascoDeSelvagem);
        this.vendedorRPG.adicionarStock(coquetelUivante);
        this.vendedorRPG.adicionarStock(carneAoVinho);
        this.vendedorRPG.adicionarStock(bolinhoDivino);
        this.vendedorRPG.adicionarStock(frutoDeYggdrasil);


        // Arma Principal Adicionado aos NPC dp Jogo:
        poring.addInventarioNPC((ArmaPrincipal) espada);
        lunatico.addInventarioNPC((ArmaPrincipal) punhal);
        mandragora.addInventarioNPC((ArmaPrincipal) bastao);
        picky.addInventarioNPC((ArmaPrincipal) arco);
        fabre.addInventarioNPC((ArmaPrincipal) machado);


        // Adicionar ao array de salas (mapa)
        adicionarMapa(sj0Treinamento);
        adicionarMapa(sj1Vendedor);
        adicionarMapa(sj2Deserto);
        adicionarMapa(sj3Apocalipse);
        adicionarMapa(sj4MiniBoss);
        adicionarMapa(sj5VilaOrcs);
        adicionarMapa(sj6FlorestaBrasileira);
        adicionarMapa(sj7Esfinge);
        adicionarMapa(sj8FundoMar);
        adicionarMapa(sj9MiniBoss2);
        adicionarMapa(sj10FabricaBrinquedo);
        adicionarMapa(sj11AlpesSuicos);
        adicionarMapa(sj12VulcaoMaldito);
        adicionarMapa(sj13CeuInvertido);
        adicionarMapa(sj14FakeBoss);
        adicionarMapa(sj15RealFinalBoss);

        //TODO COMEÇAR JOGO
        //Saudações Inicial do Jogo:
        System.out.println("Em um mundo repleto de magia e mistério, " +
                "um jovem aprendiz chamado \n" + jogadorAtual.getNomeEntidade() + " embarca em uma jornada épica em busca de poder e glória. " +
                "\nO reino de Fantasy onde é conhecido por seus inúmeros desafios e segredos mágicos.\n");
        System.out.println("*******************************************************");

        System.err.println("\t\t\t»»» Em seus primeiros desafios você está sendo abençoado... \n" +
                "\t\t\t    ...por proteger o nosso reino e irá receber uma Faca de Aprendiz «««");
        System.out.println("*******************************************************");
        jogadorAtual.setArmaPrincipalHeroi((ArmaPrincipal) faca);

        //TODO ADICIONAR MÉTODO PARA REINICIAR JOGO COM BOOLEAN NO FANTASY E PECORRER
        pecorrerJogoInteiro(0, jogadorAtual);

    }

    /**
     * Método para Pecorrer o Jogo de acordo com a lógica criada do mapa:
     *
     * @param indexAtualSalaDoJogo - Sala para o Labirinto Instalado ao Jogo
     * @param jogadorAtual         - Heroi / jogadorAtual
     * @throws InterruptedException
     */
    protected void pecorrerJogoInteiro(int indexAtualSalaDoJogo, Heroi jogadorAtual) throws InterruptedException {
        // Import Scanner para entrada de dados:
        Scanner input = new Scanner(System.in);

        // Declaração de variáveis:
        int indexProximaSalaDoJogo = 0;
        int opcaoCompraVendedor = 0;
        boolean opcaoInvalida = true;
        boolean jogadorPerdeu = false;


        //Laço para criar validação de morte do personagem:
        do {
            // Saudações de Boas Vindas de acordo com a sala atual:
            boasVindas(indexAtualSalaDoJogo);

            // Acessar a sala atual através de ArrayList<SalaDeJogo>
            SalaDeJogo salaAtual = this.salasJogo.get(indexAtualSalaDoJogo);


            // Array para correr inimigo da SalaDeJogo
            for (NPC npcAtual : salaAtual.getInimigoNaSala()) {
                System.out.println("NOME NPC = " + npcAtual.getNomeEntidade());
                String mensagem = mensagemBatalhaPorNPC(npcAtual);
                System.out.println(mensagem);
                System.out.println("\t\t»» Prepar-se Para Enfrentá-lo ««");
                Thread.sleep(1000);
                jogadorAtual.atacar(npcAtual);

                if (npcAtual.getVidaEntidade() <= 0) {
                    salaAtual.getInimigoNaSala().remove(npcAtual);
                }
            }


            //Após final da batalha dar acesso a próxima sala pelo labirinto até final do jogo.
            System.out.println("\t########## PARABÉNS!! MAIS UMA ETAPA VENCIDA!! ##########");

            for (int idSalaConectda : salaAtual.getIdSalaConectada()) {
                System.out.print("[ " + idSalaConectda + " ]");
                switch (idSalaConectda) {
                    case 1:
                        jogadorAtual.setOuroHeroi(3000);
                        System.out.println("ADICIONANDO OURO PARA TESTE DE POÇÃO!! " + jogadorAtual.getOuroHeroi());
                        System.out.print("Sala do Vendedor\n");

                        while (opcaoInvalida && jogadorAtual.getOuroHeroi() > 0) {
                            Thread.sleep(350);
                            this.vendedorRPG.venderTodosItens(jogadorAtual);

                            System.out.println("[ 1 ] - Sim");
                            System.out.println("[ 2 ] - Não");
                            System.out.print("Deseja comprar mais algo? ");

                            try {
                                opcaoCompraVendedor = input.nextInt();
                            } catch (InputMismatchException mismatchException) {
                                System.err.println("Erro: Entrada inválida. Certifique-se de digitar um número inteiro.");
                                input.next();
                                opcaoCompraVendedor = 0;
                            }

                            if (opcaoCompraVendedor == 1) {
                                this.vendedorRPG.venderTodosItens(jogadorAtual);
                            } else if (opcaoCompraVendedor == 2) {
                                opcaoInvalida = false;
                            } else {
                                System.out.println("Opção inválida. Por favor, escolha 1 para comprar ou 2 para sair.");
                            }
                        }
                        System.out.print("[ " + idSalaConectda + " ]");
                        System.out.println(" - Voltar ao Salão Principal");
                        break;
                    case 2:
                    case 6:
                        System.out.println("Sala Surpresa");
                        break;
                    case 3:
                        System.out.println("Sala do Apocalipse");
                        break;
                    case 4:
                        salaParaHeroiUsarPocao(jogadorAtual);
                        System.out.print("[ " + idSalaConectda + " ]");
                        System.out.println(" - Voltar ao Salão Principal");
                    case 9:
                        System.out.println("Mini Boss!!");
                        salaParaHeroiUsarPocao(jogadorAtual);
                        System.out.print("[ " + idSalaConectda + " ]");
                        System.out.println(" - Voltar ao Salão Principal");
                        break;
                    case 5:
                        System.out.println("Sala de Recuperação ?!?!");

                        System.out.print(jogadorAtual.getNomeEntidade() + " Pesadelo ja passou! Volte ao salão principal!! ");
                        indexProximaSalaDoJogo = input.nextInt();
                        contextoDiferenteSurpresa1(jogadorAtual);
                        System.out.print("[ " + idSalaConectda + " ]");
                        System.out.println(" - Voltar ao Salão Principal");
                    case 7:
                        System.out.println("Enfrente as Esfinge!!");
                        break;
                    case 8:
                        System.out.println("Deseja Nadar um pouco??");
                        break;
                    case 10:
                        System.out.println("Gosta de Brinquedos?");
                        break;
                    case 11:
                        System.out.println("Ou Prefere Enfrentar o frio??");
                        while (opcaoInvalida && jogadorAtual.getOuroHeroi() > 0) {
                            Thread.sleep(350);
                            this.vendedorRPG.venderItem(jogadorAtual);

                            System.out.println("[ 1 ] - Sim");
                            System.out.println("[ 2 ] - Não");
                            System.out.print("Deseja comprar mais algo? ");

                            try {
                                opcaoCompraVendedor = input.nextInt();
                            } catch (InputMismatchException mismatchException) {
                                System.err.println("Erro: Entrada inválida. Certifique-se de digitar um número inteiro.");
                                input.next();
                                opcaoCompraVendedor = 0;
                            }

                            if (opcaoCompraVendedor == 1) {
                                this.vendedorRPG.venderItem(jogadorAtual);
                            } else if (opcaoCompraVendedor == 2) {
                                opcaoInvalida = false;
                            } else {
                                System.out.println("Opção inválida. Por favor, escolha 1 para comprar ou 2 para sair.");
                            }
                        }
                        System.out.print("[ " + idSalaConectda + " ]");
                        System.out.println(" - Voltar ao Salão Principal");
                        System.out.println("Sala da boa Esperança");
                        break;
                    case 12:
                        break;
                    case 13:
                        System.out.println("Agora vai Esquentar!!");
                        break;
                    case 14:
                        System.out.println("O Bixo Vai Pegar!!");
                        break;
                    case 15:
                        System.out.println("Final Boss!! Não tem pra onde Fugir agora!!");
                        break;
                    default:
                        System.out.println("Sala Desconhecida");
                }
            }

            // Adicionando validação para continuar ou selecionar salas de acordo com o labirinto:
            opcaoInvalida = true;
            do {
                opcaoInvalida = true;
                try {
                    System.out.print("Escolha uma sala válida entre as disponíveis: ");
                    int escolha = input.nextInt();

                    for (int idSalaConectada : salaAtual.getIdSalaConectada()) {
                        if (escolha == idSalaConectada) {
                            opcaoInvalida = false;
                            indexProximaSalaDoJogo = escolha;
                            break;
                        }
                    }

                    if (opcaoInvalida) {
                        System.err.println("Opção inválida. Por favor, escolha uma sala válida.");
                    }
                } catch (InputMismatchException e) {
                    System.err.println("Entrada inválida. Por favor, insira um número inteiro.");
                    input.next(); // Limpar o buffer de entrada
                }
            } while (opcaoInvalida);

            // Continuação do Jogo ao final do labirinto
            pecorrerJogoInteiro(indexProximaSalaDoJogo, jogadorAtual);
        } while (jogadorAtual.getVidaEntidade() > 0);

        // Caso Jogador Perca o Jogo:
        if (jogadorAtual.getVidaEntidade() <= 0) {
            System.out.println("Game Over!!");
            System.out.println("Deseja Jogar Novamente?");
            pecorrerJogoInteiro(0, jogadorAtual);
        }
    }

    /**
     * Método para o Herói Usar Poção:
     *
     * @param jogadorAtual - Heroi / jogadorAtual
     */
    private void salaParaHeroiUsarPocao(Heroi jogadorAtual) {
        // Scanner input para entrada de dados:
        Scanner input = new Scanner(System.in);

        // Declaração de variáveis:
        int numContadorUsoPocao = 0;
        int opcaoContador = 0;

        System.out.println("Uma pequena Porta no meio de tantos desafios,\n" +
                "se abre para dar um pouco de descanso para o Aventureiro!! ");

        for (numContadorUsoPocao = 1; numContadorUsoPocao <= 3; numContadorUsoPocao++) {
            System.out.println("HP Atual = " + jogadorAtual.getVidaEntidade() + "; FOR Atual = " + jogadorAtual.getForcaEntidade());

            System.out.println("********** Lista de Poções no Inventário **********");
            ArrayList<Consumivel> inventario = jogadorAtual.getInventarioHeroi();
            opcaoContador = 0;

            for (int i = 0; i < inventario.size(); i++) {
                ItemHeroi itemHeroi = inventario.get(i);
                if (itemHeroi instanceof Pocao) {
                    opcaoContador++;
                    System.out.println("[ " + opcaoContador + " ] - " + itemHeroi.getNomeItemHeroi()
                            + " HP + " + ((Pocao) itemHeroi).getRecuperarVida()
                            + "; FOR + " + ((Pocao) itemHeroi).getAumentarForca());
                }
            }

            if (opcaoContador == 0) {
                System.out.println("Inventário de Poções Vazio!");
                break;  // Sai do loop se não houver poções no inventário
            } else {
                System.out.println("[ 0 ] - Digite para sair!!");
                System.out.print("Deseja utilizar alguma Poção acima para recuperar seu HP? ");
                int opcaoCompraVendedor = input.nextInt();

                if (opcaoCompraVendedor == 0) {
                    break;  // Sai do loop se o usuário escolher 0
                }

                if (opcaoCompraVendedor < 1 || opcaoCompraVendedor > opcaoContador) {
                    System.out.println("Opção inválida. Escolha um número válido.");
                    numContadorUsoPocao--;
                    continue;
                }

                // Uso e Remoção do Item Poção do inventário:
                Consumivel pocaoEscolhida = (Pocao) inventario.get(opcaoCompraVendedor - 1);
                jogadorAtual.setVidaEntidade(jogadorAtual.getVidaEntidade() + ((Pocao) pocaoEscolhida).getRecuperarVida());
                jogadorAtual.setForcaEntidade(jogadorAtual.getForcaEntidade() + ((Pocao) pocaoEscolhida).getAumentarForca());
                inventario.remove(opcaoCompraVendedor - 1);
                System.out.println("Poção usada com sucesso!");
            }
        }
    }


    /**
     * Método para Contexto Diferente Surpresa 1 do Jogo:
     *
     * @param jogadorAtual - Heroi / jogadorAtual
     */
    private void contextoDiferenteSurpresa1(Heroi jogadorAtual) {
        //Random para interferir na sorte do Jogador:
        Random random = new Random();

        //Import Scanner para entrada de dados:
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis Locais:
        int opcaoEscolhaJogador;
        int opcaoSorteJogador;
        int ouroParaDiminuir;

        System.out.println("Na \"Sala das Armadilhas Douradas,\" você se depara com uma reviravolta inesperada em sua jornada. \n" +
                "À primeira vista, a sala brilha com a promessa de riquezas incalculáveis, \n" +
                "com montanhas de ouro e tesouros cintilantes. \n" +
                "No entanto, assim que você põe os pés na sala, uma armadilha é acionada.\n" +
                "O chão treme e se desloca sob seus pés, \n" +
                "e você percebe que está em um labirinto de corredores com 5 portas diferentes!!!. \n" +
                "Muito Cuidado!!! Cada movimento incorre tem um custo a se cobrar, \n" +
                "e sua habilidade de escapar dessa sala depende de sua astúcia e destreza. \n" +
                "Esta é uma lição valiosa de que nem todo tesouro brilhante é o que parece e de que o risco espreita \n" +
                "em todos os lugares, mesmo nas salas mais tentadoras de Fantasy.");
        System.out.println("Total de Ouro no Momento = " + jogadorAtual.getOuroHeroi());
        System.out.println("A sua frente existem 5 Portas, 1 delas irá te sarfar da armadilha!!");
        do {
            System.out.println("Escolha a classe para o seu personagem:");
            System.out.println("[ 1 ] - Porta da Ilusão Eterna");
            System.out.println("[ 2 ] - Passagem do Tesouro Falso");
            System.out.println("[ 3 ] - Entrada do Labirinto Dourado");
            System.out.println("[ 4 ] - Portal da Ganância");
            System.out.println("[ 5 ] - Caminho da Incerteza");
            System.out.print("Escolha uma Opção Acima: ");

            try {
                opcaoEscolhaJogador = input.nextInt();
            } catch (InputMismatchException mismatchException) {
                System.err.println("Erro: Entrada inválida. Certifique-se de digitar um número inteiro.");
                input.next();
                opcaoEscolhaJogador = 0;
            }

            opcaoSorteJogador = random.nextInt(1, 6);
            if (opcaoSorteJogador == opcaoEscolhaJogador) {
                System.out.println("Você Passou com Muita Sorte desta vez!!");
                System.out.println("Siga Seu Caminho!");
            } else {
                System.out.println("Um mecanismo oculto é acionado, e você se vê preso em uma \n" +
                        "rede de correntes mágicas que começam a drenar seu ouro. \n" +
                        "O brilho de suas moedas é lentamente absorvido pela sala, \n" +
                        "e você percebe que está perdendo uma parte de sua riqueza \n" +
                        "conquistada com tanto esforço. A cada segundo que passa, \n" +
                        "mais moedas de ouro desaparecem, e você luta para se libertar da armadilha, mas sem sucesso.\n" +
                        "\n" +
                        "Quando a armadilha finalmente é desativada, \n" +
                        "você se sente aliviado por escapar ileso fisicamente, \n" +
                        "mas percebe que uma quantidade considerável de seu ouro se foi. \n" +
                        "A sala, com seu brilho ilusório, mostrou ser uma armadilha traiçoeira, \n" +
                        "ensinando-lhe uma valiosa lição sobre a ganância e a necessidade \n" +
                        "de avaliar com cuidado as escolhas em Fantasy.");
                System.err.println("O custo da armadilha: -20 moedas de ouro");
                if (jogadorAtual.getOuroHeroi() == 0) {
                    System.out.println("Por Sorte já estava sem ouro!!");
                    System.out.println("Total de Ouro = " + jogadorAtual.getOuroHeroi());
                } else {
                    ouroParaDiminuir = jogadorAtual.getOuroHeroi() - 20;
                    jogadorAtual.setOuroHeroi(ouroParaDiminuir);
                    System.out.println("Total de Ouro = " + jogadorAtual.getOuroHeroi());
                    if (jogadorAtual.getOuroHeroi() < 0) {
                        jogadorAtual.setOuroHeroi(0);
                        System.out.println("Total de Ouro = " + jogadorAtual.getOuroHeroi());
                    }
                }
            }
        } while (opcaoEscolhaJogador < 1 || opcaoEscolhaJogador > 5);
    }

    /**
     * Método para imprimir no Console a interatividade de acordo com o NPC
     *
     * @param npcAtual
     * @return - Contexto de acordo com o tipo de NPC da sala do mapa
     */
    private String mensagemBatalhaPorNPC(NPC npcAtual) {
        String nomeNpc = npcAtual.getNomeEntidade();
        String mensagem = "";

        if (nomeNpc.equalsIgnoreCase("Poring")) {
            mensagem = "Os Porings são criaturas gelatinosas e saltitantes que parecem inofensivas à primeira vista,\n" +
                    "mas possuem a habilidade de se dividir em múltiplos Porings menores quando atacados. \n" +
                    "Eles testarão sua habilidade de lidar com inimigos numerosos e ágeis.";
        } else if (nomeNpc.equalsIgnoreCase("Lunático")) {
            mensagem = "Os Lunáticos são pequenos monstros lunáticos com sorrisos sinistros. \n" +
                    "Eles adoram pregar peças e têm uma agilidade surpreendente. \n" +
                    "Enfrentá-los é um teste de sua destreza e habilidades de combate rápido.";
        } else if (nomeNpc.equalsIgnoreCase("Salgueiro")) {
            mensagem = "Salgueiros são árvores vivas que podem lançar raízes em sua direção e \n" +
                    "atacar com golpes poderosos de galhos retorcidos. \n" +
                    "Lidar com esses monstros é um teste de resistência e estratégia.";
        } else if (nomeNpc.equalsIgnoreCase("Picky")) {
            mensagem = "Os Pickys são aves rápidas e esquivas com bicos afiados. \n" +
                    "Eles testarão sua precisão e capacidade de enfrentar inimigos voadores.";
        } else if (nomeNpc.equalsIgnoreCase("Fabre")) {
            mensagem = "Os Fabres são pequenos insetos, mas em grandes números, podem ser uma ameaça. \n" +
                    "Eles testarão sua habilidade de lidar com hordas de inimigos e sua resistência.";
        } else if (nomeNpc.equalsIgnoreCase("Lobo do Deserto")) {
            mensagem = "Este predador solitário e astuto é uma das criaturas mais adaptadas a \n" +
                    "sobreviver nas condições adversas do Deserto de Soltar. \n" +
                    "Com pelagem áspera e olhos ardentes, o Lobo do Deserto é um caçador feroz, \n" +
                    "capaz de mover-se rapidamente sobre a areia escaldante e atacar com precisão letal. \n" +
                    "Ele representa um teste de sua habilidade de combate e agilidade sob o implacável sol do deserto.";
        } else if (nomeNpc.equalsIgnoreCase("Zumbi Prisioneiro")) {
            mensagem = "Este terrível inimigo é o resultado de uma experiência desastrosa que ocorreu \n" +
                    "nos laboratórios secretos de um antigo complexo prisional. \n" +
                    "Preso em correntes enferrujadas, o Zumbi Prisioneiro é uma aberração reanimada, \n" +
                    "com correntes e algemas que ainda o prendem. \n" +
                    "Seus passos são arrastados e seus gemidos ecoam pelo que um dia foi uma instalação de detenção. \n" +
                    "Ele é um exemplo aterrorizante de como a ciência e a magia descontroladas podem dar origem a horrores impensáveis.";
        } else if (nomeNpc.equalsIgnoreCase("Drácula")) {
            mensagem = "Este vampiro lendário é conhecido por sua inteligência afiada, n" +
                    "força sobrenatural e habilidades mágicas sombrias. Vestido com uma capa negra \n" +
                    "esvoaçante e olhos vermelhos hipnotizantes, \n" +
                    "Drácula é uma ameaça para todos os que ousam entrar em seu reino das sombras. \n" +
                    "Sua sede de sangue é insaciável, \n" +
                    "e ele se alimenta da energia daqueles que se aventuram em seu domínio.\n" +
                    "\n" +
                    "Prepare-se para o confronto com Drácula na Sala das Sombras, \n" +
                    "pois a batalha será intensa e a recompensa inestimável. \n" +
                    "Sua coragem é a única esperança de vencer este inimigo e prosseguir em sua missão épica.";
        } else if (nomeNpc.equalsIgnoreCase("Boitatá")) {
            mensagem = "Este ser lendário é uma representação mágica das criaturas das florestas brasileiras. \n" +
                    "O Boitatá é uma serpente de fogo, com olhos brilhantes que emitem chamas, \n" +
                    "o que lhe permite navegar pelas sombras da floresta com facilidade. \n" +
                    "Sua presença é temida e respeitada, e sua aparência imponente é um espetáculo de beleza e terror.";
        } else if (nomeNpc.equalsIgnoreCase("Faraó")) {
            mensagem = "Este ser lendário personifica a majestade e o poder dos antigos faraós do Egito. \n" +
                    "Vestido com trajes reais e usando uma coroa dourada, o Faraó é um monarca reanimado, \n" +
                    "dotado de habilidades mágicas ancestrais. \n" +
                    "Ele empunha um cajado poderoso, capaz de conjurar feitiços e controlar elementos mágicos, \n" +
                    "como areia e fogo.";
        } else if (nomeNpc.equalsIgnoreCase("Arc Angeling")) {
            mensagem = "Este ser angélico é uma visão sombria das criaturas celestiais. \n" +
                    "Com asas negras e uma aura de misticismo, o Arc Angeling é uma figura imponente. \n" +
                    "Seus olhos irradiam uma luz sinistra e seu poder é inigualável. \n" +
                    "Ele é um guardião do \"Céu Invertido,\" capaz de lançar feitiços celestiais \n" +
                    "poderosos e controlar elementos mágicos.";
        } else if (nomeNpc.equalsIgnoreCase("Tritão")) {
            mensagem = "Este ser lendário é um mestre dos oceanos, meio humano e meio peixe, \n" +
                    "com uma aparência majestosa. Com cabelos esvoaçantes e um tridente mágico, \n" +
                    "o Tritão é o governante das profundezas e protetor das águas. \n" +
                    "Ele controla as marés e é conhecido por sua força formidável e habilidades mágicas aquáticas.";
        } else if (nomeNpc.equalsIgnoreCase("Grinch")) {
            mensagem = "Este ser lendário é uma figura enigmática que se esconde nas montanhas geladas dos Alpes Suiços. \n" +
                    "Com sua pele esverdeada e uma expressão travessa, \n" +
                    "o Grinch é conhecido por suas travessuras e seu desejo de roubar a alegria dos outros. \n" +
                    "Ele é ágil, astuto e pode criar ilusões mágicas para confundir e enganar seus adversários.";
        } else if (nomeNpc.equalsIgnoreCase("Jack Wolf")) {
            mensagem = "Este ser lendário aparece como um lobo gigante, de pelagem escura e olhos ardentes. \n" +
                    "Ele é um inimigo imponente e feroz à primeira vista, \n" +
                    "e sua presença ameaçadora faz com que você se prepare para uma batalha épica.";
        }
        return mensagem;
    }

    /**
     * Método de Boas vindas para cada tipo e contexto de Sala do Jogo
     *
     * @param indexAtualSalaDoJogo
     * @throws InterruptedException
     */
    protected void boasVindas(int indexAtualSalaDoJogo) throws InterruptedException {
        if (indexAtualSalaDoJogo == 0) {
            //Campo de Treinamento
            System.out.println("###################################################################");
            System.out.println("No campo de treinamento de Fantasy,\n" +
                    "um vasto e pitoresco local cercado por densas florestas,\n" +
                    "altas montanhas e rios cristalinos, você inicia sua jornada heróica.\n" +
                    "O campo de treinamento é um local sagrado, onde os aventureiros se preparam\n" +
                    "para os desafios que os aguardam no reino. Aqui, você aprimorará suas habilidades,\n" +
                    "ganhará experiência e, o mais importante, enfrentará cinco monstros temíveis,\n" +
                    "cada um representando um teste de suas habilidades.");
            Thread.sleep(150);
            System.out.println("###################################################################");
        } else if (indexAtualSalaDoJogo == 1) {
            //Vendedor
            System.out.println("###################################################################");
            System.out.println("\t\t\tSalão Principal!!");
            Thread.sleep(150);
            System.out.println("###################################################################");
        } else if (indexAtualSalaDoJogo == 2) {
            //Deserto
            System.out.println("###################################################################");
            System.out.println("Bem-vindo ao Deserto de Soltar, uma vastidão escaldante de areia e mistério, \n" +
                    "onde sua aventura em Fantasy continua a se desdobrar. \n" +
                    "À medida que você atravessa as dunas intermináveis e encara o calor abrasador do deserto, \n" +
                    "você se depara com um desafio singular: o temido \"Lobo do Deserto.\"");
            Thread.sleep(150);
            System.out.println("###################################################################");
        } else if (indexAtualSalaDoJogo == 3) {
            //Apocalipse
            System.out.println("###################################################################");
            System.out.println("No mundo pós-apocalíptico de Fantasy, a civilização está à beira da extinção. \n" +
                    "Cidades abandonadas, ruínas destruídas e uma atmosfera de desespero permeiam a paisagem. \n" +
                    "A humanidade enfrenta um novo inimigo, e é aqui que a sua jornada como herói começa a se destacar. " +
                    "Em meio ao caos, você encontra um desafio assustador: o \"Zumbi Prisioneiro\".");
            Thread.sleep(150);
            System.out.println("###################################################################");
        } else if (indexAtualSalaDoJogo == 4) {
            //Mini Boss
            System.out.println("###################################################################");
            System.out.println("\n" +
                    "Bem-vindo à Sala das Sombras, um local misterioso e sinistro onde sua aventura\n" +
                    "em Fantasy atinge um ponto crucial. À medida que você adentra a sala, \n" +
                    "a atmosfera se torna densa e carregada de tensão, e no centro da câmara escura,\n" +
                    " você enfrenta um desafio formidável: o temido \"Drácula\", um mini boss poderoso.");
            Thread.sleep(150);
            System.out.println("###################################################################");
        } else if (indexAtualSalaDoJogo == 5) {
            System.out.println("###################################################################");
            System.out.println("SALA PARA ADICIONAR CONTEXTO SURPRESA");
            Thread.sleep(150);
            System.out.println("###################################################################");
        } else if (indexAtualSalaDoJogo == 6) {
            //Floresta Brasileira
            System.out.println("###################################################################");
            System.out.println("Bem-vindo à \"Floresta Brasileira,\" um local mágico e repleto de mistérios,\n" +
                    "onde sua aventura em Fantasy se mescla com as lendas do folclore brasileiro.\n" +
                    "Enquanto você atravessa a densa vegetação da floresta,\n" +
                    "você se depara com um desafio inigualável: o temido \"Boitatá.\"");
            Thread.sleep(150);
            System.out.println("###################################################################");
        } else if (indexAtualSalaDoJogo == 7) {
            //Esfinge
            System.out.println("###################################################################");
            System.out.println("Bem-vindo à \"Sala da Esfinge,\" um local majestoso e enigmático em Fantasy,\n" +
                    "onde sua aventura continua a se desdobrar. \n" +
                    "A sala é adornada com esculturas e hieróglifos misteriosos, \n" +
                    "e no centro dela, você enfrenta um desafio sem igual: o temível \"Faraó.\"");
            Thread.sleep(150);
            System.out.println("###################################################################");
        } else if (indexAtualSalaDoJogo == 8) {
            //Fundo do Mar
            System.out.println("###################################################################");
            System.out.println("Bem-vindo ao \"Fundo do Mar,\" um reino subaquático deslumbrante e misterioso em Fantasy,\n" +
                    "onde sua aventura atinge profundezas inexploradas.\n" +
                    "À medida que você mergulha nas águas cristalinas e contempla a vida marinha exuberante,\n" +
                    "você se depara com um desafio único: o poderoso \"Tritão.\"");
            Thread.sleep(150);
            System.out.println("###################################################################");
        } else if (indexAtualSalaDoJogo == 9) {
            //Mini Boss 2
            System.out.println("###################################################################");
            System.out.println("Bem-vindo à \"Sala do Abismo,\" um local sombrio e misterioso em Fantasy,\n" +
                    "onde sua aventura atinge um novo nível de desafio.\n" +
                    "À medida que você adentra a sala, a escuridão se fecha ao seu redor,\n" +
                    "e no centro dela, você enfrenta um inimigo impressionante: o formidável \"Megalodon\".");
            Thread.sleep(150);
            System.out.println("###################################################################");
        } else if (indexAtualSalaDoJogo == 10) {
            //Fábrica de Brinquedos
            System.out.println("###################################################################");
            System.out.println("Bem-vindo à \"Fábrica de Brinquedos\", um local encantado e colorido em Fantasy, \n" +
                    "onde sua aventura continua em um ambiente que parece saído de um conto de fadas. \n" +
                    "Enquanto você explora os corredores repletos de brinquedos mágicos e máquinas de produção, \n" +
                    "você se depara com um desafio inesperado: o travesso \"Duende Verde.\"");
            Thread.sleep(150);
            System.out.println("###################################################################");
        } else if (indexAtualSalaDoJogo == 11) {
            //Alpes Suiços
            System.out.println("###################################################################");
            System.out.println("Bem-vindo aos majestosos \"Alpes Suiços\", um cenário de tirar o fôlego em Fantasy, \n" +
                    "onde sua jornada continua em meio às montanhas cobertas de neve e paisagens deslumbrantes. \n" +
                    "Enquanto você explora as encostas e picos gelados, \n" +
                    "você se depara com um desafio peculiar: o travesso \"Grinch\".");
            Thread.sleep(150);
            System.out.println("###################################################################");
        } else if (indexAtualSalaDoJogo == 12) {
            //TODO ADICIONAR CONTEXTO DIFERENTE SURPRESA 2
            System.out.println("###################################################################");
            System.out.println("SALA PARA ADICIONAR CONTEXTO SURPRESA");
            Thread.sleep(150);
            System.out.println("###################################################################");
        } else if (indexAtualSalaDoJogo == 13) {
            //Céu Invertido
            System.out.println("###################################################################");
            System.out.println("Bem-vindo ao \"Céu Invertido,\" um reino celestial distorcido e enigmático em Fantasy, \n" +
                    "onde sua jornada assume uma aura de mistério e desafio. \n" +
                    "Enquanto você explora este cenário de nuvens negras e raios de luz invertidos, \n" +
                    "você se depara com um desafio celestial: o imponente \"Arc Angeling.\"");
            Thread.sleep(150);
            System.out.println("###################################################################");
        } else if (indexAtualSalaDoJogo == 14) {
            //Fake Boss
            System.out.println("###################################################################");
            System.out.println("\n" +
                    "Na \"Sala das Ilusões\", a tensão atinge o seu auge. \n" +
                    "O confronto com o temido \"Jack Wolf\" parece ser o penúltimo desafio em sua jornada épica. \n" +
                    "A batalha começa com uma intensidade dramática, mas à medida que o combate avança, \n" +
                    "uma revelação chocante se desdobra: o Jack Wolf não passa de uma ilusão habilmente projetada, \n" +
                    "deixando você atordoado e pronto para enfrentar o verdadeiro desafio que está por vir.");
            Thread.sleep(150);
            System.out.println("###################################################################");
        } else {
            //Final Real Boss
            System.out.println("###################################################################");
            System.out.println("O encontro com o \"Jack Wolf\" na \"Sala das Ilusões\" \n" +
                    "revela-se parte de um plano elaborado para testar sua coragem e habilidades. \n" +
                    "Enquanto você processa a surpreendente ilusão, a verdadeira ameaça emerge: \n" +
                    "o \"Guardião Morto Kades\", um ser poderoso e aterrorizante que estava à espreita nas sombras. \n" +
                    "A ilusão do Jack Wolf serviu como um estratagema para ocultar a verdadeira natureza deste \n" +
                    "formidável adversário. Agora, você está diante de um verdadeiro desafio, \n" +
                    "e a batalha que se inicia é a mais emocionante e crucial de sua jornada em Fantasy.");
            Thread.sleep(150);
            System.out.println("###################################################################");
        }
    }

    /**
     * Método para Opção do Jogador da Dificuldade do Jogo (Dificl/Fácil)
     *
     * @param jogadorAtual
     * @throws InterruptedException
     */
    protected void dificuldadeJogo(Heroi jogadorAtual) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        String nomePersonagem;
        int opcaoDificuldade;
        int totalPontosCriacao = 0;
        int pontosVida = 0;
        int pontosForca = 0;

        // Passo 1: Escolha de Dificuldade
        System.out.println("\n######################################################################################################");
        System.err.println("Você precisa escolher o nível de dificuldade do jogo.\n" +
                "Como aventureiro, você tem duas opções:\n" +
                "\n" +
                "[ 1 ] Modo Bebé: Neste modo, você terá 300 pontos de distribuição para aprimorar sua força. \n" +
                "Cada 5 ponto utilizado em força ganhará +1 ponto sólido. \"150 Pontos = 30 For\"\n" +
                "Cada 1 ponto será convertido em +1 de HP. \"150 Pontos = 150HP\"\n" +
                "Além disso, você receberá 20 moedas de ouro para começar sua jornada.\n" +
                "\n" +
                "[ 2 ] Modo HardCore: Neste modo desafiador, você terá 220 pontos de distribuição para sua força,\n" +
                "Cada 5 ponto utilizado em força ganhará +1 ponto sólido. Ou Seja \"120 Pontos = 24 For\"\n" +
                "Cada 1 ponto será convertido em +1 de HP. \"100 Pontos = 100HP\"\n" +
                "Você receberá apenas 15 moedas de ouro para começar.\n" +
                "\n" +
                "A escolha é sua, aventureiro. \n" +
                "Você está pronto para enfrentar Fantasy no modo FÁCIL e desfrutar de uma jornada mais tranquila,\n" +
                "Ou deseja encarar o desafio no modo DIFÍCIL, onde a recompensa será menor, mas a glória ainda maior?");
        Thread.sleep(150);
        System.out.println("######################################################################################################");
        //Thread.sleep(3500);
        do {
            System.out.print("» Escolha a dificuldade: ");

            // Tratamento de Erro para opção errada do usuário
            try {
                opcaoDificuldade = input.nextInt();
                if (opcaoDificuldade < 1 || opcaoDificuldade > 2) {
                    System.err.println("\t\t\t*** Opção Inválida ***\n");
                }
            } catch (InputMismatchException mismatchException) {
                System.err.println("\n\t\t\t*** Certifique-se de digitar um número inteiro ***\n");
                input.next();
                opcaoDificuldade = 0;
            }
        } while (opcaoDificuldade < 1 || opcaoDificuldade > 2);


        // Passo 2: Distribuição de Pontos
        if (opcaoDificuldade == 1) {
            totalPontosCriacao = 300;
            System.out.println("Você tem 300 Pontos para distribuir entre Força e Vida");
            System.out.println("Quantos Pontos deseja colocar em Força?");
            pontosForca = input.nextInt();
            jogadorAtual.setForcaEntidade(pontosForca / 5);
            pontosVida = totalPontosCriacao - pontosForca;
            System.out.println("Restaram " + pontosVida + " que será atribuída ao valor da Vida");
            jogadorAtual.setVidaEntidade(pontosVida);
            System.out.println("Também foi atribuido valor de 15 moedas de ouro");
            Thread.sleep(1500);
            jogadorAtual.setOuroHeroi(15);
            jogadorAtual.exibirDetalhes();

        } else if (opcaoDificuldade == 2) {
            totalPontosCriacao = 220;
            System.out.println("Você tem 220 Pontos para distribuir entre Força e Vida");
            System.out.println("Quantos Pontos deseja colocar em Força?");
            pontosForca = input.nextInt();
            jogadorAtual.setForcaEntidade(pontosForca / 5);
            pontosVida = totalPontosCriacao - pontosForca;
            System.out.println("Restaram " + pontosVida + " que será atribuída ao valor da Vida");
            jogadorAtual.setVidaEntidade(pontosVida);
            System.out.println("Também foi atribuido valor de 20 moedas de ouro");
            Thread.sleep(1500);
            jogadorAtual.setOuroHeroi(20);
            jogadorAtual.exibirDetalhes();
        } else {
            System.err.println("Opção de dificuldade inválida.");
        }
    }

    /**
     * Método Para Criar Personagem e insirir ao Jogo Principal.
     *
     * @return - Tipo do Herói Criado
     * @throws InterruptedException
     */
    protected Heroi criarPersonagem() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Heroi jogadorAtual = null;
        int opcaoJogador;

        System.out.print("Digite o nome do seu personagem: ");
        String nomePersonagem = input.nextLine();

        do {
            System.out.println("Escolha a classe para o seu personagem:");
            System.out.println("[ 1 ] - Arqueiro");
            System.out.println("[ 2 ] - Espadachim");
            System.out.println("[ 3 ] - Gatuno");
            System.out.println("[ 4 ] - Mago");
            System.out.println("[ 5 ] - Mercador");
            System.out.println("[ 6 ] - Noviço");
            System.out.print("Escolha uma Opção Acima: ");

            try {
                opcaoJogador = input.nextInt();
            } catch (InputMismatchException mismatchException) {
                System.err.println("Erro: Entrada inválida. Certifique-se de digitar um número inteiro.");
                input.next();
                opcaoJogador = 0;
            }

            switch (opcaoJogador) {
                case 1:
                    jogadorAtual = new Arqueiro(nomePersonagem, 0, 0);
                    System.out.println("###################################################################");
                    System.err.println("Arqueiro: Mestre do ataque à distância, \n" +
                            "O Arqueiro possui a habilidade de Grande Destreza!!\n" +
                            "E Por Isso tem Prioridade de Ataque!!\n" +
                            "Após vencer a(s) batalha(s) contra o(s) monstro(s) do(s) mapa(s), \n" +
                            "O Arqueiro ganha um aumento de Nível +1, +5% de HP e +3% de Força.");
                    Thread.sleep(150);
                    System.out.println("###################################################################");
                    Thread.sleep(2000);
                    break;
                case 2:
                    jogadorAtual = new Espadachim(nomePersonagem, 0, 0);
                    System.out.println("###################################################################");
                    System.err.println("Espadachim: Alto Vigor e com Armadura Resistente!! \n" +
                            "O Espadachim Sofre apenas 80% do dano do ataque dos NPC's.\n" +
                            "Porém... o(s) oponente(s) têm prioridade de ataque. \n" +
                            "Após vencer a(s) batalha(s) contra o(s) monstro(s) do(s) mapa(s), \n" +
                            "O Espadachim aumento de Nível +1, +6% de HP e +6% de Força.");
                    Thread.sleep(150);
                    System.out.println("###################################################################");
                    Thread.sleep(2000);
                    break;
                case 3:
                    jogadorAtual = new Gatuno(nomePersonagem, 0, 0);
                    System.out.println("###################################################################");
                    System.err.println("Gatuno: Ágil e Sorrateiro!!\n" +
                            "O Gatuno tem a chance de atacar o monstro duas vezes. \n" +
                            "Após vencer a(s) batalha(s) contra o(s) monstro(s) do(s) mapa(s), \n" +
                            "O Gatuno ganha Nível +1, +5% de HP e +3% de Força.");
                    Thread.sleep(150);
                    System.out.println("###################################################################");
                    //Thread.sleep(2000);
                    break;
                case 4:
                    jogadorAtual = new Mago(nomePersonagem, 0, 0);
                    System.out.println("###################################################################");
                    System.err.println("Mago: Especialista em Magia, \n" +
                            "O Mago não possui armadura adequada e sofre 10% a mais de dano do ataque dos monstros," +
                            "MAS!! Seu ataque mágico inflige 20% a mais de dano. \n" +
                            "Após vencer a(s) batalha(s) contra o(s) monstro(s) do(s) mapa(s), \n" +
                            "O Mago ganha Nível +1, +7% de HP e +2% de Força.");
                    Thread.sleep(150);
                    System.out.println("###################################################################");
                    Thread.sleep(2000);
                    break;
                case 5:
                    jogadorAtual = new Mercador(nomePersonagem, 0, 0);
                    System.out.println("###################################################################");
                    System.out.println("Mercador: Ambicioso e muito Astuto!!\n" +
                            "O Mercador recebe 10% a mais de ouro, baseado na quantidade de ouro que o monstro possui.\n" +
                            "Após vencer a(s) batalha(s) contra o(s) monstro(s) do(s) mapa(s), \n" +
                            "O Mercador aumenta de Nível +1, +3% de HP, +3% de Força\n" +
                            "Mais o bônus de 10% no ouro adquirido.");
                    Thread.sleep(150);
                    System.out.println("###################################################################");
                    Thread.sleep(2000);
                    break;
                case 6:
                    jogadorAtual = new Novico(nomePersonagem, 0, 0);
                    System.out.println("###################################################################");
                    System.out.println("Noviço: Um Curandeiro por Natureza.\n" +
                            "O Noviço tem a habilidade de auto-recuperação de HP, \n" +
                            "Restaurando 10% de seu HP durante a batalha contra monstros.\n" +
                            "Após vencer a(s) batalha(s) contra o(s) monstro(s) do(s) mapa(s), \n" +
                            "O Noviço ganha Nível +1, +7% de HP e +2% de Força.");
                    Thread.sleep(150);
                    System.err.println("###################################################################");
                    Thread.sleep(2000);
                    break;
                default:
                    System.err.println("\n\t\t\t*** Opção Inválida ***\n");
                    Thread.sleep(2000);
                    break;
            }
        } while (opcaoJogador < 1 || opcaoJogador > 6);

        //Chamada para Dificuldade do Jogo:
        dificuldadeJogo(jogadorAtual);

        return jogadorAtual;
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