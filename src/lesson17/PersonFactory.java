package lesson17;

import lesson14.Person;

public class PersonFactory {

    private String factoryName = "Roddom";

    class SuperMan implements Personable {

        private String factoryName = "Krypton";

        private String name = "Superman";

        @Override
        public void eat() {
            System.out.println("Factory name is " + factoryName);
            System.out.println("Factory name is " + PersonFactory.this.factoryName);
            System.out.println(name + " is eating!");
        }

        @Override
        public void move() {
            System.out.println(name + " is moving!");

        }

        @Override
        public void sleep() {
            System.out.println(name + " is sleeping!");

        }


    }

    public SuperMan createSuperMan() {
        return new SuperMan();
    }

    public Personable createHouseWife(boolean man) {
        class HouseWife implements Personable {
            String name = "HouseWife";

            @Override
            public void eat() {
                System.out.println(name + " is eating!");

            }

            @Override
            public void move() {
                System.out.println(name + " is moving!");

            }

            @Override
            public void sleep() {
                System.out.println(name + " is sleeping!");

            }

        }

        class HouseMan implements Personable {
            String name = "HouseMan";

            @Override
            public void eat() {
                System.out.println(name + " is eating!");

            }

            @Override
            public void move() {
                System.out.println(name + " is moving!");

            }

            @Override
            public void sleep() {
                System.out.println(name + " is sleeping!");

            }
        }

        return man ? new HouseMan() : new HouseWife();
    }

    public Personable createHacker() {
        return new Personable() {
            String name = "Hacker";

            @Override
            public void eat() {
                System.out.println(name + " is eating!");
            }

            @Override
            public void move() {
                System.out.println(name + " is moving!");

            }

            @Override
            public void sleep() {
                System.out.println(name + " is sleeping!");

            }
        };
    }

    static class DriverMan implements Personable {

        String name = "Driver";

        @Override
        public void eat() {
            new PersonFactory().showName();
            showStaticName();
            System.out.println(name + " is eating!");
        }

        @Override
        public void move() {
            System.out.println(name + " is driving!");
        }

        @Override
        public void sleep() {
            System.out.println(name + " is sleeping!");
        }
    }

    public DriverMan createDriverMan() {
        return new DriverMan();
    }

    public void showName() {
        System.out.println("Name from the  inner class is " + new SuperMan().name);
    }

    public static void showStaticName() {
        System.out.println("Name from the  inner class is ");
    }

}

class Person2 implements Personable {

    @Override
    public void eat() {
        System.out.println("Person is eating");
    }

    @Override
    public void move() {

        System.out.println("Person is moving!");
    }

    @Override
    public void sleep() {

        System.out.println("Person is sleeping!");
    }
}
