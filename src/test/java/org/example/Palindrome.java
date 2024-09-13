package org.example;

public class Palindrome {

    public static void main(String[] args) {

        String s="madam";
        //check fwd=rev
        //Option 1
        /*String sb = new StringBuilder(s).reverse().toString();
        if(s.equals(sb))
        {
            System.out.println("Pal");
        }*/

        //Option 2
        boolean pal1;
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                pal1=false;
            }
            left++;
            right--;
        }
        pal1=true;
        System.out.println(pal1);
    }

}
