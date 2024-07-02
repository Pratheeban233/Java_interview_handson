package A_DSA_YT_KUNAL;

import java.util.Arrays;

public class maxNumber {

    public static void main(String[] args) {
        int [] arr = {2, 34, 23, 533, 523, 6, 6234};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("max = " + max);

        System.out.println(Arrays.stream(arr).max().getAsInt());
    }
}
