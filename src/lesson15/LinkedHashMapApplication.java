package lesson15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApplication {
    public static void main(String[] args) {

        // create  linked hash map (string, integer)
        Map<String, Integer> map = new LinkedHashMap<>();

        // add elements to map
        map.put("Andriy", 10);
        map.put("Oleg", 56);
        map.put("Vasyl", 5);
        map.put("Nazar", 32);

        // show elements
        System.out.println(map);

        // change  access order
        Map<String, Integer> map2 = new LinkedHashMap<>(16, 0.75f, true);
        map2.put("Andriy", 10);
        map2.put("Oleg", 56);
        map2.put("Vasyl", 5);
        map2.put("Nazar", 32);

        System.out.println(map2);
        map2.get("Oleg");
        System.out.println(map2);


        // iterator

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println(next.getKey() + " - " + next.getValue());
        }

        System.out.println();

        Iterator<String> keyIterator = map.keySet().iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            if (key.equalsIgnoreCase("Oleg")) {
                keyIterator.remove();
            }
        }

        System.out.println();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }

        Iterator<Integer> valueIterator = map.values().iterator();

        while (valueIterator.hasNext()) {
            System.out.println(valueIterator.next());
        }

        // get entry set

        // show all in foreach

        // get value by key

        // contains

        // values

        // keys

        // containsValue

        // create new hash map

        // make link to first map

        // compare both maps

        // getOrDefault

        // remove and show

        // size

        // replace on null

        // putIfAbsent

        // clear

    }
}
