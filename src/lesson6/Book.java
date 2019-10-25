package lesson6;

public class Book implements Print, Info {

    void read() {
        System.out.println("Someone is reading me!");
    }

    @Override
    public void print() {
        System.out.println("I was printing!");
    }

    @Override
    public void printBooks(int books) {
        Print.super.printBooks(2);
        Info.super.printBooks(3);
        System.out.println("Printed in better quality " + books + " books.");
    }

    @Override
    public void info() {
        System.out.println("Show info about book");

    }

    @Override
    public void beWhite() {
        System.out.println("I am!");
    }

    interface Page {
        static void getNumber() {
            System.out.println("I don't know!");
        }
    }
}
