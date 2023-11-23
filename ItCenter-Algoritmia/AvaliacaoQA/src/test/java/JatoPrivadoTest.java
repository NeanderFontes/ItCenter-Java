import AvaliacaoQA.Enum.CategoriaJato;
import AvaliacaoQA.Enum.Instalacao;
import AvaliacaoQA.JatoPrivado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JatoPrivadoTest {

    JatoPrivado jatoPrivadoTest;

    @BeforeEach
    public void setUp() {
        jatoPrivadoTest = new JatoPrivado(123, 2023, 2, "Modelo Jato", 5000.0, 20.5, 18.0, 6.0, 12000.0, 600, 15000000.0, 8, 500.0, CategoriaJato.LIGHT_JET);
    }

    /**
     * Teste para Adicionar Instalação ao Jato
     */
    @Test
    public void testAddInstalacao() {
        // Adicionando a instalação ao jato
        jatoPrivadoTest.addInstalacao(Instalacao.WC);

        // Verificando se a instalação foi adicionada corretamente
        assertTrue(jatoPrivadoTest.getInstalacoes().contains(Instalacao.WC));
    }
}
