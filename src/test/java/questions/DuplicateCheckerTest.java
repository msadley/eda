package questions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DuplicateCheckerTest {

    private final DuplicateChecker checker = new DuplicateChecker();

    @Test
    @DisplayName("Should return true for a sequence with duplicates in the middle")
    void shouldReturnTrueForSequenceWithDuplicates() {
        int[] sequence = { 1, 2, 3, 1 };
        assertTrue(checker.containsDuplicates(sequence));
    }

    @Test
    @DisplayName("Should return false for a sequence without duplicates")
    void shouldReturnFalseForSequenceWithoutDuplicates() {
        int[] sequence = { 1, 2, 3, 4 };
        assertFalse(checker.containsDuplicates(sequence));
    }

    @Test
    @DisplayName("Should return false for an empty sequence")
    void shouldReturnFalseForEmptySequence() {
        int[] sequence = {};
        assertFalse(checker.containsDuplicates(sequence));
    }

    @Test
    @DisplayName("Should return false for a sequence with a single element")
    void shouldReturnFalseForSequenceWithSingleElement() {
        int[] sequence = { 1 };
        assertFalse(checker.containsDuplicates(sequence));
    }

    @Test
    @DisplayName("Should return true for a sequence with all elements being the same")
    void shouldReturnTrueForAllElementsEqual() {
        int[] sequence = { 5, 5, 5, 5 };
        assertTrue(checker.containsDuplicates(sequence));
    }

    @Test
    @DisplayName("Should return false for a null input")
    void shouldReturnFalseForNullSequence() {
        assertFalse(checker.containsDuplicates(null));
    }

    @Test
    @DisplayName("Should detect duplicates when elements are numbers")
    void shouldDetectDuplicatesWithNumbers() {
        int[] sequence = { 10, 20, 30, 10 };
        assertTrue(checker.containsDuplicates(sequence));
    }

    @Test
    @DisplayName("Should detect duplicates at the beginning and end of the sequence")
    void shouldDetectDuplicatesAtExtremes() {
        int[] sequence = { 1, 2, 3, 1 };
        assertTrue(checker.containsDuplicates(sequence));
    }
}
