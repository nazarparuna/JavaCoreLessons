package lesson7.isp.good;

public class Penguine implements Bird, Swimmable {
    @Override
    public void go() {
        System.out.println("Penguine is going");
    }

    @Override
    public void swim() {
        System.out.println("Penguine is swimming");
    }
}
