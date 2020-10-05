package lesson5.computer;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer() {
            @Override
            public void abstractMethod() {
                System.out.println("We call abstract method! Great!!!");
            }
        };

        computer.setYear(2020);
        System.out.println(computer.getYear());
        computer.abstractMethod();


        System.out.println();

        Laptop laptop = new Laptop();
        laptop.abstractMethod();
        System.out.println(laptop.getYear());

        TowerPC towerPC = new TowerPC();
        towerPC.abstractMethod();
        System.out.println(towerPC.getYear());

        Computer laptop2 = new Laptop();
        Computer towerPC2 = new TowerPC();
        laptop2.abstractMethod();
        towerPC2.abstractMethod();

        System.out.println();
        ((Laptop) laptop2).laptopMethod();
    }

}
