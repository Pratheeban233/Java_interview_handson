package logical;

import java.util.*;

public class ReturnBooleanArrayRepeatedCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers ...");

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        /*
         integer array nums, return true if any value appears at least twice in the array,
         and return false if every element is distinct.
         */

        System.out.println(findBoolean(numbers));

    }

    private static boolean findBoolean(int[] numbers) {
        List<Integer> list = Arrays.stream(numbers)
                .boxed()
                .toList();

        Set<Integer> set = new HashSet<>(list);

        return list.size() == set.size();
    }
}
