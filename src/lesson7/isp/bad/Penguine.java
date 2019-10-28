package lesson7.isp.bad;

public class Penguine implements Bird {
    @Override
    public void go() {
        System.out.println("Penguine is going");
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {
        System.out.println("Penguine is swimming");
    }
}
