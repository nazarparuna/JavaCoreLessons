package consultation3;

public class Methods {

    void add(double a, double b) {
        checkNumbers(a, b);
        System.out.println(a + b);
    }

    private void checkNumbers(double a, double b) {
        if ((a < 0 && b < 0)) {
            throw new IllegalArgumentException();
        } else if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
            throw new ArithmeticException();
        } else if ((a == 0 && b == 0)) {
            try {
                throw new IllegalAccessException();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } else if (a > 0 && b > 0) {
            throw new MyException();
        }
    }

    void sub(double a, double b) {
        checkNumbers(a, b);
        System.out.println(a + b);
    }

    void mul(double a, double b) {
        checkNumbers(a, b);
        System.out.println(a + b);
    }

    void div(double a, double b) {
        checkNumbers(a, b);
        System.out.println(a + b);
    }
}
