package lesson8;

import java.util.Scanner;

public class Application {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        showMenu();
        String line = scanner.next();
        while (!line.equalsIgnoreCase("quit")) {
            switch (line) {
                case "1":
                    searchContinent();
                    break;
                case "2":
                    findContinentsInSpecificSide();
                    break;
            }
            showMenu();
            line = scanner.next();
        }
    }

    private static void findContinentsInSpecificSide() {
        boolean isFinded = false;
        System.out.println("Input your side:");
        String readedSide = scanner.next();
        for (Continents continent : Continents.values()) {
            if (continent.getSide().name().equalsIgnoreCase(readedSide)) {
                System.out.println(continent);
                isFinded = true;
            }
        }
        if (!isFinded) {
            System.out.println("There is no continent in this side");
        }
    }

    private static void searchContinent() {
        boolean isFinded = false;
        System.out.println("Input your continent:");
        String readedContinent = scanner.next();
        for (Continents continent : Continents.values()) {
            if (continent.name().equalsIgnoreCase(readedContinent)) {
                System.out.println("Such continent exists!");
                isFinded = true;
            }
        }
        if (!isFinded) {
            System.out.println("Such continent is not exist!");
        }
    }

    private static void showMenu() {
        System.out.println("Make your choice: ");
        System.out.println("\t1.Check if such continent exists. ");
        System.out.println("\t2.Check which continents are in this side. ");
        System.out.println("\tType \"quit\" for exit. ");
        System.out.println();
    }
}
