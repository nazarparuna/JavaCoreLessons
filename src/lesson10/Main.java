package lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        // сторення масиву символів і вивід його

        char[] symbols = {'h', 'e', 'l', 'l', 'o'};
        for (char sym : symbols) {
            System.out.print(sym);
        }
        System.out.println();

        // створення строк
        String str1 = "Java1";
        String str2 = new String("Java1");
        String str3 = "Java1";

        System.out.println(str1 == str2); // false

        System.out.println(str1 == str3); // true



        // показати конструктори

        String str4 = new String(symbols);
        System.out.println(str4);

        // масив строк
        String[] strArray = {"Hello, ", "World!"};
        for (String str : strArray) {
            System.out.print(str);
        }
        System.out.println();
        // що буде працювати швидше створення строк явно, чи через new?

        String[] largeArray = new String[1000];
        for (int i = 0; i < largeArray.length; i++) {
//            largeArray[i] = "nsdfsdf"
//            largeArray[i] = new String("nsdfsdf"); // швидше

        }

        // конкатенація строк

        String s1 = "Hello, ";
        String s2 = "darkness...";
        System.out.println("Hello, " + "darkness...");
        System.out.println(s1 + s2);

        // методи для роботи з рядками

        // length
        System.out.println(s1.length()); // 7

        // читання строк з консолі

        Scanner scanner = new Scanner(System.in);
//        String readedStr = scanner.nextLine();
//        System.out.println("Your string is " + readedStr);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String buffStr = bufferedReader.readLine();
//            bufferedReader.rea
//            System.out.println("Your buffered string is next: " + buffStr);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            bufferedReader.close();
//        }

        // індексація по строках
        String indexStr = "Java is fun!";

        // charAt
        for (int i = 0; i < indexStr.length(); i++) {
            System.out.println(indexStr.charAt(i));
        }

        // indexOf / lastIndexOf
        System.out.println(indexStr.indexOf('!')); // 11
        System.out.println(indexStr.indexOf('a')); // 1
        System.out.println(indexStr.lastIndexOf('a')); // 3
        System.out.println(indexStr.indexOf("Java")); // 0


        // split
        System.out.println();
        System.out.println("Count of elements " + indexStr.split("Ja").length);
        for (String str : indexStr.split("Ja")) {
            System.out.println(str);
        }

        System.out.println();
        for (String str : indexStr.split("")) {
            System.out.println(str);
        }


        // порівняння строк
        String s4 = new String("Java");
        String s5 = new String("Java");
        String s6 = new String("java");
        System.out.println(s4 == s5); // false
        System.out.println(s4.equals(s5)); // true
        System.out.println(s4.equals(s6)); // false
        System.out.println(s4.equalsIgnoreCase(s6)); // true
        System.out.println(s4.intern() == s5.intern());

        System.out.println("HaHaHa".toLowerCase());
        System.out.println("HaHaHa".toUpperCase());

        // substring
        System.out.println("He " + indexStr.substring(5));
        System.out.println("He " + indexStr.substring(5, 8) + "smart!");


        // toCharArray
        for (char sym : "Hello".toCharArray()) {
            System.out.println("- " + sym);
            System.out.println("- " + (int) sym);
        }

        // toLowerCase / toUpperCase

        // trim
        String strWithWhiteSpaces = "        Today is a       great  day of my life";

        System.out.println(strWithWhiteSpaces);
        System.out.println(strWithWhiteSpaces.trim());

        // compareTo
        // -1, 0, 1
        String s7 = "Javb";
        String s8 = "Javb1221312";
        System.out.println(s5.compareTo(s6));
        System.out.println(s6.compareTo(s5));
        System.out.println(s5.compareTo(s7));
        System.out.println(s5.compareTo(s8));

        // задача про частотний аналіз тексту
        String poetry = "To be, or not to be, that is the question:" +
                "Whether 'tis nobler in the mind to suffer" +
                "The slings and arrows of outrageous fortune," +
                "Or to take arms against a sea of troubles" +
                "And by opposing end them. To die—to sleep," +
                "No more; and by a sleep to say we end" +
                "The heart-ache and the thousand natural shocks";

        char[] alphabet = new char[256];
        for (char sym : poetry.toLowerCase().toCharArray()) {
            int symbol = ((char) sym % 256);
            alphabet[(int) symbol]++;
        }

        for (int i = 97; i < 123; i++) {
            System.out.println(((char) alphabet[i]) + " - " + alphabet[i]);
        }


        // StringBuffer

        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.capacity());

        stringBuilder.append("Java");
        System.out.println(stringBuilder.capacity());

        System.out.println(stringBuilder);
        System.out.println(stringBuilder.toString());


        StringBuilder stringBuilder2 = new StringBuilder(20);

        System.out.println(stringBuilder2.capacity());

        // capacity

        // get / setLength

//        stringBuilder.setLength(30);
        System.out.println(stringBuilder.capacity());

        // append
        stringBuilder.append(" is now in version 13.");
        System.out.println(stringBuilder);

        // setCharAt
        stringBuilder.setCharAt(0, 'G');
        System.out.println(stringBuilder);

        // insert
//        stringBuilder.insert()

        // delete / deleteCharAt
        stringBuilder.delete(0, 5);
        System.out.println(stringBuilder);

        // reverse
        stringBuilder.reverse();
        System.out.println(stringBuilder);



        // Ввести 2 слова, що складаються з парного числа букв. Отримати слово, що складається з першої половини першого слова і другої половини другого слова.
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        System.out.println(first.substring(0, first.length() / 2) + second.substring(second.length() / 2));
    }
}
