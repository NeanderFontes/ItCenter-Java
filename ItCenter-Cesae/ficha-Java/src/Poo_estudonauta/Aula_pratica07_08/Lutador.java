package Poo_estudonauta.Aula_pratica07_08;

/*
 * Objeto Lutador.
 * Projeto utilizando as estruturas com metodos especiais
 * Metodos get, set e construct.
 * Metodos Visibilidade: public, private, protected.
 * Atributos: nome, nacionalidade, idade,  altura, peso, categoria, vitorias, derrotas, empates;
 * Metodos implementados: apresentador(), status(), ganharLuta(), perderLuta(), empatarLuta();
 * Estado: statusAtual();
 */

public class Lutador implements Funcionalidade_da_luta{
    //Atributos "características" do Objeto Lutador:
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;;
    private float altura, peso;

    //Método Construct:
    public Lutador(String nome, String nacionalidade, int idade, int vitorias,
                  int derrotas, int empates, float altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.setPeso(peso);
    }

    //Métodos getter e setter:

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(getCategoria());
    }
    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    //Métodos implementados da interface:
    @Override
    public void apresentar() {
        //Apresentação dos Lutadores e todas suas características:
        /*
        * this.nome = nome;
        * this.nacionalidade = nacionalidade;
        * this.idade = idade;
        * this.vitorias = vitorias;
        * this.derrotas = derrotas;
        * this.empates = empates;
        * this.altura = altura;
        * this.setPeso(peso);
        */
        System.out.println("*****   Senhoras e senhores, vai começar a luta do ano! *****");
        System.out.println("Lutador: " + getNome());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("Vitórias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
        System.out.println("*************************************************************");
    }

    @Override
    public void status() {
        //Apresentação dos Lutadores e suas características principais resumidas:
        System.out.println("********** VAI COMEÇAR A LUTA **********");
        System.out.println("Lutador: " + getNome());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Vitórias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
        System.out.println("****************************************");
    }

    @Override
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
}
