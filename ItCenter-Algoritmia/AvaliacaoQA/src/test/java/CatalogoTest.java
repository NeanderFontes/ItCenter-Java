import AvaliacaoQA.Aviao;
import AvaliacaoQA.AviaoCombate;
import AvaliacaoQA.Catalogo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatalogoTest {
    Catalogo catalogoTest;
    Aviao aviaoCatalogoTest;
    AviaoCombate aviaoCombateCatalogoTest;

    @BeforeEach
    public void setUp() {
        catalogoTest = new Catalogo();
        aviaoCatalogoTest = new Aviao(123,2000,2,"ModeloTest",1000,9,6,1.5,1500,800,1000);
        aviaoCombateCatalogoTest = new AviaoCombate(999000, 2010, 1, "F16", 2000, 8, 6, 1.5, 2500, 800, 1000, "USA", false);
    }

    @Test
    public void testCalcularValorCatalogo() {
        // Adicionando aviões ao catalogoTest
        catalogoTest.adquirirAviao(aviaoCatalogoTest);
        catalogoTest.adquirirAviao(aviaoCombateCatalogoTest);


        // Verificação do assertEquals do preço "valorTotal" do catalogo
        assertEquals(2000.0, catalogoTest.calcularValorCatalogo());
    }

    /**
     * Teste adicionar Avião do ArrayList do Catalogo
     */
    @Test
    public void testAddAviaoCatalogo() {
        // Adicionando tipos de aviões ao ArrayList<>
        catalogoTest.adquirirAviao(aviaoCatalogoTest);
        catalogoTest.adquirirAviao(aviaoCombateCatalogoTest);

        // Teste se o array contém tamanho 2
        assertEquals(2, catalogoTest.getCatalogo().size());

        // Testar se o aviao se encontra efetivamente no array
        assertEquals(aviaoCatalogoTest, catalogoTest.getCatalogo().get(0));
    }

    /**
     * Teste para Remover Avião do ArrayList do Catalogo
     */
    @Test
    public void testRemoveAviaoCatalogo() {
        // Adicionando tipos de aviões ao ArrayList<>
        catalogoTest.adquirirAviao(aviaoCatalogoTest);
        catalogoTest.adquirirAviao(aviaoCombateCatalogoTest);

        // Teste de Remover o primeiro aviao do array
        catalogoTest.venderAviao(0);

        // Teste Final
        assertEquals(1, catalogoTest.getCatalogo().size());
    }
}
