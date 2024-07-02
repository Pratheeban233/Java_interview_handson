package interview_asked;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindCharOccurranceCount {

    public static void main(String[] args) {
        int input = 100, d = 1;
        String str = String.valueOf(input);
        String[] inp = str.split("");

        long count = Arrays.stream(inp)
                .filter(ch -> ch.equals(String.valueOf(d)))
                .count();

        System.out.println(d + " presented in " + count + " times.");

    }
}
