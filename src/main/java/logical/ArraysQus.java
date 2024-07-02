package logical;

import java.util.Arrays;

public class ArraysQus {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        Arrays.stream(arr1)
                .filter(e1 -> Arrays.stream(arr2)
                        .anyMatch(e2 -> e2 == e1)).boxed()
                .forEach(System.out::println);
    }
}
