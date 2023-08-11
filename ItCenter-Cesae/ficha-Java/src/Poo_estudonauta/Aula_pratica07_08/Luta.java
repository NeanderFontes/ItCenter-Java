package Poo_estudonauta.Aula_pratica07_08;

/*
 * Classe agregada de Objeto Lutador.
 * Projeto utilizando as estruturas com metodos especiais
 * Metodos get, set e construct.
 * Metodos Visibilidade: public, private, protected.
 * Atributos: desafiado, desafiante, rouds,  altura, lutaAprovada;
 * Metodos implementados: apresentador();
 */

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
        if (lutador1.getCategoria() == lutador2.getCategoria() && lutador1 != lutador2) {
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
            this.getDesafiado().apresentar();
        } else {
            System.out.println("Luta anulada, componentes diferentes do exigido!!");
        }
    }
}
