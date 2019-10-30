package lesson8;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    static int result2;

    public static void main(String[] args) throws IOException {
        // створення enum класу Планети

        // доступ до елементів класу
        System.out.println(Days.MONDAY);

        System.out.println(Planets.VENERA);
        System.out.println(Planets.VENERA.getG());
        System.out.println(Planets.EARTH);
        System.out.println(Planets.EARTH.getG());


        System.out.println();
        // цикл по values
        for (Planets planet : Planets.values()) {
            System.out.println(planet);
        }

        // name
        for (Planets planet : Planets.values()) {
            System.out.println(planet.name());
        }

        // compareTo
        System.out.println(Planets.EARTH.compareTo(Planets.MERCURIY));
        System.out.println(Planets.EARTH.compareTo(Planets.NEPTUN));

        // ordinal
        for (Planets planet : Planets.values()) {
            System.out.println(planet.name() + " - " + planet.ordinal());
        }

        // getDeclaringClass
        for (Planets planet : Planets.values()) {
            System.out.println(planet.getDeclaringClass() + " : " + planet.getClass());
        }

        // valueOf ы вивід
        Planets ourPlanet = Planets.valueOf("EARTH");
//        Planets ourPlanet2 = Planets.valueOf("Earth");
        System.out.println(ourPlanet);
//        System.out.println(ourPlanet2);


        // enum всередині класу

        System.out.println(Seasons.FALL);

        // enum в switch

        Seasons season = Seasons.valueOf("WINTER");
        switch (season) {
            case SPRING:
                System.out.println("Currently is " + season);
                break;
            case SUMMER:
                System.out.println("Currently is " + season);
                break;
            case FALL:
                System.out.println("Currently is " + season);
                break;
            case WINTER:
                System.out.println("Currently is " + season);
                break;
        }


        //Scanner

        Scanner scanner = new Scanner(System.in);

//        String string = scanner.next();
//
//
//        System.out.println("You input : " + string);

//        String findedLine = scanner.findInLine("m.*m");

//        System.out.println("You find : " + findedLine);


        // читання двох дробових чисел

//        double first = scanner.nextDouble();
////        double second = scanner.nextDouble();
////
////        sum(first, second);
////        sub(first, second);
////        mul(first, second);
////        div(first, second);

        // операції над числами

        //BufferedReader читання порядково консолі

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//        double bufferedFirst = Double.parseDouble(bufferedReader.readLine());
//        double bufferedSecond = Double.parseDouble(bufferedReader.readLine());
//
//        sum(bufferedFirst, bufferedSecond);
//        sub(bufferedFirst, bufferedSecond);
//        mul(bufferedFirst, bufferedSecond);
//        div(bufferedFirst, bufferedSecond);

        // тернарний оператор

        boolean condition = scanner.nextBoolean();
        int result;
        if (condition) {
            result = 1;
        } else {
            result = 2;
        }
        System.out.println("Result is " + result);


        System.out.println("Result state is " + result2);

        result2 = condition ? 1 : 2;

        System.out.println("Result #2 is " + result2);


        // складений тернарний оператор

        boolean condition2 = scanner.nextBoolean();
        result2 = condition ? (condition2 ? 4 : 5) : 3;
        System.out.println("Result #2 is " + result2);


        // повернення з тернарним оператором

        System.out.println(returnByOperator(true));
        System.out.println(returnByOperator(false));


        // сторони, континенти


    }


    private static void sum(double first, double second) {
        System.out.println(first + second);
    }

    private static void sub(double first, double second) {
        System.out.println(first - second);
    }

    private static void mul(double first, double second) {
        System.out.println(first * second);
    }

    private static void div(double first, double second) {
        if (second == 0) {
            System.out.println("Cannot divide by zero!");
        } else {
            System.out.println(first / second);
        }
    }

    private static String returnByOperator(boolean condition) {
        return condition ? "End" : "Start";
    }


    enum Seasons {
        SPRING, SUMMER, FALL, WINTER;
    }

}
