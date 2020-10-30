package lesson14.example;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        SortedSet<String> names = new TreeSet<>();

        names.add("Nazar");
        names.add("Nazar");
        names.add("Vlad");
        names.add("Sasha K.");
        names.add("Oleh");
        names.add("Sasha V.");

        System.out.println(names);

        SortedSet<Book> books = new TreeSet<>();

        books.add(new Book("Java  14", "Bloch", 2019));
        books.add(new Book("Java  13", "Gosling", 2018));
        books.add(new Book("Java  13", "Bloch", 2018));
        books.add(new Book("Java  13", "Richardson", 2018));

        System.out.println();
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println();

        System.out.println();
        SortedSet<String> subSet = names.subSet("Oleh", "Sasha V.");

        System.out.println(subSet);

        System.out.println();

        Comparator<? super String> comparator = subSet.comparator();


    }
}
