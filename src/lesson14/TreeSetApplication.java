package lesson14;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetApplication {
    public static void main(String[] args) {

        // tree set with strings
        Set<String> strings = new TreeSet<>();
        strings.add("F");
        strings.add("D");
        strings.add("B");
        strings.add("A");
        strings.add("C");
        strings.add("E");

        for (String s : strings) {
            System.out.println(s);
        }

        // tree set with persons

        Set<Person> personSet = new TreeSet<>();
        Person olga = new Person("Olga", 21);
        Person anna = new Person("Anna", 21);
        Person andriy = new Person("Andriy", 21);
        Person andriy3 = new Person("Andriy", 21);
        Person andriy2 = new Person("Andriy", 20);
        Person oleg = new Person("Oleg", 23);
        Person mykola = new Person("Mykola", 21);
        Person[] people = {mykola, andriy, oleg, olga, andriy2, andriy3, anna};
        for (Person p : people) {
            personSet.add(p);
        }

        // foreach to show
        System.out.println("From TreeSet:");
        for (Person p : personSet) {
            System.out.println(p);
        }

        // comparable or comparator
        Set<Person> personComparableSet = new TreeSet<>(new AgePersonComparator());
        for (Person p : people) {
            personComparableSet.add(p);
        }

        // foreach to show
        System.out.println();
        System.out.println("From TreeSet:");
        for (Person p : personComparableSet) {
            System.out.println(p);
        }



    }
}
