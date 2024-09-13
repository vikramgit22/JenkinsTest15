package org.example;

public class LnSArray {

    public static void main(String[] args) {

        int[] num={12, 5, 8, 20, 3, 25, 7};
        int max = num[0];
        for (int n : num) {
            if (n > max) {
                max = n;
            }
        }
        System.out.println("Max "+max);

        int min=num[0];
        for(int n1:num) {
            if(n1 < min)
            {
                min=n1;
            }
        }
        System.out.println("Min "+min);

    }


}
