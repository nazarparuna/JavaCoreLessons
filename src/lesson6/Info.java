package lesson6;

public interface Info {


    void info();

    default void printBooks(int books) {
        System.out.println("Show info from " + books + " books");
    }

    static void staticMethod() {
        System.out.println("I am static method!");
    }
}
