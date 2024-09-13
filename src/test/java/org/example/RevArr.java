package org.example;

public class RevArr {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int left=0;int right=numbers.length-1;
        while(left<right)
        {
            numbers[left] = numbers[left]+numbers[right];
            numbers[right] = numbers[left]-numbers[right];
            numbers[left] = numbers[left]-numbers[right];

            left++;
            right--;
        }

        for(int n:numbers)
        {
            System.out.print(n+",");
        }

    }

}
