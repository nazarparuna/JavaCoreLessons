package lesson13.example;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Programmer> {
    @Override
    public int compare(Programmer o1, Programmer o2) {
        return o1.getSalary() - o2.getSalary();
    }
}
