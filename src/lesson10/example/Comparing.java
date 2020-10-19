package lesson10.example;

public class Comparing {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;

        System.out.println(o1 == o2); // false
        System.out.println(o1 == o3); // true
        System.out.println(o2 == o3); // false


    }
}
