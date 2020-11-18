package lesson22.example.method_reference;

import java.util.Arrays;
import java.util.List;

public class ReferenceTest {
    public static void main(String[] args) {
        List<Integer> intSeq = Arrays.asList(1, 2, 3);
        intSeq.forEach(System.out::println);
        System.out.println();
        intSeq.forEach(ReferenceTest::pow);
        System.out.println();
        ReferenceTest referenceTest = new ReferenceTest();
        intSeq.forEach(referenceTest::sqrt);

//        referenceTest
    }

    public static void pow(Integer value) {
        System.out.println(value * value);
    }

    public void sqrt(Integer value) {
        System.out.println(Math.sqrt(value));
    }

    public Person create(String name, int age) {
        return new Person(name, age);
    }
}
