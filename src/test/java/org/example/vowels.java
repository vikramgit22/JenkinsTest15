package org.example;

public class vowels {
    public static void main(String[] args) {

        String s="Hi Chinni";
        int vcount =0;
        int others =0;
        String v="aeiouAEIOU";
        for(char c:s.toCharArray())
        {
            if(Character.isLetter(c))
            {
                if(v.indexOf(c)!=-1)
                {
                    vcount++;
                }
                else {
                    others++;
                }
            }
        }

        System.out.println("vow="+vcount+" "+"con="+others);
    }
}
