package lesson7.ocp.good;

public class Guy implements Personality {
    @Override
    public void greet() {
        System.out.println("Hi!");
    }
}
