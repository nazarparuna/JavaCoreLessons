package lesson15;

import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapApplication {
    public static void main(String[] args) {

        // create tree map (int, string)

        SortedMap<Integer, String> treeMap = new TreeMap<>();

        // add elements
        treeMap.put(2, "Mykola");
        treeMap.put(1, "Andriy");
        treeMap.put(5, "Volodymyr");
        treeMap.put(16, "Olga");
        treeMap.put(4, "Igor");
        treeMap.put(7, "Stepan");
        treeMap.put(12, "Nazar");

        Iterator<Map.Entry<Integer, String>> treeMapIterator = treeMap.entrySet().iterator();
        while (treeMapIterator.hasNext()) {
            Map.Entry<Integer, String> next = treeMapIterator.next();
            System.out.println(next.getKey() + " : " + next.getValue());
        }

        // subMap
        System.out.println();
        System.out.println(treeMap.subMap(4, 12));

        // headMap
        System.out.println();
        System.out.println(treeMap.headMap(5));

        // tailMap
        System.out.println();
        System.out.println(treeMap.tailMap(7));


        // tree map with students
        SortedMap<Student, Integer> students = new TreeMap<>();

        students.put(new Student("Nazer", 14), 71);
        students.put(new Student("Oleg", 56), 81);
        students.put(new Student("Ivan", 46), 98);
        students.put(new Student("Ruslan", 24), 100);
        students.put(new Student("Igor", 18), 51);

        Iterator<Map.Entry<Student, Integer>> iter = students.entrySet().iterator();

        System.out.println();
        while (iter.hasNext()) {
            Map.Entry<Student, Integer> next = iter.next();
            System.out.println(next.getKey() + " has score " + next.getValue() + " points.");
        }

        SortedMap<Student, Integer> group = new TreeMap<>(new NameComparator());
        Iterator<Map.Entry<Student, Integer>> iter2 = students.entrySet().iterator();

        while (iter2.hasNext()) {
            Map.Entry<Student, Integer> next = iter2.next();
            group.put(next.getKey(), next.getValue());
        }

        System.out.println();
        Iterator<Map.Entry<Student, Integer>> groupIterator = group.entrySet().iterator();
        while (groupIterator.hasNext()) {
            Map.Entry<Student, Integer> next = groupIterator.next();
            System.out.println(next.getKey() + " has score " + next.getValue() + " points.");
        }


    }
}
