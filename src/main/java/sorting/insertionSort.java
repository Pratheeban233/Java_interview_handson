package sorting;

import java.util.Arrays;

public class insertionSort {

    public static void main(String[] args) {
        int[] arr = {6, 2, 1, 8, 5, 9, 4};
        insertionSorting(arr);
    }

    private static void insertionSorting(int[] arr) {

        int key;
        int j;

        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }
}
