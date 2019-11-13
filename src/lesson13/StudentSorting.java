package lesson13;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentSorting {
    public static void main(String[] args) {
        // list of students

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nazar", 24));
        students.add(new Student(2, "Mykola", 17));
        students.add(new Student(5, "Valentyn", 18));
        students.add(new Student(4, "Oleg", 28));
        students.add(new Student(3, "Maria", 20));
        students.add(new Student(5, "Maria", 16));
        students.add(new Student(5, "Maria", 14));
        students.add(new Student(1, "Andriy", 44));
        students.add(new Student(6, "Roman", 85));

        // before sorting
        System.out.println("Before sorting:");
        Iterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        // sorting using Comparable
        System.out.println("After sorting:");

//        Collections.sort(students);
//        Collections.sort(students, new AgeStudentComparator());
//        Collections.sort(students, new NameStudentComparator());
        Collections.sort(students, new AllFieldsStudentComparator());
        Collections.reverse(students);

        Iterator<Student> listIterator = students.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println();





        // sorting using age Comparator

        // sorting using name Comparator

        // sorting using all fields Comparator

    }
}
