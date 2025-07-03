package questions;

public class DuplicateChecker {

    public boolean containsDuplicates(int[] sequence) {
        if (sequence == null)
            return false;

        if (sequence.length == 0)
            return false;

        int largest = sequence[0];
        for (int i : sequence)
            if (i > largest)
                largest = i;

        int smallest = sequence[0];
        for (int i : sequence)
            if (i < smallest)
                smallest = i;

        boolean[] h = new boolean[largest-smallest+2];

        for (int i : sequence) {
            if (h[i-smallest])
                return true;
            h[i-smallest] = true;
        }
        return false;
    }
}
