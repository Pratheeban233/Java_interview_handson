package java_8;

import java.util.*;
import java.util.stream.Collectors;

public class FindNthHighestSalary {

    public static void main(String[] args) {
        HashMap<String, Integer> map= new HashMap<>();
        map.put("Pratheeban", 130000);
        map.put("Abiya", 120000);
        map.put("Prathi", 130000);
        map.put("abi", 120000);
        map.put("Dhiya", 200000);
        map.put("dumminy", 50000);

        getNthSalary(2, map);
        System.out.println("--------------------------");
//        getNthSalary(2, Employee.getEmployeeList());
    }

    private static void getNthSalary(int find, HashMap<String, Integer> map) {

        Map.Entry<Integer, List<String>> nthSalary = map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet()
                .stream()
                .peek(System.out::println)
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .toList()
                .get(find - 1);

        System.out.println("nthSalary from map -> " + nthSalary);
    }

}
