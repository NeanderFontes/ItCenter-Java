import AvaliacaoQA.Aviao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AviaoTest {
    Aviao aviaoTest;

    @BeforeEach
    public void setUp() {
        aviaoTest = new Aviao(123,2000,2,"ModeloTest",1000,9,6,1.5,1500,800,17000000);

    }

    /**
     * Teste da função que retorna nome do Modelo do Avião:
     */
    @Test
    public void testModeloAviao() {
        assertEquals("ModeloTest", aviaoTest.getModelo());
    }

    /**
     * Teste da função que retorna preço do Avião:
     */
    @Test
    public void testPrecoAviao() {
        double result = aviaoTest.getPreco();
        assertEquals(17000000, result);
    }
}
