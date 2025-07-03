package questions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SomaDeParesTest {

    private SomaDePares buscador;

    @BeforeEach
    public void setUp() {
        buscador = new SomaDePares();
    }

    @Test
    public void deveEncontrarParesEmArrayOrdenado() {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        int alvo = 7;
        String resultado = buscador.encontrarPares(nums, alvo);
        assertTrue(resultado.contains("(1, 6)") && resultado.contains("(2, 5)") && resultado.contains("(3, 4)"));
    }

    @Test
    public void deveEncontrarParesEmArrayDesordenado() {
        int[] nums = { 8, 1, 6, 3, 4, 5, 2, 7 };
        int alvo = 9;
        String resultado = buscador.encontrarPares(nums, alvo);
        assertTrue(resultado.contains("(1, 8)") && resultado.contains("(2, 7)") && resultado.contains("(3, 6)")
                && resultado.contains("(4, 5)"));
    }

    @Test
    public void deveRetornarStringVaziaSeNenhumParForEncontrado() {
        int[] nums = { 1, 2, 3, 4, 5 };
        int alvo = 10;
        assertEquals("", buscador.encontrarPares(nums, alvo));
    }

    @Test
    public void deveLidarComNumerosNegativos() {
        int[] nums = { -1, -3, 5, 8, 4 };
        int alvo = 4;
        String resultado = buscador.encontrarPares(nums, alvo);
        assertTrue(resultado.contains("(-1, 5)"));
    }

    @Test
    public void deveLidarComArrayVazio() {
        int[] nums = {};
        int alvo = 5;
        assertEquals("", buscador.encontrarPares(nums, alvo));
    }

    @Test
    public void deveLidarComParesQueIncluemZero() {
        int[] nums = { 0, 5, 3, 2, -3 };
        int alvo = 2;
        String resultado = buscador.encontrarPares(nums, alvo);
        assertTrue(resultado.contains("(-3, 5)") && resultado.contains("(0, 2)"));
    }
}
