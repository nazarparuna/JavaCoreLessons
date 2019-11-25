package lesson18;

public class Coords<T extends TwoC> {

    T[] coords;

    public Coords(T[] coords) {
        super();
        this.coords = coords;
    }

    public static void showXY(Coords<?> c) {
        System.out.println("Coordinates of XY :");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + "---" + c.coords[i].y);
            System.out.println();
        }
    }

    public static void showXYZ(Coords<? extends ThreeC> c) {
        System.out.println("Coordinates of XYZ :");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + "---" + c.coords[i].y + "---" + c.coords[i].z);
            System.out.println();
        }
    }

    public static void showXYZT(Coords<? extends FourC> c) {
        System.out.println("Coordinates of XYZT :");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + "---" + c.coords[i].y + "---" + c.coords[i].z + "---" + c.coords[i].t);
            System.out.println();
        }
    }

    public static void showXYsuper(Coords<? super FourC> c) {
        System.out.println("Coordinates of XYZ :");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + "---" + c.coords[i].y + "---");
            System.out.println();
        }
    }

}

class TwoC {
    int x;
    int y;

    public TwoC(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

class ThreeC extends TwoC {
    int z;

    public ThreeC(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}

class FourC extends ThreeC {
    int t;

    public FourC(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

}
