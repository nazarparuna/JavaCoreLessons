package lesson7.isp.good;

public class Eagle implements Bird, Flyable {

    @Override
    public void go() {
        System.out.println("Eagle is going");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

}
