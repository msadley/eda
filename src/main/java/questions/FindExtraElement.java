package questions;

public class FindExtraElement {

    // Execution time: O(n)
    // Space usage: O(k)
    public int find(int[] a, int[] b) {

        int[] larger, smaller;

        if (a.length > b.length) {
            larger = a;
            smaller = b;
        } else {
            larger = b;
            smaller = a;
        }

        int largestInt = larger[0];
        for (int i : larger)
            if (i > largestInt)
                largestInt = i;

        int smallestInt = larger[0];
        for (int i : larger)
            if (i < smallestInt)
                smallestInt = i;

        boolean[] h = new boolean[largestInt - smallestInt + 2];

        for (int i : smaller) {
            h[i - smallestInt] = true;
        }

        for (int i : larger) {
            if (!h[i - smallestInt])
                return i;
        }
        return -1;
    }
}