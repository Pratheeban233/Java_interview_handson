package DSA;

import java.util.Arrays;

public class SquareSortedArray {

    public static void main(String[] args) {
        int[] arr = {-4, -2, 0, 3, 5};

        bruteForceMethod(arr);
    }

    private static void bruteForceMethod(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i] * a[i];
        }
        System.out.println(Arrays.toString(a)); // not in sorted order


        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        printArray(a);
    }

    private static void printArray(int[] arr) {
        System.out.println();
        System.out.println(Arrays.toString(arr));

    }

}

