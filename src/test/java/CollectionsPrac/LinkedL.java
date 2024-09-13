package CollectionsPrac;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedL {


    /*
          Dynamic size,
          efficient insertion n deletion
          memory overhead
     */

    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();
        s.add("hi");
        s.add("45");

        Iterator<String> it = s.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        Iterator<String> di = s.descendingIterator();
        while(di.hasNext())
        {
            System.out.println(di.next());
        }

        System.out.println(s.lastIndexOf("4"));
        s.addFirst("20");
        s.addLast("100");
        System.out.println(s);
        String head = s.peek();
        //System.out.println(head);
        System.out.println(s.poll());
        System.out.println(s.pollLast());
        System.out.println(s.offerFirst("55"));
        System.out.println(s);
    }


}
