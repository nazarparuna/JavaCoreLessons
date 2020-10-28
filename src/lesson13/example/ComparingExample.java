package lesson13.example;

import java.util.*;

public class ComparingExample {

    public static void main(String[] args) {
        Programmer[] programmersArray = {
                new Programmer("Nazar", 20000),
                new Programmer("Vlad", 1000),
                new Programmer("Nazar", 1900),
                new Programmer("Sasha", 2500),
                new Programmer("Sasha", 2000),
                new Programmer("Oleh", 500)
        };

        List<Programmer> programmers = new ArrayList<>(Arrays.asList(programmersArray));

        for (Programmer programmer : programmers) {
            System.out.println(programmer);
        }

        System.out.println();

//        SalaryComparator comparator = new SalaryComparator();
//        programmers.sort(comparator);

        Collections.sort(programmers);

        for (Programmer programmer : programmers) {
            System.out.println(programmer);
        }

        System.out.println();

        programmers.sort(new NameComparator());

        for (Programmer programmer : programmers) {
            System.out.println(programmer);
        }

        System.out.println();

        programmers.sort(new ProgrammerComparator());
        for (Programmer programmer : programmers) {
            System.out.println(programmer);
        }

        System.out.println();


    }
}
