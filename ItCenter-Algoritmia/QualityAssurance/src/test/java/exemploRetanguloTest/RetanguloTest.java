package exemploRetanguloTest;

import Ex_04.Retangulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {
    Retangulo retangulo01;
    Retangulo retangulo02;

    /**
     * Teste de criação do Construtor
     */
    @BeforeEach
    public void setUp() {
        retangulo01 = new Retangulo(5, 2);
        retangulo02 = new Retangulo(20, 10);
    }

    @Test
    public void instanciarRetanguloImpossivel() {

        assertThrows(IllegalArgumentException.class, () -> {
            Retangulo retanguloImpossivel = new Retangulo(0, 0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            Retangulo retanguloImpossivel = new Retangulo(0, 10);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            Retangulo retanguloImpossivel = new Retangulo(10, 0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            Retangulo retanguloImpossivel = new Retangulo(10, -10);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            Retangulo retanguloImpossivel = new Retangulo(-10, 10);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            Retangulo retanguloImpossivel = new Retangulo(-10, -10);
        });
    }

    /**
     * Teste do Perimetro do retangulo01
     */
    @Test
    public void testePerimetroRetangulo01() {
        assertEquals(14, retangulo01.calcularPerimetro());
    }

    /**
     * Teste do Perimetro do retangulo02
     */
    @Test
    public void testePerimetroRetangulo02() {
        assertEquals(60, retangulo02.calcularPerimetro());
    }

    /**
     * Teste para calcular Area do retangulo01
     */
    @Test
    public void testeAreaRetangulo01() {
        assertEquals(10, retangulo01.calcularArea());
    }

    /**
     * Teste para calcular Area do retangulo02
     */
    @Test
    public void testeAreaRetangulo02() {
        assertEquals(200, retangulo02.calcularArea());
    }
}
