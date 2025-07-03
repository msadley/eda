package questions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class RemoveDuplicadosTest {

    private RemoveDuplicados removedor;

    @BeforeEach
    public void setUp() {
        removedor = new RemoveDuplicados();
    }

    @Test
    public void deveRemoverDuplicadosDoArray() {
        int[] nums = { 1, 1, 2 };
        int novoTamanho = removedor.remover(nums);
        assertEquals(2, novoTamanho);
        assertArrayEquals(new int[] { 1, 2 }, Arrays.copyOf(nums, novoTamanho));
    }

    @Test
    public void deveLidarComMultiplosDuplicados() {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int novoTamanho = removedor.remover(nums);
        assertEquals(5, novoTamanho);
        assertArrayEquals(new int[] { 0, 1, 2, 3, 4 }, Arrays.copyOf(nums, novoTamanho));
    }

    @Test
    public void deveRetornarMesmoTamanhoParaArraySemDuplicados() {
        int[] nums = { 1, 2, 3, 4, 5 };
        int novoTamanho = removedor.remover(nums);
        assertEquals(5, novoTamanho);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, Arrays.copyOf(nums, novoTamanho));
    }

    @Test
    public void deveLidarComArrayVazio() {
        int[] nums = {};
        int novoTamanho = removedor.remover(nums);
        assertEquals(0, novoTamanho);
    }

    @Test
    public void deveLidarComArrayDeUmElemento() {
        int[] nums = { 42 };
        int novoTamanho = removedor.remover(nums);
        assertEquals(1, novoTamanho);
        assertArrayEquals(new int[] { 42 }, Arrays.copyOf(nums, novoTamanho));
    }
}
