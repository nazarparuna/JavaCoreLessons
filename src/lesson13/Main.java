package lesson13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // create list of Strings
        List<String> names = new ArrayList<>();

        names.add("Ivan");
        names.add("Yuriy");
        names.add("Mykola");
        names.add("Maria");
        names.add("Olga");
        names.add("Andriy");
        names.add("Oleg");


        // get Iterator

        Iterator<String> iterator = names.iterator();

        // go through collection in cycle, print elements

        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
        System.out.println();

        Iterator<String> iterator2 = names.iterator();


        while (iterator2.hasNext()) {
            String item = iterator2.next();
            System.out.println(" - " + item);
        }
        System.out.println();

        // go through collection, remove element

        Iterator<String> iterator3 = names.iterator();


        while (iterator3.hasNext()) {
            if (iterator3.next().equalsIgnoreCase("Olga")) {
                iterator3.remove();
            }
        }
        System.out.println();

        Iterator<String> iterator4 = names.iterator();

        while (iterator4.hasNext()) {
            String item = iterator4.next();
            System.out.println(" - " + item);
        }
        System.out.println();

//        for (String name : names) {
//            names.remove(name);
//        }

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equalsIgnoreCase("Olga")) {
                names.remove(i);
            }
        }


        for (String name : names) {
            System.out.println(name);
        }


        // show elements which still in collection


    }
}
