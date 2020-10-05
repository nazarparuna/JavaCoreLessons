package lesson4;

public class LessonExample {

    public static void main(String[] args) {
        Animal chicken = new Animal(20);

        Human human1 = new Man();
        Human human2 = new Woman();

        if (human2.getClass().getSimpleName().equals("Man")) {
            ((Man) human2).hunt(chicken);
        } else {
            ((Woman) human2).cook(chicken);
        }


    }
}
