package lesson4.parents_and_childs;

import lesson4.sub1.Main;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.species);

        cat.setSpecies("Cat");

        System.out.println(cat.species);
        System.out.println(cat.getSpecies());

        cat.setNickname("Barsik");
        System.out.println(cat.getNickname());

        Animal animal = new Animal();

        Animal animal2 = new Cat();

        Cat cat2 = (Cat) animal2;
        System.out.println(cat2.getNickname());

        System.out.println(cat2.getWeight());
        System.out.println(cat2.getColor());


        System.out.println("========================================");
        System.out.println("========================================");
        System.out.println("========================================");

        Cat cat3 = new Cat("Cat", "Murchyk");
        System.out.println(cat3);

        cat3.setColor("Red");
        cat3.setWeight(4);

        System.out.println(cat3);


        System.out.println("========================================");
        cat3.дряпати();
        Sphinx cat4 = new Sphinx("Cat", "Matys", 2);
        cat4.дряпати();
        cat4.дряпати2();


    }
}
