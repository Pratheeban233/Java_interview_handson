package basicProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Palindrome_program {

    public static void main(String[] args) {
        FindPalindromeNumber();
        FindPalindromeString();
        FindPalindromeStack();
    }

    private static void FindPalindromeStack() {
        String input = "malayalam";
        StringBuilder builder = new StringBuilder();
        Stack<String> stack = new Stack<>();
        Arrays.stream(input.split(""))
                .forEach(stack::push);
        while (!stack.isEmpty()){
            builder.append(stack.pop());
        }

        if (input.contentEquals(builder))
            System.out.println(input + " is Palindrome");
        else
            System.out.println(input + " is not Palindrome");
    }


    private static void FindPalindromeString() {
        String input = "malayalam";
        StringBuilder reverse = new StringBuilder(input).reverse();

        if (input.contentEquals(reverse))
            System.out.println(input + " is Palindrome");
        else
            System.out.println(input + " is not Palindrome");
    }

    private static void FindPalindromeNumber() {
        int num = 12021;
        int remain, reverse = 0, temp;
        temp = num;
        while (temp > 0) {
            remain = temp % 10;
            reverse = reverse * 10 + remain;
            temp = temp / 10;
        }
        if (num == reverse)
            System.out.println(num + " is Palindrome");
        else
            System.out.println(num + " is not Palindrome");
    }
}
