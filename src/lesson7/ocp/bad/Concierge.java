package lesson7.ocp.bad;

public class Concierge {

    void greet(String person) {
        if (person.equals("guy")) {
            System.out.println("Hi");
        } else if (person.equals("minister")) {
            System.out.println("Hello, sir!");
        } else if (person.equalsIgnoreCase("wife")) {
            System.out.println("Hello, darling!");
        } else if (person.equalsIgnoreCase("enemy")) {
            System.out.println("Go away!");
        } else if (person.equalsIgnoreCase("Sasha")) {
            System.out.println("Привіт, Саша!");
        } else {
            System.out.println("I don't know you!!!");
        }
    }

}
