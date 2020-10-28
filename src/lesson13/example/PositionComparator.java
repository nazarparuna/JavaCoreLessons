package lesson13.example;

import java.util.Comparator;

public class PositionComparator implements Comparator<Programmer> {
    @Override
    public int compare(Programmer o1, Programmer o2) {
        return o1.getPosition().compareTo(o2.getPosition());
    }
}
