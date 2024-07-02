package java_8;

import java.util.function.Function;
import java.util.stream.Collectors;

public class findNonRepeatedWord {

    public static void main(String[] args) {
        findFirstNonRepeatedLetter("stress");
    }

    private static void findFirstNonRepeatedLetter(String str) {

        str.chars()
                .mapToObj(val -> (char) val)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(ch -> ch.getValue() == 1)
                .forEach(System.out::println);

    }
}
