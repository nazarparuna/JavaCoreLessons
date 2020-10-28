package lesson13.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(-1);
        numbers.add(10);
        numbers.add(12);
        numbers.add(21);
        numbers.add(14);
        numbers.add(5);
        numbers.add(9);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println("========");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("---------");

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }

        for (Integer number : numbers) {
            // will fall with exception
//            if(number == 3){
//                numbers.remove(number);
//            }
        }

        Programmer[] programmersArray = {
                new Programmer("Nazar", 20000),
                new Programmer("Vlad", 1000),
                new Programmer("Oleh", 500)
        };

        List<Programmer> programmers = new ArrayList<>(Arrays.asList(programmersArray));

        Iterator<Programmer> programmerIterator = programmers.iterator();

        while (programmerIterator.hasNext()) {
            System.out.println(programmerIterator.next());
        }

        for (Programmer programmer : programmers) {
//            if (programmer.getSalary() < 1500) {
//                programmers.remove(programmer);
//            }
        }


//        List<Programmer> forRemoving = new ArrayList<>();
//        for (Programmer programmer : programmers) {
//            if (programmer.getSalary() < 1500) {
//                forRemoving.add(programmer);
//            }
//        }
//
//        programmers.removeAll(forRemoving);


        Iterator<Programmer> iteratorForProgrammers = programmers.iterator();

        while (iteratorForProgrammers.hasNext()) {
            Programmer next = iteratorForProgrammers.next();
            if (next.getSalary() < 1500) {
//                iteratorForProgrammers.remove();
            }
        }

        System.out.println("----------");

        for (Programmer programmer : programmers) {
            System.out.println(programmer);
        }

        Set<String> setOfStrings = new HashSet<>();

        ListIterator<Programmer> programmerListIterator = programmers.listIterator();


        System.out.println("------------------------");


        while (iteratorForProgrammers.hasNext()) {
            System.out.println(iteratorForProgrammers.next());
        }

        System.out.println("##################");


        while (programmerListIterator.hasNext()) {
            Programmer next = programmerListIterator.next();
            if (next.getSalary() > 10000) {
                Programmer newProgrammer = new Programmer("Bill Gates", next.getSalary());
                programmerListIterator.set(newProgrammer);
            }
            if (next.getName().equals("Vlad")) {
                programmerListIterator.add(new Programmer("Sasha", 500));
            }
        }

        Iterator<Programmer> iterator1 = programmers.iterator();
        while (iterator1.hasNext()) {
            Programmer next = iterator1.next();
            System.out.println(next);
        }

        List<Programmer> toOleh = new ArrayList<>();
        ListIterator<Programmer> programmerListIterator1 = programmers.listIterator();
        while (programmerListIterator1.hasNext()) {
            Programmer next = programmerListIterator1.next();
            if (next.getName().equals("Oleh")) {
                programmerListIterator1.previous();
                while (programmerListIterator1.hasPrevious()) {
                    toOleh.add(programmerListIterator1.previous());
                }
                break;
            }
        }

        System.out.println("All except Oleh:");
        for (Programmer programmer : toOleh) {
            System.out.println(programmer);
        }

        System.out.println("-----------");

        ListIterator<Programmer> programmerListIterator2 = programmers.listIterator();
        while (programmerListIterator2.hasNext()) {
            System.out.println(programmerListIterator2.nextIndex() + ". " + programmerListIterator2.next());
        }


    }
}
