package lesson18.example;

public class ParametrizedClassTest {
    public static void main(String[] args) {

        ParametrizedClass<Double> integerClass = new ParametrizedClass<>(12d);
        ParametrizedClass<String> stringClass = new ParametrizedClass<>("12");

        System.out.println(integerClass.getValue().getClass());
        System.out.println(integerClass.getValue());
        System.out.println(stringClass.getValue().getClass());
        System.out.println(stringClass.getValue());

    }
}
