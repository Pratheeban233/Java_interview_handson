package java_8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCharacterOccurrenceFromString {
    public static void main(String[] args) {
        String input = "india is my country";
        String target = "i";

        input.chars()
                .mapToObj(value -> (char) value)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(ch -> ch.getKey().toString().equals(target))
                .map(Map.Entry::getValue)
                .forEach(System.out::println);

    }
}
