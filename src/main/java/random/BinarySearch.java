package random;

public class BinarySearch {
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
}