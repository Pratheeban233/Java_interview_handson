package basicProgram;

public class Factorial {
    
    // 5! = 5 * 4 * 3 * 2 * 1 = SUM


    public static void main(String[] args) {
        int input = 5, sum = 1;

        for (int i = 1; i <= input; i++) {
            sum = sum * i;
        }
        System.out.println("factorial of " + input + " is = " + sum);
    }
}
