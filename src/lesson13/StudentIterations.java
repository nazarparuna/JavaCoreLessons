package lesson13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentIterations {
    public static void main(String[] args) {

        // create class Student (name, age, course)

        // implements Comparable

        // create list of students

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Nazar", 24));
        students.add(new Student(2, "Mykola", 17));
        students.add(new Student(5, "Valentyn", 18));
        students.add(new Student(4, "Oleg", 28));
        students.add(new Student(3, "Maria", 20));
        students.add(new Student(1, "Andriy", 44));
        students.add(new Student(6, "Roman", 85));

        // get iterator

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student next = iterator.next();
            System.out.println(next);
        }
        System.out.println();

        // complex condition -> remove
        Iterator<Student> iterator2 = students.iterator();

        while (iterator2.hasNext()) {
            Student next = iterator2.next();
            if (next.getAge() > 30) {
                iterator2.remove();
            }
        }
        System.out.println();

//        Iterator<Student> iterator3 = students.iterator();
//
//        while(iterator3.hasNext()){
//            Student next = iterator3.next();
//            System.out.println(next);
//        }


        // foreach - show remove without iterator
        for (Student student : students) {
            if (student.getAge() > 30) {
                System.out.println(student);
                students.remove(student);
            }
        }

        System.out.println();
        for (Student student : students) {
            System.out.println(student);
        }


        // fori - show how we can miss some objects

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAge() > 25) {
                students.remove(i);
            }
        }

        for (Student student : students) {
            System.out.println(student);
        }

    }
}
