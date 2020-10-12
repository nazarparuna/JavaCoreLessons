package lesson8.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedExample {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("Enter something: ");
            String input = br.readLine();
            if ("q".equals(input)) {
                System.out.println("Exit!");
                System.exit(0);
            }
            System.out.println(input);
        }
    }

}
