package lesson8.example;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String str = scanner.next();

//        System.out.println(str);
//
//        scanner.nextLine();
//
//        String s = scanner.nextLine();
//
//        System.out.println(s);

//        int i = scanner.nextInt();
//        System.out.println(i);

        String i2 = scanner.nextLine();
        int number = getNumber(i2);
        System.out.println(number);

        boolean b = scanner.hasNext();
        System.out.println(b);

    }

    private static int getNumber(String line) {
        int index = 0;
        char[] str = new char[line.length()];
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) >= 48 && line.charAt(i) <= 57) {
                str[index] = line.charAt(i);
                index++;
            }
        }

        int newIndex = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 0) {
                break;
            }
            newIndex++;
        }
        char[] lastStr = new char[newIndex];

        for (int i = 0; i < newIndex; i++) {
            lastStr[i] = str[i];
        }

        String stringNumber = new String(lastStr);
        return Integer.parseInt(stringNumber);
    }
}
