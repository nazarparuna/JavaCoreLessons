package lesson24.class_init;

public class Child extends Parent {
    public Child() {
        System.out.println("I am in child empty constructor");
    }

    public Child(int i) {
        this();
        System.out.println("I am in child constructor with value: " + i);
    }
}
