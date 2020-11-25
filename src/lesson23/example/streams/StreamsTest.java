package lesson23.example.streams;

import lesson23.example.functional_interfaces.Book;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest {

    public static void main(String[] args) {

        Book book1 = new Book(1, "Kobzar", "Shevchenko", 1841, 150);
        Book book2 = new Book(3, "Perekhresni stezhky", "Franko", 1889, 120);
        Book book3 = new Book(2, "Chornyi voron", "Shkliar", 2012, 145);
        Book book4 = new Book(0, "Zemlia", "Kobylianska", 1900, 160);
        List<Book> books = Arrays.asList(book1, book2, book3, book4);

        Stream<Integer> integerStream = Stream.of(-2, -1, 0, 1, 2, 3, 4);
        integerStream.forEach(System.out::println);
//        integerStream.forEach(System.out::println);

        System.out.println();
        System.out.println("Another stream:");
        Stream<Object> stream = Stream.builder()
                                      .add(1)
                                      .add(4)
                                      .add(-3)
                                      .build();

        stream.forEach(System.out::println);
        System.out.println();
        System.out.println("Stream from array:");
        int[] array = {29, 7, 0, -4, 2, 5, -4, 0, 10, 2, 3, 4, 6, 6, 7};
        IntStream stream1 = Arrays.stream(array);

        stream1.forEach(System.out::println);
        System.out.println();
        System.out.println("Stream from list:");
        books.stream().forEach(System.out::println);

        System.out.println();
        System.out.println("Map example:");
        Stream<String> authors = books.stream().map(book -> book.getAuthor());
        authors.forEach(System.out::println);

        System.out.println();
        System.out.println("Filter example:");
        books.parallelStream().filter(b -> b.getPrice() >= 150).forEach(System.out::println);

        System.out.println();
        System.out.println("Find first example:");
        Optional<Book> first = books.parallelStream().filter(b -> b.getId() > 0).findFirst();
        System.out.println(first.get());

        System.out.println();
        System.out.println("toArray example:");
//        Object[] objects = books.stream().toArray();
        Book[] books1 = books.stream().toArray(Book[]::new);
        System.out.println(Arrays.deepToString(books1));

        System.out.println();
        System.out.println("collect example:");
        Set<Book> collect = books.stream().filter(b -> b.getYear() >= 1900).collect(Collectors.toSet());
        collect.forEach(System.out::println);

        System.out.println();
        System.out.println("collect map example:");
        Map<String, Book> collect1 = books.stream().filter(b -> b.getYear() >= 1900).collect(Collectors.toMap(Book::getName, b -> b));
        collect1.forEach((k, v) -> System.out.format("%s : %s\n", k, v));

        System.out.println();
        System.out.println("reduce example:");
        OptionalInt reduce = Arrays.stream(array).reduce((x, y) -> x + y);
        System.out.println(reduce.getAsInt());
        int reduce1 = Arrays.stream(array).reduce(10, (x, y) -> x + y);
        System.out.println(reduce1);

        System.out.println();
        System.out.println("Limit example:");
        books.parallelStream().limit(2).forEach(System.out::println);

        System.out.println();
        System.out.println("Skip and limit example:");
        books.stream().skip(1).limit(2).forEach(System.out::println);

        System.out.println();
        System.out.println("sorted example:");
        Arrays.stream(array).sorted().forEach(System.out::println);

        System.out.println();
        System.out.println("min example:");
        int asInt = Arrays.stream(array).min().getAsInt();
        System.out.println(asInt);

        System.out.println();
        System.out.println("max example:");
        int asInt2 = Arrays.stream(array).max().getAsInt();
        System.out.println(asInt2);

        System.out.println("additional");

        System.out.println();
        System.out.println("distinct example:");
        Arrays.stream(array).distinct().sorted().forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(0, 1, 2, 4);

        System.out.println();
        System.out.println("allMatch example:");
        boolean allIsEven = numbers.stream().allMatch(x -> x % 2 == 0);
        System.out.println(allIsEven);

        System.out.println();
        System.out.println("noneMatch example:");
        boolean noneIsEven = numbers.stream().noneMatch(x -> x % 2 == 0);
        System.out.println(noneIsEven);

        System.out.println();
        System.out.println("anyMatch example:");
        boolean anyIsEven = numbers.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(anyIsEven);

        System.out.println();
        System.out.println("count example:");
        long count = numbers.stream().count();
        System.out.println(count);
    }
}
