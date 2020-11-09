package lesson18.example;

public class TestDoubleParametrizedClass {
    public static void main(String[] args) {

        Point<Number, String> point = new Point<>(1, "first");

        System.out.println(point.getX());
        System.out.println(point.getY());


        Point3D<Integer, Double, String> point3D = new Point3D<>(100, 200d, "Result ");

        System.out.println(point3D.getX());
        System.out.println(point3D.getY());
        System.out.println(point3D.getZ());

        System.out.println(point3D.showResult(3, 6d));

    }
}
