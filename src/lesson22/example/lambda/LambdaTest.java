package lesson22.example.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaTest {

    public static void main(String[] args) {
        Incrementor incrementor = new Incrementor() {
            @Override
            public int increment(int value) {
                return value + 1;
            }
        };

        Incrementor lambdaIncrementor = x -> x + 1;

        int newVariable = incrementor.increment(2);
        System.out.println(newVariable);

        System.out.println(lambdaIncrementor.increment(10));

        System.out.println("Shower example:");
        Shower shower = () -> "Hello from Lambda.";
        System.out.println(shower.show());

        int value = 20;

        System.out.println("Summator example:");
        Summator summator = (x, y) -> {
            System.out.println(value);
            System.out.println("Number x : " + x);
            System.out.println("Number y : " + y);
            return (int) (x + y);
        };

        System.out.println(summator.sum(1, 5));

        List<Integer> intSeq = Arrays.asList(1, 2, 3);
        intSeq.forEach(x -> System.out.println(x));


        ParametrizedSummator<Integer> integerParametrizedSummator = (x, y) -> x + y;
        System.out.println("Result from parametrized summator");
        System.out.println(integerParametrizedSummator.sum(2, 5));


    }
}
