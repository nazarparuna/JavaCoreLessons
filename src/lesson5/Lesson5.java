package lesson5;

import java.util.Calendar;

public class Lesson5 {
    public static void main(String[] args) {

        // clone проекту
        // позначити src директорію як Source Root

        // додати колаборантів
        // Github > Settings > Collaborators

        // створити об'єкти типу Object

        Object obj = new Object();

        // getClass()
        System.out.println(obj.getClass());

        // hashCode()
        System.out.println(obj.hashCode());

        // toString()
        System.out.println(obj.toString());

        // equals з String
        String str1 = new String("str1");
        String str2 = new String("str1");

        System.out.println(str1.equals(str2)); // true

        // == з String
        System.out.println(str1 == str2); // false

        // String створені без new

        String str3 = "str";
        String str4 = "str";
        System.out.println(str3 == str4); // true

        // додати клас Shape, Circle, Triangle, Square

        Circle circle = new Circle();
        Square square = new Square();
//        Shape shape = new Shape(); // позначили як абстрактний -> більше не можемо створити об'єкт

        circle.draw();
        square.draw();

        // override метод

        // overload метод

        circle.draw();
        circle.draw(20);

        // final змінна
        System.out.println();
        System.out.println("Radius is " + circle.getRadius());
//        System.out.println("Radius is " + circle.setRadius()); // значення final змінної не можна змінити

        // final method
        circle.show();
        square.show();
//        shape.show();

        // final класс


        // static  змінна

        System.out.println(Math.PI);


        // static  метод

        // абстрактний клас

//        Shape abstractShape = new Shape(); не дозволено

        // абстрактний метод
        circle.makeBigger();
        square.makeBigger();

        // String format()
        // string
        String myName = "Nazar";
        String myFriendName = "Igor";
        System.out.println(String.format("My name is %s, my friend's name is %s", myName, myFriendName));

        // numbers
        System.out.println(String.format("My age is %d", 24));
        System.out.println(String.format("My age is %f", 24.1));
        System.out.println(String.format("My age is %.2f", 24.1));

        // форматування цифр
        System.out.println();
        double[] numbers = {1.2, 2.34, 3.4546, 6.3423, 7.32423423};
        for(double number: numbers){
            System.out.println(String.format("%s", number));
        }

        for(double number: numbers){
            System.out.println(String.format("%10s", number));
        }

        // exponential
        System.out.println(String.format("My age is %.2e", 2421321312.1));

        // hexadecimal
        System.out.println(String.format("Hex digit is %h", 15));
        System.out.println(String.format("Hex digit is %#X", 15));

        // Дата і час
        Calendar calendar = Calendar.getInstance();

        System.out.println(String.format("Hour is %d", calendar.get(Calendar.HOUR_OF_DAY)));

        // static call

        God god = new God();
        God god2 = god;
//        God.staticMethod();
//        God.Power.make();
//        god.new SuperPower().show();


        // робота методу finalize
        god = null;
        System.gc();

    }
}
