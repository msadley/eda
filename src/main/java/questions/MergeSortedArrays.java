package questions;

public class MergeSortedArrays {

    public int[] merge(int[] a, int[] b) {
        int[] v = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j])
                v[k++] = a[i++];
            else
                v[k++] = b[j++];
        }

        while (i < a.length)
            v[k++] = a[i++];
        
        while (j < b.length)
            v[k++] = b[j++];

        return v;
    }
}