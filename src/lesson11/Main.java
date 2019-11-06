package lesson11;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // overview methods of iterable

//        Collection
//        Collections

        // overview methods of collections

        // asList

        Integer[] numbers = {1, 3, -4, -5, 0, -7, 2};
//        List<Integer> integers = Arrays.asList(numbers);
//        integers.(new Integer(10));
//        for (Integer num: integers) {
//            System.out.println(num);
//        }
//        System.out.println();
//        for (Integer num: numbers) {
//            System.out.println(num);
//        }

        // sort
        for (Integer num : numbers) {
            System.out.println(num);
        }
        System.out.println();
//        Arrays.sort(numbers);
//        for (Integer num:numbers) {
//            System.out.println(num);
//        }

        // sort with indexes
//        Arrays.sort(numbers, 1, numbers.length);
//        for (Integer num:numbers) {
//            System.out.println(num);
//        }

        // sort with Comparator
        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (Integer num : numbers) {
            System.out.println(num);
        }


        // binarySearch
        // compare with linear search

//        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int i = Arrays.binarySearch(numbers, 3);
        System.out.println("Index is " + i);

        // copyOf

        int[] intNumbers = {1, 3, 0, 5, -3, -6};
        int[] copyOf = Arrays.copyOf(intNumbers, intNumbers.length + 3);
        System.out.println(Arrays.toString(copyOf));

        // copyOfRange

        int[] intsCopy = Arrays.copyOfRange(intNumbers, 1, 4);
        System.out.println(Arrays.toString(intsCopy));


        // deepEquals, == , equals

        Boolean[] booleanArray = {true, false, false, true, true};
        Boolean[] booleanArray2 = {true, false, false, true, true};

        System.out.println(booleanArray == booleanArray2); // false
        System.out.println(booleanArray.equals(booleanArray2)); // false
        System.out.println(Arrays.deepEquals(booleanArray, booleanArray2)); // true

        // toString
        System.out.println(booleanArray);
        System.out.println(Arrays.toString(booleanArray));

        int[][] doubleArray = {{1, 2, -4}, {2, 7}};
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(Arrays.deepToString(doubleArray));

        //deepToString()


        // empty array
        // initialized array
        // two-dimensional array
        // array with Persons

        // deepHashcode

        // Arrays.fill() -  all types include String

        byte[] byteArray = new byte[10];
        System.out.println(Arrays.toString(byteArray));
        Arrays.fill(byteArray, (byte) 20);
        System.out.println(Arrays.toString(byteArray));
        Arrays.fill(byteArray, 5, 7, (byte) 10);
        System.out.println(Arrays.toString(byteArray));
//        Arrays.fill(byteArray, 8,  7, (byte) 10);
        Arrays.fill(byteArray, 18, 20, (byte) 10);



    }

}
