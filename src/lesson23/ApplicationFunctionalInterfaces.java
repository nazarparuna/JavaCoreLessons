package lesson23;

import java.util.function.BiFunction;

public class ApplicationFunctionalInterfaces {
    public static void main(String[] args) {

        // predicate

        // function

        // consumer

        BiFunction<Integer, Long, Double> biFunction = (x, y) -> Double.valueOf(x + y);

        Double aDouble = biFunction.apply(1, 2L);
        System.out.println(aDouble);
        System.out.println();

        // binary operator


        // unary operator

        // supplier which generates user
    }
}

class User {
    private String name;

    public User(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User [name=" + name + "]";
    }
}