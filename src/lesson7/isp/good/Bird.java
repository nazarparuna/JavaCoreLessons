package lesson7.isp.good;

public class Bird {
    String name;

    public Bird(String name) {
        this.name = name;
    }

    void go() {
        System.out.println("The " + name + " is going");
    }

}
