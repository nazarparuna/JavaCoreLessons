package lesson24.class_init;

public class Parent {

    static {
        System.out.println("static block");
    }

    {
        System.out.println("Empty block 1");
    }


    {
        System.out.println("Empty block");
    }


    public Parent() {
        System.out.println("This is empty constructor!");
    }

    public Parent(int i) {
        System.out.println("This is constructor with value: " + i);
    }
}
