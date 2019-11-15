package lesson14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetApplication {
    public static void main(String[] args) {

        // create hash set
        Set<Double> doubleSet = new HashSet<>();


        // add elements
        doubleSet.add(1.9);
        doubleSet.add(2.5);
        doubleSet.add(3.4);
        doubleSet.add(5.7);

        // toString
        System.out.println(doubleSet);

        // contains
        System.out.println(doubleSet.contains(2.5));
        System.out.println(doubleSet.contains(2.5000001));


        // isEmpty
        System.out.println(doubleSet.isEmpty()); // false
        System.out.println(new HashSet<>().isEmpty()); // true


        // size
        System.out.println(doubleSet.size());


        // create second set

        Set<Double> secondDoubleSet = new HashSet<>();




        // add elements to second set
        secondDoubleSet.add(0.6);
        secondDoubleSet.add(1.9);
        secondDoubleSet.add(5.5);
        secondDoubleSet.add(2.5);
        secondDoubleSet.add(5.7);


        // retailAll

        System.out.println(doubleSet);
        doubleSet.retainAll(secondDoubleSet);

        System.out.println(doubleSet);


        // clear
        doubleSet.clear();
        System.out.println(doubleSet);


        // second set toArray
        Object[] doubles = secondDoubleSet.toArray();


        // Arrays - toString
        System.out.println(Arrays.toString(doubles));


        // iterator
        Iterator<Double> iterator = secondDoubleSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // iterator remove
        Iterator<Double> iterator2 = secondDoubleSet.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next < 2) {
                iterator2.remove();
            }
        }

        System.out.println();
        // after removing
        Iterator<Double> iterator3 = secondDoubleSet.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }

        // create set of strings with the same values
        Set<String> strings = new HashSet<>();
        strings.add("B");
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("E");
        strings.add("A");
        strings.add("D");
        strings.add("D");

        System.out.println();
        System.out.println(strings.size());
        for (String str : strings) {
            System.out.println(str);
        }

        // create set of persons
        Set<Person> persons = new HashSet<>();
        Person andriy = new Person("Andriy", 20);
        Person andriy2 = new Person("Andriy", 20);
        Person andriy3 = new Person("Andriy", 21);

        System.out.println("Hashcodes:");
        System.out.println(andriy.hashCode());
        System.out.println(andriy2.hashCode());
        System.out.println(andriy3.hashCode());

        System.out.println();
        persons.add(andriy);
        persons.add(andriy2);
        persons.add(andriy3);


        System.out.println();
        System.out.println(persons.size());
        for (Person str : persons) {
            System.out.println(str);
        }

    }
}
