package lesson3;

public class Main {
    public static void main(String[] args) {
        // create class Human
        // add few fields in class Human

        Human human = new Human(1995);
        System.out.println(human.getAge());

        System.out.println(human.getAge(2020));

        Car bmw = new Car();
        System.out.println(bmw.year);
        System.out.println(bmw.brand);
        System.out.println(bmw.model);

        Car audi = new Car(2010, "Audi", "Q5");
        System.out.println(audi.year);
        System.out.println(audi.brand);
        System.out.println(audi.model);

        Car uaz = new Car("UAZ", "Patriot");
        System.out.println(uaz);

        System.out.println("===============");

        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(uaz);


        System.out.println("===============");

        Human oleh = new Human(2002);
        System.out.println(oleh);

        Human oleh2 = new Human(2002, "Oleh", "Hill");
        System.out.println(oleh2);

        Human oleh3 = new Human();
        System.out.println(oleh3);

        oleh3.setName("Oleh");
        oleh3.setSurname("Hill");
        oleh3.setYear(2002);

        System.out.println(oleh3);


        System.out.println("Output by getters");
        System.out.println(oleh3.getAge());
        System.out.println(oleh3.getYear());
        System.out.println(oleh3.getName());
        System.out.println(oleh3.getSurname());




        // create create variable of class Human
        // assign object to this variable
        // show output of this object
        // add other constructors to this class
        // repeat creation with other parameters and constructors
        // make fields private
        // add setters and getters


        System.out.println("By Lombok");

        Animal animal = new Animal();
        Animal animal2 = new Animal();

        System.out.println(animal.getName());


    }
}
