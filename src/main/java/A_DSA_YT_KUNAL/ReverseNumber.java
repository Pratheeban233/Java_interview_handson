package A_DSA_YT_KUNAL;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number...");
        int num = in.nextInt();

        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }

        System.out.println("reverse num : \n" + sum);
    }
}
