package A_DSA_YT_KUNAL;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {23, 23, 435, 1, 0, 56, 3};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

        UsingStack(arr);

    }

    private static void reverseArray(int[] arr) {
        IntStream.range(0, arr.length/2) //23, 23, 435, 1, 0, 56, 3
                .forEach(i -> {
                    int temp = arr[i];
                    arr[i] = arr[arr.length -i -1];
                    arr[arr.length -i -1] = temp;
                });
    }

    private static void UsingStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        Arrays.stream(arr)
                .boxed()
                .map(stack::push)
                .forEach(e -> System.out.print(e +", "));
    }



}
