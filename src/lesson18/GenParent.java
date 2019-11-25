package lesson18;

public class GenParent<T> {
    T value;

    public GenParent(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }


}
