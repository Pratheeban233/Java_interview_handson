package logical;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String str = " I love India";
//        reverseString(str);
        reverseCharacter(str);
    }

    private static void reverseCharacter(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder reverseString = new StringBuilder();
        str.chars()
                .mapToObj(ch -> (char) ch)
                .forEach(stack::push);

        while (!stack.isEmpty()) {
            reverseString.append(stack.pop());
        }
        System.out.println(reverseString);
    }

    private static void reverseString(String str) {
        Stack<String> stack = new Stack<>();
        for (String s : str.split(" ")) {
            stack.push(s);
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
