package Ex_10;

import java.util.Scanner;

/**
 * Crie uma classe Funcionário que tenha os atributos nome, salário e departamento, e os métodos
    aumentarSalario e exibirDados.
    I - O método aumentarSalario deve receber um valor percentual (número real) como parâmetro e
        atualizar o salário de acordo.
    II - O método exibirDados deve exibir na consola o nome, salário e departamento do funcionário.
    III - No método main, crie um objeto dessa classe e invoque os métodos para aumentar o salário em
        10% e exibir os dados do funcionário.
 */
public class Funcionario {
    private String nomeFuncionario, departamento;
    private double salarioFuncionario;

    /**
     * Método Construtor para cadastrar o funcionario em instancia.
     * @param nomeFuncionario
     * @param departamento
     * @param salarioFuncionario
     */
    public Funcionario(String nomeFuncionario, String departamento, double salarioFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.departamento = departamento;
        this.salarioFuncionario = salarioFuncionario;
    }

    public void exibirDados() {
        System.out.println("Funcionário: " + getNomeFuncionario());
        System.out.println("Salário: " + getSalarioFuncionario());
        System.out.println("Departamento: " + getDepartamento());
    }

    /**
     * Método para aumentar salário de acordo com a porcentagem de desconto introduzida.
     * @param aumentoFuncionario
     * @return - Aumento Funcionário já adicionado.
     */
    private double aumentarSalario(double aumentoFuncionario) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos % Deseja aumentar o salário? ");
        double descontoFuncionario = input.nextDouble();
        descontoFuncionario = (aumentoFuncionario * this.salarioFuncionario) / 100;
        return (this.salarioFuncionario + descontoFuncionario);
    }

    /**
     * Método getter para obter Nome do Funcionario
     * @return - Nome do Funcionario
     */
    public String getNomeFuncionario() {
        return this.nomeFuncionario;
    }

    /**
     * Método getter para obter Departamento do Funcionario
     * @return
     */
    public String getDepartamento() {
        return this.departamento;
    }

    /**
     * Método getter para obter Valor do Salario do Funcionário
     * @return - Salario do Funcionário
     */
    public double getSalarioFuncionario() {
        return this.salarioFuncionario;
    }
}
