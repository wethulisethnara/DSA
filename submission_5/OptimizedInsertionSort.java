package submission_5;

import java.util.Arrays;

public class OptimizedInsertionSort {
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            // Use binary search to find insertion point
            int pos = Math.abs(Arrays.binarySearch(arr, 0, i, key) + 1);
            System.arraycopy(arr, pos, arr, pos + 1, i - pos);
            arr[pos] = key;
        }
    }
}

