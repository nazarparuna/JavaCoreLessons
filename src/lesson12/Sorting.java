package lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Sorting {
    public static void main(String[] args) {
        // масив імен
        String[] names = {"Ivan", "Andriy", "Olga", "Yuriy", "Stepan", "Mykola", "Roman", "Maria"};


        // масив років
        Integer[] ages = {10, 23, 45, 63, 24, 19, 18, 6};


        // масив кількості грошей грошей

        Integer[] moneys = {10000, 20000, 5000, 1300, 4200, 500, 4800};


        // масив назв гаманців
        String[] wallets = {"Hugo", "Levis", "MonteCarlo", "Zara"};

        // згенерувати масив студентів (ім'я, вік, гаманець)

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            students.add(new Student((String) getRandomValue(names, 0, names.length), (Integer) getRandomValue(ages, 0, ages.length), new Wallet((Integer) getRandomValue(moneys, 0, moneys.length), (String) getRandomValue(wallets, 0, wallets.length))));
        }

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println();
        // перед сортуванням
//        System.out.println(Arrays.toString(students));

        // сортування висхідне / низхідне через Collections.sort()

        Collections.sort(students, new From1To9Comparator());

        System.out.println();
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    private static Object getRandomValue(Object[] array, int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min cannot be less than max");
        }
        Random random = new Random();
        int randomInt = random.nextInt(max);
        return array[randomInt];
    }
}
