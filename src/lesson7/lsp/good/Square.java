package lesson7.lsp.good;

public class Square implements Squareabe {
    int side;

    public Square(int side) {
        this.side = side;
    }


    @Override
    public void calculateSquare() {
        System.out.println("Square is " + Math.pow(side, 2));
    }
}
