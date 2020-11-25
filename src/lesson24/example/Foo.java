package lesson24.example;

@FunctionalInterface
public interface Foo {
    static void printInStatic() {
        System.out.println("static");
    }

    String method(String string);

    default void print() {
        System.out.println("1232131");
    }
}

