package logical;

import java.util.Arrays;
import java.util.Stack;

public class StringReverseWord {

    public static void main(String[] args) {
        String input = " Dhiya is a good girl";

        reversTheWordUsingStack(input);
        usingStringBuilder(input);
    }

    private static void usingStringBuilder(String input) {
        StringBuilder stringBuilder = new StringBuilder(input)
                .reverse();
        System.out.println("stringBuilder = " + stringBuilder);
    }

    private static void reversTheWordUsingStack(String input) {

        Stack<String> stack = new Stack<>();
        StringBuilder output = new StringBuilder();

        for (String str : input.split(" ")) {
            stack.push(str);
        }

        while (!stack.isEmpty()) {
            String pop = stack.pop();
            output.append(pop).append(" ");
        }

        System.out.println("stack output = " + output);

        Arrays.stream(input.split(" "))
                .map(stack::push)
                .forEach(s -> System.out.print(stack.pop() +" "));


    }
}
