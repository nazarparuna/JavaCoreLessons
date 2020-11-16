package lesson21.example.suppress_warnings;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarningsTest {

    List list = new ArrayList();

    public static void main(String[] args) {
        SuppressWarningsTest suppressWarningsTest = new SuppressWarningsTest();
        suppressWarningsTest.add(1);
        suppressWarningsTest.add("1");
    }

    @SuppressWarnings("unchecked")
    public void add(Object obj) {
        list.add(obj);
    }
}
