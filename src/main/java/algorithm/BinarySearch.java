package algorithm;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] input = {3, 4, 7, 6, 2, 1, 9, 8, 7};
        int target = 4;
        Arrays.sort(input);

        for (int i = 0; i < input.length - 1; i++) {
            System.out.print(input[i] + " ");
        }

        int index = binarySearch(input, target);
        System.out.println("\n index = " + index);
    }

    private static int binarySearch(int[] input, int target) {

        int low = 0;
        int high = input.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == input[mid]) {
                return mid;
            }
            if (target < input[mid]) {
                high = mid - 1;
            }
            if (target > input[mid]) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
