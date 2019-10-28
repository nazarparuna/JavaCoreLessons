package lesson7.ocp.good;

public class Minister implements Personality {
    @Override
    public void greet() {
        System.out.println("Hello, sir!");
    }
}
