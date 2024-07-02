package basicProgram;

public class Armstrong_number {
    // sum of cubical value equal to given number
    public static void main(String[] args) {
        int input = 153;
        int num = input, armstrong = 0, temp;

        while (num > 0) {
            temp = num % 10;
            temp = temp * temp * temp;
            armstrong = armstrong + temp;
            num = num / 10;
        }
        if (input == armstrong)
            System.out.println(input + " is Armstrong number");
        else
            System.out.println(input + " is not Armstrong number");
    }
}
