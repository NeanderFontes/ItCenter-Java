package exemploFuncionarioTest;

import Ex_05.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FuncionarioTest {
    Funcionario funcionarioTeste1;
    Funcionario funcionarioTeste2;
    Funcionario funcionarioSalarioNegativo;
    Funcionario funcionarioNullName;
    Funcionario funcionarioNullDepartament;

    /**
     * Teste de criação do Construtor
     */
    @BeforeEach
    public void setUp() {
        funcionarioTeste1 = new Funcionario("FuncinarioTeste1", 1000, "Desenvolvedor");
        funcionarioTeste2 = new Funcionario("FuncionarioTeste2", 800, "QA");
    }

    /**
     * Teste de Instancias impossiveis
     */
    @Test
    public void instanciaFuncionarioSalarioNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            funcionarioSalarioNegativo = new Funcionario("FuncionarioTeste1", -1000, "Desenvolvedor");
        });
    }

    /**
     * Teste de Instancias impossiveis
     */
    @Test
    public void instanciaFuncionarioNullName() {
        assertThrows(NullPointerException.class, () -> {
            funcionarioNullName = new Funcionario(null, 1000, "Desenvolvedor");

        });
    }

    /**
     * Teste de Instancias impossiveis
     */
    @Test
    public void instanciaFuncionarioNullDepartament() {
        assertThrows(IllegalArgumentException.class, () -> {
            funcionarioNullDepartament = new Funcionario("FuncionarioTeste1", 1000, null);
        });
    }
}
