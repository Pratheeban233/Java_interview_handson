package algorithm;

import java.util.Collections;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 34, 23, 533, 523, 6, 6234};
        int target = 6;
        int index = searchIndex(arr, target);
        System.out.println("index at = " + index);
    }

    private static int searchIndex(int[] arr, int target) {
        if (arr.length == 0)
            return -1;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
