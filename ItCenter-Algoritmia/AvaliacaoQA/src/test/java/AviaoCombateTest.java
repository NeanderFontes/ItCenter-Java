import AvaliacaoQA.AviaoCombate;
import AvaliacaoQA.Enum.Arma;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AviaoCombateTest {

    AviaoCombate aviaoCombateTest;

    @BeforeEach
    public void setUp() {
        aviaoCombateTest = new AviaoCombate(999000, 2010, 1, "F16", 2000, 8, 6, 1.5, 2500, 800, 17000000, "USA", false);
    }

    /**
     * Teste de Adicionar 4 Armas ao ArrayList
     */
    @Test
    public void testAddArma() {
        // Adicionando 3 armas para o ArrayList<>
        aviaoCombateTest.addArma(Arma.METRALHADORA);
        aviaoCombateTest.addArma(Arma.FOGUETES);
        aviaoCombateTest.addArma(Arma.MISSEIS);

        // Adicionando 4 armas para test de tamanho limite do array
        aviaoCombateTest.addArma(Arma.BOMBAS);

        // Teste final do tamanho do array expected = 3
        assertEquals(3, aviaoCombateTest.getArsenal().size());
    }

    /**
     * Teste para Remover Arma do ArrayList<>
     */
    @Test
    public void testRemoveArma() {
        // Adicionando 3 armas para o ArrayList<>
        aviaoCombateTest.addArma(Arma.METRALHADORA);
        aviaoCombateTest.addArma(Arma.FOGUETES);
        aviaoCombateTest.addArma(Arma.MISSEIS);

        // Teste de Remover a segunda arma do array
        aviaoCombateTest.removeArma(1);

        // Teste Final
        assertEquals(2, aviaoCombateTest.getArsenal().size());
    }
}
