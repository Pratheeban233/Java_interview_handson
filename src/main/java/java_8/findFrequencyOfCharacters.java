package java_8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class findFrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input...");
        String str = scanner.nextLine();
        findFrequency(str);
    }

    private static void findFrequency(String str) {
        str.chars()
                .mapToObj(value -> (char) value)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);

        System.out.println("--------------------");
// find frequent char
        str.chars()
                .mapToObj(value -> (char) value)
                .filter(ch -> Collections
                        .frequency(Arrays.asList(str.split("")), 'a') > 1)
                .distinct()
                .forEach(System.out::println);

    }
}
