package lesson5;

public abstract class Shape {

    final void show(){
        System.out.println("Just show shape");
    }

    void draw(){
        System.out.println("Draw shape!");
    }

    abstract void makeBigger();

}
