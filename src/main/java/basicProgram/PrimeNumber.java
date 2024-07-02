package basicProgram;

public class PrimeNumber {

    public static void main(String[] args) {
        int num = 13;
        int i =2;
        while (num > i) {
            if(num % i == 0) {
                System.out.println(num + " is not a Prime number");
                break;
            } else {
                System.out.println(num + " is prime number");
                break;
            }
        }
    }

}
