package Poo_estudonauta.Aula_pratica07_08;

/*
 * Classe agregada de Objeto Lutador.
 * Projeto utilizando as estruturas com metodos especiais
 * Metodos get, set e construct.
 * Metodos Visibilidade: public, private, protected.
 * Atributos: desafiado, desafiante, rouds,  altura, lutaAprovada;
 * Metodos implementados: apresentador();
 */

import java.util.Objects;
import java.util.Random;

//Classe agregada:
public class Luta {
    //Atributos agregado ao Objeto Lutador:
    private Lutador desafiado;
    private Lutador desafiante;

    //Atributos novos gerados para classe agregada:
    private int rouds;
    private boolean lutaAprovada;

    //Métodos Especiais da classe agregada:
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRouds() {
        return rouds;
    }

    public void setRouds(int rouds) {
        this.rouds = rouds;
    }

    public boolean isLutaAprovada() {
        return lutaAprovada;
    }

    public void setLutaAprovada(boolean lutaAprovada) {
        this.lutaAprovada = lutaAprovada;
    }

    //Métodos específicos:
    /* Regras da validação da class agregada:
        » Só pode ser marcada entre lutadores da mesma categoria.
        » Desafiado e desafiante devem ser lutadores diferentes.
        » Só pode acontecer a puta se estiver aprovada.
        » Só pode ter como resultado a vitória de um dos lutadores ou empate.
     */
    public void marcarLuta(Lutador lutador1, Lutador lutador2) {
        //Objects.equals = lutador1.getCategoria() == lutador2.getCategoria()
        if (Objects.equals(lutador1.getCategoria(), lutador2.getCategoria()) && lutador1 != lutador2) {
            this.setLutaAprovada(true);
            this.setDesafiado(lutador1);
            this.setDesafiante(lutador2);
        } else {
            this.setLutaAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar() {

        if (this.isLutaAprovada()) {
            System.out.println("###### DESAFIADO ######");
            this.getDesafiado().apresentar();
            System.out.println("###### DESAFIANTE ######");
            this.getDesafiante().apresentar();

            //Import Random e Parâmetro criado para decidir quem ganha, empaga ou perde.
            Random random = new Random();
            int vencedor = random.nextInt(0, 2);

            switch (vencedor) {
                case 0: //Empatar a Luta
                    System.out.println("Empate da luta!!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1: //Ganhar "Desafiado" Luta
                    System.out.println("Lutador " + this.desafiado.getNome() + " é o Vencedor da luta!!");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 2: //Ganhar "Desafiante" Luta
                    System.out.println("Lutador " + this.desafiante.getNome() + " é o Vencedor da luta!!");
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
                    break;
            }
        } else {
            System.out.println("Luta anulada, componentes diferentes do exigido!!");
        }
    }
}
