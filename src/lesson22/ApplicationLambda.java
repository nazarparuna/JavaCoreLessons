package lesson22;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ApplicationLambda {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4);

        int addNumber = 10;

        Consumer<Integer> consumer = x -> {
            x += addNumber;
            if (x > 20) {
                System.out.println("X is more than twenty!");
            } else {
                System.out.println("X is less than twenty!");
            }
        };

        consumer.accept(5);
        consumer.accept(24);

        integers.forEach(y -> {
            System.out.print(y + " ");
            System.out.println(y + 1);
        });
        System.out.println();
        integers.forEach(consumer);

        // create interface for operations

        // write lambda for different operations
        MathOperations add = (x, y) -> x + y;
        MathOperations min = (x, y) -> x - y;
        MathOperations mul = (x, y) -> x * y;
        MathOperations div = (x, y) -> x / y;

        // show result of lambda execution

        System.out.println(add.operate(2, 1));
        System.out.println(min.operate(2, 1));
        System.out.println(mul.operate(3, 1));
        System.out.println(div.operate(4, 2));

        // write interface for greetings

        Greetings formal = name -> System.out.println("Good evening, " + name + "!");
        Greetings nonFormal = name -> System.out.println("Hi, " + name + "!");
        formal.sayHi("Nazar");
        nonFormal.sayHi("Nazar");

        // add two string, two numbers
        MathOperation<Integer> integerMathOperation = (x, y) -> x + y;
        MathOperation<String> stringMathOperation = (x, y) -> x + y;

        System.out.println(integerMathOperation.operate(3, 7));
        System.out.println(stringMathOperation.operate("3", "7"));

        // write method which takes interface as parameter
        operate(4, 5, add);
        operate(4, 5, min);
        operate(4, 5, mul);
        operate(4, 5, div);


    }

    public static void operate(Integer a, Integer b, MathOperations lambda) {
        System.out.println(lambda.operate(a, b));
    }

}

interface MathOperations {
    int operate(int a, int b);
}

interface Greetings {
    void sayHi(String name);
}

interface MathOperation<T> {
    T operate(T a, T b);
}