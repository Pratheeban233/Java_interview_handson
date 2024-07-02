package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class findStartWithNum {

    public static void main(String[] args) {

        int[] numArray = {23, 43, 12, 54, 19, 90, 7, 16};

        Arrays.stream(numArray)
                .boxed()
                .filter(num -> num.toString().startsWith("1"))
                .forEach(System.out::println);

        int reduce = Arrays.stream(numArray)
                .reduce(0, Integer::sum);
        System.out.println("reduce = " + reduce);
    }
}
