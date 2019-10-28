package lesson7.isp.bad;

public class Eagle implements Bird {

    @Override
    public void go() {
        System.out.println("Eagle is going");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public void swim() {

    }
}
