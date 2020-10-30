package lesson14.example;

import lesson11.example.Human;

import java.util.*;

public class HashSetAndLinkedHashSetExample {
    public static void main(String[] args) {
        Set<Human> humans = new HashSet<>();

        Set<String> strings = new HashSet<>();

        strings.add("10");
        strings.add("2");
        strings.add("56");
        strings.add("6");
        strings.add("7");
        strings.add("18");
        strings.add("28");
        strings.add("8");
        strings.add("0");
        strings.add("0");
        strings.add("0");


        System.out.println(strings);

        System.out.println(strings.isEmpty()); // false
        System.out.println(strings.size());

//        strings.clear();

        System.out.println(strings.isEmpty()); // true
        System.out.println(strings.size());

        System.out.println();

//        strings.retainAll(Arrays.asList("2", "6", "100"));

        System.out.println(strings);

        strings.remove("56");

        System.out.println(strings);

        Set<String> clonedSet = strings;

        boolean result = strings.equals(Arrays.asList("10", "2", "6", "7", "18", "28", "8", "0"));

        System.out.println("Collections are equals : " + result);

        boolean result2 = Arrays.deepEquals(strings.toArray(), new String[]{"10", "2", "6", "7", "18", "28", "8", "0"});

        System.out.println(result2);

        System.out.println("Comparing the same sets");
        System.out.println(strings.equals(clonedSet));

        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("7")) {
//                Spliterator<String> spliterator = strings.spliterator();
//                spliterator.forEachRemaining(System.in::);
            }
        }


    }
}
