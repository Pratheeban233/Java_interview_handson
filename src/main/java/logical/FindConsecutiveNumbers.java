package logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindConsecutiveNumbers {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 1, 2, 6};

        Arrays.sort(numbers);

        boolean isConsecutive = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1] - numbers[i] != 1) {
                isConsecutive = false;
//                System.out.println("the number " + numberList.get(i) + " and " + numberList.get(i + 1) + " are consecutive");
            }
        }

        if (isConsecutive)
            System.out.println("given numbers are consecutive");
        else
            System.out.println("given numbers are not consecutive");

    }
}
