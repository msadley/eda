package questions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RotacionaArrayTest {

    private RotacionaArray rotator;

    @BeforeEach
    public void setUp() {
        rotator = new RotacionaArray();
    }

    @Test
    public void deveRotacionarArrayComKMenorQueTamanho() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotator.rotacionar(nums, k);
        assertArrayEquals(new int[] { 5, 6, 7, 1, 2, 3, 4 }, nums);
    }

    @Test
    public void deveLidarComKIgualAoTamanho() {
        int[] nums = { 1, 2, 3, 4 };
        int k = 4;
        rotator.rotacionar(nums, k);
        assertArrayEquals(new int[] { 1, 2, 3, 4 }, nums);
    }

    @Test
    public void deveLidarComKMaiorQueTamanho() {
        int[] nums = { -1, -100, 3, 99 };
        int k = 2;
        rotator.rotacionar(nums, k);
        assertArrayEquals(new int[] { 3, 99, -1, -100 }, nums);
    }

    @Test
    public void deveLidarComArrayDeDoisElementos() {
        int[] nums = { 1, 2 };
        int k = 1;
        rotator.rotacionar(nums, k);
        assertArrayEquals(new int[] { 2, 1 }, nums);
    }

    @Test
    public void deveLidarComKIgualAZero() {
        int[] nums = { 1, 2, 3 };
        int k = 0;
        rotator.rotacionar(nums, k);
        assertArrayEquals(new int[] { 1, 2, 3 }, nums);
    }
}