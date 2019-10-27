package lesson6;

public interface Print extends Paper, Sheet {
    String name = "Alice in the Wonderland";

    void print();

    default void printBooks(int books) {
        System.out.println("show info from print");

    }


}
