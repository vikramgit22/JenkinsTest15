package CollectionsPrac;

import java.util.*;

public class AList {

    public static void main(String[] args) {

        /*
           ArrayList
              - for faster random access to the elements.
              - freq read n less modified.
              - used for sorting & manipulations.
              - it's a dynamic array.
              - maintains order of insertion.
              - not thread safe.
         */

        int[] a ={4,5,1,0,6,76};

        List<Integer> l = new ArrayList<>();
          l.add(2);
          for(int i:a)
          {
              l.add(i);
          }
        System.out.println(l);
        System.out.println(l.contains(5));

        Collections.sort(l);
        System.out.println(l);

     Collection<String> collection = new ArrayList<>();
        collection.add("Java");
        collection.add("Python");
        collection.add("C++");
        System.out.println("Initial Collection: " + collection);

        Collection<String> newElements = new ArrayList<>();
        newElements.add("Ruby");
        newElements.add("JavaScript");

        collection.addAll(newElements);
        for (String s : collection) {
            System.out.println(s);
        }
        System.out.println(collection.contains("Ruby"));
         Object[] st =collection.toArray();











    }

}
