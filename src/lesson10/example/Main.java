package lesson10.example;

public class Main {
    public static void main(String[] args) {
        String str = "11231231";
        String str2 = new String("my world");
        str += "1";

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.length());


        StringBuilder stringBuilder2 = new StringBuilder("Hello, world!");

        System.out.println(stringBuilder2.capacity());
        System.out.println(stringBuilder2.length());

        stringBuilder2.append(2l);
        System.out.println(stringBuilder2);

        stringBuilder.insert(0, "+");
        System.out.println(stringBuilder2);

//        stringBuilder2.sub

        String cat1 = "Cat";
        String cat2 = "Cat";
        String cat3 = new String("Cat");

        System.out.println(cat1 == cat1); // true
        System.out.println(cat1 == cat2); // true
        System.out.println(cat1 == cat3); // false
        System.out.println(cat2 == cat3); // false

        System.out.println(cat1.equals(cat2)); // true
        System.out.println(cat1.equals(cat3)); // true;
        System.out.println(cat2.equals(cat3)); // true;

        System.out.println(cat1.compareTo(cat2) == 0); // true
        System.out.println(cat1.compareTo(cat3) == 0); // true
        System.out.println(cat2.compareTo(cat3) == 0); // true


        String trimString = "   \t\b   dsjlj    sdkjlkds   dsfsd \n fd sd s  ----                    ";

        System.out.print(trimString);

        System.out.println("==============================");
        System.out.println(trimString.trim());

        System.out.println(stringBuilder);
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.length());
        stringBuilder.setLength(30);
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder);
        stringBuilder.append(12);
        System.out.println(stringBuilder);

        System.out.println("---------");
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder);
        System.out.println("---------");

        String stringFromBuilder = new String(stringBuilder.reverse());
        System.out.println(stringFromBuilder);


    }
}
