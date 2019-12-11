package lesson23;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summarizingDouble;

public class ApplicationStreamAPI {
    public static void main(String[] args) throws IOException {

        // create collection of strings

        // create streams with of
        Stream<Integer> integerStream = Stream.of(-1, 0, 1, 2, 3, 4, 5, 3, 0, -9);


        // create streams from collection
        List<String> strings = Arrays.asList("a1", "a2", "a2", "a3", "a5");
        Stream<List<String>> listStream = Stream.of(strings);




        // create streams from array
        double[] doubles = {2.0, 5.4, 6.3, -1.6, 7.2};
        Stream<double[]> doublesStream = Stream.of(doubles);

        // stream builder
        Stream<Object> namesStream = Stream.builder().add("Nazar").add("Oleg").add("Valentyn").build();


        // from files
//        Stream<String> sheduleStream = Files.lines(Path);
////        sheduleStream.forEach(System.out::println);
////        System.out.println();

//        Files.walk(Paths.get("D:\\"))
//                .filter(Files::isRegularFile)
//                .forEach(System.out::println);

        System.out.println();

        /*
        Transit methods
         */

        List<Student> students = Arrays.asList(new Student("Nazar", 24, 1000, Status.ABITURIENT),
                new Student("Oleg", 26, 1200, Status.ABITURIENT),
                new Student("Valentyn", 18, 0, Status.MASTER),
                new Student("Tetiana", 20, 2500, Status.BACHELOR));


        students.stream().forEach(System.out::println);

        List<Integer> sholarships = students.stream().map(Student::getSholarship).collect(Collectors.toList());
        System.out.println(sholarships);


        // filter
        System.out.println();
        students.stream().filter(x -> x.getAge() >= 20).forEach(System.out::println);
        System.out.println();

        // find first
        Optional<Student> firstStudent = students.stream().filter(x -> x.getAge() >= 20).findFirst();
        System.out.println(firstStudent.get());
        System.out.println();

        Optional<Student> firstStudentInParalel = students.stream().parallel().filter(x -> x.getAge() >= 20).findFirst();
        System.out.println(firstStudentInParalel.get());
        System.out.println();


        Student[] studentArray = students.stream().filter(x -> x.getStatus() == Status.ABITURIENT).toArray(Student[]::new);
        System.out.println(studentArray);
        System.out.println();

        Map<String, Student> map = students.stream().collect(Collectors.toMap(x -> x.getName(), x -> x));
        Iterator<Map.Entry<String, Student>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println("Key: " + next.getKey() + " Value: " + next.getValue());
        }

        System.out.println();
        Map<Status, List<Student>> studentByStatus = students.stream().collect(groupingBy(Student::getStatus));
        Iterator<Map.Entry<Status, List<Student>>> iterator1 = studentByStatus.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Status, List<Student>> next = iterator1.next();
            System.out.println(next.getKey() + " Students: " + next.getValue());
        }


        Integer reduce = integerStream.reduce(0, (x, y) -> x + y);
//        integerStream.red
        System.out.println();
        System.out.println(reduce);

        students.stream().limit(2).forEach(System.out::println);

        // skip
        students.stream().skip(2).forEach(System.out::println);

        // count

        System.out.println();
        students.stream().sorted((x, y) -> x.getSholarship() - y.getSholarship()).forEach(System.out::println);

        System.out.println();
        System.out.println(students.stream().min((x, y) -> x.getAge() - y.getAge()).get());
        System.out.println(students.stream().max((x, y) -> x.getAge() - y.getAge()).get());

        System.out.println();
//        Stream<Integer> distinct = integerStream.distinct();
//        distinct.forEach(System.out.println(););
        System.out.println();
        System.out.println(students.stream().anyMatch(x -> x.getAge() == 24));
        System.out.println(students.stream().noneMatch(x -> x.getAge() > 30));
        System.out.println(students.stream().allMatch(x -> x.getAge() >= 18));

        long count = students.stream().count();
        System.out.println(count);
        System.out.println();
        // orElse


        // distinct

        // collect

        // map

        // peek

        students.stream().peek(x -> x.setAge(20)).forEach(System.out::println);

        // limit

        //sorted

        // flat map
//        integerStream.flatMap(x -> Stream.of(x, x+ 10)).forEach(System.out::println);

        // take while

//        students.stream().

        // drop while


        /*
        Terminal methods
         */

        // or else

        // any match

        // none match

        // all match

        // min

        // max

        // reduce

        // summary

    }
}

class Student {
    String name;
    int age;
    int sholarship;
    Status status;

    public Student(String name, int age, int sholarship, Status status) {
        this.name = name;
        this.age = age;
        this.sholarship = sholarship;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSholarship() {
        return sholarship;
    }

    public void setSholarship(int sholarship) {
        this.sholarship = sholarship;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sholarship=" + sholarship +
                ", status=" + status +
                '}';
    }
}