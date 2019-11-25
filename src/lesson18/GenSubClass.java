package lesson18;

public class GenSubClass<T, V> extends GenParent<T> {
    V subValue;

    public GenSubClass(T value, V subValue) {
        super(value);
        this.subValue = subValue;
    }

    public V getSubValue() {
        return subValue;
    }

    public void setSubValue(V subValue) {
        this.subValue = subValue;
    }

    @Override
    public String toString() {
        return "GenSubClass{" +
                "subValue=" + subValue +
                ", value=" + value +
                '}';
    }
}
