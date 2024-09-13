package org.example;

public class ReverseString
{
    public static void main(String[] args) {

        String s = "Vikram is good";
        //output = good is vikram
        String[] v = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i=v.length-1;i>=0;i--)
        {
            sb.append(" "+v[i]);
        }
        System.out.println(sb.toString());
    }
}