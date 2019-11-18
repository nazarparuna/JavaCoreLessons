package lesson14;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetApplication {
    public static void main(String[] args) {

        // create linked-hash set
        Set<Person> personSet = new LinkedHashSet<>();
        Person andriy = new Person("Andriy", 20);
        Person andriy2 = new Person("Andriy", 20);
        Person andriy3 = new Person("Andriy", 21);
        Person anna = new Person("Anna", 21);
        Person olga = new Person("Olga", 21);
        Person[] people = {andriy, andriy2, andriy3, anna, olga};
        for (Person p : people) {
            personSet.add(p);
        }

        // foreach to show
        System.out.println("From LinkedHashSet:");
        for (Person p : personSet) {
            System.out.println(p);
        }

        // create hash set
        Set<Person> personHashSet = new HashSet<>();

        for (Person p : people) {
            personHashSet.add(p);
        }

        // foreach to show
        System.out.println("From HashSet:");
        for (Person p : personHashSet) {
            System.out.println(p);
        }

    }
}
