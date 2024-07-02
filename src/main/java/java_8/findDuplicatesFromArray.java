package java_8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};

        duplicatesUsingSet(arr);
        duplicatesUsingMap(arr);
        duplicatesUsingMap_usingJava8("bananas");
        findDuplicatesFromString("bananas");
        removeDuplicatesFromString("bananas");
    }

    private static void removeDuplicatesFromString(String str) {
        System.out.println("removeDuplicatesFromString");

        Arrays.stream(str.split(""))
                .distinct()
                .forEach(System.out::println);

        System.out.println("------------------------------------");
    }

    private static void findDuplicatesFromString(String str) {
        System.out.println("findDuplicatesFromString");

        String[] strArr = str.split("");
        Arrays.stream(strArr)
                .filter(s -> Collections.frequency(List.of(strArr), s) > 1)
                .distinct()
                .forEach(System.out::println);

        System.out.println("------------------------------------");
    }

    private static void duplicatesUsingSet(int[] arr) {
        System.out.println("duplicatesUsingSet");

        Set<Integer> integers = new HashSet<>();
        Arrays.stream(arr)
                .filter(value -> !integers.add(value))
                .forEach(System.out::println);

        System.out.println("------------------------------------");
    }

    private static void duplicatesUsingMap(int[] arr) {
        System.out.println("duplicatesUsingMap");

        Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        System.out.println("------------------------------------");

    }

    private static void duplicatesUsingMap_usingJava8(String str) {
        System.out.println("duplicatesUsingMap_usingJava8");

        Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(System.out::println);

        System.out.println("------------------------------------");


    }
}
