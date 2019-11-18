package lesson15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapApplication {
    public static void main(String[] args) {

        // create  hashmap (string, integer)

        Map<String, Integer> map = new HashMap<>();

        // add elements to map
        map.put("Andriy", 10);
        map.put("Oleg", 56);
        map.put("Vasyl", 5);
        map.put("Nazar", 32);


        // show elements
        System.out.println(map);

        // get entry set
        Set<Map.Entry<String, Integer>> entries = map.entrySet();


        System.out.println();
        // show all in foreach
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }

        // get value by key
        System.out.println(map.get("Oleg"));
        System.out.println(map.get("Oleg1"));

        // contains
        System.out.println(map.containsKey("Nazar"));
        System.out.println(map.containsValue(5));
        System.out.println(map.containsValue(55));

        // values
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }

        // keys
        System.out.println();
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }

        // containsValue

        // create new hash map
        Map<String, Integer> map2 = new HashMap<>();

        // make link to first map
        map2 = map;

        // compare both maps
        System.out.println();
        System.out.println(map.equals(map2));

        // getOrDefault
        System.out.println();
        System.out.println(map.get("Oleg1"));
        System.out.println(map.getOrDefault("Oleg1", 24));

        // remove and show
        map.remove("Nazar");
        System.out.println(map);

        // size
        System.out.println(map.size());

        // replace on null
        map.replace("Vasyl", 100);
        System.out.println();
        System.out.println(map);
        map.replace("Vasyl", null);
        System.out.println(map);

        // putIfAbsent
        map.putIfAbsent("Andriy", 20);
        map.putIfAbsent("Vasyl", 20);
        System.out.println(map);


        // clear
        map.clear();
        System.out.println(map);

    }
}
