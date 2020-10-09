package lesson7.isp.good;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("Eagle");
        eagle.fly();
        eagle.go();

        Penguine penguine = new Penguine("Penguine");
        penguine.go();
        penguine.swim();

    }
}
