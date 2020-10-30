package lesson14.example;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityQueue<>();

        numbers.add(3);
        numbers.add(13);
        numbers.add(43);
        numbers.add(0);
        numbers.add(6);
        numbers.add(9);

        System.out.println(numbers);


    }
}
