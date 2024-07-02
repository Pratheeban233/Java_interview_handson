package A_DSA_YT_KUNAL;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr2D = {
                {15, 2, 34, 4},
                {5, 65},
                {7, 86, 96},
                {101}
        };

        int target = 86;

        int[] index = search(arr2D, target);
        System.out.println("index = " + Arrays.toString(index));

    }

    private static int[] search(int[][] arr2D, int target) {
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                if (arr2D[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
