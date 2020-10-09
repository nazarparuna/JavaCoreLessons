package lesson7.lsp.good;

public class Circle implements Squareabe {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String calculateSquare() {
        return "Square is " + Math.PI * Math.pow(radius, 2);
    }
}
