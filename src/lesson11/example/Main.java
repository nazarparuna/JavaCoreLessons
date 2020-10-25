package lesson11.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Integer[] arrayOfNumber = {1, 4, 6, 7, 9, -2, 20, 0, -5, 10, 10};

        System.out.println(arrayOfNumber);

        for (int i = 0; i < arrayOfNumber.length; i++) {
            System.out.println(arrayOfNumber[i]);
        }

        System.out.println("------------------");

        System.out.println(Arrays.toString(arrayOfNumber));

        System.out.println("--------");

        List<Integer> listOfIntegers = Arrays.asList(1, 3, 6, 8, 8);

        for (Integer item : listOfIntegers) {
            System.out.println(item);
        }

        System.out.println("------------------");

        Arrays.sort(arrayOfNumber);

        System.out.println(Arrays.toString(arrayOfNumber));

        Arrays.sort(arrayOfNumber, Collections.reverseOrder());

        System.out.println(Arrays.toString(arrayOfNumber));

        Arrays.sort(arrayOfNumber, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println(Arrays.toString(arrayOfNumber));

        Date date = new Date();
        long time = date.getTime();


        int i = Arrays.binarySearch(arrayOfNumber, 5);

        long time2 = date.getTime();

        System.out.println(i);


        Integer[] integers = Arrays.copyOf(arrayOfNumber, 2);

        for (Integer integer : integers) {
            System.out.println(integer);
        }

        Integer[] integers2 = Arrays.copyOfRange(arrayOfNumber, 2, 5);

        for (Integer item : integers2) {
            System.out.println(item);
        }

        Integer[] array1 = {1};
        Integer[] array2 = {1};

        System.out.println(array1.equals(array2));
        System.out.println(Arrays.deepEquals(array1, array2));

        Human human5 = new Human("Sasha V.", 19);
        Human human1 = new Human("Nazar P.", 27);
        Human human2 = new Human("Sasha K.", 19);
        Human human3 = new Human("Nazar M.", 27);
        Human human4 = new Human("Oleg", 17);
        Human human6 = new Human("Vlad", 20);

        Human[] humans = {human1, human2, human3, human4, human5, human6};

        System.out.println(Arrays.toString(humans));

        System.out.println(Arrays.deepToString(humans));

        Integer nums[] = new Integer[10];

        for (Integer num : nums) {
            System.out.println(num);
        }

        Arrays.fill(nums, 23);

        System.out.println(Arrays.deepToString(nums));

        System.out.println("--------");

        Arrays.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human human1, Human human2) {
                if (human1.getAge() == human2.getAge()) {
                    return human1.getName().compareTo(human2.getName());
                } else {
                    return human1.getAge() - human2.getAge();
                }
            }
        });

        System.out.println(Arrays.deepToString(humans));


        extractMethod();
        extractMethod();
        extractMethod();
        extractMethod();

    }

    private static void extractMethod() {
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
    }
}
