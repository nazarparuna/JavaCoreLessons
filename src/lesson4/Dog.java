package lesson4;

public class Dog extends Animal {

    int weight = 10;
    String nick;

    public Dog(int height) {
//        super(height);
        this("Barsik", height);
    }

    public void sleep() {
        super.sleep();
        System.out.println("Dog sleeps in budka!");
    }

    public void sleep(boolean t) {
        if (t) {
            super.sleep();
        } else {

            System.out.println("Dog sleeps in budka!");
        }
    }

    public void bark() {
        System.out.println("Dog is barking!");
    }

    public Dog(String nick, int height) {
        super(height);
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nick =" + nick +
                ", weight=" + weight +
                ", height=" + height +
                ", paws=" + paws +
                '}';
    }

    void swim(){
        System.out.println("Dog is swimming well!");
    }

    void bite(){
        System.out.println("Dog is biting!");
    }

}
