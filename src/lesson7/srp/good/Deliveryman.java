package lesson7.srp.good;

public class Deliveryman extends Worker {


    public void delivery() {
        System.out.println("I have deliverer a dish!");
    }

    @Override
    public void work() {
        delivery();
    }
}
