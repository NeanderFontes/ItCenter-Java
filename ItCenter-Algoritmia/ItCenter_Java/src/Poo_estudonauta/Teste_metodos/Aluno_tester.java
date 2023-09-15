package Poo_estudonauta.Teste_metodos;

/*
 * Projeto utilizando as estruturas com metodos especiais
 * Metodos get, set e construct.
 * Metodos public, private, protected.
 * Objeto Alunos.
 * Atributos: nome, idadeAluno, nota1Aluno, nota2Aluno, mediaAluno, alunoFormado;
 * Metods: getter e setter de todas variáveis criadas
 * Estado: status();
 */
public class Aluno_tester {
    //Método main com passagem de valores direto por parâmetros
    public static void main(String[] args) {
        //Inicializando o objeto Alunos e criando nova variável aluno1:
        Alunos aluno1 = new Alunos("Neander",34);

        //Entrada direta por parâmetro atribuindo double nota1Aluno, nota2Aluno ao aluno1;
        aluno1.setNota1Aluno(7.0);
        aluno1.setNota2Aluno(3.0);

        /* Utilização do método getNota1Aluno() e getNota2Aluno() para pegar os valores
         *   modificados pelos métodos setter
         */
        aluno1.setMediaAluno(aluno1.getNota1Aluno(), aluno1.getNota2Aluno());

        //Análise do método setAlunoFormado(boolean alunoFormado) com as devidas validações:
        aluno1.setAlunoFormado(aluno1.getAlunoFormado());

        //Saída de dados do estado atual do Objeto:
        aluno1.status();
    }
}
