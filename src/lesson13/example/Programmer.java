package lesson13.example;

public class Programmer implements Comparable<Programmer> {

    private String name;
    private int salary;
    private Position position;

    public Programmer(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Programmer(String name, int salary, Position position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", position=" + position +
                '}';
    }

    @Override
    public int compareTo(Programmer o) {
        return salary - o.getSalary();
    }

}
