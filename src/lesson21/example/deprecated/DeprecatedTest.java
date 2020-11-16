package lesson21.example.deprecated;

public class DeprecatedTest {

    public static void main(String[] args) {
        TestExample testExample = new TestExample();
        double a = 1.0;
        int b = 2;
        double sum = testExample.sum(a, b);

//        int sum1 = testExample.sum(1, 2); is not possible in version #3

        System.out.println("Result of " + a + " + " + b + " is " + sum);

        // Java 12

        Integer integer = new Integer(12);
        Integer integerInJava12 = Integer.valueOf(12);
    }

}
