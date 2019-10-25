package lesson6;

import additionallesson6.forest.animals.Frog;
import org.apache.log4j.BasicConfigurator;

public class Lesson6 {
    public static void main(String[] args) {

        // форматування коду

        String str = " dsljsdfl";
        String strs = new String("dsfsldj");




        /*
        Делегування
         */

        // додати класи

        Boss boss = new Boss();
        boss.work("TASK10");
        boss.work("TASK20");
        boss.work("TASK30");




        /*
        Пакети
         */

        // два класи з однаковим іменем - Rock

        // створити об'єкти обох класів

        Frog frog = new Frog();

        lesson6.Rock rockMusic = new Rock();
        additionallesson6.Rock rockStone = new additionallesson6.Rock();

        String song = "Yellow Submarine";
        rockMusic.playSongDefault(song);
        rockStone.liePublic(10, 20);


        // доступ до методів та змінних з різними рівнями доступу

        rockMusic.playSongProtected(song);
        rockMusic.playSongDefault(song);
        rockMusic.playSongPublic(song);

        // приклади стандартних пакетів

        // java.lang



        /*
        Інтерфейси
         */

        // додати клас Книга

        // додати інтерфейси Видавницто, Автор

        // створення об'єкту інтерфейсу
        Book book = new Book();
        book.print();
        book.read();


        // змінні в інтерфейсах

        System.out.println(book.name);
        System.out.println(Print.name);
//        Print.name = "";

        // чекнути чи вибрана Java 8
        // дефолтні методи

        book.printBooks(2);

        // виклик дефолтних методів

        // перекриття дефолтних методів

        // посилання інтерфейсного типу

        Newspaper newspaper = new Newspaper();

        showMaterial(book);
        showMaterial(newspaper);

        // передача інтерфейсного типу в метод

        System.out.println(getItem(false).getClass());
        System.out.println(getItem(true).getClass());

        // повернення інтерфейсного типу з методу

        // конфлікт дефолтних методів
        System.out.println();
        book.info();

        // вирішення конфлікту

        book.printBooks(3);

        // static методи
        Info.staticMethod();
//        book.staticMethod()

        // доступ до статичних методів інтерфейсів

        // наслідування в інтерфейсах
        book.beWhite();
        newspaper.beWhite();

        // вкладені інтерфейси

        Book.Page.getNumber();

        // приклади стандартних інтерфейсів


//        Category category = new Category("dsljfdsl");
//        BasicConfigurator basicConfigurator = new BasicConfigurator();

    }

    static void showMaterial(Print object) {
        System.out.println(object.getClass());
    }

    static Print getItem(boolean isBook) {
        if (isBook)
            return new Book();
        else
            return new Newspaper();
    }
}
