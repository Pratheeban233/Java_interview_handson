package java_8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMap_improvement {

    public static void main(String[] args) {
        // create a new HashMap
        Map<String, Integer> map = new HashMap<>();

// add 16 or more objects to the map with the same key
        for (int i = 1; i <= 20; i++) {
            map.put("key", i);
        }

// retrieve a value from the map using the key
        int value = map.get("key");
        System.out.println("value = " + value);
        Collection <Integer> listofvalues = map.values();
        System.out.println("listofvalues = " + listofvalues);
    }
}
