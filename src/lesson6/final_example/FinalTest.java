package lesson6.final_example;

public class FinalTest {

    public static final String STRING_CONST = "Hello, world";
    public final String STRING_CONST2;

    public FinalTest(String STRING_CONST2) {
        this.STRING_CONST2 = STRING_CONST2;
    }

    public static void main(String[] args) {
        System.out.println(STRING_CONST);
//        STRING_CONST = "New value";
        FinalTest test = new FinalTest("new value");
        System.out.println(test.STRING_CONST2);
//        test.STRING_CONST2 = "new value";
    }
}
