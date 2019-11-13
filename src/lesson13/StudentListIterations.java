package lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentListIterations {
    public static void main(String[] args) {
        // create list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(2, "Peter", 23));
        students.add(new Student(1, "Adrew", 33));
        students.add(new Student(3, "Levan", 19));
        students.add(new Student(5, "Pavlo", 42));
        students.add(new Student(4, "Joseph", 55));

        // get list iterator

        ListIterator<Student> studentListIterator = students.listIterator();

        // while hasNext show

        while (studentListIterator.hasNext()) {
            Student next = studentListIterator.next();
//            if (next.getLevel() >= 4) {
//                studentListIterator.add(new Student(1, "Leonid", 40));
//            }
        }
        System.out.println();

        // has previous
        while (studentListIterator.hasPrevious()) {
            Student previous = studentListIterator.previous();
            if (previous.getLevel() >= 4) {
                studentListIterator.add(new Student(2, "Oxana", 25));
            }
        }
        System.out.println();


        while (studentListIterator.hasNext()) {
            System.out.println(studentListIterator.next());
        }
        System.out.println();

        // add if course is > 5


        // show difference when to add

        // if age is < 25 remove

        // show all

        // show previousIndex

        // set
        System.out.println();
        while (studentListIterator.hasPrevious()) {
            Student previous = studentListIterator.previous();
            if (previous.getLevel() == 3) {
                studentListIterator.set(new Student(3, "Igor", 27));
            }
        }

        while (studentListIterator.hasNext()) {
            System.out.println(studentListIterator.next());
        }
        System.out.println();


    }
}
