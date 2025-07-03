package questions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RotateArrayTest {

    private RotateArray rotator;

    @BeforeEach
    public void setUp() {
        rotator = new RotateArray();
    }

    @Test
    public void shouldRotateArrayWithKLessThanSize() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotator.rotate(nums, k);
        assertArrayEquals(new int[] { 5, 6, 7, 1, 2, 3, 4 }, nums);
    }

    @Test
    public void shouldHandleKEqualToSize() {
        int[] nums = { 1, 2, 3, 4 };
        int k = 4;
        rotator.rotate(nums, k);
        assertArrayEquals(new int[] { 1, 2, 3, 4 }, nums);
    }

    @Test
    public void shouldHandleKGreaterThanSize() {
        int[] nums = { -1, -100, 3, 99 };
        int k = 2;
        rotator.rotate(nums, k);
        assertArrayEquals(new int[] { 3, 99, -1, -100 }, nums);
    }

    @Test
    public void shouldHandleArrayOfTwoElements() {
        int[] nums = { 1, 2 };
        int k = 1;
        rotator.rotate(nums, k);
        assertArrayEquals(new int[] { 2, 1 }, nums);
    }

    @Test
    public void shouldHandleKEqualToZero() {
        int[] nums = { 1, 2, 3 };
        int k = 0;
        rotator.rotate(nums, k);
        assertArrayEquals(new int[] { 1, 2, 3 }, nums);
    }
}
