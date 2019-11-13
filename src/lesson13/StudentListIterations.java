package lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentListIterations {
    public static void main(String[] args) {
        // create list of students

        // get list iterator

        // while hasNext show

        // has previous

        // add if course is > 5

        // show difference when to add

        // if age is < 25 remove

        // show all

        // show previousIndex

        // set


        List<Student> students = new ArrayList<>();
        students.add(new Student(2, "Peter", 23));
        students.add(new Student(1, "Adrew", 33));
        students.add(new Student(3, "Levan", 19));
        students.add(new Student(5, "Pavlo", 42));
        students.add(new Student(4, "Joseph", 55));


        ListIterator<Student> listIterator = students.listIterator();

        while (listIterator.hasNext()) {
            Student next = listIterator.next();
            if (next.getLevel() == 5) {
                listIterator.set(new Student(6, "Albus", 70));
            }
            System.out.println(next);
        }
        System.out.println();

        while (listIterator.hasPrevious()) {
            Student previous = listIterator.previous();

            if (previous.getLevel() == 5) {

                listIterator.add(new Student(6, "Albus", 70));
            }
        }

        while (listIterator.hasNext()) {
            Student next = listIterator.next();
            System.out.println(next);
        }
        System.out.println();


    }
}
