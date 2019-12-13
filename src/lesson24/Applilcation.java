package lesson24;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.reverseOrder;

public class Applilcation {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 6, 7, 8, 1, 4, -3);
        intStream.sorted().forEach(System.out::println);
        System.out.println();
        Stream<Integer> integerStream = Stream.of(1, 2, 6, 7, 8, 1, 4, -3);
        integerStream.sorted(reverseOrder()).forEach(System.out::println);
//        DifferentClass differentClass = new DifferentClass();
//        System.out.println(differentClass);
//        new DifferentClass();

    }
}

class DifferentClass {
    String str;
    int num;

    {
        System.out.println("Hello, people!");
    }

    static {
        System.out.println("Static call");
    }

    @Override
    public String toString() {
        return "DifferentClass{" +
                "str='" + str + '\'' +
                ", num=" + num +
                '}';
    }
}
