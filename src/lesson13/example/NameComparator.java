package lesson13.example;

import java.util.Comparator;

public class NameComparator implements Comparator<Programmer> {
    @Override
    public int compare(Programmer o1, Programmer o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
