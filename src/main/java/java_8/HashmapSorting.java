package java_8;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashmapSorting {
    public static void main(String[] args) {
        HashMap<String, Integer> sampleHashMap = new HashMap<>();

        // Add elements to the HashMap
        sampleHashMap.put("apple", 3);
        sampleHashMap.put("banana", 6);
        sampleHashMap.put("cherry", 9);
        sampleHashMap.put("date", 2);
        sampleHashMap.put("grape", 8);
        sampleHashMap.put("kiwi", 4);
        sampleHashMap.put("lemon", 7);
        sampleHashMap.put("mango", 5);
        sampleHashMap.put("orange", 10);
        sampleHashMap.put("pear", 1);


        sampleHashMap.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
//                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));


    }
}
