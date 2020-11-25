package lesson24.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.toList;

public class Lesson24Test {
    public static void main(String[] args) {
        Foo foo = x -> "Hello, " + x;
        System.out.println(foo.method("Nazar"));
        UnaryOperator unaryOperator = x -> "Hello, " + x;
        System.out.println(unaryOperator.apply("Nazar"));

        System.out.println();
        List<String> strings = Arrays.asList("Nazar", "Oleh", "Vlad", "Sasha", "V");

        strings.stream()
               .filter(s -> s.length() > 2)
               .sorted(reverseOrder())
               .map(s -> s.substring(0, 2))
               .collect(toList())
               .forEach(System.out::println);

        System.out.println();
        System.out.println("Students sorting:");
        List<Student> students = new ArrayList<>();

        Student nazar = new Student(1, "Nazar", "Paruna", 25);
        System.out.println(nazar);
        students.add(nazar);
        students.add(new Student(4, "Oleh", "Z", 19));
        students.add(new Student(0, "Vlad", "K", 18));
        students.add(new Student(7, "Sasha", "K", 20));

        List<Student> collect = students.stream()
                                        .sorted(comparing(Student::getId))
                                        .collect(toList());

        collect.forEach(System.out::println);

    }
}
