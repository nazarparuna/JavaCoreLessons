package lesson5;

public class Square extends Shape {

    void draw(){
        System.out.println("Draw Square!");
    }

    @Override
    void makeBigger() {
        System.out.println("Square is now bigger");
    }

}
