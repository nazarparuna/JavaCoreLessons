package lesson4;

public class Animal {

    String name = "chicken";

    int weight = 20;
    public int height = 50;
    protected int paws = 4;
    private int width = 10;

    public int getWidth(){
        return width;
    }

    public void eat(){
        System.out.println("Animal is eating!");
    }

    public void sleep(){
        System.out.println("Animal is sleeping!");
    }

    public Animal(int height){
        this.height = height;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", height=" + height +
                ", paws=" + paws +
                ", width=" + width +
                '}';
    }

    private void swim(){
        System.out.println("Animal is swimming!");
    }
}
