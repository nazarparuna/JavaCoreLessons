package lesson18.example;

public class Point3D<P1 extends Number, P2 extends Number, P3> extends Point<P1, P2> {

    P3 z;

    public Point3D(P1 x, P2 y, P3 z) {
        super(x, y);
        this.z = z;
    }

    public P3 getZ() {
        return z;
    }

    public void setZ(P3 z) {
        this.z = z;
    }

    public P3 showResult(P1 a, P2 b) {
        return (P3) (z + ("" + (a.doubleValue() + b.doubleValue())));
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }
}
