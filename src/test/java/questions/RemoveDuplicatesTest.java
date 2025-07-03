package questions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class RemoveDuplicatesTest {

    private RemoveDuplicates remover;

    @BeforeEach
    public void setUp() {
        remover = new RemoveDuplicates();
    }

    @Test
    public void shouldRemoveDuplicatesFromArray() {
        int[] nums = { 1, 1, 2 };
        int newSize = remover.remove(nums);
        assertEquals(2, newSize);
        assertArrayEquals(new int[] { 1, 2 }, Arrays.copyOf(nums, newSize));
    }

    @Test
    public void shouldHandleMultipleDuplicates() {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int newSize = remover.remove(nums);
        assertEquals(5, newSize);
        assertArrayEquals(new int[] { 0, 1, 2, 3, 4 }, Arrays.copyOf(nums, newSize));
    }

    @Test
    public void shouldReturnSameSizeForArrayWithoutDuplicates() {
        int[] nums = { 1, 2, 3, 4, 5 };
        int newSize = remover.remove(nums);
        assertEquals(5, newSize);
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, Arrays.copyOf(nums, newSize));
    }

    @Test
    public void shouldHandleEmptyArray() {
        int[] nums = {};
        int newSize = remover.remove(nums);
        assertEquals(0, newSize);
    }

    @Test
    public void shouldHandleArrayOfOneElement() {
        int[] nums = { 42 };
        int newSize = remover.remove(nums);
        assertEquals(1, newSize);
        assertArrayEquals(new int[] { 42 }, Arrays.copyOf(nums, newSize));
    }
}