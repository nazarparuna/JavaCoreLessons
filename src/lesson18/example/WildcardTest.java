package lesson18.example;

import java.util.Arrays;
import java.util.List;

public class WildcardTest {
    public static void main(String[] args) {

        Integer[] ints = {1, 2, 3, 4, 5};
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List<String> strings = Arrays.asList("first", "second", "third", "fourth");

        printList(integers);
        System.out.println();
        printList(strings);
    }

    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

}
