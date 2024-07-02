package java_8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java_8_basic_questions {

    public static void main(String[] args) {

        // Q1: find out all the even numbers
        System.out.println("Q1: find out all the even numbers");
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        list.stream()
                .filter(e -> e % 2 == 0)
                .forEach(e -> System.out.print(e + " "));


        // Q2: find out all the numbers starting with 1
        System.out.println("\nQ2: find out all the numbers starting with 1");
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        myList.stream()
                .map(String::valueOf)
                .filter(e -> e.startsWith("1"))
                .forEach(e -> System.out.print(e + " "));

        // Q3: find duplicate elements
        System.out.println("\nQ3: find duplicate elements");
        List<Integer> dupList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Set<Integer> set = new HashSet<>();
        dupList.stream()
                .filter(e -> !set.add(e))
                .forEach(e -> System.out.print(e + " "));

        // Q4: find the first element
        System.out.println("\nQ4: find the first element");
        List<Integer> l1 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        l1.stream()
                .findFirst()
                .ifPresent(System.out::print);

        // Q5: find the total number of elements
        System.out.println("\nQ5: find the total number of elements");
        List<Integer> l2 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        System.out.println(l1.stream().count());

        // Q6:find the maximum value element
        System.out.println("\nQ6:find the maximum value element");
        List<Integer> l3 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        l3.stream()
                .max((o1, o2) -> o1 - o2)
                .ifPresent(System.out::print);

        // Q7: find the non-repeated character
        System.out.println("\nQ7: find the non-repeated character");
        String input = "Java articles are Awesome";
        input.chars()
                .mapToObj(c -> Character.toLowerCase((char) c))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .forEach(e -> System.out.print(e.getKey() + " "));

        // Q7-i: find the non-repeated character
        System.out.println("\nQ7-i: find the first non-repeated character");
        String input1 = "Java articles are Awesome";
        input1.chars()
                .mapToObj(c -> Character.toLowerCase((char) c))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::print);

        // Q8: find the first repeated character
        System.out.println("\nQ8: find the first repeated character");
        String input2 = "Java Articles are Awesome";

        input2.chars()
                .mapToObj(ch -> Character.toLowerCase((char) ch))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::print);


        // Q9: sort all the values present
        System.out.println("\nQ9: sort all the values present");
        List<Integer> myList3 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList3.stream()
                .sorted()
                .forEach(e -> System.out.print(e +" "));


        // Q10: sort all the values present
        System.out.println("\nQ10: sort all the values present- DESC");
        List<Integer> myList4 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList3.stream()
                .sorted(Collections.reverseOrder())
                .forEach(e -> System.out.print(e +" "));


    }
}
