package lesson13.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparingByPosition {
    public static void main(String[] args) {
        Programmer[] programmersArray = {
                new Programmer("Nazar", 20000, Position.ARCHITECT),
                new Programmer("Vlad", 5000, Position.TEAM_LEAD),
                new Programmer("Lilia", 10000, Position.SENIOR),
                new Programmer("Nazar", 1900, Position.JUNIOR),
                new Programmer("Sasha2", 2500, Position.MIDDLE),
                new Programmer("Sasha1", 2000, Position.MIDDLE),
                new Programmer("Oleh", 500, Position.TRAINEE)
        };

        List<Programmer> programmers = new ArrayList<>(Arrays.asList(programmersArray));

        for (Programmer programmer : programmers) {
            System.out.println(programmer);
        }

        System.out.println();

        programmers.sort(new PositionComparator());
        for (Programmer programmer : programmers) {
            System.out.println(programmer);
        }

    }
}
