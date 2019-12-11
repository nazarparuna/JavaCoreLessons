package lesson23;

public class ApplicationFunctionalInterfaces {
    public static void main(String[] args) {

        // predicate

        // binary operator

        // unary operator

        // function

        // consumer

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