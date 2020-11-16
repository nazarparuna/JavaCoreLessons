package lesson21.example.override;

public class OverrideAnnotationTest {
    public static void main(String[] args) {
        Base obj = new Base();
        obj.show();

        Base childObj = new ChildClass();
        childObj.show();

    }

}
