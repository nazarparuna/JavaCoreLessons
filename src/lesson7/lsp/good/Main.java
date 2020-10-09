package lesson7.lsp.good;

public class Main {
    public static void main(String[] args) {
        Rectangular rectangular = new Rectangular(10, 4);
        Square square = new Square(14);
        Circle circle = new Circle(10);

        showSquare(rectangular);
        showSquare(square);
        showSquare(circle);

    }

    public static void showSquare(Squareabe shape) {
        System.out.println(shape.calculateSquare());
    }
}
