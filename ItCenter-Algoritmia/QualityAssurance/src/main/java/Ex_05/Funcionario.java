package Ex_05;

public class Funcionario {

    // Atributos de instância
    private String nome, departamento;
    private double salario;

    public Funcionario(String nome, double salario, String departamento) {
        if (this.salario < 0) {
            throw new IllegalArgumentException();
        } else if (this.nome == null || this.departamento == null){
            throw new NullPointerException();
        } else {
            this.nome = nome;
            this.salario = salario;
            this.departamento = departamento;
        }
    }

    /**
     * Método para aumentar o salário
     *
     * @param aumento - Recebe um valor percentual
     */
    public void aumentarSalario(double aumento) {
        this.salario *= (1 + (aumento / 100));
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
        System.out.println("Departamento: " + this.departamento);
    }

    public String getNome() {
        return nome;
    }
}
