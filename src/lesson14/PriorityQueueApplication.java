package lesson14;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueApplication {
    public static void main(String[] args) {

        // simple queue

//        Queue<String> strings = new PriorityQueue<>();
////        strings.add("F");
////        strings.add("D");
////        strings.add("B");
////        strings.add("A");
////        strings.add("C");
////        strings.add("E");
////        strings.add("E");
//
//        for (String str: strings) {
//            System.out.println(str);
//        }


        // queue with persons with comparator
        Queue<Person> persons = new PriorityQueue<>();
        Person olga = new Person("Olga", 25);
        Person anna = new Person("Anna", 22);
        Person andriy = new Person("Andriy", 21);
        Person andriy3 = new Person("Andriy", 27);
        Person andriy2 = new Person("Andriy", 20);
        Person oleg = new Person("Oleg", 23);
        Person mykola = new Person("Mykola", 21);
        Person[] people = {mykola, andriy, oleg, olga, andriy2, andriy3, anna};
        for (Person p : people) {
            persons.add(p);
        }

        System.out.println();


        System.out.println("From PriorityQueue:");
        for (Person p : persons) {
            System.out.println(p);
        }

        System.out.println();
        System.out.println("From poll:");
        int size = persons.size();
        for (int i = 0; i < size; i++) {
            System.out.println(persons.poll());
        }

//        System.out.println();
//        Queue<Person> persons2 = new PriorityQueue<>();
//
//        for (Person p : people) {
//            persons2.add(p);
//        }
//
//        System.out.println("From PriorityQueue with Comparable:");
//        for (Person p : persons2) {
//            System.out.println(p);
//        }

    }
}