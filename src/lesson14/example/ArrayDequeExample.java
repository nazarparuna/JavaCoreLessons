package lesson14.example;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Queue<String> names = new ArrayDeque<>();

        names.add("123");
        names.add("2");
        names.add("6");
        names.add("43534");
        names.add("ds");
        names.add("dsf");
        names.add("43dvsd");

        System.out.println(names);

        String element = names.poll();
        System.out.println(element);
        System.out.println(names);

        names.clear();

        String peek = names.peek();
        System.out.println(peek);
        System.out.println(names);


    }
}
