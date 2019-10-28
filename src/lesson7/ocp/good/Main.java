package lesson7.ocp.good;

public class Main {
    public static void main(String[] args) {
        Concierge concierge = new Concierge();
        concierge.greet(new Wife());
        concierge.greet(new Guy());
        concierge.greet(new Minister());
    }
}
