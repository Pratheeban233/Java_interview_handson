package leetcode;

import java.util.Arrays;

public class Merge2ArrayInto1 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 9, 0, 0, 0};
        int[] arr2 = {2, 5, 6};
        int m = 4; // length of present values in arr1
        int n = 3; // length of present values in arr2

        int[] merge = merge(arr1, m, arr2, n);
        System.out.println(Arrays.toString(merge));
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int arr1 = m - 1;
        int arr2 = n - 1;
        int k = m + n - 1;

        while (arr2 >= 0) {
            if (arr1 >= 0 && nums1[arr1] > nums2[arr2]) {
                nums1[k--] = nums1[arr1];
                arr1--;
            } else {
                nums1[k--] = nums2[arr2];
                arr2--;
            }
        }
        return nums1;
    }
}
