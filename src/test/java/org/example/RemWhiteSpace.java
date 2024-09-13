package org.example;

public class RemWhiteSpace {

    public static void main(String[] args) {

         String val =" Hello world  ";
         StringBuilder sb = new StringBuilder();
         for(int i=0;i<val.length();i++)
         {
             char[] c= val.toCharArray();
              if(!Character.isWhitespace(c[i]))
              {
                 sb.append(c[i]).toString();
              }
         }

        System.out.println(sb);

    }


}
