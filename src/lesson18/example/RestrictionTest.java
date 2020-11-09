package lesson18.example;

public class RestrictionTest {
    public static void main(String[] args) {
        RestrictedParamClass<Integer> restrictedParamClass = new RestrictedParamClass<>(3);
        System.out.println(restrictedParamClass);

        System.out.println();
        restrictedParamClass.setArray(new Integer[]{1, 2, 3});

        for (Integer integer : restrictedParamClass.getArray()) {
            System.out.println(integer);
        }

    }
}
