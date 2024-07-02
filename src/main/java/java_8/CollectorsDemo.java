package java_8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 6, 75, 234, 2, 75, 322, 12, 1, 8, 6, 54, 2, 45, 23);
        List<String> stringList = Arrays.asList("Pratheeban", "Abiyakarolin", "Dhiya", "Pratheeban");

        System.out.println("Binary search : " + Arrays.binarySearch(numbers.toArray(), 1));

        Long counting = numbers.stream().collect(Collectors.counting()); // count()
        counting = numbers.stream().count(); // count()
        System.out.println("counting = " + counting);

        Optional<Integer> maxBy = numbers.stream().collect(Collectors.maxBy(Comparator.comparing(n -> n))); //max()
        maxBy = numbers.stream().max(Comparator.comparing(n -> n)); //max()
        System.out.println("maxBy = " + maxBy.get());

        Optional<Integer> minBy = numbers.stream().collect(Collectors.minBy(Comparator.comparing(n -> n))); //min()
        minBy = numbers.stream().min(Comparator.comparing(n -> n)); //min()
        System.out.println("minBy = " + minBy.get());

        String joining = numbers.stream().map(String::valueOf)
                .collect(Collectors.joining(" - ", "[", "]"));
        System.out.println("joining = " + joining);

        PriorityQueue<Integer> priorityQueue = numbers.stream()
                .collect(Collectors.toCollection(PriorityQueue::new));
        System.out.println("priorityQueue = " + priorityQueue);

        Double summingDouble = numbers.stream().collect(Collectors.summingDouble(x -> x));
        summingDouble = numbers.stream().mapToDouble(x -> x).sum();
        System.out.println("summingDouble = " + summingDouble);

        Map<Boolean, List<Integer>> partitionBy = numbers.stream().collect(Collectors.partitioningBy(n -> n > 30));
        System.out.println("partitionBy = " + partitionBy);

        Map<Integer, Integer> numbersToMap = numbers.stream().collect(Collectors.toMap(Function.identity(), n -> (n * 2), (a, b) -> a));
        System.out.println("numbersToMap = " + numbersToMap);

        Map<String, Integer> stringMap = stringList.stream().collect(Collectors.toMap(Function.identity(), s -> s.length(), (a, b) -> b));
        System.out.println("stringMap = " + stringMap);

        Map<Integer, List<Integer>> IntegerGroupBy = numbers.stream().collect(Collectors.groupingBy(Function.identity()));
        System.out.println("IntegerGroupBy = " + IntegerGroupBy);

        Map<Integer, Map<Integer, Integer>> integerMapMap = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.toMap(x -> x, x -> x * x, (a, b) -> a)));
        System.out.println("integerMapMap = " + integerMapMap);

    }
}
