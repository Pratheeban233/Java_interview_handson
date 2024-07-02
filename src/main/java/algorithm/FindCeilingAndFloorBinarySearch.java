package algorithm;

public class FindCeilingAndFloorBinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8, 12, 24, 35, 67, 98};
        int target = 1;
        // ceiling : greatest small or equal index
        System.out.println(ceiling(arr, target));
        System.out.println(floor(arr, target));
    }

    static int ceiling(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return start;
    }

    static int floor(int[] input, int target) {

        int start = 0;
        int end = input.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == input[mid]) {
                return mid;
            }
            if (target < input[mid]) {
                end = mid - 1;
            }
            if (target > input[mid]) {
                start = mid + 1;
            }
        }
        return end;
    }
}
