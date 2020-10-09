package lesson7.ocp.good;

public class Enemy implements Personality {

    @Override
    public String greet() {
        return "Go away";
    }
}
