package questions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindExtraElementTest {

    private final FindExtraElement finder = new FindExtraElement();

    @Test
    @DisplayName("Should find the extra element at the end of the array")
    void shouldFindExtraElementAtTheEnd() {
        int[] baseArray = { 1, 2, 3, 4 };
        int[] arrayWithExtra = { 1, 2, 3, 4, 5 };
        assertEquals(5, finder.find(baseArray, arrayWithExtra));
    }

    @Test
    @DisplayName("Should find the extra element at the beginning of the array")
    void shouldFindExtraElementAtTheBeginning() {
        int[] baseArray = { 10, 20, 30 };
        int[] arrayWithExtra = { 5, 10, 20, 30 };
        assertEquals(5, finder.find(baseArray, arrayWithExtra));
    }

    @Test
    @DisplayName("Should find the extra element in the middle of the array")
    void shouldFindExtraElementInTheMiddle() {
        int[] baseArray = { 8, 6, 2 };
        int[] arrayWithExtra = { 8, 6, 4, 2 };
        assertEquals(4, finder.find(baseArray, arrayWithExtra));
    }

    @Test
    @DisplayName("Should find the element when there are negative numbers")
    void shouldFindElementWithNegativeNumbers() {
        int[] baseArray = { -1, -2, -3 };
        int[] arrayWithExtra = { -1, -5, -2, -3 };
        assertEquals(-5, finder.find(baseArray, arrayWithExtra));
    }

    @Test
    @DisplayName("Should find the element when the extra one is zero")
    void shouldFindElementZero() {
        int[] baseArray = { 1, 2, 3 };
        int[] arrayWithExtra = { 1, 0, 2, 3 };
        assertEquals(0, finder.find(baseArray, arrayWithExtra));
    }

    @Test
    @DisplayName("Should work when the base array already has duplicate elements")
    void shouldFindElementWithDuplicatesInBase() {
        int[] baseArray = { 4, 1, 3, 1, 4 };
        int[] arrayWithExtra = { 1, 4, 1, 5, 3, 4 };
        assertEquals(5, finder.find(baseArray, arrayWithExtra));
    }

    @Test
    @DisplayName("Should work when the base array is empty")
    void shouldWorkWithEmptyBaseArray() {
        int[] baseArray = {};
        int[] arrayWithExtra = { 99 };
        assertEquals(99, finder.find(baseArray, arrayWithExtra));
    }

    @Test
    @DisplayName("Should find the extra element at the end of the array (array 1 with extra)")
    void shouldFindExtraElementAtTheEndInverted() {
        int[] arrayWithExtra = { 1, 2, 3, 4, 5 };
        int[] baseArray = { 1, 2, 3, 4 };
        assertEquals(5, finder.find(arrayWithExtra, baseArray));
    }

    @Test
    @DisplayName("Should find the extra element at the beginning of the array (array 1 with extra)")
    void shouldFindExtraElementAtTheBeginningInverted() {
        int[] arrayWithExtra = { 5, 10, 20, 30 };
        int[] baseArray = { 10, 20, 30 };
        assertEquals(5, finder.find(arrayWithExtra, baseArray));
    }

    @Test
    @DisplayName("Should find the extra element in the middle of the array (array 1 with extra)")
    void shouldFindExtraElementInTheMiddleInverted() {
        int[] arrayWithExtra = { 8, 6, 4, 2 };
        int[] baseArray = { 8, 6, 2 };
        assertEquals(4, finder.find(arrayWithExtra, baseArray));
    }

    @Test
    @DisplayName("Should find the element when there are negative numbers (array 1 with extra)")
    void shouldFindElementWithNegativeNumbersInverted() {
        int[] arrayWithExtra = { -1, -5, -2, -3 };
        int[] baseArray = { -1, -2, -3 };
        assertEquals(-5, finder.find(arrayWithExtra, baseArray));
    }

    @Test
    @DisplayName("Should find the element when the extra one is zero (array 1 with extra)")
    void shouldFindElementZeroInverted() {
        int[] arrayWithExtra = { 1, 0, 2, 3 };
        int[] baseArray = { 1, 2, 3 };
        assertEquals(0, finder.find(arrayWithExtra, baseArray));
    }

    @Test
    @DisplayName("Should work when the base array already has duplicate elements (array 1 with extra)")
    void shouldFindElementWithDuplicatesInBaseInverted() {
        int[] arrayWithExtra = { 1, 4, 1, 5, 3, 4 };
        int[] baseArray = { 4, 1, 3, 1, 4 };
        assertEquals(5, finder.find(arrayWithExtra, baseArray));
    }

    @Test
    @DisplayName("Should work when array 2 is empty")
    void shouldWorkWithArray2Empty() {
        int[] arrayWithExtra = { 99 };
        int[] baseArray = {};
        assertEquals(99, finder.find(arrayWithExtra, baseArray));
    }
}
