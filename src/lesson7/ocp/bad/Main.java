package lesson7.ocp.bad;

public class Main {
    public static void main(String[] args) {
        Concierge concierge = new Concierge();
        concierge.greet("wife");
        concierge.greet("guy");
        concierge.greet("minister");
    }
}
