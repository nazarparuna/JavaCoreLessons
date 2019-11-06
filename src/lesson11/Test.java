package lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Integer[] numbers = {1, 3, -4, -5, 0, -7, 2};
//        List<Integer> integers = new ArrayList<Integer>(Arrays.asList(numbers));
        List<Integer> integers = Arrays.asList(numbers);

        integers.remove(0);
        for (Integer num : integers) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }

//        StringBuffer
    }
}
