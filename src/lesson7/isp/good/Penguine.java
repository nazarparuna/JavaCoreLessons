package lesson7.isp.good;

public class Penguine extends Bird implements Swimmable {
    public Penguine(String name) {
        super(name);
    }

//    @Override
//    public void go() {
//        System.out.println("Penguine is going");
//    }

    @Override
    public void swim() {
        System.out.println("Penguine is swimming");
    }
}
