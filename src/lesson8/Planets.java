package lesson8;

public enum Planets {

    MERCURIY,
    VENERA,
    EARTH(9.81),
    MARS,
    UPITER,
    SATURN,
    NEPTUN;

    private double g;

    Planets() {
        this.g = 1;
    }

    Planets(double g) {
        this.g = g;
    }

    public double getG() {
        return g;
    }


}
