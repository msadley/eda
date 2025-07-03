package questions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncontraElementoSobrandoTest {

    // Instancie sua classe aqui quando criá-la
    private final EncontraElementoSobrando buscador = new EncontraElementoSobrando();

    @Test
    @DisplayName("Deve encontrar o elemento sobrando no final do array")
    void deveEncontrarElementoSobrandoNoFinal() {
        int[] arrayBase = { 1, 2, 3, 4 };
        int[] arrayComExtra = { 1, 2, 3, 4, 5 };
        assertEquals(5, buscador.encontrar(arrayBase, arrayComExtra));
    }

    @Test
    @DisplayName("Deve encontrar o elemento sobrando no início do array")
    void deveEncontrarElementoSobrandoNoInicio() {
        int[] arrayBase = { 10, 20, 30 };
        int[] arrayComExtra = { 5, 10, 20, 30 };
        assertEquals(5, buscador.encontrar(arrayBase, arrayComExtra));
    }

    @Test
    @DisplayName("Deve encontrar o elemento sobrando no meio do array")
    void deveEncontrarElementoSobrandoNoMeio() {
        int[] arrayBase = { 8, 6, 2 };
        int[] arrayComExtra = { 8, 6, 4, 2 };
        assertEquals(4, buscador.encontrar(arrayBase, arrayComExtra));
    }

    @Test
    @DisplayName("Deve encontrar o elemento quando há números negativos")
    void deveEncontrarElementoComNegativos() {
        int[] arrayBase = { -1, -2, -3 };
        int[] arrayComExtra = { -1, -5, -2, -3 };
        assertEquals(-5, buscador.encontrar(arrayBase, arrayComExtra));
    }

    @Test
    @DisplayName("Deve encontrar o elemento quando o sobrando é zero")
    void deveEncontrarElementoZero() {
        int[] arrayBase = { 1, 2, 3 };
        int[] arrayComExtra = { 1, 0, 2, 3 };
        assertEquals(0, buscador.encontrar(arrayBase, arrayComExtra));
    }

    @Test
    @DisplayName("Deve funcionar quando o array base já possui elementos duplicados")
    void deveEncontrarElementoComDuplicadosNaBase() {
        int[] arrayBase = { 4, 1, 3, 1, 4 };
        int[] arrayComExtra = { 1, 4, 1, 5, 3, 4 };
        assertEquals(5, buscador.encontrar(arrayBase, arrayComExtra));
    }

    @Test
    @DisplayName("Deve funcionar quando o array base está vazio")
    void deveFuncionarComArrayBaseVazio() {
        int[] arrayBase = {};
        int[] arrayComExtra = { 99 };
        assertEquals(99, buscador.encontrar(arrayBase, arrayComExtra));
    }

    @Test
    @DisplayName("Deve encontrar o elemento sobrando no final do array (array 1 com extra)")
    void deveEncontrarElementoSobrandoNoFinalInvertido() {
        int[] arrayComExtra = { 1, 2, 3, 4, 5 };
        int[] arrayBase = { 1, 2, 3, 4 };
        assertEquals(5, buscador.encontrar(arrayComExtra, arrayBase));
    }

    @Test
    @DisplayName("Deve encontrar o elemento sobrando no início do array (array 1 com extra)")
    void deveEncontrarElementoSobrandoNoInicioInvertido() {
        int[] arrayComExtra = { 5, 10, 20, 30 };
        int[] arrayBase = { 10, 20, 30 };
        assertEquals(5, buscador.encontrar(arrayComExtra, arrayBase));
    }

    @Test
    @DisplayName("Deve encontrar o elemento sobrando no meio do array (array 1 com extra)")
    void deveEncontrarElementoSobrandoNoMeioInvertido() {
        int[] arrayComExtra = { 8, 6, 4, 2 };
        int[] arrayBase = { 8, 6, 2 };
        assertEquals(4, buscador.encontrar(arrayComExtra, arrayBase));
    }

    @Test
    @DisplayName("Deve encontrar o elemento quando há números negativos (array 1 com extra)")
    void deveEncontrarElementoComNegativosInvertido() {
        int[] arrayComExtra = { -1, -5, -2, -3 };
        int[] arrayBase = { -1, -2, -3 };
        assertEquals(-5, buscador.encontrar(arrayComExtra, arrayBase));
    }

    @Test
    @DisplayName("Deve encontrar o elemento quando o sobrando é zero (array 1 com extra)")
    void deveEncontrarElementoZeroInvertido() {
        int[] arrayComExtra = { 1, 0, 2, 3 };
        int[] arrayBase = { 1, 2, 3 };
        assertEquals(0, buscador.encontrar(arrayComExtra, arrayBase));
    }

    @Test
    @DisplayName("Deve funcionar quando o array base já possui elementos duplicados (array 1 com extra)")
    void deveEncontrarElementoComDuplicadosNaBaseInvertido() {
        int[] arrayComExtra = { 1, 4, 1, 5, 3, 4 };
        int[] arrayBase = { 4, 1, 3, 1, 4 };
        assertEquals(5, buscador.encontrar(arrayComExtra, arrayBase));
    }

    @Test
    @DisplayName("Deve funcionar quando o array 2 está vazio")
    void deveFuncionarComArray2Vazio() {
        int[] arrayComExtra = { 99 };
        int[] arrayBase = {};
        assertEquals(99, buscador.encontrar(arrayComExtra, arrayBase));
    }
}