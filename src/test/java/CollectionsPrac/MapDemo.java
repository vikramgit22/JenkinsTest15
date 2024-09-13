package CollectionsPrac;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"2");
        map.put(2,"3");

       for(Map.Entry e: map.entrySet())
       {
           System.out.println(e.getKey() + "  "+ e.getValue());
       }

       if(map.containsKey(1)) {
           System.out.println("found");
       }
       else if(!map.isEmpty())
       {
           map.remove(2);
       }

        System.out.println(map);

    }




}
