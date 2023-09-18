package Ex_08;

import java.util.Scanner;

/**
 * Crie uma classe Aluno que tenha os atributos nome, idade, curso e média.
    I - Crie um construtor que receba os quatro atributos como parâmetros.
    II - Crie um método chamado situacao que retorne "Aprovado" se a média for maior ou igual a 9.5,
        "Reprovado" caso contrário.
    III - No método main, crie um objeto dessa classe e apresente a situação do aluno
 */
public class Aluno {
    //Atributos para class Aluno:
    private String nome, curso;
    private int idade;
    private double nota1, nota2, media;
    //private boolean aprovado = true;

    /**
     * Método Construtor
     * @param nome - Nome ALuno
     * @param curso - Curso Aluno
     * @param idade - Idade Aluno
     */
    public Aluno(String nome, String curso, int idade) {
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
    }

    /**
     * Método para obter Média do aluno.
        Utilizando entrada de dados para atribuir valores as nota1 e nota2
     * @return Média = (nota1 + nota2) / 2
     */
    public double mediaAluno() {
        //Scanner para apresentar nota:
        Scanner input = new Scanner(System.in);
        System.out.print("Insira nota 1:");
        this.nota1 = input.nextDouble();
        System.out.print("Insira nota 2:");
        this.nota2 = input.nextDouble();

        return this.media = (this.nota1 + this.nota2) / 2;
    }

    /**
     * Método para resultado média do Aluno
     * @return - "Aprovado" ou "Reprovado"
     */
    public String resultadoAluno() {
        if (this.media > 9.5) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    //Métodos especiais:

    /**
     * Método getter para obter nome do aluno
     * @return - Nome do aluno
     */
    public String getNome() {
        return this.nome;
    }
}
