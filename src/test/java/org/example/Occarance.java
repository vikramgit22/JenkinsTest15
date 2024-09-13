package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Occarance {
    public static void main(String[] args) {
       /* String str = "Hello, World!  ";
        int[] array = {1, 2, 3, 2, 4, 5, 1, 6, 7, 5};
       
    Map<Integer, Integer> charCountMap = new HashMap<>();

        // Convert string to char array
        //char[] chars = str.toCharArray();

        // Count occurrences of each character
        for (int c : array) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if(entry.getValue()==1)
            {
                System.out.println(charCountMap);
            }
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }*/

        int[] array = {1, 2, 3, 2, 4, 5, 1, 6, 7, 5}; // Example array with duplicates
        List<Integer> uniqueValues = findUniqueValues(array);

        System.out.println("Non-duplicate values: " + uniqueValues);
    }

    public static List<Integer> findUniqueValues(int[] array) {
        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a list to store non-duplicate values
        List<Integer> nonDuplicateValues = new ArrayList<>();

        // Add only the elements with a frequency of 1 to the non-duplicate list
        for (int num : array) {
            if (frequencyMap.get(num) == 1) {
                nonDuplicateValues.add(num);
            }
        }
       return nonDuplicateValues;

    }
}
