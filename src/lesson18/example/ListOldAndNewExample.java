package lesson18.example;

import java.util.ArrayList;
import java.util.List;

public class ListOldAndNewExample {

    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4.1);
        list.add(1);
        Integer octNumber = 011111;
        Integer hexNumber = 0x11111;
        list.add(octNumber);
        list.add(hexNumber);
        Integer binaryNumber = 0b111;
        list.add(binaryNumber);

        double sum = 0;
        for (Number o : list) {
            sum += o.doubleValue();
        }

        System.out.println("Sum is " + sum);
    }

}
