package lesson22;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ApplicationFunctionalInterface {

    public static void main(String[] args) {

        // create list of integer

        List<Integer> integers = Arrays.asList(-3, -2, -1, 0, 1, 2, 3);


        // predicate
        Predicate<Integer> predicate = x -> x > 0;
        System.out.println(predicate.test(4));
        System.out.println(predicate.test(-44));

        System.out.println();
        showElements(integers, predicate);
        System.out.println();
        showElements(integers, x -> x % 2 == 0);
        System.out.println();
        showElements(integers, x -> x == 0);

        System.out.println();
        integers.stream().filter(predicate).forEach(x -> System.out.println(x));

        // consumer
        Consumer<Integer> consumer = x -> {
            int y = x + 100;
            System.out.println(y);
        };

        System.out.println();
        integers.forEach(consumer);

        // function
        Function<Integer, String> function = x -> String.valueOf(x);
        System.out.println();
        changeType(integers, function);

        // supplier
        Supplier<String> supplier = () -> {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        };
        System.out.println();
        String string = supplier.get();
        System.out.println("Supplier returns " + string);

        // write method which takes functional interface

//        integers.stream().collect()


    }

    private static void changeType(List<Integer> integers, Function<Integer, String> function) {
        for (Integer item : integers) {
            String string = function.apply(item);
            System.out.println("String is " + (string + 1));
        }
    }

    private static void showElements(List<Integer> integers, Predicate<Integer> predicate) {
        for (Integer item : integers) {
            if (predicate.test(item)) {
                System.out.println(item);
            }
        }
    }
}

@FunctionalInterface
interface Phone {

    int add();

}