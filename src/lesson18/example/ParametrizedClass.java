package lesson18.example;

public class ParametrizedClass<T> {

    T value;

    public ParametrizedClass(T value) {
        this.value = value;
        System.out.println("You insert in constructor " + value.getClass() + "" +
                " with value " + value);
    }

    public ParametrizedClass(Integer integer) {
        System.out.println("You insert in constructor number " + integer);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ParametrizedClass{" +
                "value=" + value +
                '}';
    }
}
