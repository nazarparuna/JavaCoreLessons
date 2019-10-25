package lesson6;

public class Newspaper implements Print {

    void cut() {
        System.out.println("Someone is cutting me!");
    }

    @Override
    public void print() {
        System.out.println("Print a newspaper!");
    }

    @Override
    public void beWhite() {
        System.out.println("I am not");
    }
}
