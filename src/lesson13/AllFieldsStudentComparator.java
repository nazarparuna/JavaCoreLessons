package lesson13;

import java.util.Comparator;

public class AllFieldsStudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getName().compareTo(o2.getName()) != 0) {
            return o1.getName().compareTo(o2.getName());
        } else {
            if (o1.getLevel().compareTo(o2.getLevel()) != 0) {
                return o1.getLevel().compareTo(o2.getLevel());
            } else {
                return o1.getAge().compareTo(o2.getAge());
            }
        }
    }

}
