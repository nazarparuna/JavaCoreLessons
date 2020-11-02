package lesson15.example;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Key, String> stringTreeMap = new TreeMap<Key, String>();

        Key key1 = new Key(1, "name1");
        Key key2 = new Key(3, "name2");
        Key key3 = new Key(3, "name3");
        Key key4 = new Key(3, "name4");
        Key key5 = new Key(5, "name3");
        Key key6 = new Key(6, "name3");

        stringTreeMap.put(key6, "value6");
        stringTreeMap.put(key2, "value2");
        stringTreeMap.put(key4, "value4");
        stringTreeMap.put(key5, "value5");
        stringTreeMap.put(key1, "value1");
        stringTreeMap.put(key3, "value3");

        for (Map.Entry<Key, String> keyStringEntry : stringTreeMap.entrySet()) {
            System.out.println("Key: " + keyStringEntry.getKey() + " Value: " + keyStringEntry.getValue());
        }

        System.out.println(stringTreeMap.get(key1));


        System.out.println(stringTreeMap.containsValue("value2"));
        System.out.println(stringTreeMap.containsValue("value5"));


    }
}
