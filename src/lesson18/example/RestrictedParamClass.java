package lesson18.example;

import java.util.ArrayList;
import java.util.List;

public class RestrictedParamClass<P extends Number> {

    P value;
    P[] array;
    List<P> list;

    public RestrictedParamClass(P value) {
        this.value = value;
    }

    public P getValue() {
        return value;
    }

    public void setValue(P value) {
        this.value = value;
    }

    public P[] getArray() {
        return array;
    }

    public void setArray(P[] array) {
//        this.array = new P[10]; will not work
        this.array = array;
    }

    public void setList(List<P> list) {
        this.list = new ArrayList<P>();
        this.list = list;
    }

    public void showResult() {

    }

    @Override
    public String toString() {
        return "RestrictedParamClass{" +
                "value=" + value +
                '}';
    }
}
