package questions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PairSumTest {

    private PairSum finder;

    @BeforeEach
    public void setUp() {
        finder = new PairSum();
    }

    @Test
    public void shouldFindPairsInSortedArray() {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        int target = 7;
        String result = finder.findPairs(nums, target);
        assertTrue(result.contains("(1, 6)") && result.contains("(2, 5)") && result.contains("(3, 4)"));
    }

    @Test
    public void shouldFindPairsInUnsortedArray() {
        int[] nums = { 8, 1, 6, 3, 4, 5, 2, 7 };
        int target = 9;
        String result = finder.findPairs(nums, target);
        assertTrue(result.contains("(1, 8)") && result.contains("(2, 7)") && result.contains("(3, 6)")
                && result.contains("(4, 5)"));
    }

    @Test
    public void shouldReturnEmptyStringIfNoPairIsFound() {
        int[] nums = { 1, 2, 3, 4, 5 };
        int target = 10;
        assertEquals("", finder.findPairs(nums, target));
    }

    @Test
    public void shouldHandleNegativeNumbers() {
        int[] nums = { -1, -3, 5, 8, 4 };
        int target = 4;
        String result = finder.findPairs(nums, target);
        assertTrue(result.contains("(-1, 5)"));
    }

    @Test
    public void shouldHandleEmptyArray() {
        int[] nums = {};
        int target = 5;
        assertEquals("", finder.findPairs(nums, target));
    }

    @Test
    public void shouldHandlePairsThatIncludeZero() {
        int[] nums = { 0, 5, 3, 2, -3 };
        int target = 2;
        String result = finder.findPairs(nums, target);
        assertTrue(result.contains("(-3, 5)") && result.contains("(0, 2)"));
    }
}