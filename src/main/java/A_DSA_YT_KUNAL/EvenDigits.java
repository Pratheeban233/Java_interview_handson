package A_DSA_YT_KUNAL;

public class EvenDigits {
    public static void main(String[] args) {

        // find even digits

        int[] arr = {12, 4, 4546, 45, 232, 2};
        System.out.println(evenDigit(arr));
    }

    private static int evenDigit(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (isEven(j))
                count++;
        }
        return count;
    }

    private static boolean isEven(int i) {
        return String.valueOf(i).length() % 2 == 0;

        // using divide by 10
//        int count = 0;
//        while (i > 0) {
//            count++;
//            i = i / 10;
//        }
//        return count % 2 == 0;
    }
}
