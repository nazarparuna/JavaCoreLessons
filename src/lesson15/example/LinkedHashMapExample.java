package lesson15.example;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> stringMap = new LinkedHashMap<>();

        stringMap.put(2, "fdsjsdklj");
        stringMap.put(42, "fdsjs21312dklj");
        stringMap.put(22, "fdsjs12312dklj");
        stringMap.put(26, "fdsjsdklj");
        stringMap.put(28, "111111111");

        for (Map.Entry<Integer, String> entry : stringMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        Collection<String> values = stringMap.values();

        for (String value : values) {
            System.out.println(value);
        }


    }
}
