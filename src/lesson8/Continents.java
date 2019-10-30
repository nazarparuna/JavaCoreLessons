package lesson8;

import javafx.geometry.Side;

public enum Continents {

    NORTH_AMERICA(Sides.WEST),
    SOUTH_AMERICA(Sides.WEST),
    EUROPE(Sides.NORTH),
    ASIA(Sides.NORTH),
    AFRICA(Sides.SOUTH),
    AUSTRALIA(Sides.SOUTH),
    ANTARCTIDA(Sides.SOUTH);

    private Sides side;

    Continents(Sides side) {
        this.side = side;
    }

    public Sides getSide() {
        return side;
    }
}
