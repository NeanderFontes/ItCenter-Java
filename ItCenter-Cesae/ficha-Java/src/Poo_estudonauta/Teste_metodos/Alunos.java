package Poo_estudonauta.Teste_metodos;


/*
 * Projeto utilizando as estruturas com metodos especiais
 * Metodos get, set e construct.
 * Metodos Visibilidade: public, private, protected.
 * Objeto Aluno.
 * Atributos: nome, idadeAluno, nota1Aluno, nota2Aluno, mediaAluno, alunoFormado;
 * Metodos:
 * Estado: status();
 */
public class Alunos {
    //Atributos private do Objeto aluno:
    private String nome;
    private int idadeAluno;
    private double nota1Aluno, nota2Aluno, mediaAluno;
    private boolean alunoFormado;

    //Métodos get e set dos valores dos atributos:
    //Passagem através de parâmetro para atribuir valor a "String nome" do objeto aluno:
    public void setNome(String nome) {
        this.nome = nome;
    }
    //Método getNome():
    public String getNome() {
        return nome;
    }

    //Passagem de valor na varável "int idadeAluno" através de parâmetro set atribuindo valor do objeto aluno:
    public void setIdadeAluno(int idadeAluno) {
        this.idadeAluno = idadeAluno;
    }
    //Método getIdadeAluno():
    public int getIdadeAluno() {
        return idadeAluno;
    }

    //Passagem de valor na varável "double nota1Aluno" através de parâmetro set atribuindo valor do objeto aluno:
    public void setNota1Aluno() {
        this.nota1Aluno = nota1Aluno;
    }
    //Método getNota1Aluno():
    public double getNota1Aluno() {
        return nota1Aluno;
    }

    //Passagem de valor na varável "double nota2Aluno" através de parâmetro set atribuindo valor do objeto aluno:
    public void setNota2Aluno(double nota2Aluno) {
        this.nota2Aluno = nota2Aluno;
    }
    //Método getNota2Aluno():
    public double getNota2Aluno() {
        return nota2Aluno;
    }

    //Passagem de valor na varável "double mediaAluno" através de parâmetro set atribuindo valor do objeto aluno:
    public void setMediaAluno(double nota1Aluno, double nota2Aluno) {
        nota1Aluno = this.nota1Aluno;
        nota2Aluno = this.nota2Aluno;
        this.mediaAluno = (nota1Aluno + nota2Aluno) / 2;
    }
    //Método getMediaAluno():
    public double getMediaAluno() {
        return mediaAluno;
    }

    //Passagem set de valor na varável "boolean alunoFormado" através de parâmetro set atribuindo valor do objeto aluno:
    public void setAlunoFormado(boolean alunoFormado) {
        if (mediaAluno >= 7) {
            this.alunoFormado = true;
        } else if (mediaAluno > 5 && mediaAluno < 7) {
            this.alunoFormado = true;
        } else {
            this.alunoFormado = false;
        }
    }
    //Método getAlunoFormado():
    public boolean getAlunoFormado() {
        return alunoFormado;
    }

    //Estado atual do Objeto Aluno para saída de dados na função main principal:
    public void status() {
        System.out.println("Sobre o Aluno:");
        System.out.println("Nome do aluno: " + this.nome);
        System.out.println("A idade do aluno: " + this.idadeAluno);
        System.out.println("Nota 1 do aluno = " + this.nota1Aluno);
        System.out.println("Nota 2 do aluno = " + this.nota2Aluno);
        System.out.println("Média final do aluno = " + this.mediaAluno);

        if (this.alunoFormado == true) {
            System.out.println("Aluno passou de ano!");
        } else {
            System.out.println("Infelizmente o aluno não está formado!");
        }
    }
}


