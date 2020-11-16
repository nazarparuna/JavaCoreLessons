package lesson21.example.override;

public class ChildClass extends Base {

    @Override
    public void show() {
        System.out.println("I am in child class....");
    }

    //    @Override - is not possible
    public void show(int i) {
        System.out.println("Show with parameter");
    }
}
