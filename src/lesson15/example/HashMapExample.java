package lesson15.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static lesson15.example.Genre.LOVE_STORY;
import static lesson15.example.Genre.NON_FICTION;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String, Book> bookMap = new HashMap<>();

        String key1 = "favorite1";
        String key2 = "favorite2";
        String key3 = "favorite3";
        String key4 = "favorite4";
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());
        System.out.println(key3.hashCode());
        System.out.println(key4.hashCode());
        System.out.println();
        System.out.println(key1.hashCode() % 16);
        System.out.println(key2.hashCode() % 16);
        System.out.println(key3.hashCode() % 16);
        System.out.println(key4.hashCode() % 16);
        bookMap.put(key1, new Book(1, "Java Basics", "Bloch", NON_FICTION));
        bookMap.put(key2, new Book(1, "Java Philosophy", "Bloch", NON_FICTION));
        bookMap.put(key3, new Book(1, "Java 14", "Bloch", NON_FICTION));
        bookMap.put(key4, new Book(1, "Java OOP", "Bloch", NON_FICTION));

        Set<Map.Entry<String, Book>> entries = bookMap.entrySet();

        Iterator<Map.Entry<String, Book>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Book> book = iterator.next();
            System.out.println("Key: " + book.getKey() + " Value: " + book.getValue());
        }

        Set<String> keys = bookMap.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println(bookMap.containsKey("favorite3")); // true
        System.out.println(bookMap.containsKey("favorite5"));
        ;


        Book abcBook = bookMap.getOrDefault(key1, new Book(2, "ABC", "", LOVE_STORY));
        System.out.println(abcBook);

        System.out.println();

//        bookMap.remove()

    }

}
