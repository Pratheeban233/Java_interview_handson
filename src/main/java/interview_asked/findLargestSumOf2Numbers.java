package interview_asked;

public class findLargestSumOf2Numbers {
    public static void main(String[] args) {
        int[] arr = {12, 37, -7, 32, -10, 41};

        printLargestSumOf2numbers(arr);
        findLargestSumOf2Number(arr);

    }

    private static void findLargestSumOf2Number(int[] arr) {
        int largestNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int currentSum = arr[i] + arr[j];
                largestNumber = Math.max(largestNumber, currentSum);
            }
        }
        System.out.println("largestNumber = " + largestNumber);
    }

    private static void printLargestSumOf2numbers(int[] arr) {
        int currentSum = 0;
        int largestSum = 0;

        int firstValue = 0;
        int secondValue = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                currentSum = arr[i] + arr[j]; // 12 + 37
                if (currentSum > largestSum) {
                    largestSum = currentSum;
                    firstValue = arr[i];
                    secondValue = arr[j];
                }

            }
        }

        System.out.println("largestvalue = " + largestSum + " firstvalue : " + firstValue + " second : " + secondValue);
    }
}
