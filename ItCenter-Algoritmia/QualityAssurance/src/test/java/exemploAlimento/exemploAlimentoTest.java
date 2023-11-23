package exemploAlimento;

import Ex_03.Alimento;
import Ex_03.Animal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class exemploAlimentoTest {
    private Animal leao;
    private Animal elefante;

    @BeforeEach
    public void setUp() {
        leao = new Animal("Leao", Alimento.CARNE);
        elefante = new Animal("Elefante", Alimento.FRUTAS);
    }

    /**
     * Teste da função que retorna nome da Instância criada do leao:
     */
    @Test
    public void testNameAnimalLeao() {
        assertEquals("Leao", leao.getNome());
    }

    /**
     * Teste da função que retorna nome da Instância criada do elefante:
     */
    @Test
    public void testNameAnimalElefante() {
        assertEquals("Elefante", elefante.getNome());
    }

    /**
     * Teste da função booleana para testar se leao está com fome = True
     */
    @Test
    public void testeLeaoFomeTrue() {
        leao.comer(Alimento.FRUTAS);
        assertTrue(leao.estaComFome());
    }

    /**
     * Teste da função booleana para testar se leao está com fome = False
     */
    @Test
    public void testeLealFomeFalse() {
        leao.comer(leao.getTipoAlimentacao());
        assertFalse(leao.estaComFome());
    }

    /**
     * Teste da função booleana para testar se elefante está com fome = True
     */
    @Test
    public void testeElefanteFomeTrue() {
        assertTrue(elefante.estaComFome());
    }

    /**
     * Teste da função booleana para testar se elefante está com fome = False
     */
    @Test
    public void testeElefanteFomeFalse() {
        elefante.comer(elefante.getTipoAlimentacao());
        assertFalse(elefante.estaComFome());
    }

    /**
     * Teste da getName para test se leao recebe nome Correto
     */
    @Test
    public void testeNomeLeao() {
        assertEquals("Leao", leao.getNome());
    }

    /**
     * Teste da getName para test se elefante recebe nome Correto
     */
    @Test
    public void testeNomeElefante() {
        assertEquals("Elefante", elefante.getNome());
    }

}
