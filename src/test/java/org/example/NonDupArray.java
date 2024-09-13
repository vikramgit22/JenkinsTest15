package org.example;

public class NonDupArray {
    public static void main(String[] args) {
        // Initialize the array with some duplicate values
        int[] numbers = {4, 5, 6, 7, 4, 5, 8, 9, 9};

        // Create an array to store the count of each element
        int[] counts = new int[numbers.length];

        // Calculate occurrences of each element
        for (int i = 0; i < numbers.length; i++) {
            counts[i] = 1; // Initialize the count for the current element
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j]) {
                    counts[i]++; // Increase count if duplicate is found
                }
            }
        }

        // Print non-duplicate values
        System.out.print("Non-duplicate values: ");
        for (int i = 0; i < numbers.length; i++) {
            // Print the element if its count is 1
            if (counts[i] == 1) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
