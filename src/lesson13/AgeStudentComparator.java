package lesson13;

import java.util.Comparator;

public class AgeStudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge().compareTo(o2.getAge());
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
