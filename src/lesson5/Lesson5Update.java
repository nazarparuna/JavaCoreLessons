package lesson5;

import java.text.DecimalFormat;

public class Lesson5Update {

    public static void main(String[] args) {
        Byte byteVar = new Byte((byte) 0);
        Integer intVar = Integer.valueOf(0);

        Test test = new Test();
        System.out.println(test.getClass());
        test.test();

        test.test();

        double random = Math.random();

        int random2 = (int) (Math.random() * 100) + 1;

        Float floatVar = new Float(29.8);
        System.out.println(3.30e23);

        DecimalFormat decimalFormat = new DecimalFormat("0.######E0");
        System.out.println(decimalFormat.format(floatVar));

    }
}

@Deprecated
class Test {
    public void test() {
        System.out.println("test");
    }

    public int test(int value) {
        System.out.println("test" + value);
        return value;
    }

    public void test(double value) {
        System.out.println("test" + value);
    }
}
