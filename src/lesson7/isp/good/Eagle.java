package lesson7.isp.good;

public class Eagle extends Bird implements Flyable {

    public Eagle(String name) {
        super(name);
    }

//    @Override
//    public void go() {
//        System.out.println("Eagle is going");
//    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

}
