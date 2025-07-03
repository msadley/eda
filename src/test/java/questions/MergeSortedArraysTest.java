package questions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortedArraysTest {

    private MergeSortedArrays merger;

    @BeforeEach
    public void setUp() {
        merger = new MergeSortedArrays();
    }

    @Test
    public void shouldMergeTwoSortedArrays() {
        int[] nums1 = { 1, 3, 5 };
        int[] nums2 = { 2, 4, 6 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        assertArrayEquals(expected, merger.merge(nums1, nums2));
    }

    @Test
    public void shouldHandleArraysOfDifferentSizes() {
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 4, 5, 6, 7, 8 };
        int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8 };
        assertArrayEquals(expected, merger.merge(nums1, nums2));
    }

    @Test
    public void shouldHandleEmptyArray() {
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = {};
        int[] expected = { 1, 2, 3 };
        assertArrayEquals(expected, merger.merge(nums1, nums2));
    }

    @Test
    public void shouldHandleBothEmptyArrays() {
        int[] nums1 = {};
        int[] nums2 = {};
        int[] expected = {};
        assertArrayEquals(expected, merger.merge(nums1, nums2));
    }

    @Test
    public void shouldHandleNegativeNumbers() {
        int[] nums1 = { -3, -1, 0 };
        int[] nums2 = { -2, 2, 4 };
        int[] expected = { -3, -2, -1, 0, 2, 4 };
        assertArrayEquals(expected, merger.merge(nums1, nums2));
    }
}