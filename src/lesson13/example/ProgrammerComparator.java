package lesson13.example;

import java.util.Comparator;

public class ProgrammerComparator implements Comparator<Programmer> {
    @Override
    public int compare(Programmer o1, Programmer o2) {
        if (o1.getName().compareTo(o2.getName()) == 0) {
            return o1.getSalary() - o2.getSalary();
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
