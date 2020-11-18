package lesson22.example.optional;

import lesson22.example.method_reference.Person;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {

        Person person = new Person("Nazar", 25);
        Person personEmpty = null;

        Optional<Person> optionalPerson = Optional.of(new Person("Nazar", 25));
        Optional<Person> optionalPersonEmpty = Optional.ofNullable(null);

        System.out.println(person.getName());
        if (personEmpty != null) {
            System.out.println(personEmpty.getName());
        } else {
            System.out.println("Person is null");
        }

        optionalPerson.ifPresent(System.out::println);

        Person person1 = optionalPerson.get();
        System.out.println(person1);

        Person person2 = optionalPersonEmpty.orElse(new Person("Oleh", 19));
        System.out.println(person2);

        Person person3 = optionalPersonEmpty.orElseGet(() -> new Person("Vlad", 18));
        System.out.println(person3);

        optionalPersonEmpty.orElseThrow(RuntimeException::new);

    }
}
