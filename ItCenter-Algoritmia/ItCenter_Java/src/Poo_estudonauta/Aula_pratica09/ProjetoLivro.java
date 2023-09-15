package Poo_estudonauta.Aula_pratica09;
/*
    Neander Fontes, Braga-Portugal, 28/08/2023
    Exercício pratico Curso POO Java.
    Criação de classe Pessoa.
    Criação de classe agregada Livro.
    Criação da Interface Publicacao.
 */

//Instanciação do Objeto a partir das classes:
public class ProjetoLivro {
    public static void main(String[] args) {
        //Instaciação da classe Pessoa:
        Pessoa[] pessoa = new Pessoa[2];
        pessoa[0] = new Pessoa("Neander", 34, 'M');
        pessoa[1] = new Pessoa("Rebeca", 34, 'F');

        //Instaciação da classe Livro:
        Livro[] livro = new Livro[3];
        livro[0] = new Livro("Curso POO", "Gustavo Guanabara", 15, pessoa[0]);

        //Saída de dados e Detalhes das ações das instâncias:
        System.out.println(livro[0].detalhes());
        livro[0].abrir();
        livro[0].folhear(10);
        livro[0].fechar();
        System.out.println(livro[0].detalhes());
    }
}
