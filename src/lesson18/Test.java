package lesson18;

class Test<T> {
    T[] values;             //ok

    Test(T[] n) {
//        values = new T[10];     // базовий тип - параметр типу

        values = n;       //ok
    }
}

