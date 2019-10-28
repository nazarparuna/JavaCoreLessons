package lesson7.lsp.bad;

public class Rectangular {

    int height;
    int width;

    public Rectangular(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void calculateSquare() {
        System.out.println("Square is " + (height * width));
    }

}
