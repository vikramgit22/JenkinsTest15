package org.example;

import java.util.Arrays;
import java.util.Collections;

public class NthLargest {

    public static void main(String[] args) {

        Integer[] numbers = {5, 3, 1, 6, 4, 2};
        /*int n=2;
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers[n-1]);*/

        int first=Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;

        for(int u:numbers)
        {
            if(u>first)
            {
                sec=first;
                first=u;
            } else if (u > sec && u !=first) {
                sec=u;
                
            }
        }
        System.out.println(sec);
    }


}
