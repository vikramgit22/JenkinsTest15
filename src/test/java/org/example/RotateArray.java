package org.example;

public class RotateArray {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(numbers, k);

        System.out.print("Rotated array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void rotate(int[] numbers, int k) {
        int n = numbers.length;
        k = k % n;

        reverse(numbers, 0, n - 1);
        reverse(numbers, 0, k - 1);
        reverse(numbers, k, n - 1);
    }

    public static void reverse(int[] numbers, int start, int end) {
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }


}
