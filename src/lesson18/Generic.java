package lesson18;

public class Generic<T> {
    T ob;

    public Generic(T ob) {
        super();
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }
}

class Generic2<T> extends Generic<T> {

    public Generic2(T ob) {
        super(ob);
    }

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }

}

class Generic3<T, V> extends Generic<T> {

    V ob2;

    public Generic3(T ob, V ob2) {
        super(ob);
        this.ob2 = ob2;
    }

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }

    public V getOb2() {
        return ob2;
    }

    public void setOb2(V ob2) {
        this.ob2 = ob2;
    }

}