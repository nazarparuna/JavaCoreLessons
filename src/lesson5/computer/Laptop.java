package lesson5.computer;

public class Laptop extends Computer {
    @Override
    public void abstractMethod() {
        System.out.println("I am laptop");
    }

    public void laptopMethod() {
        System.out.println("Laptop method");
    }
}
