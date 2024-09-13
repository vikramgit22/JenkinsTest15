package org.example;

public class ArMisNum {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 6, 3, 7, 8};

        int missingNumber = findMissingNumber(numbers, 8);

        System.out.println("Missing number: " + missingNumber);
    }

    public static int findMissingNumber(int[] numbers, int n) {
        int sum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : numbers) {
            actualSum += num;
        }

        return sum - actualSum;
    }
}
