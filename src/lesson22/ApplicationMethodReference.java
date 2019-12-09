package lesson22;

import lesson11.Person;

import java.util.Arrays;
import java.util.List;

public class ApplicationMethodReference {
    public static void main(String[] args) {

        // create list of string

        List<String> names = Arrays.asList("Nazar", "Petro", "Pavlo", "Demian");

        // print all with method reference
        names.forEach(x -> System.out.println(x));
        System.out.println();
        names.forEach(System.out::println);

        System.out.println();

        List<Person> people = Arrays.asList(new Person("Nazar", 24), new Person("Oleg", 21));
        people.forEach(Person::toString);

//        names.forEach(Person::new);

        // write personal method
        System.out.println();
        names.forEach(ApplicationMethodReference::print);

    }

    public static void print(String str) {
        System.out.println(str);
    }
}