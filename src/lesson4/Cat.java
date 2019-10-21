package lesson4;

public class Cat extends Animal {

    int life = 9;

    Cat(int height){
        super(height);
    }

    public void sleep(){
        System.out.println("Cat sleeps in the bed!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "life=" + life +
                ", weight=" + weight +
                ", height=" + height +
                ", paws=" + paws +
                '}';
    }
}
