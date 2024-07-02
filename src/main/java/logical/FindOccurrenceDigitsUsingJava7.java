package logical;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindOccurrenceDigitsUsingJava7 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 1, 3, 1, 2, 2);
        findOccurrenceDigit(list);
    }

    private static void findOccurrenceDigit(List<Integer> list) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (Integer num : list) {
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            } else {
                hm.put(num, 1);
            }
        }

        int mostFrequentDigit = 0;
        int highestValue = 0;
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int digit = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                mostFrequentDigit = digit;
                highestValue = digit;
                maxCount = count;
            } else if (count == maxCount && digit > highestValue) {
                highestValue = digit;
            }
        }
        System.out.println("Most frequent digit: " + mostFrequentDigit);
        System.out.println("Highest value among the most frequent digits: " + highestValue);
    }

}
