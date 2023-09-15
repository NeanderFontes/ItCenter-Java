package Poo_estudonauta.Aula_pratica09;
/*
    Neander Fontes, Braga-Portugal, 28/08/2023
    Exercício pratico Curso POO Java.
    Criação de classe Pessoa.
    Criação de classe agregada Livro.
    Criação da Interface Publicacao.
 */

//Classe Pessoa:
public class Pessoa {
    //Atributos abstratos para a classe Pessoa:
    private String nome;
    private int idade;
    private char sexo;

    //Método Específico:
    public void fazerAniversario() {
        this.idade++;
    }

    //Método Construtor da class Pessoa:
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    //Métodos especiais Getter e Setter dos atributos abstratos:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
