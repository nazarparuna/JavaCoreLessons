package consultation2;

public class StringFormatDemo {

    public static void main(String[] args) {
        System.out.println(String.format("String is %d", 3));
        System.out.println(String.format("String is %d", (int) 3.0));

        System.out.println(String.format("String is %f", 3.0));
        System.out.println(String.format("String is %.0f", 3.0));
        System.out.println(String.format("String is %.2f", 3.0));

        System.out.println(String.format("String is %g", 3.0));
        System.out.println(String.format("String is %e", 3.0));


    }
}
