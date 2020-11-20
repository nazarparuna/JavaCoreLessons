package lesson23.example.functional_interfaces;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class FunctionalInterfacesTest {
    public static void main(String[] args) {
        System.out.println("Unary operator:");
        UnaryOperator<Integer> incrementor = x -> x + 1;
        System.out.println(incrementor.apply(5));

        System.out.println();
        System.out.println("Binary operator: ");
        BinaryOperator<Integer> summator = (x, y) -> x + y;
        System.out.println(summator.apply(1, 3));

        Comparator<Book> bookComparator = (book1, book2) -> Double.compare(book1.getPrice(), book2.getPrice());

        Book book1 = new Book(1, "Kobzar", "Shevchenko", 1841, 150);
        Book book2 = new Book(3, "Perekhresni stezhky", "Franko", 1889, 120);
        Book book3 = new Book(2, "Chornyi voron", "Shkliar", 2012, 145);
        Book book4 = new Book(0, "Zemlia", "Kobylianska", 1900, 160);

        int result = bookComparator.compare(book1, book4);
        System.out.println();
        System.out.println("Result of comparing:");
        System.out.println(result);

        BiFunction<Integer, Long, Double> biFunction = (x, y) -> Double.valueOf(x + y);
        System.out.println();
        System.out.println("BiFunction example:");
        System.out.println(biFunction.apply(3, 1000L));


    }
}
