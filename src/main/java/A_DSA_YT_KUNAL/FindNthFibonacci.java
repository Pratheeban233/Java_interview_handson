package A_DSA_YT_KUNAL;

import java.util.Scanner;

public class FindNthFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number...");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;

        int count = 2;

        while (count <= n) {
            int temp = b; // to keep value for next assignment
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println(b);
    }
}
