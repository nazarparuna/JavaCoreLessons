package lesson5;

public class Circle extends Shape {

    final int radius = 10;

    public int getRadius() {
        return this.radius;
    }

    Circle(){

    }

    void draw(){
        System.out.println("Draw Circle!");
    }

    void draw(int radius){
        System.out.println("Draw new circle with radius " + radius);
    }

    double draw(double radius){
        return radius;
    }

    @Override
    void makeBigger() {
        System.out.println("Circle is now bigger");
    }

}
