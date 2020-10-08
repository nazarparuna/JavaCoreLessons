package lesson6;

public interface Sheet {

    default void toBeSheet() {
        System.out.println("I am the Sheet");
    }
}
