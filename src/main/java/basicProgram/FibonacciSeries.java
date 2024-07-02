package basicProgram;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        // when next term is the sum of first two term
        concept();
    }


    private static void concept() {
        int firstTerm = 0, secondTerm = 1;
        int count = 10;
        int nextTerm;
        System.out.print(firstTerm + " " + secondTerm);
        for (int i = 1; i < count; i++) {
            nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
