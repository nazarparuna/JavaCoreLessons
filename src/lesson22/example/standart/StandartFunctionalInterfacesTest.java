package lesson22.example.standart;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StandartFunctionalInterfacesTest {
    public static void main(String[] args) {
        Consumer<String> consumer = value -> {
            System.out.println(value.getClass().getSimpleName());
            System.out.println(value);
        };

        Consumer<String> substringConsumer = x -> System.out.println(x.substring(0, 3));

        consumer.accept("Hello, world!");
        System.out.println("Aggregation example");
        consumer.andThen(substringConsumer).accept("1, 2, 3, 4, 5.");

        System.out.println("Predicate example:\n");

        List<Integer> integerList = Arrays.asList(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5);
        Predicate<Integer> integerPredicate = x -> x % 2 == 0;

        System.out.println("Before filtering:");
        integerList.forEach(x -> System.out.println(x));
        System.out.println("After filtering:");
//        integerList.removeIf(integerPredicate);
//        integerList.forEach(x -> System.out.println(x));

        showElements(integerList, integerPredicate);

        System.out.println("Function example:\n");
        Function<Integer, String> function = (x) -> String.valueOf(x);

        convertElements(integerList, function);

        System.out.println("Supplier example:\n");

        Supplier<Integer> supplier = () -> {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        };

        System.out.println(supplier.get());

    }

    private static void convertElements(List<Integer> integerList, Function<Integer, String> function) {
        integerList.forEach(x -> {
            System.out.println(function.apply(x) + 1);
        });
    }

    private static void showElements(List<Integer> integerList, Predicate<Integer> integerPredicate) {
        integerList.forEach(x -> {
            if (integerPredicate.test(x)) {
                System.out.println(x);
            }
        });
    }
}
