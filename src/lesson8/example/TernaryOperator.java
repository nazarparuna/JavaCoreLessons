package lesson8.example;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Is sunny?");
        boolean isWarm = scanner.nextBoolean();

        System.out.println("Is warm?");
        boolean isSunny = scanner.nextBoolean();


        System.out.println("Is raining?");
        boolean isRaining = scanner.nextBoolean();

        boolean isWeatherGood = isSunny && isWarm ? (isRaining ? false : true) : returnFalse();

        int i = test();

        String example = isWeatherGood ? "Хороша. \nЙди гуляй!" : "Погана. \n Сиди вдома.";
        System.out.println(example);

        if (isWeatherGood) {
            System.out.println(Weather.GOOD);
        } else {
            System.out.println(Weather.BAD);
        }

    }

    private static int test() {
        return 0;
    }

    private static boolean returnFalse() {
        System.out.println("We are inside returnFalse method!");
        return false;
    }
}
