package A_DSA_YT_KUNAL;

import java.util.Scanner;

public class CountOccurrence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number... ");
        int num = in.nextInt();
        System.out.println("type the target character");
        int find = in.nextInt();

        int count = 0;

        while (num > 0) {
            int remainder = num % 10;
            if(remainder == find) {
                count++;
            }
            num = num / 10;
        }

        System.out.println( find + " number occurred " + count + " times.");
    }
}
