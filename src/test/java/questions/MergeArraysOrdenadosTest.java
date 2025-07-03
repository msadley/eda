package questions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeArraysOrdenadosTest {

    private MergeArraysOrdenados merger;

    @BeforeEach
    public void setUp() {
        merger = new MergeArraysOrdenados();
    }

    @Test
    public void deveMesclarDoisArraysOrdenados() {
        int[] nums1 = { 1, 3, 5 };
        int[] nums2 = { 2, 4, 6 };
        int[] esperado = { 1, 2, 3, 4, 5, 6 };
        assertArrayEquals(esperado, merger.merge(nums1, nums2));
    }

    @Test
    public void deveLidarComArraysDeTamanhosDiferentes() {
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 4, 5, 6, 7, 8 };
        int[] esperado = { 1, 2, 3, 4, 5, 6, 7, 8 };
        assertArrayEquals(esperado, merger.merge(nums1, nums2));
    }

    @Test
    public void deveLidarComUmArrayVazio() {
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = {};
        int[] esperado = { 1, 2, 3 };
        assertArrayEquals(esperado, merger.merge(nums1, nums2));
    }

    @Test
    public void deveLidarComAmbosArraysVazios() {
        int[] nums1 = {};
        int[] nums2 = {};
        int[] esperado = {};
        assertArrayEquals(esperado, merger.merge(nums1, nums2));
    }

    @Test
    public void deveLidarComNumerosNegativos() {
        int[] nums1 = { -3, -1, 0 };
        int[] nums2 = { -2, 2, 4 };
        int[] esperado = { -3, -2, -1, 0, 2, 4 };
        assertArrayEquals(esperado, merger.merge(nums1, nums2));
    }
}
