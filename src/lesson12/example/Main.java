package lesson12.example;

import lesson11.example.Human;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(20);

        for (int i = 0; i < 10; i++) {
            list.add(UUID.randomUUID().toString());
        }

        for (String s : list) {
            System.out.println(s);
        }

        list.add(10, "new line");

        String new_new_line = list.set(10, "new new line");

        System.out.println(new_new_line);

        list.addAll(Arrays.asList("first", "Second"));


        Iterator<String> iterator = list.iterator();
        System.out.println(list.size());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ListIterator<String> stringListIterator = list.listIterator();

        List<Human> humans = new ArrayList<Human>();

        List list2 = new ArrayList();

        list2.add("dfsdfsd");
        list2.add(new Human("Nazar", 12));
        for (Object o : list2) {
            System.out.println();
        }


//        ListIterator<Human> humanListIterator = humans.listIterator();
//        humanListIterator.


        List<String> linkedList = new LinkedList<>(Arrays.asList("2", "4", "7", "1", "2", "3"));

        Collections.sort(linkedList);

        for (String s : linkedList) {
            System.out.println(s);
        }

        Iterator<String> linkedIter = linkedList.iterator();

//        while (linkedIter.hasNext()){
//            for
//        }

        String s = linkedList.get(0);


        List<Integer> integerList = new ArrayList<>();

    }
}
