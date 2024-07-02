package algorithm;

public class ArrayAgnosticBinarySearch {

    // what if array sorted in reverse order

    public static void main(String[] args) {
//        int[] input = {1, 2, 3, 4, 6, 7, 7, 8, 9};
        int[] input = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int target = 4;

        int index = findNumber(input, target);
        System.out.println("\n index = " + index);
    }

    private static int findNumber(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == arr[mid]) {
                return mid;
            }

            //binary search array should be ordered. either asc or desc
            if (isAscending(arr)) {
                if (target < arr[mid]) {
                    high = mid - 1;
                }
                if (target > arr[mid]) {
                    low = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    high = mid - 1;
                }
                if (target < arr[mid]) {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    private static boolean isAscending(int[] arr) {

        return arr[0] < arr[arr.length - 1];
    }
}
