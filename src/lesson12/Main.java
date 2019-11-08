package lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // методи ліста

        // методи ArrayList

        ArrayList<String> arrayList = new ArrayList<>();
//        ArrayList arrayList = new ArrayList<String>();
        arrayList.add("Hello, world!");
        System.out.println(arrayList.size());

        ArrayList<String> strings = new ArrayList<>(arrayList);
        System.out.println(strings);




        // size


        // вставка

        strings.add("123");
        System.out.println(strings);

        strings.add(1, "First");
        System.out.println(strings);

        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("2");
        strings1.add("3");
        strings.addAll(strings1);
        System.out.println(strings);

        // addAll

        // clear
//        strings.clear();
        System.out.println(strings);

        // contains
        System.out.println("String \"2\" is present in List: " + strings.contains("2"));
        System.out.println("String \"2\" is not present in List: " + strings.contains("4"));

        // equals
        ArrayList<String> strings2 = new ArrayList<>(strings);

        System.out.println("Lists are the same " + strings.equals(strings2));
        System.out.println("Lists are not the same " + strings.equals(strings1));

        // remove
        System.out.println(strings);
        strings.remove("3");
        System.out.println(strings);

        // get

        System.out.println(strings.get(1));

        // get поза межами
//        System.out.println(strings.get(100));



        // створення з масиву

        Integer[] integers = {1, 3, -5};
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(integers));
        System.out.println(integerArrayList);

        // subList
        System.out.println(strings);
        System.out.println(strings.subList(2, 3));

        /*
        Linked List
         */

        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add("Element " + i);
        }
        System.out.println(linkedList);

        // add

        // get
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        // addFirst

        // addLast

        // offer
        System.out.println(linkedList);
        linkedList.offer("Offered Element");
        System.out.println(linkedList);

        // poll / pollLast
        System.out.println(linkedList);
        System.out.println(linkedList.poll());
        System.out.println(linkedList);


    }
}
