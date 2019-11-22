package lesson17;

public class PersonableApplication {
    public static void main(String[] args) {

        // create factory

        PersonFactory personFactory = new PersonFactory();

        // inner class

//        PersonFactory.SuperMan superMan = new PersonFactory().new SuperMan();
        PersonFactory.SuperMan superMan = personFactory.createSuperMan();
        superMan.eat();
        superMan.move();
        superMan.sleep();

        System.out.println();
        // local class
        Personable houseWife = personFactory.createHouseWife(false);
        houseWife.eat();
        houseWife.move();
        houseWife.sleep();



        // anonymous class
        Personable hacker = personFactory.createHacker();
        System.out.println();
        hacker.eat();
        hacker.move();
        hacker.sleep();


        // static inner class
        PersonFactory.DriverMan driverMan = personFactory.createDriverMan();

        System.out.println();
        driverMan.eat();
        driverMan.move();
        driverMan.sleep();

        System.out.println();
        superMan.eat();

        System.out.println();
        personFactory.showName();

        System.out.println();
        Person2 person = new Person2();
        person.eat();
        person.move();
        person.sleep();

        System.out.println();
        System.out.println(superMan.getClass().getName());
        System.out.println(houseWife.getClass().getName());
        System.out.println(hacker.getClass().getName());
        System.out.println(driverMan.getClass().getName());
        Personable houseMan = personFactory.createHouseWife(true);
        System.out.println(houseMan.getClass().getName());
    }
}
