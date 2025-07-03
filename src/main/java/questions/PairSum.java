package questions;

public class PairSum {

    // Execution time: O(n*logn)
    // Space usage: O(n) => Taking into account the result string
    public String findPairs(int[] v, int key) {
        String r = "";
        int j;

        sort(v);

        for (int i = 0; i < v.length; i++) {
            if ((j = search(v, key - v[i], i + 1, v.length - 1)) != -1)
                r += String.format("(%d, %d)", v[i], v[j]);
        }
        return r;
    }

    // Auxiliary methods
    public int search(int[] array, int key, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;

            if (array[mid] == key)
                return mid;
            else if (key < array[mid])
                return search(array, key, start, mid - 1);
            else
                return search(array, key, mid + 1, end);
        }
        return -1;
    }

    public void sort(int[] v) {
        if (0 < v.length - 1) {
            int pivot = partition(v, 0, v.length - 1);
            sort(v, 0, pivot - 1);
            sort(v, pivot + 1, v.length - 1);
        }
    }

    public void sort(int[] v, int start, int end) {
        if (start < end) {
            int pivot = partition(v, start, end);
            sort(v, start, pivot - 1);
            sort(v, pivot + 1, end);
        }
    }

    public int partition(int[] v, int start, int end) {
        int pivot = v[start];

        int i = start;
        int j = end;

        while (i <= j) {
            while (i <= j && v[i] <= pivot)
                i++;

            while (i <= j && v[j] >= pivot)
                j--;

            if (i < j)
                swap(v, i, j);
        }
        swap(v, start, j);
        return j;
    }

    public void swap(int[] v, int i, int j) {
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
}