package lesson12;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class From1To9Comparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
//        return student1.getName().compareTo(student2.getName());
        if (student1.getName().compareTo(student2.getName()) > 0) {
            return 1;
        } else if (student1.getName().compareTo(student2.getName()) < 0) {
            return -1;
        } else if (student1.getAge().compareTo(student2.getAge()) > 0) {
            return 1;
        } else if (student1.getAge().compareTo(student2.getAge()) < 0) {
            return -1;
        }
        return 0;
    }

    @Override
    public Comparator<Student> reversed() {
        return null;
    }

    @Override
    public Comparator<Student> thenComparing(Comparator<? super Student> other) {
        return null;
    }

    @Override
    public <U> Comparator<Student> thenComparing(Function<? super Student, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Student> thenComparing(Function<? super Student, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Student> thenComparingInt(ToIntFunction<? super Student> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Student> thenComparingLong(ToLongFunction<? super Student> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Student> thenComparingDouble(ToDoubleFunction<? super Student> keyExtractor) {
        return null;
    }
}
