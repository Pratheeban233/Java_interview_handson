package interview_asked;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findFirstNonRepeatedChar {
    public static void main(String[] args) {
        String numbers = "441138030203215";


        String result = Arrays.stream(numbers.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse("All are repeating numbers");

        System.out.println(result);
    }
}
