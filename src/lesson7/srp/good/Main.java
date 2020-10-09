package lesson7.srp.good;

public class Main {
    public static void main(String[] args) {
        Cook cook = new Cook();
        Deliveryman deliveryman = new Deliveryman();
        cook.cook();
        deliveryman.delivery();
        cook.getSalary();
        deliveryman.getSalary();
    }
}
